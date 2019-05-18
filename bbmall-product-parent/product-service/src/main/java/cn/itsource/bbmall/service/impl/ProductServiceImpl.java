package cn.itsource.bbmall.service.impl;

import cn.itsource.bbmall.domain.Product;
import cn.itsource.bbmall.mapper.ProductMapper;
import cn.itsource.bbmall.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author yh
 * @version V1.0
 * @className ProductServiceImpl
 * @date 2019/5/17
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper,Product> implements IProductService {
}
