package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Edu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6993Edu extends InputStream {
    public int A00;
    public int A01;
    public final C6986Edm A02;

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A02.A03() - this.A01;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.A00 = this.A01;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.A01 = this.A00;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        CVn.A02(C8j3.A1Q((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        int iMin = Math.min((int) j, available());
        this.A01 += iMin;
        return iMin;
    }

    public C6993Edu(C6986Edm c6986Edm) {
        boolean z;
        synchronized (c6986Edm) {
            z = !EfF.A01(c6986Edm.A00);
        }
        CVn.A02(!z);
        this.A02 = c6986Edm;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i2);
            this.A02.A04(this.A01, bArr, i, iMin);
            this.A01 += iMin;
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException(FGI.A0Z("length=", "; regionStart=", "; regionLength=", bArr.length, i, i2));
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        C6986Edm c6986Edm = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return c6986Edm.A02(i) & 255;
    }
}
