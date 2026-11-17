package com.facebook.aura.partners.voice.viewmodel;

import X.BV4;
import X.C7384Etj;
import android.media.MediaDataSource;

/* loaded from: classes5.dex */
public final class ByteArrayMediaDataSource extends MediaDataSource {
    public static final int $stable = 8;
    public final byte[] data;

    public ByteArrayMediaDataSource(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.data = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 1);
        byte[] bArr2 = this.data;
        long length = bArr2.length;
        if (j >= length) {
            return -1;
        }
        int iA01 = BV4.A01(i2, length - j);
        System.arraycopy(bArr2, (int) j, bArr, i, iA01);
        return iA01;
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.data.length;
    }
}
