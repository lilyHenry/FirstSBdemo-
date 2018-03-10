package com.example.demo.dao;

import com.example.demo.entity.Area;

import java.util.List;

/**
 * Created by zyz on 2018/3/8.
 */
public interface AreaDao {
    /**
     * 查询所有的区域信息
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据ID查询区域信息
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 新增区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
