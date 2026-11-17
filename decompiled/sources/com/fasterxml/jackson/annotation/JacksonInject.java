package com.fasterxml.jackson.annotation;

import X.G4b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JacksonInject {
    G4b useInput() default G4b.A00;

    String value() default "";
}
