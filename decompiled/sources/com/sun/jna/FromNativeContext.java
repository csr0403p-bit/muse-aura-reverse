package com.sun.jna;

/* loaded from: classes5.dex */
public class FromNativeContext {
    public Class<?> type;

    public Class<?> getTargetType() {
        return this.type;
    }

    public FromNativeContext(Class<?> cls) {
        this.type = cls;
    }
}
