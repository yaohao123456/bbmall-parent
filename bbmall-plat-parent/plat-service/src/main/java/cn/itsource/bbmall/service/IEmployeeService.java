package cn.itsource.bbmall.service;

import cn.itsource.bbmall.domain.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IEmployeeService extends IService<Employee> {
    Employee login(String username, String password);
}
