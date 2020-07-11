package com.jiangbei.test.service;

import com.jiangbei.test.dao.BaseDao;
import com.jiangbei.test.pojo.DEPT;
import com.jiangbei.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/14 19:15
 * @Version: 1.0
 * @Description:
 */
@Service("service")
public class MyService {
    @Autowired
    private BaseDao baseDao;
    public DEPT select(int id){
        DEPT dict = baseDao.selectById(id);
        return dict;
    }

    public boolean login(User user) {
        return true;
    }

    public boolean register(User user) {
       return baseDao.register(user);
    }
}
