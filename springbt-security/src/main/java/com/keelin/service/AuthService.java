package com.keelin.service;

import com.keelin.entity.User;

/**
 * @www.codesheep.cn
 * 20190312
 */
public interface AuthService {

    User register(User userToAdd);
    String login(String username, String password);
}
