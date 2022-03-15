package com.cmbc.gulimall;


import com.cmbc.gulimall.dao.CategoryBrandRelationDao;
import com.cmbc.gulimall.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;

@SpringBootTest
class GuliProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryBrandRelationDao categoryBrandRelationDao;
    @Test
    void contextLoads() throws FileNotFoundException {

    }

}
