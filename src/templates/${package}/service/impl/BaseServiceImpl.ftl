package ${package}.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ${package}.model.Page;
import ${package}.dao.${className}Dao;
import ${package}.model.${className};
import ${package}.service.I${className}Service;
import com.lxmall.mainframe.utils.ParamValidateUtils;

/** 
 * Description: [${table.tableDesc}服务实现]
 * Created on ${date}
 * @author 7Stars
 * @version 1.0 
 * Copyright (c) ${year} 7Stars
 */
@Service("${classNameLower}Service")
public class ${className}ServiceImpl implements I${className}Service {
	
	/**
	 *  Discription:[${table.tableDesc}dao]
	 */	
	@Resource
	private ${className}Dao ${classNameLower}Dao;
	
	/**
	 *  Discription:[${table.tableDesc}数据分页查询]
	 * Created on ${date}
	 * @param pager ${table.tableDesc}数据分页条件
	 * @param ${classNameLower}Model ${table.tableDesc}数据查询条件
	 * @param queryFields ${table.tableDesc}数据查询字段
	 * @return List<${className}>分页数据
	 *													       	 
	 * @author:${author}
	 */
	public List<${className}> queryPage${className}(Page page,${className} ${classNameLower}Model,
			String queryFields){
			
		List<${className}> list${className} = new ArrayList<${className}>();
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
				list${className} = this.${classNameLower}Dao.queryPage${className}(page,${classNameLower}Model,lis);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return list${className};
	}
	
	
	/**
	 *  Discription:[${table.tableDesc}数据不分页查询]
	 * Created on ${date}
	 * @param ${classNameLower}Model ${table.tableDesc}数据查询条件
	 * @param queryFields ${table.tableDesc}数据查询字段
	 * @return List<${className}>数据
	 *													       	 
	 * @author:${author}
	 */
	public List<${className}> queryList${className}(${className} ${classNameLower}Model,String queryFields){
	
		List<${className}> list${className} = new ArrayList<${className}>();
		try{
			List<String> lis = new ArrayList<String>();
			if(ParamValidateUtils.isEmpty(queryFields)){
				lis = null;
			}else{
				lis = Arrays.asList(queryFields.split(","));
			}
			list${className} = this.${classNameLower}Dao.queryList${className}(${classNameLower}Model,lis);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return list${className};
	}
	
	
	/**
	 *  Discription:[${table.tableDesc}数据查询总条数]
	 * Created on ${date}
	 * @param ${classNameLower}Model ${table.tableDesc}数据查询条件
	 * @return 查询条数	 
	 * @author:${author}
	 */
	public Long queryCount${className}(${className} ${classNameLower}Model){
		
		Long count = (long)0;
		try{
			count = this.${classNameLower}Dao.queryCount${className}(${classNameLower}Model);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 *  Discription:[根据id查询${table.tableDesc}数据]
	 * Created on ${date}
	 * @param id ${table.tableDesc}数据id
	 * @return ${className} 单条数据
	 * @author:${author}
	 */
	public ${className} query${className}ById(String id){
		
		${className} model = new ${className}();
		try{
			if(ParamValidateUtils.isEmpty(id)){
				return null;
			}else{
				model = this.${classNameLower}Dao.query${className}ById(id,null);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return model;
	}
	
	/**
	 *  Discription:[${table.tableDesc}数据新增]
	 * Created on ${date}
	 * @param ${classNameLower}Model ${table.tableDesc}数据
	 * @return String 添加成功的id
	 
	 * @author:${author}
	 */
	public int save(${className} ${classNameLower}Model){
	
		int count = 0;
		try{
			if(ParamValidateUtils.isEmpty(${classNameLower}Model)){
				return 0;
			}else{
				count = this.${classNameLower}Dao.add${className}(${classNameLower}Model);
			}
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 *  Discription:[${table.tableDesc}数据编辑]
	 * Created on ${date}
	 * @param ${classNameLower}Model ${table.tableDesc}数据
	 * @return 成功条数 	
	 *								    
	 * @author:${author}
	 */
	public int edit(${className} ${classNameLower}Model){
		
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(${classNameLower}Model) || ParamValidateUtils.isEmpty(${classNameLower}Model.get${modelIdFirstUpper}())){
				return 0;
			}else{
				count = this.${classNameLower}Dao.update${className}(${classNameLower}Model);
			}	
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 *  Discription:[${table.tableDesc}数据删除]
	 * Created on ${date}
	 * @param id ${table.tableDesc}数据id
	 * @return 成功条数 	
	 *								   
	 * @author:${author}
	 */
	public int remove${className}ById(String id){
	
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(id)){
				return 0;
			}else{
				count = this.${classNameLower}Dao.remove${className}ById(id);
			}		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 *  Discription:[${table.tableDesc}数据批量删除]
	 * Created on ${date}
	 * @param ids ${table.tableDesc}数据id的集合
	 * @return 成功条数
	 *								  	 
	 * @author:${author}
	 */
	public int remove${className}ByIds(String ids){
		
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(ids)){
				return 0;
			}else{
				List<String> lis = Arrays.asList(ids.split(","));
				count = this.${classNameLower}Dao.remove${className}ByIds(lis);
			}
						
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}

}