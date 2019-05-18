package cn.itsource.bbmall.service.impl;

import cn.itsource.bbmall.domain.Brand;
import cn.itsource.bbmall.mapper.BrandMapper;
import cn.itsource.bbmall.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author yh
 * @version V1.0
 * @className BrandServiceImpl
 * @date 2019/5/17
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper,Brand> implements IBrandService {
}
