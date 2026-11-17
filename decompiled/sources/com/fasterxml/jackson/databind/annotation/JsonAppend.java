package com.fasterxml.jackson.databind.annotation;

import X.AbstractC9968Gmg;
import X.EnumC10065Gom;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonAppend {

    public @interface Attr {
        EnumC10065Gom include() default EnumC10065Gom.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    public @interface Prop {
        EnumC10065Gom include() default EnumC10065Gom.NON_NULL;

        String name() default "";

        String namespace() default "";

        Class<?> type() default Object.class;

        Class<? extends AbstractC9968Gmg> value();
    }

    Attr[] attrs() default {};

    boolean prepend() default false;

    Prop[] props() default {};
}
