package com.jiangbei.test.service;

import com.jiangbei.test.dao.BaseDao;
import com.jiangbei.test.pojo.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/14 19:15
 * @Version: 1.0
 * @Description:
 */
@Service("service")
public class service {
    @Autowired
    private BaseDao baseDao;
    public Dict select(int id){
        Dict dict = baseDao.selectById(id);
        return dict;
    }
}
