package com.jiangbei.test.controller;

import com.jiangbei.test.pojo.DEPT;
import com.jiangbei.test.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/14 19:17
 * @Version: 1.0
 * @Description:测试查询controller
 */
@Controller
public class selectItemsController {
    @Autowired
    private MyService MyService;

    @RequestMapping("select")
    @ResponseBody
    public DEPT select(String id){
        int i = Integer.parseInt(id);
        DEPT dict = MyService.select(i);
        return dict;
    }
}
