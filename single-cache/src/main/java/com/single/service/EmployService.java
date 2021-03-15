package com.single.service;

import com.single.domain.Employee;
import com.single.domain.mapper.EmploeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "emp")
@Service
public class EmployService {

    @Autowired
    EmploeeMapper emploeeMapper;

    @Cacheable(cacheNames = {"emp"})
    public Employee getEmpById(Integer id){
        System.out.println("查询" + id + "号员工");
        Employee employee = emploeeMapper.getEmpById(id);
        return  employee;
    }

    @CachePut(key = "#result.id")
    public Employee updateEmp(Employee employee){
        System.out.println("updateEmp "+employee);
        emploeeMapper.updateEmpById(employee);
        return  employee;
    }

}