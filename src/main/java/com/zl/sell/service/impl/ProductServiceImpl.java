package com.zl.sell.service.impl;

import com.zl.sell.dataobject.ProductInfo;
import com.zl.sell.dto.CartDTO;
import com.zl.sell.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品服务实现类
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public ProductInfo findOne(String productId) {
        return null;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return null;
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return null;
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    public void decreaseStock(List<CartDTO> cartDTOList) {

    }
}
