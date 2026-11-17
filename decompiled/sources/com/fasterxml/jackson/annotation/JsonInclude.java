package com.fasterxml.jackson.annotation;

import X.EnumC10065Gom;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonInclude {
    EnumC10065Gom content() default EnumC10065Gom.ALWAYS;

    Class<?> contentFilter() default Void.class;

    EnumC10065Gom value() default EnumC10065Gom.ALWAYS;

    Class<?> valueFilter() default Void.class;
}
