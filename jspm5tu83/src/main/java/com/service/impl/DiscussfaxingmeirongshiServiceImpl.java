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


import com.dao.DiscussfaxingmeirongshiDao;
import com.entity.DiscussfaxingmeirongshiEntity;
import com.service.DiscussfaxingmeirongshiService;
import com.entity.vo.DiscussfaxingmeirongshiVO;
import com.entity.view.DiscussfaxingmeirongshiView;

@Service("discussfaxingmeirongshiService")
public class DiscussfaxingmeirongshiServiceImpl extends ServiceImpl<DiscussfaxingmeirongshiDao, DiscussfaxingmeirongshiEntity> implements DiscussfaxingmeirongshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfaxingmeirongshiEntity> page = this.selectPage(
                new Query<DiscussfaxingmeirongshiEntity>(params).getPage(),
                new EntityWrapper<DiscussfaxingmeirongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfaxingmeirongshiEntity> wrapper) {
		  Page<DiscussfaxingmeirongshiView> page =new Query<DiscussfaxingmeirongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfaxingmeirongshiVO> selectListVO(Wrapper<DiscussfaxingmeirongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfaxingmeirongshiVO selectVO(Wrapper<DiscussfaxingmeirongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfaxingmeirongshiView> selectListView(Wrapper<DiscussfaxingmeirongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfaxingmeirongshiView selectView(Wrapper<DiscussfaxingmeirongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
