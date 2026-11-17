package X;

import java.lang.reflect.Method;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class HkA extends GEJ {
    public static final Method A00;

    static {
        Method method;
        try {
            method = String.class.getMethod("encodedLength", Charset.class);
        } catch (ReflectiveOperationException unused) {
            method = null;
        }
        A00 = method;
    }
}
