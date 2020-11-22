package ${package}.model;

import java.io.Serializable;
/** 
 *  Description: [${table.tableDesc}model]
 * Created on ${date}
 * @author 7Stars
 * @version 1.0 
 * Copyright (c) 2016 乐享商城  
 */
public class ${className}  implements Serializable {

	private static final long serialVersionUID = 1L;

<#list table.columns as column>
	/**
     * ${column.label}
     */
	private ${column.type} ${column.name};
</#list>
	
	// setter and getter
<#list table.columns as column>
	/**
	*  Discription:[${column.label}]
	* Created on ${date}
	* @return ${column.type}
    * @author:${author}
    */
	public ${column.type} get${column.nameUpper}(){
		return ${column.name};
	}
	/**
	*  Discription:[${column.label}]
	* Created on ${date}
	* @author:${author}
	*/
	public void set${column.nameUpper}(${column.type} ${column.name}){
		this.${column.name} = ${column.name};
	}
</#list>
}
