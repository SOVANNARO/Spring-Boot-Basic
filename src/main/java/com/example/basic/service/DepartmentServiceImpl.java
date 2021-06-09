package com.example.basic.service;

import com.example.basic.entity.Department;
import com.example.basic.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department testdb = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDeName()) && !"".equalsIgnoreCase(department.getDeName())) {
            testdb.setDeName(department.getDeName());
        }

        if (Objects.nonNull(department.getDeAddress()) && !"".equalsIgnoreCase(department.getDeAddress())) {
            testdb.setDeAddress(department.getDeAddress());
        }

        if (Objects.nonNull(department.getDeCode()) && !"".equalsIgnoreCase(department.getDeCode())) {
            testdb.setDeCode(department.getDeCode());
        }

        return departmentRepository.save(testdb);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return null;
    }
}
