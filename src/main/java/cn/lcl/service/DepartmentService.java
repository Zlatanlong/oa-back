package cn.lcl.service;

import cn.lcl.pojo.Department;
import cn.lcl.pojo.result.Result;

public interface DepartmentService {
    Result<Department> addDepartment(Department department);
}