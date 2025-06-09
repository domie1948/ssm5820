package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FaxingmeirongshiEntity;
import com.entity.view.FaxingmeirongshiView;

import com.service.FaxingmeirongshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 发型美容师
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
@RestController
@RequestMapping("/faxingmeirongshi")
public class FaxingmeirongshiController {
    @Autowired
    private FaxingmeirongshiService faxingmeirongshiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FaxingmeirongshiEntity faxingmeirongshi, 
		HttpServletRequest request){

        EntityWrapper<FaxingmeirongshiEntity> ew = new EntityWrapper<FaxingmeirongshiEntity>();
    	PageUtils page = faxingmeirongshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, faxingmeirongshi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FaxingmeirongshiEntity faxingmeirongshi, HttpServletRequest request){
        EntityWrapper<FaxingmeirongshiEntity> ew = new EntityWrapper<FaxingmeirongshiEntity>();
    	PageUtils page = faxingmeirongshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, faxingmeirongshi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FaxingmeirongshiEntity faxingmeirongshi){
       	EntityWrapper<FaxingmeirongshiEntity> ew = new EntityWrapper<FaxingmeirongshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( faxingmeirongshi, "faxingmeirongshi")); 
        return R.ok().put("data", faxingmeirongshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FaxingmeirongshiEntity faxingmeirongshi){
        EntityWrapper< FaxingmeirongshiEntity> ew = new EntityWrapper< FaxingmeirongshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( faxingmeirongshi, "faxingmeirongshi")); 
		FaxingmeirongshiView faxingmeirongshiView =  faxingmeirongshiService.selectView(ew);
		return R.ok("查询发型美容师成功").put("data", faxingmeirongshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FaxingmeirongshiEntity faxingmeirongshi = faxingmeirongshiService.selectById(id);
		faxingmeirongshi.setClicktime(new Date());
		faxingmeirongshiService.updateById(faxingmeirongshi);
        return R.ok().put("data", faxingmeirongshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FaxingmeirongshiEntity faxingmeirongshi = faxingmeirongshiService.selectById(id);
		faxingmeirongshi.setClicktime(new Date());
		faxingmeirongshiService.updateById(faxingmeirongshi);
        return R.ok().put("data", faxingmeirongshi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        FaxingmeirongshiEntity faxingmeirongshi = faxingmeirongshiService.selectById(id);
        if(type.equals("1")) {
        	faxingmeirongshi.setThumbsupnum(faxingmeirongshi.getThumbsupnum()+1);
        } else {
        	faxingmeirongshi.setCrazilynum(faxingmeirongshi.getCrazilynum()+1);
        }
        faxingmeirongshiService.updateById(faxingmeirongshi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FaxingmeirongshiEntity faxingmeirongshi, HttpServletRequest request){
    	faxingmeirongshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(faxingmeirongshi);

        faxingmeirongshiService.insert(faxingmeirongshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FaxingmeirongshiEntity faxingmeirongshi, HttpServletRequest request){
    	faxingmeirongshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(faxingmeirongshi);

        faxingmeirongshiService.insert(faxingmeirongshi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FaxingmeirongshiEntity faxingmeirongshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(faxingmeirongshi);
        faxingmeirongshiService.updateById(faxingmeirongshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        faxingmeirongshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FaxingmeirongshiEntity> wrapper = new EntityWrapper<FaxingmeirongshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = faxingmeirongshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,FaxingmeirongshiEntity faxingmeirongshi, HttpServletRequest request,String pre){
        EntityWrapper<FaxingmeirongshiEntity> ew = new EntityWrapper<FaxingmeirongshiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = faxingmeirongshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, faxingmeirongshi), params), params));
        return R.ok().put("data", page);
    }


}
