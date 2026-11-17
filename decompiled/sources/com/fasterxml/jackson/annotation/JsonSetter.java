package com.fasterxml.jackson.annotation;

import X.EnumC10073Gou;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonSetter {
    EnumC10073Gou contentNulls() default EnumC10073Gou.DEFAULT;

    EnumC10073Gou nulls() default EnumC10073Gou.DEFAULT;

    String value() default "";
}
