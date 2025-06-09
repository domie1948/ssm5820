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


import com.dao.JishileixingDao;
import com.entity.JishileixingEntity;
import com.service.JishileixingService;
import com.entity.vo.JishileixingVO;
import com.entity.view.JishileixingView;

@Service("jishileixingService")
public class JishileixingServiceImpl extends ServiceImpl<JishileixingDao, JishileixingEntity> implements JishileixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishileixingEntity> page = this.selectPage(
                new Query<JishileixingEntity>(params).getPage(),
                new EntityWrapper<JishileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishileixingEntity> wrapper) {
		  Page<JishileixingView> page =new Query<JishileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishileixingVO> selectListVO(Wrapper<JishileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishileixingVO selectVO(Wrapper<JishileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishileixingView> selectListView(Wrapper<JishileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishileixingView selectView(Wrapper<JishileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
