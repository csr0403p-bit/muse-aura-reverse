package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: X.EyX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7510EyX {
    public static <T> T A00(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C7510EyX.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
