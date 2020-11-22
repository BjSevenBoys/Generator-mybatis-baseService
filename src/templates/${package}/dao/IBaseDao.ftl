package ${package}.dao;

import ${package}.model.${className};
import ${package}.model.Page;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/** 
 * Description: [${table.tableDesc}dao]
 * Created on ${date}
 * @author 7Stars
 * @version 1.0 
 * Copyright (c) Copyright (c) ${year} 7Stars
 */
public interface IBaseDao<T>{

	T findById (@Param("id") String id);

	T save (T t);

	int updateById (T t);

	int deleteById (@Param("id") String id);

	/**
	* 分页查询固定参数
	*/
	List<${className}> queryPage${className}(@Param("page")Page page, @Param("entity")${className} entity, @Param("queryFields")List queryFields);
	
	
	/**
	* 查询固定参数
	*/
	List<${className}> queryList${className}(@Param("entity")${className} entity, @Param("queryFields")List queryFields);
	
	
	/**
	* 查询总数量
	*/
	Long queryCount${className}(@Param("entity")${className} entity);
	
	/**
	* 查询单个实体
	*/
	${className} query${className}ById(@Param("id")String id,  @Param("queryFields")List queryFields);
	
	/**
	* <!-- 新增 -->
	*/
	int add${className}(${className} entity);
	
	/**
	* <!-- 修改 -->
	*/
	int update${className}(${className} entity);
	
	/**
	* <!-- 批量删除 -->
	*/
	int remove${className}ByIds(List code);
	
	/**
	* <!-- 删除 -->
	*/
	int remove${className}ById(@Param("id")String id);
	
	
}
