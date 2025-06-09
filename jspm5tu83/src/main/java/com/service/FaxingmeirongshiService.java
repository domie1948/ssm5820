package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FaxingmeirongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FaxingmeirongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FaxingmeirongshiView;


/**
 * 发型美容师
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface FaxingmeirongshiService extends IService<FaxingmeirongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FaxingmeirongshiVO> selectListVO(Wrapper<FaxingmeirongshiEntity> wrapper);
   	
   	FaxingmeirongshiVO selectVO(@Param("ew") Wrapper<FaxingmeirongshiEntity> wrapper);
   	
   	List<FaxingmeirongshiView> selectListView(Wrapper<FaxingmeirongshiEntity> wrapper);
   	
   	FaxingmeirongshiView selectView(@Param("ew") Wrapper<FaxingmeirongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FaxingmeirongshiEntity> wrapper);
   	
}

