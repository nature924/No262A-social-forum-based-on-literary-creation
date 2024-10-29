package com.dao;

import com.entity.WenzhangjubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhangjubaoVO;
import com.entity.view.WenzhangjubaoView;


/**
 * 文章举报
 * 
 * @author 
 * @email 
 * @date 2023-01-18 23:20:36
 */
public interface WenzhangjubaoDao extends BaseMapper<WenzhangjubaoEntity> {
	
	List<WenzhangjubaoVO> selectListVO(@Param("ew") Wrapper<WenzhangjubaoEntity> wrapper);
	
	WenzhangjubaoVO selectVO(@Param("ew") Wrapper<WenzhangjubaoEntity> wrapper);
	
	List<WenzhangjubaoView> selectListView(@Param("ew") Wrapper<WenzhangjubaoEntity> wrapper);

	List<WenzhangjubaoView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhangjubaoEntity> wrapper);
	
	WenzhangjubaoView selectView(@Param("ew") Wrapper<WenzhangjubaoEntity> wrapper);
	

}
