package com.ssafy.goumunity.user.service.port;

import com.ssafy.goumunity.user.domain.User;

public interface UserRepository {
    User save(User user);
}
