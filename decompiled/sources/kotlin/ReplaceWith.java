package kotlin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface ReplaceWith {
    String expression();

    String[] imports();
}
