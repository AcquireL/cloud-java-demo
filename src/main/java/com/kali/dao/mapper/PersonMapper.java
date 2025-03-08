package com.kali.dao.mapper;

import com.kali.dao.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface PersonMapper {
    @Select("SELECT * FROM person WHERE name = #{name}")
    Person findByName(String name);

    @Select("SELECT * FROM person")
    List<Person> findAll();
}
