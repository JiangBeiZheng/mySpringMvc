package com.jiangbei.test.dao;

import com.jiangbei.test.pojo.Dict;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/14 19:03
 * @Version: 1.0
 * @Description:
 */
@Component("BaseDao")
public class BaseDao {
    @Autowired
  private SqlSessionFactory sqlSessionFactory;

   /* public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }*/
    public Dict selectById(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Dict dict = sqlSession.selectOne("queryUserById", id);
        sqlSession.close();
        return dict;
    }
}
