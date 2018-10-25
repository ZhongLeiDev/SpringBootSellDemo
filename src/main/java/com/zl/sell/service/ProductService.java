package com.zl.sell.service;

import com.zl.sell.dataobject.ProductInfo;
import com.zl.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品列表
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //增加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减少库存
    void decreaseStock(List<CartDTO> cartDTOList);

}
