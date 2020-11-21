package com.lxmall.mainframe.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.junit.Test;
import com.lxmall.mainframe.model.TestModel;
import com.lxmall.mainframe.test.common.BaseTestCase;
import com.lxmall.mainframe.service.TestMicroService;
import com.camelot.openplatform.common.bean.Pager;

/** 
 * <p>Description: [用户表 单元测试类]</p>
 * Created on 2020年11月21日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2016 乐享商城  
 */
public class TestMicroServiceImplTest extends BaseTestCase{
	@Resource
	private TestMicroService testMicroService;

	/**
	 * <p>Discription:[用户表分页查询数据]</p>
	 * Created on 2020年11月21日
	 * @author:钱永飞
	 */
	@Test
	public void queryPage(){
		List<String> queryFields = new ArrayList<String>();
		queryFields.add("id");
		TestModel testModel = new TestModel();
		List<TestModel> list = testMicroService.queryPage(testModel, new Pager(), null, queryFields);
		for(TestModel model: list){
			System.out.println(model.getId());
		}
	}
	
	/**
	 * <p>Discription:[用户表查询数据(不分页)]</p>
	 * Created on 2020年11月21日
	 * @author:钱永飞
	 */
	@Test
	public void queryList(){
		List<String> queryFields = new ArrayList<String>();
		queryFields.add("id");
		TestModel testModel = new TestModel();
		List<TestModel> list = testMicroService.queryList(testModel, null, queryFields);
		for(TestModel model: list){
			System.out.println(model.getId());
		}
	}
	
	/**
	 * <p>Discription:[用户表查询总条数]</p>
	 * Created on 2020年11月21日
	 * @author:钱永飞
	 */
	@Test
	public void queryCount(){
		TestModel testModel = new TestModel();
		Long count = testMicroService.queryCount(testModel, null);
		System.out.println(count);
	}
	
	/**
	 * <p>Discription:[根据id查询用户表]</p>
	 * Created on 2017年02月20日
	 * @author:钱永飞
	 */
	@Test
	public void queryById(){
		List<String> queryFields = new ArrayList<String>();
		queryFields.add("id");
		TestModel model = testMicroService.queryById(1l, queryFields);
		System.out.println(model);
	}
	
	/**
	 * <p>Discription:[用户表新增]</p>
	 * Created on 2020年11月21日
	 * @author:钱永飞
	 */
	@Test
	public void save(){
		TestModel testModel = new TestModel();
//		testModel.set
		testMicroService.save(testModel);
	}
	
	/**
	 * <p>Discription:[用户表编辑]</p>
	 * Created on 2020年11月21日
	 * @author:钱永飞
	 */
	@Test
	public void edit(){
		TestModel testModel = new TestModel();
//		testModel.set
		testMicroService.edit(testModel);
	}
	
	/**
	 * <p>Discription:[用户表单个删除]</p>
	 * Created on 2020年11月21日
	 * @author:钱永飞
	 */
	@Test
	public void deleteById(){
		System.out.println(testMicroService.deleteById(1l));
	}
	
	/**
	 * <p>Discription:[用户表批量删除]</p>
	 * Created on 2020年11月21日
	 * @author:钱永飞
	 */
	@Test
	public void deleteByIds(){
		List<Long> ids = new ArrayList<Long>();
		ids.add(1l);
		ids.add(2l);
		System.out.println(testMicroService.deleteByIds(ids));
	}
	
}