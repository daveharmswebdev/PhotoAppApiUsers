package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.ui.models.UserDto;

public interface UsersService {
    UserDto createUser(UserDto userDetails);
}
