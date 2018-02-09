package cn.hwolf.manager.thirdparty.qiniu.impl;

import cn.hwolf.manager.thirdparty.qiniu.QiniuClient;
import com.qiniu.util.Auth;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/8.
 */
public class DefaultQiniuClient implements QiniuClient {

    private static final String ACCESS_KEY = "";
    private static final String SECRET_KEY = "";
    public static final String QINIU_URL = "";

    private static final String BUCKET = "";


    @Override
    public String getUpToken() {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        return auth.uploadToken(BUCKET);
    }

    @Override
    public String getImgUrl(String imgName) {
        return QINIU_URL + '/' + imgName;
    }
}
