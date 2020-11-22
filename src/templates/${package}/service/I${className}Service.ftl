package ${package}.service;

import java.util.List;

import ${package}.model.Page;
import ${package}.model.${className};

/**
 * Description: [${table.tableDesc}服务]
 * Created on ${date}
 * @author 7Stars
 * @version 1.0 
 * Copyright (c) ${year} 7Stars
 */
public interface I${className}Service {
	
	
	/**
	 *  Discription:[${table.tableDesc}数据分页查询]
	 * Created on ${date}
	 * @param pager ${table.tableDesc}数据分页条件
	 * @param ${classNameLower}Model ${table.tableDesc}数据查询条件
	 * @param queryFields ${table.tableDesc}数据查询字段集合
	 * @return List<${className}>分页数据
	 *													       	 
	 * @author:${author}
	 */
	 public	List<${className}> queryPage${className}(Page page, ${className} ${classNameLower}Model, String queryFields);
	 
	 /**
	 *  Discription:[${table.tableDesc}数据不分页查询]
	 * Created on ${date}
	 * @param pager ${table.tableDesc}数据分页条件
	 * @param ${classNameLower}Model ${table.tableDesc}数据查询条件
	 * @param queryFields ${table.tableDesc}数据查询字段集合
	 * @return List<${className}>分页数据
	 *													       	 
	 * @author:${author}
	 */
	 public	List<${className}> queryList${className}(${className} ${classNameLower}Model, String queryFields);
	
	/**
	 *  Discription:[${table.tableDesc}数据查询总条数]
	 * Created on ${date}
	 * @param ${classNameLower}Model ${table.tableDesc}数据查询条件
	 * @return 查询条数	 
	 * @author:${author}
	 */
	public Long queryCount${className}(${className} ${classNameLower}Model);
	
	/**
	 *  Discription:[根据id查询${table.tableDesc}数据]
	 * Created on ${date}
	 * @param id ${table.tableDesc}数据id
	 * @return ${className} 单条数据
	 * @author:${author}
	 */
	public ${className} query${className}ById(String id);
	
	
	
	
	/**
	 *  Discription:[${table.tableDesc}数据新增]
	 * Created on ${date}
	 * @param ${classNameLower}Model ${table.tableDesc}数据
	 * @return String 添加成功的id
	 * @author:${author}
	 */
	public int save(${className} ${classNameLower}Model);
	
	/**
	 *  Discription:[${table.tableDesc}数据编辑]
	 * Created on ${date}
	 * @param ${classNameLower}Model ${table.tableDesc}数据
	 * @return 成功条数 
	 * @author:${author}
	 */
	public int edit(${className} ${classNameLower}Model);
	
	/**
	 *  Discription:[${table.tableDesc}数据删除]
	 * Created on ${date}
	 * @param id ${table.tableDesc}数据id
	 * @return 成功条数 	
	 * @author:${author}
	 */
	public int remove${className}ById(String id);
	
	/**
	 *  Discription:[${table.tableDesc}数据批量删除]
	 * Created on ${date}
	 * @param ids ${table.tableDesc}数据id的集合
	 * @return 成功条数 
	 * @author:${author}
	 */
	public int remove${className}ByIds(String ids);
	
}
