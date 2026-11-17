package X;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class C1Q extends InputStream {
    public long A01;
    public final C1J A03;
    public final C1O A04;
    public boolean A00 = false;
    public boolean A02 = false;
    public final byte[] A05 = new byte[1];

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A02) {
            return;
        }
        this.A03.close();
        this.A02 = true;
    }

    public C1Q(C1J c1j, C1O c1o) {
        this.A03 = c1j;
        this.A04 = c1o;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C1G.A08(!this.A02);
        if (!this.A00) {
            this.A03.open(this.A04);
            this.A00 = true;
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.A01 += i3;
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.A05;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
