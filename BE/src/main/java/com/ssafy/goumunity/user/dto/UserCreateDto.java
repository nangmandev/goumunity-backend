package com.ssafy.goumunity.user.dto;

import com.ssafy.goumunity.user.domain.UserCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class UserCreateDto {
    private String email;
    private String password;
    private Long monthBudget;
    private Integer age;
    private UserCategory userCategory;
    private Integer gender;
    private String nickname;
    private MultipartFile imgSrc;
    private Integer regionId;
}
