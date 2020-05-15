package com.ijemy.aws2qn;

import com.amazonaws.services.s3.model.Region;

public class Config {
    /*请求服务器地址,在七牛控制台可以获取*/
    public static final String ENDPOINT = "https://s3-cn-east-1.qiniucs.com";

    public static final String ACCESSKEY = "Oh5V7tcC3YiXDpQaXf6GMn_dIOVzQBnW9j4UZePS";

    public static final String SecretKey = "aCwh1K_nlhosdvf_3qpIjL-_Cw2SsAaYIn7A5dj_";

    public static final String BUCKET_NAME = "pursue-z0";

    public static final String BUCKET_REGION = Region.CN_Beijing.toString();

//    public static final String ENDPOINT = "https://s3-cn-east-1.qiniucs.com";
//
//    public static final String ACCESSKEY = "AKIAIBERJY4YS36EVIMQ";
//
//    public static final String SecretKey = "TIS30eW9bNNZCXLd692THKOfc";
//
//    public static final String BUCKET_NAME = "aws2qn";
//
//    public static final String BUCKET_REGION = Region.AP_Tokyo.toString();
}
