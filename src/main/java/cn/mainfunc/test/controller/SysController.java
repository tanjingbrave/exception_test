package cn.mainfunc.test.controller;

import cn.mainfunc.test.service.UserServices;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: mf014
 * @Date: 2020/5/12 15:10
 * @Description
 */
@RestController
public class SysController {
    @Autowired
    private UserServices userServices;
@RequestMapping(value = "/user",method = RequestMethod.POST )
@ResponseBody
    public JSONObject selectUser() {


        return userServices.selectUser();
    }

}
