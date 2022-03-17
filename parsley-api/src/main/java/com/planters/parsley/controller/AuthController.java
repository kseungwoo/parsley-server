package com.planters.parsley.controller;

import com.planters.parsley.component.CommonResponseMaker;
import com.planters.parsley.constant.ResponseCode;
import com.planters.parsley.dto.*;
import com.planters.parsley.service.AuthService;
import com.planters.parsley.vo.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class AuthController extends AppApiV1Controller {

    private final AuthService authService;
    private final CommonResponseMaker commonResponseMaker;

    /**
     * Sign-Up
     */
    @PostMapping("/auth/sign-up")
    public CommonResponse<Void> signUp(@RequestBody final SignUpRequestDto requestDto) {

        authService.signUp(requestDto.toVo());

        return commonResponseMaker.makeEmptyInfoCommonResponse(ResponseCode.SUCCESS);
    }

    /**
     * Sign-In
     */
    @PostMapping("/auth/sign-in")
    public CommonResponse<SignInResponseDto> signIn(@RequestBody final SignInRequestDto requestDto) {

        final SignInResponseDto responseDto = SignInResponseDto.of(authService.signIn(requestDto.toVo()));

        return commonResponseMaker.makeSucceedCommonResponse(responseDto);
    }

    /**
     * Sign-Out
     */
    @PostMapping("/auth/sign-out")
    public CommonResponse<Void> signOut(@AuthenticationPrincipal final UserPrincipal userPrincipal) {

        authService.signOut(userPrincipal);

        return commonResponseMaker.makeEmptyInfoCommonResponse(ResponseCode.SUCCESS);
    }

    /**
     * Reissue Jwt Tokens
     */
    @PostMapping("/auth/tokens")
    public CommonResponse<ReissueJwtTokensResponseDto> reissueJwtTokens(
            @RequestBody final ReissueJwtTokensRequestDto requestDto) {

        final ReissueJwtTokensResponseDto responseDto =
                ReissueJwtTokensResponseDto.of(authService.reissueTokens(requestDto.toVo()));

        return commonResponseMaker.makeSucceedCommonResponse(responseDto);
    }
}