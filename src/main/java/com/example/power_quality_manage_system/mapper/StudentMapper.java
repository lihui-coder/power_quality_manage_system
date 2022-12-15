package com.example.power_quality_manage_system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.power_quality_manage_system.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    @Select("select * from information")
    List<Student> find();
}
