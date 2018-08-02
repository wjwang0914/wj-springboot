package com.wj.springboot.mapper;

import com.wj.springboot.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user")
    @Results({
            @Result(property = "userName", column = "name"),
            @Result(property = "userId", column = "id", jdbcType = JdbcType.INTEGER)
    })
    List<User> listUserByMapper();//使用复杂的SQL可以是 @SelectProvider @UpdateProvider @InsertProvider @DeleteProvider等方式动态构造sql
}
