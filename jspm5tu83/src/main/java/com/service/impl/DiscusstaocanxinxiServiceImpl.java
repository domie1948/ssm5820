package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusstaocanxinxiDao;
import com.entity.DiscusstaocanxinxiEntity;
import com.service.DiscusstaocanxinxiService;
import com.entity.vo.DiscusstaocanxinxiVO;
import com.entity.view.DiscusstaocanxinxiView;

@Service("discusstaocanxinxiService")
public class DiscusstaocanxinxiServiceImpl extends ServiceImpl<DiscusstaocanxinxiDao, DiscusstaocanxinxiEntity> implements DiscusstaocanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstaocanxinxiEntity> page = this.selectPage(
                new Query<DiscusstaocanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusstaocanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstaocanxinxiEntity> wrapper) {
		  Page<DiscusstaocanxinxiView> page =new Query<DiscusstaocanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstaocanxinxiVO> selectListVO(Wrapper<DiscusstaocanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstaocanxinxiVO selectVO(Wrapper<DiscusstaocanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstaocanxinxiView> selectListView(Wrapper<DiscusstaocanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstaocanxinxiView selectView(Wrapper<DiscusstaocanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
