package com.xqtools.memorydbtools.controller;


import cn.hutool.json.JSONObject;
import com.xqtools.memorydbtools.dao.ToolDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/dbtool")
public class ToolController {

    private static final Logger logger = LoggerFactory.getLogger(ToolController.class);

    @Autowired
    ToolDao toolDao;

    @PostMapping(value = "/dataindb")
    public JSONObject dataInDB(@RequestBody Map<String,Object> pmap){
        logger.info("入参[{}]",pmap);
        toolDao.createTable(pmap);
        toolDao.insertTable(pmap);
        JSONObject rspJson = new JSONObject();
        rspJson.set("rspcode",0);
        rspJson.set("rspmsg","成功");

        return rspJson;
    }
}
