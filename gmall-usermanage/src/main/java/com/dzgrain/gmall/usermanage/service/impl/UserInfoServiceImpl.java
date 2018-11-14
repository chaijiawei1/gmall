package com.dzgrain.gmall.usermanage.service.impl;

import com.dzgrain.gmall.bean.UserInfo;
import com.dzgrain.gmall.service.UserInfoService;
import com.dzgrain.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
