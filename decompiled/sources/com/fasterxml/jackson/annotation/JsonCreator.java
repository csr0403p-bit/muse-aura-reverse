package com.fasterxml.jackson.annotation;

import X.EnumC8882Fsl;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonCreator {
    EnumC8882Fsl mode() default EnumC8882Fsl.DEFAULT;
}
