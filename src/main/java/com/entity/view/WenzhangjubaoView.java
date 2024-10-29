package com.entity.view;

import com.entity.WenzhangjubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文章举报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 23:20:36
 */
@TableName("wenzhangjubao")
public class WenzhangjubaoView  extends WenzhangjubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhangjubaoView(){
	}
 
 	public WenzhangjubaoView(WenzhangjubaoEntity wenzhangjubaoEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhangjubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
