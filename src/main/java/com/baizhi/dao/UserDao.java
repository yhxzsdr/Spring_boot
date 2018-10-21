package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public interface UserDao {
    public void save(User u);

    public List<User> selectAll();
}
