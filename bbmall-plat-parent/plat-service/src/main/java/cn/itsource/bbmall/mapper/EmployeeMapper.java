package cn.itsource.bbmall.mapper;

import cn.itsource.bbmall.domain.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yh
 * @version V1.0
 * @className EmployeeMapper
 * @date 2019/5/16
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
