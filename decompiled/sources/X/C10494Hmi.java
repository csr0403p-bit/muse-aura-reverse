package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: X.Hmi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10494Hmi implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() throws SecurityException {
        Object objA0v;
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            objA0v = null;
            if (i >= length) {
                break;
            }
            objA0v = AbstractC7610F5x.A0v(declaredFields, i);
            if (objA0v instanceof Unsafe) {
                break;
            }
            i++;
        }
        return objA0v;
    }
}
