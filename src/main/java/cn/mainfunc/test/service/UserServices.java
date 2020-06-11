package cn.mainfunc.test.service;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author: mf014
 * @Date: 2020/5/12 15:26
 * @Description
 */
@Service
public interface UserServices {

    JSONObject selectUser();
}
