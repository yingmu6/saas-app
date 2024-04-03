package com.orange.core.impl;

import com.orange.core.IBaseDAO;
import com.orange.core.entity.BaseDO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDAO<T extends BaseDO> extends SqlSessionDaoSupport implements IBaseDAO<T> {

     public String nameSpace;

    public SqlSessionFactory sqlSessionFactory;

    public BaseDAO() {
        this.nameSpace = this.getClass().getCanonicalName() + ".";
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public void add(T t) {
        this.executeInsert(nameSpace + "add", t);
    }


    @Override
    public int update(T t) {
        return this.executeUpdate(nameSpace + "update", t);
    }


    @Override
    public T getById(Object id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);
        return this.queryForObject(this.nameSpace + "getById", paramMap);
    }

    @Override
    public List<T> findList(Object t) {
        return this.queryForList(this.nameSpace + "findList", t);
    }

    @Override
    public int remove(Object id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);
        return this.executeDelete(this.nameSpace + "remove", paramMap);
    }

    protected T queryForObject(String statementName, Object parameterObject) {
        T object = this.getSqlSession().selectOne(statementName, parameterObject);
        return object;
    }

    protected List<T> queryForList(String statementName, Object parameterObject) {
        List<T> objectList = this.getSqlSession().selectList(statementName, parameterObject);
        return objectList;
    }

    protected int executeUpdate(String statementName, Object parameterObject) {
        int updateRows = this.getSqlSession().update(statementName, parameterObject);
        return updateRows;
    }

    protected Object executeInsert(String statementName, Object parameterObject) {
        Object back = null;
        back = this.getSqlSession().insert(statementName, parameterObject);
        return back;
    }

    protected int executeDelete(String statementName, Object parameterObject) {
        int updateRows = this.getSqlSession().delete(statementName, parameterObject);
        return updateRows;
    }
}
