package com.example.demo.dao;

import com.example.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zyz on 2018/3/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void queryArea() throws Exception {
        List<Area> list = areaDao.queryArea();
        assertEquals(1,list.size());
    }

    @Test
    @Ignore
    public void queryAreaById() throws Exception {

    }

    @Test
    @Ignore
    public void insertArea() throws Exception {

    }

    @Test
    @Ignore
    public void updateArea() throws Exception {

    }

    @Test
    @Ignore
    public void deleteArea() throws Exception {

    }

}