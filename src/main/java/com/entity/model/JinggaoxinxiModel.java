package com.entity.model;

import com.entity.JinggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 警告信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-18 23:20:36
 */
public class JinggaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章类型
	 */
	
	private String wenzhangleixing;
		
	/**
	 * 发布者
	 */
	
	private String fabuzhe;
		
	/**
	 * 警告内容
	 */
	
	private String jinggaoneirong;
		
	/**
	 * 警告时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinggaoshijian;
				
	
	/**
	 * 设置：文章类型
	 */
	 
	public void setWenzhangleixing(String wenzhangleixing) {
		this.wenzhangleixing = wenzhangleixing;
	}
	
	/**
	 * 获取：文章类型
	 */
	public String getWenzhangleixing() {
		return wenzhangleixing;
	}
				
	
	/**
	 * 设置：发布者
	 */
	 
	public void setFabuzhe(String fabuzhe) {
		this.fabuzhe = fabuzhe;
	}
	
	/**
	 * 获取：发布者
	 */
	public String getFabuzhe() {
		return fabuzhe;
	}
				
	
	/**
	 * 设置：警告内容
	 */
	 
	public void setJinggaoneirong(String jinggaoneirong) {
		this.jinggaoneirong = jinggaoneirong;
	}
	
	/**
	 * 获取：警告内容
	 */
	public String getJinggaoneirong() {
		return jinggaoneirong;
	}
				
	
	/**
	 * 设置：警告时间
	 */
	 
	public void setJinggaoshijian(Date jinggaoshijian) {
		this.jinggaoshijian = jinggaoshijian;
	}
	
	/**
	 * 获取：警告时间
	 */
	public Date getJinggaoshijian() {
		return jinggaoshijian;
	}
			
}
