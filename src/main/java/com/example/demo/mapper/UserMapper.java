package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author 幻
 * @date 2021-04-01 10:35
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
