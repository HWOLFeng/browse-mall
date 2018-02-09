package cn.hwolf.manager.thirdparty.qiniu;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/8.
 */
public interface QiniuClient {
    String getUpToken();

    String getImgUrl(String imgName);
}
