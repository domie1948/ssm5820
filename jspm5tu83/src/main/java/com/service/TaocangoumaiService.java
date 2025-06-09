package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocangoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocangoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocangoumaiView;


/**
 * 套餐购买
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface TaocangoumaiService extends IService<TaocangoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocangoumaiVO> selectListVO(Wrapper<TaocangoumaiEntity> wrapper);
   	
   	TaocangoumaiVO selectVO(@Param("ew") Wrapper<TaocangoumaiEntity> wrapper);
   	
   	List<TaocangoumaiView> selectListView(Wrapper<TaocangoumaiEntity> wrapper);
   	
   	TaocangoumaiView selectView(@Param("ew") Wrapper<TaocangoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocangoumaiEntity> wrapper);
   	
}

