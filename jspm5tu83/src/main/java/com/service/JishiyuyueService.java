package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishiyuyueView;


/**
 * 技师预约
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface JishiyuyueService extends IService<JishiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishiyuyueVO> selectListVO(Wrapper<JishiyuyueEntity> wrapper);
   	
   	JishiyuyueVO selectVO(@Param("ew") Wrapper<JishiyuyueEntity> wrapper);
   	
   	List<JishiyuyueView> selectListView(Wrapper<JishiyuyueEntity> wrapper);
   	
   	JishiyuyueView selectView(@Param("ew") Wrapper<JishiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishiyuyueEntity> wrapper);
   	
}

