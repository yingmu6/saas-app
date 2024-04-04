package com.orange.api.common;

import java.lang.annotation.*;

/**
 * @author
 * @date
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface SaaSRequestContext {

    String type() default "";

    String path() default "";

    String action() default "";
}
