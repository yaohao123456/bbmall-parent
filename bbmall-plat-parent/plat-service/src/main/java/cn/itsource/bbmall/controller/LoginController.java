package cn.itsource.bbmall.controller;

import cn.itsource.bbmall.domain.Employee;
import cn.itsource.bbmall.service.IEmployeeService;
import cn.itsource.bbmall.util.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yh
 * @version V1.0
 * @className LoginController
 * @date 2019/5/12
 */
@RestController
public class LoginController {

    @Autowired
    private IEmployeeService employeeService;

    @PostMapping("/login")
    @ApiOperation(value = "登录接口")
    public AjaxResult login(@RequestBody Map<String,Object> params){

        String username = (String) params.get("username");
        String password = (String) params.get("password");

        Employee employee = employeeService.login(username,password);

        if (null != employee){
            return new AjaxResult().setSuccess(true).setMessage("登陆成功");
        }else{
            //登录失败
            return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误!");
        }
    }
}
