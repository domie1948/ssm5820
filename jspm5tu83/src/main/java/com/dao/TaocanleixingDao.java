package com.dao;

import com.entity.TaocanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocanleixingVO;
import com.entity.view.TaocanleixingView;


/**
 * 套餐类型
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface TaocanleixingDao extends BaseMapper<TaocanleixingEntity> {
	
	List<TaocanleixingVO> selectListVO(@Param("ew") Wrapper<TaocanleixingEntity> wrapper);
	
	TaocanleixingVO selectVO(@Param("ew") Wrapper<TaocanleixingEntity> wrapper);
	
	List<TaocanleixingView> selectListView(@Param("ew") Wrapper<TaocanleixingEntity> wrapper);

	List<TaocanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<TaocanleixingEntity> wrapper);
	
	TaocanleixingView selectView(@Param("ew") Wrapper<TaocanleixingEntity> wrapper);
	
}
