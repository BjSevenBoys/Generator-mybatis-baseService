package com.lxmall.mainframe.service;

import java.util.List;

import com.lxmall.mainframe.model.Page;
import com.lxmall.mainframe.model.TestModel;

/**
 * Description: [用户表服务]
 * Created on 2020年11月21日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2020年 乐享商城  
 */
public interface TestService {
	
	
	/**
	 * <p>Discription:[用户表数据分页查询]</p>
	 * Created on 2020年11月21日
	 * @param pager 用户表数据分页条件
	 * @param testModel 用户表数据查询条件
	 * @param queryFields 用户表数据查询字段集合
	 * @return List<TestModel>分页数据
	 *													       	 
	 * @author:钱永飞
	 */
	 public	List<TestModel> queryPageTest(Page page, TestModel testModel, String queryFields);
	 
	 /**
	 * <p>Discription:[用户表数据不分页查询]</p>
	 * Created on 2020年11月21日
	 * @param pager 用户表数据分页条件
	 * @param testModel 用户表数据查询条件
	 * @param queryFields 用户表数据查询字段集合
	 * @return List<TestModel>分页数据
	 *													       	 
	 * @author:钱永飞
	 */
	 public	List<TestModel> queryListTest(TestModel testModel, String queryFields);
	
	/**
	 * <p>Discription:[用户表数据查询总条数]</p>
	 * Created on 2020年11月21日
	 * @param testModel 用户表数据查询条件
	 * @return 查询条数	 
	 * @author:钱永飞
	 */
	public Long queryCountTest(TestModel testModel);
	
	/**
	 * <p>Discription:[根据id查询用户表数据]</p>
	 * Created on 2020年11月21日
	 * @param id 用户表数据id
	 * @return TestModel 单条数据	 
	 * @author:钱永飞
	 */
	public TestModel queryTestById(String id);
	
	
	
	
	/**
	 * <p>Discription:[用户表数据新增]</p>
	 * Created on 2020年11月21日
	 * @param testModel 用户表数据
	 * @return String 添加成功的id
	 * @author:钱永飞
	 */
	public int save(TestModel testModel);
	
	/**
	 * <p>Discription:[用户表数据编辑]</p>
	 * Created on 2020年11月21日
	 * @param testModel 用户表数据
	 * @return 成功条数 
	 * @author:钱永飞
	 */
	public int edit(TestModel testModel);
	
	/**
	 * <p>Discription:[用户表数据删除]</p>
	 * Created on 2020年11月21日
	 * @param id 用户表数据id
	 * @return 成功条数 	
	 * @author:钱永飞
	 */
	public int removeTestById(String id);
	
	/**
	 * <p>Discription:[用户表数据批量删除]</p>
	 * Created on 2020年11月21日
	 * @param ids 用户表数据id的集合
	 * @return 成功条数 
	 * @author:钱永飞
	 */
	public int removeTestByIds(String ids);
	
}
