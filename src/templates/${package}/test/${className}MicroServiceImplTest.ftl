<#--package ${package}.service.impl;-->

<#--import java.util.ArrayList;-->
<#--import java.util.List;-->

<#--import javax.annotation.Resource;-->
<#--import org.junit.Test;-->
<#--import ${package}.model.${className};-->
<#--import ${package}.test.common.BaseTestCase;-->
<#--import ${package}.service.${className}MicroService;-->
<#--import com.camelot.openplatform.common.bean.Pager;-->

<#--/** -->
 <#--*  Description: [${table.tableDesc} 单元测试类]-->
 <#--* Created on ${date}-->
 <#--* @author 7Stars-->
 <#--* @version 1.0 -->
 <#--* Copyright (c) Copyright (c) ${year} 7Stars-->
 <#--*/-->
<#--public class ${className}MicroServiceImplTest extends BaseTestCase{-->
	<#--@Resource-->
	<#--private ${className}MicroService ${classNameLower}MicroService;-->

	<#--/**-->
	 <#--*  Discription:[${table.tableDesc}分页查询数据]-->
	 <#--* Created on ${date}-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void queryPage(){-->
		<#--List<String> queryFields = new ArrayList<String>();-->
		<#--queryFields.add("id");-->
		<#--${className} ${classNameLower}Model = new ${className}();-->
		<#--List<${className}> list = ${classNameLower}MicroService.queryPage(${classNameLower}Model, new Pager(), null, queryFields);-->
		<#--for(${className} model: list){-->
			<#--System.out.println(model.getId());-->
		<#--}-->
	<#--}-->
	<#---->
	<#--/**-->
	 <#--*  Discription:[${table.tableDesc}查询数据(不分页)]-->
	 <#--* Created on ${date}-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void queryList(){-->
		<#--List<String> queryFields = new ArrayList<String>();-->
		<#--queryFields.add("id");-->
		<#--${className} ${classNameLower}Model = new ${className}();-->
		<#--List<${className}> list = ${classNameLower}MicroService.queryList(${classNameLower}Model, null, queryFields);-->
		<#--for(${className} model: list){-->
			<#--System.out.println(model.getId());-->
		<#--}-->
	<#--}-->
	<#---->
	<#--/**-->
	 <#--*  Discription:[${table.tableDesc}查询总条数]-->
	 <#--* Created on ${date}-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void queryCount(){-->
		<#--${className} ${classNameLower}Model = new ${className}();-->
		<#--Long count = ${classNameLower}MicroService.queryCount(${classNameLower}Model, null);-->
		<#--System.out.println(count);-->
	<#--}-->
	<#---->
	<#--/**-->
	 <#--*  Discription:[根据id查询${table.tableDesc}]-->
	 <#--* Created on 2017年02月20日-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void queryById(){-->
		<#--List<String> queryFields = new ArrayList<String>();-->
		<#--queryFields.add("id");-->
		<#--${className} model = ${classNameLower}MicroService.queryById(1l, queryFields);-->
		<#--System.out.println(model);-->
	<#--}-->
	<#---->
	<#--/**-->
	 <#--*  Discription:[${table.tableDesc}新增]-->
	 <#--* Created on ${date}-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void save(){-->
		<#--${className} ${classNameLower}Model = new ${className}();-->
<#--//		${classNameLower}Model.set-->
		<#--${classNameLower}MicroService.save(${classNameLower}Model);-->
	<#--}-->
	<#---->
	<#--/**-->
	 <#--*  Discription:[${table.tableDesc}编辑]-->
	 <#--* Created on ${date}-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void edit(){-->
		<#--${className} ${classNameLower}Model = new ${className}();-->
<#--//		${classNameLower}Model.set-->
		<#--${classNameLower}MicroService.edit(${classNameLower}Model);-->
	<#--}-->
	<#---->
	<#--/**-->
	 <#--*  Discription:[${table.tableDesc}单个删除]-->
	 <#--* Created on ${date}-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void deleteById(){-->
		<#--System.out.println(${classNameLower}MicroService.deleteById(1l));-->
	<#--}-->
	<#---->
	<#--/**-->
	 <#--*  Discription:[${table.tableDesc}批量删除]-->
	 <#--* Created on ${date}-->
	 <#--* @author:${author}-->
	 <#--*/-->
	<#--@Test-->
	<#--public void deleteByIds(){-->
		<#--List<Long> ids = new ArrayList<Long>();-->
		<#--ids.add(1l);-->
		<#--ids.add(2l);-->
		<#--System.out.println(${classNameLower}MicroService.deleteByIds(ids));-->
	<#--}-->
	<#---->
<#--}-->