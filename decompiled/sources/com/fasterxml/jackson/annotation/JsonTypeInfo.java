package com.fasterxml.jackson.annotation;

import X.EnumC10066Gon;
import X.EnumC10075Gow;
import X.G4b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonTypeInfo {
    Class<?> defaultImpl() default JsonTypeInfo.class;

    EnumC10075Gow include() default EnumC10075Gow.PROPERTY;

    String property() default "";

    G4b requireTypeIdForSubtypes() default G4b.A00;

    EnumC10066Gon use();

    boolean visible() default false;
}
