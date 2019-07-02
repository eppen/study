package com.bage.study.mybatis.springboot.org.dao;

import com.bage.study.mybatis.springboot.org.domain.DepartmentAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentAddressMapper {

    int insert(DepartmentAddress departmentAddress);
    int batchInsert(List<DepartmentAddress> departmentAddresses);

    int delete(long id);

    int update(DepartmentAddress departmentAddress);

    List<DepartmentAddress> queryAll();
    List<DepartmentAddress> queryByDepartmentId(long departmentId);

}
