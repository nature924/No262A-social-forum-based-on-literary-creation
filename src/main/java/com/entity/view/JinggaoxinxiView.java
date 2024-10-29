package com.entity.view;

import com.entity.JinggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 警告信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 23:20:36
 */
@TableName("jinggaoxinxi")
public class JinggaoxinxiView  extends JinggaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinggaoxinxiView(){
	}
 
 	public JinggaoxinxiView(JinggaoxinxiEntity jinggaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jinggaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
