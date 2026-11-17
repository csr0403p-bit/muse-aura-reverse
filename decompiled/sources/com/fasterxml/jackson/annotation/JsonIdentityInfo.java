package com.fasterxml.jackson.annotation;

import X.AbstractC9848Gir;
import X.C10160GqT;
import X.InterfaceC9851Giv;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonIdentityInfo {
    Class<? extends AbstractC9848Gir<?>> generator();

    String property() default "@id";

    Class<? extends InterfaceC9851Giv> resolver() default C10160GqT.class;

    Class<?> scope() default Object.class;
}
