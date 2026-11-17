package X;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public abstract class C2L {
    public static final C2L A00;

    static {
        C2L beA;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    beA = new C2K(BV5.A0c(null, cls, "theUnsafe"), cls.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    beA = new BeA();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                beA = new C2M(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iA07 = BV6.A07(declaredMethod2.invoke(null, Object.class));
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            beA = new C2J(declaredMethod3, iA07);
        }
        A00 = beA;
    }

    public static void A00(Class<?> cls) {
        String strA00 = EYQ.A00(cls);
        if (strA00 != null) {
            throw BV4.A0N(FGI.A0M("UnsafeAllocator is used for non-instantiable type: ", strA00));
        }
    }
}
