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


import com.dao.JinggaoxinxiDao;
import com.entity.JinggaoxinxiEntity;
import com.service.JinggaoxinxiService;
import com.entity.vo.JinggaoxinxiVO;
import com.entity.view.JinggaoxinxiView;

@Service("jinggaoxinxiService")
public class JinggaoxinxiServiceImpl extends ServiceImpl<JinggaoxinxiDao, JinggaoxinxiEntity> implements JinggaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinggaoxinxiEntity> page = this.selectPage(
                new Query<JinggaoxinxiEntity>(params).getPage(),
                new EntityWrapper<JinggaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinggaoxinxiEntity> wrapper) {
		  Page<JinggaoxinxiView> page =new Query<JinggaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinggaoxinxiVO> selectListVO(Wrapper<JinggaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinggaoxinxiVO selectVO(Wrapper<JinggaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinggaoxinxiView> selectListView(Wrapper<JinggaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinggaoxinxiView selectView(Wrapper<JinggaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
