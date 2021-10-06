package net.dg.departmentservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dg.departmentservice.entity.Department;
import net.dg.departmentservice.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
