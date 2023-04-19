package com.dao;

import java.util.List;
import java.util.Map;

public interface employeeMapper {
       List<Map<String,Object>> queryEmployees();
       Map<String,Object> queryEmployee(Integer id);

}
