package org.zz.myspringboot.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zz.myspringboot.entity.User;
import org.zz.myspringboot.mapper.UserMapper;
import org.zz.myspringboot.service.UserService;

import java.util.List;

/**
 * @author Zhou Wenzhe
 * @date 2018/6/27
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int findCountByUsername(String username) {
        return userMapper.countByUsername(username);
    }

    @Override
    public List<User> findAll() {

        return userMapper.findAll();
    }

    @Override
    public void update(Long id, String username,Integer age,String password) {
        userMapper.update(id,username,age,password);
    }

    @Override
    public void add(String username,Integer age, String password) {
        userMapper.add(username,age,password);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findAll(Integer page, Integer pageSize) {
        if(page != null && pageSize != null){
            PageHelper.startPage(page,pageSize);
        }
        return userMapper.findAll();
    }
}
