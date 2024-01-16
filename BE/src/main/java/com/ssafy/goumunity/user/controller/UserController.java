package com.ssafy.goumunity.user.controller;

import com.ssafy.goumunity.user.domain.User;
import com.ssafy.goumunity.user.dto.UserCreateDto;
import com.ssafy.goumunity.user.dto.UserResponse;
import com.ssafy.goumunity.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<UserResponse> createUser(@RequestPart UserCreateDto userCreateDto,
                                                   @RequestPart MultipartFile profileImage){
        User user = userService.createUser(userCreateDto, profileImage);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(UserResponse.from(user));
    }
}
