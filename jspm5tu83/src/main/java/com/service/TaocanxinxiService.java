package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanxinxiView;


/**
 * 套餐信息
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface TaocanxinxiService extends IService<TaocanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocanxinxiVO> selectListVO(Wrapper<TaocanxinxiEntity> wrapper);
   	
   	TaocanxinxiVO selectVO(@Param("ew") Wrapper<TaocanxinxiEntity> wrapper);
   	
   	List<TaocanxinxiView> selectListView(Wrapper<TaocanxinxiEntity> wrapper);
   	
   	TaocanxinxiView selectView(@Param("ew") Wrapper<TaocanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocanxinxiEntity> wrapper);
   	
}

