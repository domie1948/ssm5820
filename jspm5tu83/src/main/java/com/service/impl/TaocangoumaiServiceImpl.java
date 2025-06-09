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


import com.dao.TaocangoumaiDao;
import com.entity.TaocangoumaiEntity;
import com.service.TaocangoumaiService;
import com.entity.vo.TaocangoumaiVO;
import com.entity.view.TaocangoumaiView;

@Service("taocangoumaiService")
public class TaocangoumaiServiceImpl extends ServiceImpl<TaocangoumaiDao, TaocangoumaiEntity> implements TaocangoumaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocangoumaiEntity> page = this.selectPage(
                new Query<TaocangoumaiEntity>(params).getPage(),
                new EntityWrapper<TaocangoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocangoumaiEntity> wrapper) {
		  Page<TaocangoumaiView> page =new Query<TaocangoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaocangoumaiVO> selectListVO(Wrapper<TaocangoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocangoumaiVO selectVO(Wrapper<TaocangoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocangoumaiView> selectListView(Wrapper<TaocangoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocangoumaiView selectView(Wrapper<TaocangoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
