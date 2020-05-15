package com.ijemy.aws2qn;

import com.amazonaws.auth.AWSCredentials;

/**
 * Created by nergal on 2017/5/12.
 */

public class MyAWSCredentials implements AWSCredentials {
    @Override
    public String getAWSAccessKeyId() {
        return Config.ACCESSKEY;
    }

    @Override
    public String getAWSSecretKey() {
        return Config.SecretKey;
    }
}
