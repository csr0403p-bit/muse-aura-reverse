package com.facebook.common.dextricks;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class ResProvider implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void markRootRelative() {
    }

    public abstract InputStream open(String str);

    public boolean isExoResProvider() {
        return false;
    }

    public boolean shouldMemoizeReturnedData() {
        return true;
    }

    public String getFilePath(String str) {
        return null;
    }
}
