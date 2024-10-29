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


import com.dao.WenzhangjubaoDao;
import com.entity.WenzhangjubaoEntity;
import com.service.WenzhangjubaoService;
import com.entity.vo.WenzhangjubaoVO;
import com.entity.view.WenzhangjubaoView;

@Service("wenzhangjubaoService")
public class WenzhangjubaoServiceImpl extends ServiceImpl<WenzhangjubaoDao, WenzhangjubaoEntity> implements WenzhangjubaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhangjubaoEntity> page = this.selectPage(
                new Query<WenzhangjubaoEntity>(params).getPage(),
                new EntityWrapper<WenzhangjubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhangjubaoEntity> wrapper) {
		  Page<WenzhangjubaoView> page =new Query<WenzhangjubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhangjubaoVO> selectListVO(Wrapper<WenzhangjubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhangjubaoVO selectVO(Wrapper<WenzhangjubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhangjubaoView> selectListView(Wrapper<WenzhangjubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhangjubaoView selectView(Wrapper<WenzhangjubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
