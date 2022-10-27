package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.ui.models.UserDto;

import java.util.UUID;

public class UsersServiceImpl implements UsersService {
    @Override
    public UserDto createUser(UserDto userDetails) {

        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
