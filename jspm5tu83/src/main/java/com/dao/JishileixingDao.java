package com.dao;

import com.entity.JishileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishileixingVO;
import com.entity.view.JishileixingView;


/**
 * 技师类型
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface JishileixingDao extends BaseMapper<JishileixingEntity> {
	
	List<JishileixingVO> selectListVO(@Param("ew") Wrapper<JishileixingEntity> wrapper);
	
	JishileixingVO selectVO(@Param("ew") Wrapper<JishileixingEntity> wrapper);
	
	List<JishileixingView> selectListView(@Param("ew") Wrapper<JishileixingEntity> wrapper);

	List<JishileixingView> selectListView(Pagination page,@Param("ew") Wrapper<JishileixingEntity> wrapper);
	
	JishileixingView selectView(@Param("ew") Wrapper<JishileixingEntity> wrapper);
	
}
