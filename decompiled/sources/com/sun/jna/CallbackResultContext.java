package com.sun.jna;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class CallbackResultContext extends ToNativeContext {
    public Method method;

    public Method getMethod() {
        return this.method;
    }

    public CallbackResultContext(Method method) {
        this.method = method;
    }
}
