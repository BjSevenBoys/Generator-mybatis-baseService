package ${package}.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ${package}.model.Page;
import ${package}.dao.I${className}Dao;
import ${package}.model.${className};
import ${package}.service.I${className}Service;

/** 
 * Description: [${table.tableDesc}服务实现]
 * Created on ${date}
 * @author 7Stars
 * @version 1.0 
 * Copyright (c) ${year} 7Stars
 */
@Service("${classNameLower}Service")
public class ${className}ServiceImpl extends BaseServiceImpl<${className}>  implements I${className}Service {

		private I${className}Dao  ${classNameLower}Dao;


        @Resource
		private void setDao(I${className}Dao  ${classNameLower}Dao){
			this.${classNameLower}Dao = ${classNameLower}Dao;
			super.setBaseDao( ${classNameLower}Dao);
		}



}