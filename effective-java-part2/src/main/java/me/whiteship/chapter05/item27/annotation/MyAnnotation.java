package me.whiteship.chapter05.item27.annotation;

import java.lang.annotation.*;

/**
 * @Retention: 애노테이션의 정보를 얼마나 오래 유지할 것인가.
 * • Runtime, Source, Class
 *
 * @Target: 애노테이션을 사용할 수 있는 위치.
 * • Type, Field, Method, Parameter,
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyAnnotation {

}
