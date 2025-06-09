package com.dao;

import com.entity.TaocangoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocangoumaiVO;
import com.entity.view.TaocangoumaiView;


/**
 * 套餐购买
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface TaocangoumaiDao extends BaseMapper<TaocangoumaiEntity> {
	
	List<TaocangoumaiVO> selectListVO(@Param("ew") Wrapper<TaocangoumaiEntity> wrapper);
	
	TaocangoumaiVO selectVO(@Param("ew") Wrapper<TaocangoumaiEntity> wrapper);
	
	List<TaocangoumaiView> selectListView(@Param("ew") Wrapper<TaocangoumaiEntity> wrapper);

	List<TaocangoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<TaocangoumaiEntity> wrapper);
	
	TaocangoumaiView selectView(@Param("ew") Wrapper<TaocangoumaiEntity> wrapper);
	
}
