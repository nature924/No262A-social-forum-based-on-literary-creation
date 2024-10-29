package com.dao;

import com.entity.JinggaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinggaoxinxiVO;
import com.entity.view.JinggaoxinxiView;


/**
 * 警告信息
 * 
 * @author 
 * @email 
 * @date 2023-01-18 23:20:36
 */
public interface JinggaoxinxiDao extends BaseMapper<JinggaoxinxiEntity> {
	
	List<JinggaoxinxiVO> selectListVO(@Param("ew") Wrapper<JinggaoxinxiEntity> wrapper);
	
	JinggaoxinxiVO selectVO(@Param("ew") Wrapper<JinggaoxinxiEntity> wrapper);
	
	List<JinggaoxinxiView> selectListView(@Param("ew") Wrapper<JinggaoxinxiEntity> wrapper);

	List<JinggaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JinggaoxinxiEntity> wrapper);
	
	JinggaoxinxiView selectView(@Param("ew") Wrapper<JinggaoxinxiEntity> wrapper);
	

}
