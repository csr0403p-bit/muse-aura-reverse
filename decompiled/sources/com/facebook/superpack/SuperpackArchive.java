package com.facebook.superpack;

import X.BV4;
import X.C8j3;
import X.ETi;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class SuperpackArchive implements Iterator<SuperpackFile>, Closeable {
    public static final SuperpackArchive $redex_init_class = null;
    public int A00 = 0;
    public long A01;

    public static native void appendAnonNative(long j, long j2);

    public static native void appendNative(long j, long j2);

    public static native void closeNative(long j);

    public static native long createNative();

    public static native long extractNextNative(long j, String[] strArr);

    public static native long getThreadNumOption(int i);

    public static native boolean isEmptyNative(long j);

    public static native long[] nextMemfdNative(long j, String str);

    public static native long nextNative(long j);

    public static native long readNative(InputStream inputStream, String str, long j);

    public static native long readNative(String str, String str2, long j);

    public static native void setPackingOptionsNative(long j, boolean z, boolean z2);

    public static native void setStorageNative(long j, String str, int i);

    public static native void writeNative(long j, OutputStream outputStream);

    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final synchronized SuperpackFile next() {
        long jNextNative;
        long j = this.A01;
        if (j == 0) {
            throw BV4.A0T();
        }
        jNextNative = nextNative(j);
        if (jNextNative == 0) {
            throw C8j3.A1D();
        }
        this.A00++;
        return new SuperpackFile(jNextNative);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j = this.A01;
        if (j == 0) {
            throw BV4.A0T();
        }
        closeNative(j);
        this.A01 = 0L;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean zIsEmptyNative;
        synchronized (this) {
            long j = this.A01;
            if (j == 0) {
                throw BV4.A0T();
            }
            zIsEmptyNative = isEmptyNative(j);
        }
        return !zIsEmptyNative;
    }

    public final void finalize() {
        long j = this.A01;
        if (j == 0) {
            return;
        }
        closeNative(j);
        this.A01 = 0L;
        throw BV4.A0T();
    }

    static {
        ETi.loadLibrary("superpack-jni");
    }

    public SuperpackArchive(long j) {
        if (j == 0) {
            throw BV4.A0P();
        }
        this.A01 = j;
    }
}
