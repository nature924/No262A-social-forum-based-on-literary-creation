package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinggaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinggaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinggaoxinxiView;


/**
 * 警告信息
 *
 * @author 
 * @email 
 * @date 2023-01-18 23:20:36
 */
public interface JinggaoxinxiService extends IService<JinggaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinggaoxinxiVO> selectListVO(Wrapper<JinggaoxinxiEntity> wrapper);
   	
   	JinggaoxinxiVO selectVO(@Param("ew") Wrapper<JinggaoxinxiEntity> wrapper);
   	
   	List<JinggaoxinxiView> selectListView(Wrapper<JinggaoxinxiEntity> wrapper);
   	
   	JinggaoxinxiView selectView(@Param("ew") Wrapper<JinggaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinggaoxinxiEntity> wrapper);
   	

}

