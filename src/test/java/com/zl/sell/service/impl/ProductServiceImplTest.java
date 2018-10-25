package com.zl.sell.service.impl;

import com.zl.sell.dataobject.ProductInfo;
import com.zl.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private  ProductServiceImpl productService;

    @Test
    public void findOne() {

        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId());

    }

    @Test
    public void findUpAll() {

        List<ProductInfo> result = productService.findUpAll();
        Assert.assertNotEquals(0, result.size());

    }

    @Test
    public void findAll() {

        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0, productInfoPage.getTotalElements());

    }

    @Test
    public void save() {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("小龙虾");
        productInfo.setProductPrice(new BigDecimal(1.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("小龙虾呀，好好吃呀");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);

    }
}