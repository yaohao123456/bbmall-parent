package cn.itsource.bbmall.service.impl;

import cn.itsource.bbmall.domain.ProductType;
import cn.itsource.bbmall.mapper.ProductTypeMapper;
import cn.itsource.bbmall.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author yh
 * @version V1.0
 * @className ProductTypeServiceImpl
 * @date 2019/5/17
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper,ProductType> implements IProductTypeService {
}
