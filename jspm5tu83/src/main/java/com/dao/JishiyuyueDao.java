package com.dao;

import com.entity.JishiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishiyuyueVO;
import com.entity.view.JishiyuyueView;


/**
 * 技师预约
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface JishiyuyueDao extends BaseMapper<JishiyuyueEntity> {
	
	List<JishiyuyueVO> selectListVO(@Param("ew") Wrapper<JishiyuyueEntity> wrapper);
	
	JishiyuyueVO selectVO(@Param("ew") Wrapper<JishiyuyueEntity> wrapper);
	
	List<JishiyuyueView> selectListView(@Param("ew") Wrapper<JishiyuyueEntity> wrapper);

	List<JishiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<JishiyuyueEntity> wrapper);
	
	JishiyuyueView selectView(@Param("ew") Wrapper<JishiyuyueEntity> wrapper);
	
}
