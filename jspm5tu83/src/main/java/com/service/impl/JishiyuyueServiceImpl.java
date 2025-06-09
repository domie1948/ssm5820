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


import com.dao.JishiyuyueDao;
import com.entity.JishiyuyueEntity;
import com.service.JishiyuyueService;
import com.entity.vo.JishiyuyueVO;
import com.entity.view.JishiyuyueView;

@Service("jishiyuyueService")
public class JishiyuyueServiceImpl extends ServiceImpl<JishiyuyueDao, JishiyuyueEntity> implements JishiyuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishiyuyueEntity> page = this.selectPage(
                new Query<JishiyuyueEntity>(params).getPage(),
                new EntityWrapper<JishiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishiyuyueEntity> wrapper) {
		  Page<JishiyuyueView> page =new Query<JishiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishiyuyueVO> selectListVO(Wrapper<JishiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishiyuyueVO selectVO(Wrapper<JishiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishiyuyueView> selectListView(Wrapper<JishiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishiyuyueView selectView(Wrapper<JishiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
