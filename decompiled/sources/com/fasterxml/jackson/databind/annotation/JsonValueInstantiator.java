package com.fasterxml.jackson.databind.annotation;

import X.AbstractC9944Glx;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonValueInstantiator {
    Class<? extends AbstractC9944Glx> value();
}
