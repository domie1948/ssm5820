package com.dao;

import com.entity.FaxingmeirongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FaxingmeirongshiVO;
import com.entity.view.FaxingmeirongshiView;


/**
 * 发型美容师
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface FaxingmeirongshiDao extends BaseMapper<FaxingmeirongshiEntity> {
	
	List<FaxingmeirongshiVO> selectListVO(@Param("ew") Wrapper<FaxingmeirongshiEntity> wrapper);
	
	FaxingmeirongshiVO selectVO(@Param("ew") Wrapper<FaxingmeirongshiEntity> wrapper);
	
	List<FaxingmeirongshiView> selectListView(@Param("ew") Wrapper<FaxingmeirongshiEntity> wrapper);

	List<FaxingmeirongshiView> selectListView(Pagination page,@Param("ew") Wrapper<FaxingmeirongshiEntity> wrapper);
	
	FaxingmeirongshiView selectView(@Param("ew") Wrapper<FaxingmeirongshiEntity> wrapper);
	
}
