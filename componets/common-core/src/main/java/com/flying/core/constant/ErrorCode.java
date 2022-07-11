package com.flying.core.constant;

/**
 * 自定义返回码
 */

public enum ErrorCode {
    /**
     * 成功
     */
    OK(0, "success"),
    FAIL(1000, "fail"),
    ALERT(1001, "alert"),

    /**
     * oauth2返回码
     */
    INVALID_TOKEN(2000, "invalid_token"),
    INVALID_SCOPE(2001, "invalid_scope"),
    INVALID_REQUEST(2002, "invalid_request"),
    INVALID_CLIENT(2003, "invalid_client"),
    INVALID_GRANT(2004, "invalid_grant"),
    REDIRECT_URI_MISMATCH(2005, "redirect_uri_mismatch"),
    UNAUTHORIZED_CLIENT(2006, "unauthorized_client"),
    EXPIRED_TOKEN(2007, "expired_token"),
    UNSUPPORTED_GRANT_TYPE(2008, "unsupported_grant_type"),
    UNSUPPORTED_RESPONSE_TYPE(2009, "unsupported_response_type"),
    UNAUTHORIZED(2012, "unauthorized"),
    SIGNATURE_DENIED(2013, "signature_denied"),

    ACCESS_DENIED(4030, "access_denied"),
    ACCESS_DENIED_BLACK_LIMITED(4031, "access_denied_black_limited"),
    ACCESS_DENIED_WHITE_LIMITED(4032, "access_denied_white_limited"),
    ACCESS_DENIED_AUTHORITY_EXPIRED(4033, "access_denied_authority_expired"),
    ACCESS_DENIED_UPDATING(4034, "access_denied_updating"),
    ACCESS_DENIED_DISABLED(4035, "access_denied_disabled"),
    ACCESS_DENIED_NOT_OPEN(4036, "access_denied_not_open"),
    /**
     * 账号错误
     */
    BAD_CREDENTIALS(3000, "bad_credentials"),
    ACCOUNT_DISABLED(3001, "account_disabled"),
    ACCOUNT_EXPIRED(3002, "account_expired"),
    CREDENTIALS_EXPIRED(3003, "credentials_expired"),
    ACCOUNT_LOCKED(3004, "account_locked"),
    USERNAME_NOT_FOUND(3005, "username_not_found"),

    /**
     * 请求错误
     */
    BAD_REQUEST(4000, "bad_request"),
    NOT_FOUND(4004, "not_found"),
    METHOD_NOT_ALLOWED(4005, "method_not_allowed"),
    MEDIA_TYPE_NOT_ACCEPTABLE(4006, "media_type_not_acceptable"),
    TOO_MANY_REQUESTS(4029, "too_many_requests"),
    /**
     * 系统错误
     */
    ERROR(5000, "error"),
    GATEWAY_TIMEOUT(5004, "gateway_timeout"),
    SERVICE_UNAVAILABLE(5003, "service_unavailable"),
    ACCOUNT_DEPEND(5005, "当前账号存在依赖"),
    DB_CREATE_ERROR(5006,"创建多租户-执行sql出现问题"),

    /**
     * 电子证照业务返回码
     */
    SUCCESS(10000, "请求成功"),
    SYSTEM_ERROR(-1, "系统错误"),
    PARAM_ERROR(10001, "必填参数为空"),
    REQUEST_ERROR(10002, "请求错误"),
    SEND_SMS_ERROR(10003, "短信发送异常"),
    AUTH_FAIL(11000, "认证失败"),
    RESOURCES_NOT_ALLOWED_ACCESSE(11001, "资源不允许访问"),
    REQUEST_RESOURCES_NOT_EXIST(11002, "请求资源不存在"),
    INVAILD_DATA_TYPE(11003, "无效的数据类型"),
    CREDENTIAL_VERIFY_FAIL(12000,"验证失败"),
    CREDENTIAL_EXPIRE_FAIL(12001,"二维码已过期"),
    CREDENTIAL_DATA_ERROR(12002,"二维码数据异常"),
    CREDENTIAL_CREATE_ERROR(12003,"暂未查到您的证书信息"),
    CREDENTIAL_CPT_ERROR(12004,"匹配不到该类型CPT模板，请联系管理员！"),
    CREDENTIAL_UNREVOKE_ERROR(12005,"调用下游存证服务异常"),
    CREDENTIAL_REVOKE_ERROR(12006,"撤销存证异常"),
    CREDENTIAL_DID_ERROR(12007,"该用户不存在DID,请先创建DID"),
    CREDENTIAL_ADD_ERROR(12008,"证照已存在,请勿重复添加"),
    CREDENTIAL_DOCTOR_QR_CODE_DATA_ERROR(12009,"医师证照二维码数据信息异常"),
    CREDENTIAL_QR_CODE_REDIS_DATA_ERROR(12010,"医师证照二维码缓存数据缺失异常"),
    CREDENTIAL_QR_CODE_RANDOM_CODE_DATA_ERROR(12011,"医师证照二维码验证码数据异常"),
    CREDENTIAL_QR_CODE_SECRET_CODE_DATA_ERROR(12012,"医师证照二维码加密数据异常"),
    CREDENTIAL_DEL_CREATE_ERROR(12013,"非法操作，请检查是否存在此证照！"),
    CREDENTIAL_EXPIRED__ERROR(12014,"证照已失效!")
    ;

    private int code;
    private String message;

    ErrorCode() {
    }

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ErrorCode getResultEnum(int code) {
        for (ErrorCode type : ErrorCode.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return ERROR;
    }

    public static ErrorCode getResultEnum(String message) {
        for (ErrorCode type : ErrorCode.values()) {
            if (type.getMessage().equals(message)) {
                return type;
            }
        }
        return ERROR;
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
