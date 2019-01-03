package com.zl.sell.repository;

import com.zl.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductinfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productinfoRepository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("汤圆");
        productInfo.setProductPrice(new BigDecimal(1.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("元宵必备！");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = productinfoRepository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() {

        List<ProductInfo> productInfoList = productinfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());

    }
}