package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: X.CQs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3495CQs implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (obj instanceof Unsafe) {
                return obj;
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
