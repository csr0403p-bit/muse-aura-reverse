package com.fasterxml.jackson.annotation;

import X.EnumC9856Gj4;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonAutoDetect {
    EnumC9856Gj4 creatorVisibility() default EnumC9856Gj4.DEFAULT;

    EnumC9856Gj4 fieldVisibility() default EnumC9856Gj4.DEFAULT;

    EnumC9856Gj4 getterVisibility() default EnumC9856Gj4.DEFAULT;

    EnumC9856Gj4 isGetterVisibility() default EnumC9856Gj4.DEFAULT;

    EnumC9856Gj4 setterVisibility() default EnumC9856Gj4.DEFAULT;
}
