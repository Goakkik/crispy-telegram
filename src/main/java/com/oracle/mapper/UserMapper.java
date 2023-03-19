package com.oracle.mapper;

import com.oracle.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    /**
     *                      根据用户名和密码找用户
     * @param userName      用户名
     * @param password      密码
     * @return              找到的用户
     */
    User selectUserByUserNameAndPassword(@Param("userName") String userName,
                                         @Param("password") String password);
}
