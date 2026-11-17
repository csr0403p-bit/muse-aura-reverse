package com.facebook.zstd;

import X.C3463COl;
import X.C7384Etj;
import com.facebook.jni.HybridData;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class ZstdInputStream extends FilterInputStream {
    public static final ZstdInputStream $redex_init_class = null;
    public final int bufferSize;
    public final byte[] inBuf;
    public final HybridData mHybridData;
    public final byte[] outBuf;
    public boolean sourceEOF;

    private final native boolean canWrite();

    public static final native HybridData initHybrid(int i, boolean z);

    private final native int nativeRead(byte[] bArr, int i);

    private final native void nativeWrite(byte[] bArr, int i);

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return read(bArr, 0, bArr.length);
    }

    public ZstdInputStream(InputStream inputStream, int i) {
        super(inputStream);
        this.bufferSize = 4096;
        this.inBuf = new byte[4096];
        this.outBuf = new byte[4096];
        this.mHybridData = initHybrid(4096, false);
    }

    static {
        C3463COl.loadLibrary("zstddecoder");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            r5 = 0
            X.C7384Etj.A0Y(r7, r5)
            if (r8 < 0) goto L5e
            if (r9 < 0) goto L5e
            int r1 = r8 + r9
            if (r1 < 0) goto L5e
            int r0 = r7.length
            int r0 = r0 - r1
            if (r0 < 0) goto L5e
            if (r9 != 0) goto L13
            return r5
        L13:
            r4 = 0
        L14:
            boolean r0 = r6.canWrite()
            if (r0 == 0) goto L28
            java.io.InputStream r1 = r6.in
            byte[] r0 = r6.inBuf
            int r1 = r1.read(r0)
            r0 = -1
            if (r1 != r0) goto L50
            r0 = 1
            r6.sourceEOF = r0
        L28:
            int r0 = r6.bufferSize
            double r2 = (double) r0
            int r0 = r9 - r4
            double r0 = (double) r0
            double r0 = java.lang.Math.min(r2, r0)
            int r2 = (int) r0
            byte[] r0 = r6.outBuf
            int r2 = r6.nativeRead(r0, r2)
            boolean r0 = r6.sourceEOF
            if (r0 == 0) goto L45
            if (r2 == 0) goto L56
            r0 = -1
            if (r2 != r0) goto L45
            if (r4 != 0) goto L5d
            return r0
        L45:
            byte[] r1 = r6.outBuf
            int r0 = r8 + r4
            java.lang.System.arraycopy(r1, r5, r7, r0, r2)
            int r4 = r4 + r2
            if (r4 >= r9) goto L5d
            goto L14
        L50:
            byte[] r0 = r6.inBuf
            r6.nativeWrite(r0, r1)
            goto L28
        L56:
            java.lang.String r0 = "Unexpected end of ZSTD stream"
            java.io.IOException r0 = X.BV4.A0K(r0)
            throw r0
        L5d:
            return r4
        L5e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zstd.ZstdInputStream.read(byte[], int, int):int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }
}
