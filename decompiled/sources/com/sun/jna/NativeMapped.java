package com.sun.jna;

/* loaded from: classes5.dex */
public interface NativeMapped {
    Object fromNative(Object obj, FromNativeContext fromNativeContext);

    Class<?> nativeType();

    Object toNative();
}
