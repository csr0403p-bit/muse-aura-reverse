package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.CVl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3586CVl extends InputStream {
    public int A00;
    public int A01;
    public boolean A02;
    public final InputStream A03;
    public final byte[] A04;
    public final InterfaceC3587CVm<byte[]> A05;

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.A00;
        int i2 = this.A01;
        CVn.A03(BV7.A1S(i, i2));
        if (this.A02) {
            throw BV4.A0K("stream already closed");
        }
        return (i2 - i) + this.A03.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A02) {
            return;
        }
        this.A02 = true;
        this.A05.Aa9(this.A04);
    }

    public final void finalize() throws IOException {
        if (this.A02) {
            return;
        }
        AbstractC3422CMk.A03("PooledByteInputStream", "Finalized without closing");
        close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.A00;
        int i2 = this.A01;
        CVn.A03(BV7.A1S(i, i2));
        if (this.A02) {
            throw BV4.A0K("stream already closed");
        }
        if (i >= i2) {
            int i3 = this.A03.read(this.A04);
            if (i3 <= 0) {
                return -1;
            }
            this.A01 = i3;
            this.A00 = 0;
            i = 0;
        }
        byte[] bArr = this.A04;
        this.A00 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = this.A00;
        int i2 = this.A01;
        CVn.A03(BV7.A1S(i, i2));
        if (this.A02) {
            throw BV4.A0K("stream already closed");
        }
        long j2 = i2 - i;
        if (j2 >= j) {
            this.A00 = (int) (i + j);
            return j;
        }
        this.A00 = i2;
        return j2 + this.A03.skip(j - j2);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/io/InputStream;[BLX/CVm<[B>;)V */
    public C3586CVl(InterfaceC3587CVm interfaceC3587CVm, InputStream inputStream, byte[] bArr) {
        this.A03 = inputStream;
        bArr.getClass();
        this.A04 = bArr;
        this.A05 = interfaceC3587CVm;
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = false;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.A00;
        int i4 = this.A01;
        CVn.A03(BV7.A1S(i3, i4));
        if (!this.A02) {
            if (i3 >= i4) {
                i4 = this.A03.read(this.A04);
                if (i4 <= 0) {
                    return -1;
                }
                this.A01 = i4;
                this.A00 = 0;
                i3 = 0;
            }
            int iMin = Math.min(i4 - i3, i2);
            System.arraycopy(this.A04, i3, bArr, i, iMin);
            this.A00 += iMin;
            return iMin;
        }
        throw BV4.A0K("stream already closed");
    }
}
