package com.lxmall.mainframe.dao;

import com.lxmall.mainframe.model.TestModel;
import com.lxmall.mainframe.model.Page;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/** 
 * <p>Description: [用户表dao]</p>
 * Created on 2020年11月21日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2016 乐享商城  
 */
public interface TestDao{
	
	/**
	* 分页查询固定参数
	*/
	List<TestModel> queryPageTest(@Param("page")Page page, @Param("entity")TestModel entity, @Param("queryFields")List queryFields);
	
	
	/**
	* 查询固定参数
	*/
	List<TestModel> queryListTest(@Param("entity")TestModel entity, @Param("queryFields")List queryFields);
	
	
	/**
	* 查询总数量
	*/
	Long queryCountTest(@Param("entity")TestModel entity);
	
	/**
	* 查询单个实体
	*/
	TestModel queryTestById(@Param("id")String id,  @Param("queryFields")List queryFields);
	
	/**
	* <!-- 新增 -->
	*/
	int addTest(TestModel entity);
	
	/**
	* <!-- 修改 -->
	*/
	int updateTest(TestModel entity);
	
	/**
	* <!-- 批量删除 -->
	*/
	int removeTestByIds(List code);
	
	/**
	* <!-- 删除 -->
	*/
	int removeTestById(@Param("id")String id);
	
	
}
