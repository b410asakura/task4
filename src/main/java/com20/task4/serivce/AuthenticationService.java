package com20.task4.serivce;

import com20.task4.dto.authenticationDto.AuthenticationResponse;
import com20.task4.dto.authenticationDto.SignInRequest;
import com20.task4.dto.authenticationDto.SignUpRequest;
import com20.task4.dto.userDto.UserResponse;

import java.util.List;


public interface AuthenticationService {

    AuthenticationResponse signUp(SignUpRequest signUpRequest);

    AuthenticationResponse signIn(SignInRequest signInRequest);

    List<UserResponse> getAllUsers();
}
