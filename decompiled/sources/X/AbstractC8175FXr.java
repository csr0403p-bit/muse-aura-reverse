package X;

import android.os.Build;
import android.text.StaticLayout;
import java.lang.reflect.Method;

/* renamed from: X.FXr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8175FXr {
    public static final F0C A01 = AbstractC7607F5u.A1A(null, C8472Feb.A00(9));
    public static final F0C A00 = AbstractC7607F5u.A1A(null, C8472Feb.A00(8));

    public static final Method A00(String str) throws NoSuchMethodException, SecurityException {
        Method method = null;
        if (Build.VERSION.SDK_INT < 35) {
            return null;
        }
        try {
            method = StaticLayout.Builder.class.getMethod(str, Boolean.TYPE);
            return method;
        } catch (ReflectiveOperationException unused) {
            return method;
        }
    }
}
