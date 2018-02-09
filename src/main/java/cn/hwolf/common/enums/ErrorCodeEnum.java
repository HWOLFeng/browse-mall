package cn.hwolf.common.enums;

import org.springframework.http.HttpStatus;

/**
 * 服务异常码定义
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public enum ErrorCodeEnum {

    PASSWORD_NOT_ALLOW(20001, "密码长度不符", HttpStatus.BAD_REQUEST);

    private final int code;
    private final String msg;
    private HttpStatus status;

    ErrorCodeEnum(int code, String msg, HttpStatus status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public HttpStatus getHttpStatus() {
        return status;
    }

    public static ErrorCodeEnum valueOf(int errorCode) {
        for (ErrorCodeEnum accountError : ErrorCodeEnum.values()) {
            if (accountError.code == errorCode) {
                return accountError;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + errorCode + "]");
    }


    @Override
    public String toString() {
        return Integer.toString(this.code);
    }
}
