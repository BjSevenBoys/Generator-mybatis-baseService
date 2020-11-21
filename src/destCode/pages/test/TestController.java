package com.lxmall.mainframe.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxmall.mainframe.dto.TestDTO;
import com.lxmall.mainframe.service.TestService;
import com.camelot.openplatform.common.Pager;
import com.camelot.openplatform.common.DataGrid;
import com.camelot.openplatform.common.ExecuteResult;

/** 
 * Description: [描述该类概要功能介绍]
 * Created on 2020年11月21日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2020年 乐享商城
 */
@Controller
@RequestMapping("/sellcenter/test")
public class TestController {
	private Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private TestService testService;
	
	
	/**
	 * <p>Discription:[分页查询XXXX集合数据]</p>
	 * Created on 2020年11月21日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/findtestsByPage")
	public String findtestsByPage(TestDTO testDTO,Pager pager,Model model){
		ExecuteResult<DataGrid<TestDTO>> er = this.testService.queryPage(testDTO,pager);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(er.isSuccess()){
			DataGrid<TestDTO> dg = er.getResult();
			if(dg != null){
				//将查询出的列表、总数量封装到分页实体中供页面使用
				pager.setRecords(dg.getRows());
				pager.setTotalCount(dg.getTotal().intValue());
			}
		}else{
			message = er.getErrorMessages().get(0);
		}
		model.addAttribute("pager", pager);
		model.addAttribute("message", message);
		model.addAttribute("testDTO", testDTO);
		return "/test/testList";
	}
	
	
	/**
	 * <p>Discription:[跳转到XXX新增页面]</p>
	 * Created on 2020年11月21日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/toSave")
	public String toSave(Model model){
		return "";
	}
	
	
	
	/**
	 * <p>Discription:[新增XXXX]</p>
	 * Created on 2020年11月21日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/save")
	public String save(Model model,TestDTO testDTO){
		ExecuteResult<Boolean> result = this.testService.save(testDTO);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(!result.isSuccess()){
			message = result.getErrorMessages().get(0);
		}
		model.addAttribute("message", message);
		return "";
	}
	
	/**
	 * <p>Discription:[跳转到XXX编辑页面]</p>
	 * Created on 2020年11月21日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/toEdit")
	public String toEdit(TestDTO testDTO,Model model){
		ExecuteResult<TestDTO> result = this.testService.queryTestDTOByCondition(testDTO);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(result.isSuccess()){
			testDTO = result.getResult();
		}else{
			message = result.getErrorMessages().get(0);
		}
		model.addAttribute("testDTO", testDTO);
		model.addAttribute("message", message);
		return "";
	}
	
	/**
	 * <p>Discription:[新增XXXX]</p>
	 * Created on 2020年11月21日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/edit")
	public String edit(TestDTO testDTO,Model model){
		ExecuteResult<Boolean> result = this.testService.edit(testDTO);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(!result.isSuccess()){
			message = result.getErrorMessages().get(0);
		}
		model.addAttribute("message", message);
		return "";
	}
	
	
	/**
	 * <p>Discription:[删除XXXX]</p>
	 * Created on 2020年11月21日
	 * @param ids需要删除的数据id集合
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/delTest")
	@ResponseBody
	public Map<String,String> delTest(String[] ids,Model model){
		Map<String,String> mapResult = new HashMap<String,String>();
		//存放执行结果
		String message = "";
		if(ids != null && ids.length > 0){
			//将需要删除的XXXX实体id存放到对应的dto中
			TestDTO testDTO;
			List<TestDTO> testDTOList = new ArrayList<TestDTO>();
			for(String id : ids){
				testDTO = new TestDTO();
				testDTO.setId(new Long(id));
				testDTOList.add(testDTO);
			}
			//删除XXXX
			ExecuteResult<Boolean> result = this.testService.delete(testDTOList);
			if(!result.isSuccess()){
				message = result.getErrorMessages().get(0);
			}
		}else{
			message = "没有要删除的项!";
		}
		mapResult.put("message",message);
		return mapResult;
	}
	
}
