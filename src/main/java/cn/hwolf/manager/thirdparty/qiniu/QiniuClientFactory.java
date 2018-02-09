package cn.hwolf.manager.thirdparty.qiniu;

import cn.hwolf.manager.thirdparty.qiniu.impl.DefaultQiniuClient;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/8.
 */
public class QiniuClientFactory {
    private static final QiniuClient QINIU_CLIENT;

    static {
        QINIU_CLIENT = new DefaultQiniuClient();
    }

    public QiniuClientFactory() {
    }

    public static QiniuClient getQiniuClient(){
        return QINIU_CLIENT;
    }
}
