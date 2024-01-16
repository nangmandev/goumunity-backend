package com.ssafy.goumunity.user.service;

import com.ssafy.goumunity.image.Image;
import com.ssafy.goumunity.user.domain.User;
import com.ssafy.goumunity.user.dto.UserCreateDto;
import com.ssafy.goumunity.user.service.port.UserRepository;
import com.ssafy.goumunity.util.SingleImageHandler;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final SingleImageHandler imageHandler;

    @Override
    @Transactional
    public User createUser(UserCreateDto userCreateDto, MultipartFile profileImage) {
        Image image = imageHandler.parseFileInfo(profileImage);
        User user = User.from(userCreateDto, image.getStoredFilePath());
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
