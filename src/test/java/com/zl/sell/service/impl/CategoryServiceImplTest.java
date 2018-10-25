package com.zl.sell.service.impl;

import com.zl.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @Test
    public void findOne() {

        ProductCategory productCategory = categoryServiceImpl.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());

    }

    @Test
    public void findAll() {

        List<ProductCategory> productCategoryList = categoryServiceImpl.findAll();
        Assert.assertNotEquals(0, productCategoryList.size());

    }

    @Test
    public void findByCategoryTypeIn() {

        List<ProductCategory> productCategoryList = categoryServiceImpl.findByCategoryTypeIn(Arrays.asList(1,2,3,5,10));
        Assert.assertNotEquals(0, productCategoryList.size());

    }

    @Test
    public void save() {

        ProductCategory productCategory = new ProductCategory("动漫游戏", 8);
        ProductCategory result = categoryServiceImpl.save(productCategory);
        Assert.assertNotNull(result);

    }
}