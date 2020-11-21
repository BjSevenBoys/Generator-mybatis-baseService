package com.lxmall.mainframe.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.lxmall.mainframe.model.Page;
import com.lxmall.mainframe.dao.TestDao;
import com.lxmall.mainframe.model.TestModel;
import com.lxmall.mainframe.service.TestService;
import com.lxmall.mainframe.utils.ParamValidateUtils;

/** 
 * Description: [用户表服务实现]
 * Created on 2020年11月21日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2020年 乐享商城  
 */
@Service("testService")
public class TestServiceImpl implements TestService {
	
	/**
	 * <p>Discription:[用户表dao]</p>
	 */	
	@Resource
	private TestDao testDao;
	
	/**
	 * <p>Discription:[用户表数据分页查询]</p>
	 * Created on 2020年11月21日
	 * @param pager 用户表数据分页条件
	 * @param testModel 用户表数据查询条件
	 * @param queryFields 用户表数据查询字段
	 * @return List<TestModel>分页数据
	 *													       	 
	 * @author:钱永飞
	 */
	public List<TestModel> queryPageTest(Page page,TestModel testModel,
			String queryFields){
			
		List<TestModel> listTest = new ArrayList<TestModel>();
		try{
			//判断参数是否为空
			if(ParamValidateUtils.isEmpty(page)){
				return null;
			}else{
				List<String> lis = new ArrayList<String>();
				if(ParamValidateUtils.isEmpty(queryFields)){
					lis = null;
				}else{
					lis = Arrays.asList(queryFields.split(","));
				}
				listTest = this.testDao.queryPageTest(page,testModel,lis);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return listTest;
	}
	
	
	/**
	 * <p>Discription:[用户表数据不分页查询]</p>
	 * Created on 2020年11月21日
	 * @param testModel 用户表数据查询条件
	 * @param queryFields 用户表数据查询字段
	 * @return List<TestModel>数据
	 *													       	 
	 * @author:钱永飞
	 */
	public List<TestModel> queryListTest(TestModel testModel,String queryFields){
	
		List<TestModel> listTest = new ArrayList<TestModel>();
		try{
			List<String> lis = new ArrayList<String>();
			if(ParamValidateUtils.isEmpty(queryFields)){
				lis = null;
			}else{
				lis = Arrays.asList(queryFields.split(","));
			}
			listTest = this.testDao.queryListTest(testModel,lis);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return listTest;
	}
	
	
	/**
	 * <p>Discription:[用户表数据查询总条数]</p>
	 * Created on 2020年11月21日
	 * @param testModel 用户表数据查询条件
	 * @return 查询条数	 
	 * @author:钱永飞
	 */
	public Long queryCountTest(TestModel testModel){
		
		Long count = (long)0;
		try{
			count = this.testDao.queryCountTest(testModel);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[根据id查询用户表数据]</p>
	 * Created on 2020年11月21日
	 * @param id 用户表数据id
	 * @return TestModel 单条数据	 
	 * @author:钱永飞
	 */
	public TestModel queryTestById(String id){
		
		TestModel model = new TestModel();
		try{
			if(ParamValidateUtils.isEmpty(id)){
				return null;
			}else{
				model = this.testDao.queryTestById(id,null);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return model;
	}
	
	/**
	 * <p>Discription:[用户表数据新增]</p>
	 * Created on 2020年11月21日
	 * @param testModel 用户表数据
	 * @return String 添加成功的id
	 
	 * @author:钱永飞
	 */
	public int save(TestModel testModel){
	
		int count = 0;
		try{
			if(ParamValidateUtils.isEmpty(testModel)){
				return 0;
			}else{
				count = this.testDao.addTest(testModel);
			}
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[用户表数据编辑]</p>
	 * Created on 2020年11月21日
	 * @param testModel 用户表数据
	 * @return 成功条数 	
	 *								    
	 * @author:钱永飞
	 */
	public int edit(TestModel testModel){
		
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(testModel) || ParamValidateUtils.isEmpty(testModel.getId())){
				return 0;
			}else{
				count = this.testDao.updateTest(testModel);
			}	
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[用户表数据删除]</p>
	 * Created on 2020年11月21日
	 * @param id 用户表数据id
	 * @return 成功条数 	
	 *								   
	 * @author:钱永飞
	 */
	public int removeTestById(String id){
	
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(id)){
				return 0;
			}else{
				count = this.testDao.removeTestById(id);
			}		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[用户表数据批量删除]</p>
	 * Created on 2020年11月21日
	 * @param ids 用户表数据id的集合
	 * @return 成功条数
	 *								  	 
	 * @author:钱永飞
	 */
	public int removeTestByIds(String ids){
		
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(ids)){
				return 0;
			}else{
				List<String> lis = Arrays.asList(ids.split(","));
				count = this.testDao.removeTestByIds(lis);
			}
						
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}

}