package com.dao;

import com.entity.DiscussfaxingmeirongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfaxingmeirongshiVO;
import com.entity.view.DiscussfaxingmeirongshiView;


/**
 * 发型美容师评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface DiscussfaxingmeirongshiDao extends BaseMapper<DiscussfaxingmeirongshiEntity> {
	
	List<DiscussfaxingmeirongshiVO> selectListVO(@Param("ew") Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
	
	DiscussfaxingmeirongshiVO selectVO(@Param("ew") Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
	
	List<DiscussfaxingmeirongshiView> selectListView(@Param("ew") Wrapper<DiscussfaxingmeirongshiEntity> wrapper);

	List<DiscussfaxingmeirongshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
	
	DiscussfaxingmeirongshiView selectView(@Param("ew") Wrapper<DiscussfaxingmeirongshiEntity> wrapper);
	
}
