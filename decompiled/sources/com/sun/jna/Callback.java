package com.sun.jna;

import X.BV5;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public interface Callback {
    public static final List<String> FORBIDDEN_NAMES = Collections.unmodifiableList(BV5.A12("hashCode", "equals", "toString"));
    public static final String METHOD_NAME = "callback";

    public interface UncaughtExceptionHandler {
        void uncaughtException(Callback callback, Throwable th);
    }
}
