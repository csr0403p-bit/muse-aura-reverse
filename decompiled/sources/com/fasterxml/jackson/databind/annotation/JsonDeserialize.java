package com.fasterxml.jackson.databind.annotation;

import X.AbstractC10190Gr7;
import X.AbstractC9850Giu;
import X.AbstractC9877Gjl;
import X.InterfaceC9854Giz;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonDeserialize {
    Class<?> as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends InterfaceC9854Giz> contentConverter() default AbstractC9850Giu.class;

    Class<? extends JsonDeserializer> contentUsing() default JsonDeserializer.None.class;

    Class<? extends InterfaceC9854Giz> converter() default AbstractC9850Giu.class;

    Class<?> keyAs() default Void.class;

    Class<? extends AbstractC9877Gjl> keyUsing() default AbstractC10190Gr7.class;

    Class<? extends JsonDeserializer> using() default JsonDeserializer.None.class;
}
