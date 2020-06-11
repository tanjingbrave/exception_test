package cn.mainfunc.test.service.impl;


import cn.mainfunc.test.model.Company;
import cn.mainfunc.test.model.JsonResult;
import cn.mainfunc.test.service.UserServices;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: mf014
 * @Date: 2020/5/12 15:18
 * @Description
 */
@Service
public class UserServicesImpl  implements UserServices {

    @Override
    public JSONObject selectUser() {
    //   List<Company> companies = userMapper.selectUser();

        JSONObject success = JsonResult.success();
        System.out.println(success.toString());

        return JsonResult.success();
    }
}
