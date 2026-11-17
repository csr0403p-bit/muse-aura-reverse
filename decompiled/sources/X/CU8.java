package X;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public abstract class CU8 {
    public static final Method A00;
    public static final Method A01;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        C7384Etj.A0X(methods);
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if ("addSuppressed".equals(method2.getName())) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                C7384Etj.A0U(parameterTypes);
                if (Throwable.class.equals(parameterTypes.length == 1 ? parameterTypes[0] : null)) {
                    break;
                }
            }
            i2++;
        }
        A00 = method2;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method3 = methods[i];
            if ("getSuppressed".equals(method3.getName())) {
                method = method3;
                break;
            }
            i++;
        }
        A01 = method;
    }
}
