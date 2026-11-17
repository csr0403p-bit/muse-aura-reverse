package com.facebook.forker;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public final class UnsafeByteArrayOutputStream extends ByteArrayOutputStream {
    public final byte[] getRawBuffer() {
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        return i != bArr.length ? toByteArray() : bArr;
    }

    public UnsafeByteArrayOutputStream(int i) {
        super(i);
    }

    public UnsafeByteArrayOutputStream() {
    }
}
