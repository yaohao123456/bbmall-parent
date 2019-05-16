package cn.itsource.bbmall.service.impl;

import cn.itsource.bbmall.domain.Employee;
import cn.itsource.bbmall.mapper.EmployeeMapper;
import cn.itsource.bbmall.service.IEmployeeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yh
 * @version V1.0
 * @className EmployeeServiceImpl
 * @date 2019/5/16
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements IEmployeeService{


    @Override
    public Employee login(String username, String password) {
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username ).eq("password",password );
        return baseMapper.selectOne(wrapper);
    }
}
