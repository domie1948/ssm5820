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


import com.dao.TaocanxinxiDao;
import com.entity.TaocanxinxiEntity;
import com.service.TaocanxinxiService;
import com.entity.vo.TaocanxinxiVO;
import com.entity.view.TaocanxinxiView;

@Service("taocanxinxiService")
public class TaocanxinxiServiceImpl extends ServiceImpl<TaocanxinxiDao, TaocanxinxiEntity> implements TaocanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocanxinxiEntity> page = this.selectPage(
                new Query<TaocanxinxiEntity>(params).getPage(),
                new EntityWrapper<TaocanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocanxinxiEntity> wrapper) {
		  Page<TaocanxinxiView> page =new Query<TaocanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaocanxinxiVO> selectListVO(Wrapper<TaocanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocanxinxiVO selectVO(Wrapper<TaocanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocanxinxiView> selectListView(Wrapper<TaocanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocanxinxiView selectView(Wrapper<TaocanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
