package com.jiangbei.test.controller;

import com.jiangbei.test.pojo.Dict;
import com.jiangbei.test.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/14 19:17
 * @Version: 1.0
 * @Description:
 */
@Controller
public class selectItemsController {
    @Autowired
    private service service;

    @RequestMapping("select")
    @ResponseBody
    public Dict select(){
        int id;
        id=10;
        Dict dict = service.select(id);
        return dict;
    }
}
