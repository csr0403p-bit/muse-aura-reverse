package com.google.common.base;

import X.BV4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public abstract class Throwables {
    public static final Method getStackTraceDepthMethod;
    public static final Method getStackTraceElementMethod;
    public static final Object jla;

    static {
        Method method;
        Object objInvoke = null;
        try {
            try {
                objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
            } catch (Throwable unused) {
            }
            jla = objInvoke;
            Method method2 = null;
            if (objInvoke == null) {
                method = null;
            } else {
                method = null;
                try {
                    method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
                } catch (Throwable unused2) {
                }
            }
            getStackTraceElementMethod = method;
            if (objInvoke != null) {
                try {
                    Method method3 = null;
                    try {
                        method3 = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                    } catch (ThreadDeath e) {
                        throw e;
                    } catch (Throwable unused3) {
                    }
                    if (method3 != null) {
                        method3.invoke(objInvoke, new Throwable());
                        method2 = method3;
                    }
                } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
                }
            }
            getStackTraceDepthMethod = method2;
        } catch (ThreadDeath e2) {
            throw e2;
        }
    }

    @Deprecated
    public static RuntimeException propagate(Throwable throwable) {
        if ((throwable instanceof RuntimeException) || (throwable instanceof Error)) {
            throw throwable;
        }
        throw BV4.A0e(throwable);
    }

    @Deprecated
    public static <X extends Throwable> void propagateIfPossible(Throwable throwable, Class<X> declaredType) {
        if ((throwable instanceof IOException) || (throwable instanceof RuntimeException) || (throwable instanceof Error)) {
            throw throwable;
        }
    }
}
