package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FaxingmeirongshiDao;
import com.entity.FaxingmeirongshiEntity;
import com.service.FaxingmeirongshiService;
import com.entity.vo.FaxingmeirongshiVO;
import com.entity.view.FaxingmeirongshiView;

@Service("faxingmeirongshiService")
public class FaxingmeirongshiServiceImpl extends ServiceImpl<FaxingmeirongshiDao, FaxingmeirongshiEntity> implements FaxingmeirongshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FaxingmeirongshiEntity> page = this.selectPage(
                new Query<FaxingmeirongshiEntity>(params).getPage(),
                new EntityWrapper<FaxingmeirongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FaxingmeirongshiEntity> wrapper) {
		  Page<FaxingmeirongshiView> page =new Query<FaxingmeirongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FaxingmeirongshiVO> selectListVO(Wrapper<FaxingmeirongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FaxingmeirongshiVO selectVO(Wrapper<FaxingmeirongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FaxingmeirongshiView> selectListView(Wrapper<FaxingmeirongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FaxingmeirongshiView selectView(Wrapper<FaxingmeirongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
