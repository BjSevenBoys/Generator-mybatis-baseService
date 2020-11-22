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


     public	int  findById (${className} ${classNameLower});




     public	int  save (${className} ${classNameLower});

     public	int  updateById (${className} ${classNameLower});

     public	int  delete (${className} ${classNameLower});


}
