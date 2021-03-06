package com.planters.parsley.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class AccountVo {

    private final Long id;
    private final String email;
    private final String password;
}
