package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanleixingView;


/**
 * 套餐类型
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface TaocanleixingService extends IService<TaocanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocanleixingVO> selectListVO(Wrapper<TaocanleixingEntity> wrapper);
   	
   	TaocanleixingVO selectVO(@Param("ew") Wrapper<TaocanleixingEntity> wrapper);
   	
   	List<TaocanleixingView> selectListView(Wrapper<TaocanleixingEntity> wrapper);
   	
   	TaocanleixingView selectView(@Param("ew") Wrapper<TaocanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocanleixingEntity> wrapper);
   	
}

