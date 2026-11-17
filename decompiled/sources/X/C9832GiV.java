package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.GiV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9832GiV {
    public static final C9832GiV A03;
    public static final RuntimeException A04;
    public final Method A00;
    public final Method A01;
    public final Method A02;

    static {
        C9832GiV c9832GiV = null;
        try {
            e = null;
            c9832GiV = new C9832GiV();
        } catch (RuntimeException e) {
            e = e;
        }
        A03 = c9832GiV;
        A04 = e;
    }

    public static final Object[] A00(C9832GiV c9832GiV, Class cls) {
        boolean zEquals;
        try {
            return (Object[]) c9832GiV.A02.invoke(cls, null);
        } catch (Exception e) {
            e = e;
            if (AbstractC9831GiU.A00 && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"))) {
                if (e instanceof InvocationTargetException) {
                    e = e.getCause();
                }
                zEquals = C60Q.A0e(e).equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
            } else {
                zEquals = false;
            }
            if (zEquals) {
                return null;
            }
            throw C60Q.A0U("Failed to access RecordComponents of type ", AbstractC9855Gj3.A06(cls));
        }
    }

    public C9832GiV() throws ClassNotFoundException {
        try {
            this.A02 = Class.class.getMethod(BV3.A00(64), null);
            Class<?> cls = Class.forName(BV3.A00(69));
            this.A00 = cls.getMethod("getName", null);
            this.A01 = cls.getMethod("getType", null);
        } catch (Exception e) {
            throw BV4.A0d(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", C60Q.A0e(e), e.getMessage()), e);
        }
    }
}
