package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dfj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5300Dfj {
    public static final C5300Dfj A00 = new C5300Dfj();
    public static final Map<Class<?>, Integer> A02 = BV4.A0u();
    public static final Map<Class<?>, List<Constructor<? extends InterfaceC10430HcF>>> A01 = BV4.A0u();

    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.C5300Dfj r10, java.lang.Class r11) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5300Dfj.A00(X.Dfj, java.lang.Class):int");
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/reflect/Constructor<+LX/HcF;>;Ljava/lang/Object;)LX/HcF; */
    public static final void A01(Object obj, Constructor constructor) {
        try {
            C7384Etj.A0X(constructor.newInstance(obj));
        } catch (IllegalAccessException e) {
            throw BV4.A0e(e);
        } catch (InstantiationException e2) {
            throw BV4.A0e(e2);
        } catch (InvocationTargetException e3) {
            throw BV4.A0e(e3);
        }
    }
}
