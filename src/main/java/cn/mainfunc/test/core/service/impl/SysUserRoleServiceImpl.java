package cn.mainfunc.test.core.service.impl;

import cn.mainfunc.test.core.dao.SysUserRoleDao;
import cn.mainfunc.test.core.entity.SysUserRoleEntity;
import cn.mainfunc.test.core.service.SysUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @Description 用户与角色业务实现
 * @Author Sans
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

}