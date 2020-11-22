package ${package}.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ${package}.model.Page;
import ${package}.dao.IBaseDao;
import ${package}.model.${className};
import ${package}.service.IBaseService;

/** 
 * Description: [${table.tableDesc}服务实现]
 * Created on ${date}
 * @author 7Stars
 * @version 1.0 
 * Copyright (c) ${year} 7Stars
 */
public class BaseServiceImpl<T> implements IBaseService<T> {

		private IBaseDao<T> baseDao;

		public void setBaseDao(IBaseDao<T> baseDao) {
			this.baseDao = baseDao;
		}

		public	T  save (T t){
			return baseDao.save (t);
		}
		public	int  deleteById (String id){
			return baseDao.deleteById (id);
		}
		public	int  updateById (T t){
			return baseDao.updateById (t);
		}
		public	T  findById (String id){
		    return baseDao.findById (id);
		}
		

		

		




}