package ${package}.service;

import java.util.List;



/**
 * Description: [${table.tableDesc}服务]
 * Created on ${date}
 * @author 7Stars
 * @version 1.0 
 * Copyright (c) ${year} 7Stars
 */
public interface IBaseService<T> {


     public	T  findById (String id);

     public	T  save (T t);

     public	int  updateById (T t);

     public	int  deleteById (String id);


}
