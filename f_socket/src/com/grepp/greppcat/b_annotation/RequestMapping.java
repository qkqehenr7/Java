package com.grepp.greppcat.b_annotation;

// NOTE B01 Annotation
// 표준 어노테이션 : 자바에서 기본으로 젝종하는 어노테이션
// 사용자 정의 어노테이션 : 개발자가 필요에 따라 정의한 어노테이션
// 메타 어노테이션 : 어노테이션을 정의하는데 사용되는 어노테이션

// @Target : 어노테이션이 적용될 수 있는 대상
// @Retention : 어노테이션의 유효기간, 소스코드, 컴파일, 런타임
// @Document : 문서화 때 포함 여부
// @Ingerited : 상속 시 어노테이션 상속 여부
// @Repeated : 중복 선언 허용 여부

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface RequestMapping {
    String url();
    String method() default "GET";
}
