package com.jm.thub.xcx.entity;

import lombok.Data;

/**
 * @author caozhenhao
 * @version 1.0
 * @date 2023/5/29 23:43
 */
@Data
public class Userinfo {

    private String sessionKey;

    private String rawData;

    private String signature;

    private String encryptedData;

    private String iv;
}