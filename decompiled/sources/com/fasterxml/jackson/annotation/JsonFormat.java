package com.fasterxml.jackson.annotation;

import X.EnumC10046GoQ;
import X.EnumC10062Goj;
import X.G4b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface JsonFormat {
    G4b lenient() default G4b.A00;

    String locale() default "##default";

    String pattern() default "";

    EnumC10046GoQ shape() default EnumC10046GoQ.ANY;

    String timezone() default "##default";

    EnumC10062Goj[] with() default {};

    EnumC10062Goj[] without() default {};
}
