package net.dg.departmentservice.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dg.departmentservice.entity.Department;
import net.dg.departmentservice.repository.DepartmentRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
