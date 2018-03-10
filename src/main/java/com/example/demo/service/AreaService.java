package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaService {
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
    boolean insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
