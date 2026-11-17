package com.fasterxml.jackson.databind.annotation;

import X.AbstractC9850Giu;
import X.EnumC10089GpD;
import X.EnumC10105GpT;
import X.InterfaceC9854Giz;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonSerialize {
    Class<?> as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends InterfaceC9854Giz> contentConverter() default AbstractC9850Giu.class;

    Class<? extends JsonSerializer> contentUsing() default JsonSerializer.None.class;

    Class<? extends InterfaceC9854Giz> converter() default AbstractC9850Giu.class;

    @Deprecated
    EnumC10089GpD include() default EnumC10089GpD.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends JsonSerializer> keyUsing() default JsonSerializer.None.class;

    Class<? extends JsonSerializer> nullsUsing() default JsonSerializer.None.class;

    EnumC10105GpT typing() default EnumC10105GpT.DEFAULT_TYPING;

    Class<? extends JsonSerializer> using() default JsonSerializer.None.class;
}
