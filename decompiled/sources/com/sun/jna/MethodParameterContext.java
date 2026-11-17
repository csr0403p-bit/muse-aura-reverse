package com.sun.jna;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class MethodParameterContext extends FunctionParameterContext {
    public Method method;

    public Method getMethod() {
        return this.method;
    }

    public MethodParameterContext(Function function, Object[] objArr, int i, Method method) {
        super(function, objArr, i);
        this.method = method;
    }
}
