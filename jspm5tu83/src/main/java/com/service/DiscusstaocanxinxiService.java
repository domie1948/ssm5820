package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstaocanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstaocanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstaocanxinxiView;


/**
 * 套餐信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public interface DiscusstaocanxinxiService extends IService<DiscusstaocanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstaocanxinxiVO> selectListVO(Wrapper<DiscusstaocanxinxiEntity> wrapper);
   	
   	DiscusstaocanxinxiVO selectVO(@Param("ew") Wrapper<DiscusstaocanxinxiEntity> wrapper);
   	
   	List<DiscusstaocanxinxiView> selectListView(Wrapper<DiscusstaocanxinxiEntity> wrapper);
   	
   	DiscusstaocanxinxiView selectView(@Param("ew") Wrapper<DiscusstaocanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstaocanxinxiEntity> wrapper);
   	
}

