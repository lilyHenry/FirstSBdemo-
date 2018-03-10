package com.example.demo.controller;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private Map<String, Object> listArea(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Area> list = areaService.queryArea();
        map.put("areaList" ,list);
        return map;
    }

    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(Integer areaId){
        Map<String, Object> map = new HashMap<String, Object>();
        Area area = areaService.queryAreaById(areaId);
        map.put("area" ,area);
        return map;
    }

    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> map = new HashMap<String, Object>();
        boolean flag = areaService.insertArea(area);
        map.put("success",flag);
        return map;
    }
    @RequestMapping(value = "/updatearea", method = RequestMethod.POST)
    private Map<String, Object> updateArea(@RequestBody Area area){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success",areaService.updateArea(area));
        return map;
    }

    @RequestMapping(value = "/deletearea", method = RequestMethod.POST)
    private Map<String, Object> deleteArea(Integer areaId){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success",areaService.deleteArea(areaId));
        return map;
    }
}
