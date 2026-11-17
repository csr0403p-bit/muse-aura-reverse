package com.facebook.zstd;

import X.AbstractC3135Bz1;
import X.C3463COl;
import X.C7384Etj;
import com.facebook.jni.HybridData;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class ZstdOutputStream extends AbstractC3135Bz1 {
    public final int bufferSize;
    public final byte[] inBuf;
    public final HybridData mHybridData;
    public final byte[] outBuf;

    private final native boolean canWrite();

    public static final native HybridData initHybrid(int i, int i2, boolean z);

    private final native int nativeRead(byte[] bArr, int i, boolean z);

    private final native void nativeWrite(byte[] bArr, int i);

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (true) {
            int iNativeRead = nativeRead(this.outBuf, this.bufferSize, true);
            if (iNativeRead > 0) {
                ((FilterOutputStream) this).out.write(this.outBuf, 0, iNativeRead);
            } else if (iNativeRead == -1) {
                super.close();
                return;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, 4096, 13);
    }

    static {
        C3463COl.loadLibrary("zstdencoder");
    }

    public ZstdOutputStream(OutputStream outputStream, int i, int i2) {
        super(outputStream);
        this.bufferSize = i;
        this.outBuf = new byte[i];
        this.inBuf = new byte[i];
        this.mHybridData = initHybrid(i, i2, false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C7384Etj.A0Y(bArr, 0);
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && bArr.length - i3 >= 0) {
            if (i2 == 0) {
                return;
            }
            while (i < i3) {
                int iMin = (int) Math.min(this.bufferSize, i3 - i);
                System.arraycopy(bArr, i, this.inBuf, 0, iMin);
                byte[] bArr2 = this.inBuf;
                while (!canWrite()) {
                    int iNativeRead = nativeRead(this.outBuf, this.bufferSize, false);
                    if (iNativeRead > 0) {
                        ((FilterOutputStream) this).out.write(this.outBuf, 0, iNativeRead);
                    }
                }
                nativeWrite(bArr2, iMin);
                i += this.bufferSize;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
