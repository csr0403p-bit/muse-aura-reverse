package com.facebook.common.dextricks;

/* loaded from: classes5.dex */
public final class ReflectionClassLoaderJava extends ReflectionClassLoader {
    public static final String TAG = "ReflectionClassLoaderJava";

    private boolean maybeLoadFromParent() {
        return false;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        throw new ClassNotFoundException(str);
    }
}
