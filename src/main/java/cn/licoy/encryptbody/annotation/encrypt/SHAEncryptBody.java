package cn.licoy.encryptbody.annotation.encrypt;

import cn.licoy.encryptbody.enums.SHAEncryptType;

import java.lang.annotation.*;

/**
 * @author licoy.cn
 * @version 2018/9/4
 * @see EncryptBody
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SHAEncryptBody {

    SHAEncryptType value() default SHAEncryptType.SHA256;

}
