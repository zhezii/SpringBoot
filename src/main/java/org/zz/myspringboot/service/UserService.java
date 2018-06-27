package org.zz.myspringboot.service;

import org.zz.myspringboot.entity.User;

import java.util.List;

/**
 * @author Zhou Wenzhe
 * @date 2018/6/27
 */
public interface UserService {
    int findCountByUsername(String username);

    List<User> findAll();
}
