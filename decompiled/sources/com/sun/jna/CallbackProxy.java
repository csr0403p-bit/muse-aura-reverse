package com.sun.jna;

/* loaded from: classes5.dex */
public interface CallbackProxy extends Callback {
    Object callback(Object[] objArr);

    Class<?>[] getParameterTypes();

    Class<?> getReturnType();
}
