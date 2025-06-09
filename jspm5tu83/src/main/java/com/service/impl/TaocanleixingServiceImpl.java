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


import com.dao.TaocanleixingDao;
import com.entity.TaocanleixingEntity;
import com.service.TaocanleixingService;
import com.entity.vo.TaocanleixingVO;
import com.entity.view.TaocanleixingView;

@Service("taocanleixingService")
public class TaocanleixingServiceImpl extends ServiceImpl<TaocanleixingDao, TaocanleixingEntity> implements TaocanleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocanleixingEntity> page = this.selectPage(
                new Query<TaocanleixingEntity>(params).getPage(),
                new EntityWrapper<TaocanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocanleixingEntity> wrapper) {
		  Page<TaocanleixingView> page =new Query<TaocanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaocanleixingVO> selectListVO(Wrapper<TaocanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocanleixingVO selectVO(Wrapper<TaocanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocanleixingView> selectListView(Wrapper<TaocanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocanleixingView selectView(Wrapper<TaocanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
