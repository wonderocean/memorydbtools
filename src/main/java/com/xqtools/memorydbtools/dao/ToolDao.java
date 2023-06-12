package com.xqtools.memorydbtools.dao;

import java.util.Map;

public interface ToolDao {
    public int createTable(Map<String,Object> pmap);
    public int insertTable(Map<String,Object> pmap);
}
