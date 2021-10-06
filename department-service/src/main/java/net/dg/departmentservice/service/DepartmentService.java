package net.dg.departmentservice.service;

import net.dg.departmentservice.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);
    Department findDepartmentById(Long departmentId);
}
