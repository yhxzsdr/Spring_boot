package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public interface UserService {
    public void save(User u);

    public List<User> selectAll();
}
