package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhangjubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhangjubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangjubaoView;


/**
 * 文章举报
 *
 * @author 
 * @email 
 * @date 2023-01-18 23:20:36
 */
public interface WenzhangjubaoService extends IService<WenzhangjubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhangjubaoVO> selectListVO(Wrapper<WenzhangjubaoEntity> wrapper);
   	
   	WenzhangjubaoVO selectVO(@Param("ew") Wrapper<WenzhangjubaoEntity> wrapper);
   	
   	List<WenzhangjubaoView> selectListView(Wrapper<WenzhangjubaoEntity> wrapper);
   	
   	WenzhangjubaoView selectView(@Param("ew") Wrapper<WenzhangjubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhangjubaoEntity> wrapper);
   	

}

