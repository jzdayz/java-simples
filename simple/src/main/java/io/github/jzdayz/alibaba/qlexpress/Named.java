package io.github.jzdayz.alibaba.qlexpress;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Named {

    String value() default "";
}