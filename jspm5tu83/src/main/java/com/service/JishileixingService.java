package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishileixingView;


/**
 * 技师类型
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface JishileixingService extends IService<JishileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishileixingVO> selectListVO(Wrapper<JishileixingEntity> wrapper);
   	
   	JishileixingVO selectVO(@Param("ew") Wrapper<JishileixingEntity> wrapper);
   	
   	List<JishileixingView> selectListView(Wrapper<JishileixingEntity> wrapper);
   	
   	JishileixingView selectView(@Param("ew") Wrapper<JishileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishileixingEntity> wrapper);
   	
}

