package X;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;

/* loaded from: classes5.dex */
public final class CX2 extends CX9 {
    public int A00;
    public int A01;
    public Uri A02;
    public boolean A03;
    public byte[] A04;
    public final CX4 A05;

    public CX2(byte[] bArr) {
        CX3 cx3 = new CX3(bArr);
        super(false);
        this.A05 = cx3;
        C1G.A07(AnonymousClass002.A1N(bArr.length));
    }

    @Override // X.C1J
    public final void close() {
        if (this.A03) {
            this.A03 = false;
            transferEnded();
        }
        this.A02 = null;
        this.A04 = null;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A02;
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.A04;
        C1G.A05(bArr2);
        System.arraycopy(bArr2, this.A01, bArr, i, iMin);
        this.A01 += iMin;
        this.A00 -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws DataSourceException {
        transferInitializing(c1o);
        this.A02 = c1o.A06;
        byte[] bArr = ((CX3) this.A05).A00;
        this.A04 = bArr;
        long j = c1o.A04;
        int length = bArr.length;
        if (j > length) {
            throw new DataSourceException();
        }
        int i = (int) j;
        this.A01 = i;
        int i2 = length - i;
        this.A00 = i2;
        long j2 = c1o.A03;
        if (j2 != -1) {
            this.A00 = BV4.A01(i2, j2);
        }
        this.A03 = true;
        transferStarted(c1o);
        return j2 == -1 ? this.A00 : j2;
    }
}
