package com.dao;

import com.entity.TaocanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocanxinxiVO;
import com.entity.view.TaocanxinxiView;


/**
 * 套餐信息
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface TaocanxinxiDao extends BaseMapper<TaocanxinxiEntity> {
	
	List<TaocanxinxiVO> selectListVO(@Param("ew") Wrapper<TaocanxinxiEntity> wrapper);
	
	TaocanxinxiVO selectVO(@Param("ew") Wrapper<TaocanxinxiEntity> wrapper);
	
	List<TaocanxinxiView> selectListView(@Param("ew") Wrapper<TaocanxinxiEntity> wrapper);

	List<TaocanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TaocanxinxiEntity> wrapper);
	
	TaocanxinxiView selectView(@Param("ew") Wrapper<TaocanxinxiEntity> wrapper);
	
}
