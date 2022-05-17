package cn.licoy.encryptbody.annotation.decrypt;

import java.lang.annotation.*;

/**
 * @author licoy.cn
 * @version 2018/9/7
 * @see DecryptBody
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DESDecryptBody {

    String key() default "";

}
