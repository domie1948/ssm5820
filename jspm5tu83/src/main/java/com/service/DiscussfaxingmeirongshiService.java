package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfaxingmeirongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfaxingmeirongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfaxingmeirongshiView;


/**
 * 发型美容师评论表
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface DiscussfaxingmeirongshiService extends IService<DiscussfaxingmeirongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfaxingmeirongshiVO> selectListVO(Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
   	
   	DiscussfaxingmeirongshiVO selectVO(@Param("ew") Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
   	
   	List<DiscussfaxingmeirongshiView> selectListView(Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
   	
   	DiscussfaxingmeirongshiView selectView(@Param("ew") Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
   	
}

