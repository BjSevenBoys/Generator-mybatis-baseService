package com.lxmall.mainframe.model;

import java.io.Serializable;
/** 
 * <p>Description: [用户表model]</p>
 * Created on 2020年11月21日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2016 乐享商城  
 */
public class TestModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 
     */
	private String name;
	
	// setter and getter
	/**
	* <p>Discription:[]</p>
	* Created on 2020年11月21日
	* @return Integer
    * @author:钱永飞
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[]</p>
	* Created on 2020年11月21日
	* @author:钱永飞
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[]</p>
	* Created on 2020年11月21日
	* @return String
    * @author:钱永飞
    */
	public String getName(){
		return name;
	}
	/**
	* <p>Discription:[]</p>
	* Created on 2020年11月21日
	* @author:钱永飞
	*/
	public void setName(String name){
		this.name = name;
	}
}
