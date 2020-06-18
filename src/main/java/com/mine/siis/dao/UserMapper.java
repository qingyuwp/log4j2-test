package com.mine.siis.dao;

import com.mine.siis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id} ")
    User findUserById(Integer id);

}
