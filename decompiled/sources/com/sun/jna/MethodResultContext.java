package com.sun.jna;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class MethodResultContext extends FunctionResultContext {
    public final Method method;

    public Method getMethod() {
        return this.method;
    }

    public MethodResultContext(Class<?> cls, Function function, Object[] objArr, Method method) {
        super(cls, function, objArr);
        this.method = method;
    }
}
