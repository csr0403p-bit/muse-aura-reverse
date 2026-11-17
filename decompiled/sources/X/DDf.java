package X;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DDf implements CXK {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public boolean A05;
    public byte[] A06;
    public C1O A07;
    public final int A08;
    public final CXK A09;
    public final int A0A;

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        C7384Etj.A0Y(cxb, 0);
        this.A09.addTransferListener(cxb);
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final long open(C1O c1o) throws HttpDataSource$HttpDataSourceException {
        C7384Etj.A0Y(c1o, 0);
        this.A07 = c1o;
        this.A06 = new byte[this.A08];
        this.A03 = c1o.A02;
        this.A04 = c1o.A04;
        int iA00 = A00();
        this.A02 = iA00;
        this.A00 = 0;
        if (iA00 >= 0 && iA00 < this.A0A) {
            return iA00;
        }
        long j = c1o.A03;
        if (j >= 0) {
            return j;
        }
        return -1L;
    }

    @Override // X.InterfaceC4891DDk, X.C1L
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        int i3;
        int i4;
        C7384Etj.A0Y(bArr, 0);
        byte[] bArr2 = this.A06;
        if (bArr2 == null || this.A00 < i2) {
            if (bArr2 == null || (i4 = this.A00) <= 0) {
                i3 = i2;
            } else {
                System.arraycopy(bArr2, this.A01, bArr, i, i4);
                int i5 = this.A00;
                i += i5;
                i3 = i2 - i5;
                this.A00 = 0;
            }
            do {
                int iA00 = this.A02;
                if (iA00 > 0) {
                    int i6 = this.A09.read(bArr, i, i3);
                    if (i6 == -1) {
                        this.A02 = 0;
                        iA00 = 0;
                    } else {
                        i += i6;
                        i3 -= i6;
                        this.A02 -= i6;
                        long j = i6;
                        this.A04 += j;
                        this.A03 += j;
                    }
                }
                byte[] bArr3 = this.A06;
                if (bArr3 == null) {
                    throw new HttpDataSource$HttpDataSourceException(new C1O(Uri.EMPTY, null, 0L, -1L), "No internal buffer", 2);
                }
                int i7 = this.A00;
                if (iA00 + i7 <= this.A08) {
                    int i8 = this.A01;
                    if (i8 > 0) {
                        if (i7 > 0) {
                            System.arraycopy(bArr3, i8, bArr3, 0, i7);
                        }
                        this.A01 = 0;
                    }
                    while (true) {
                        iA00 = this.A02;
                        if (iA00 <= 0) {
                            break;
                        }
                        int i9 = this.A09.read(bArr3, this.A00, iA00);
                        if (i9 == -1) {
                            this.A02 = 0;
                            iA00 = 0;
                            break;
                        }
                        this.A00 += i9;
                        this.A02 -= i9;
                        long j2 = i9;
                        this.A04 += j2;
                        this.A03 += j2;
                    }
                    if (!this.A05) {
                        this.A09.close();
                        iA00 = A00();
                        this.A02 = iA00;
                    }
                }
                if (this.A00 > 0 || iA00 > 0) {
                    int i10 = read(bArr, i, i3);
                    return (i2 - i3) + (i10 != -1 ? i10 : 0);
                }
                i2 -= i3;
                if (i2 <= 0) {
                    return -1;
                }
            } while (i3 != 0);
            return i2;
        }
        System.arraycopy(bArr2, this.A01, bArr, i, i2);
        this.A01 += i2;
        this.A00 -= i2;
        return i2;
    }

    private final int A00() throws HttpDataSource$HttpDataSourceException {
        C1O c1o = this.A07;
        if (c1o == null) {
            throw new HttpDataSource$HttpDataSourceException(new C1O(Uri.EMPTY, null, 0L, -1L), "No DataSpec when calling openInnder", 1);
        }
        long j = c1o.A03;
        long j2 = c1o.A04;
        int i = this.A0A;
        long jMin = j > 0 ? (long) Math.min(i, j - (this.A04 - j2)) : i;
        Map map = Collections.EMPTY_MAP;
        Uri uri = c1o.A06;
        byte[] bArr = c1o.A0A;
        long j3 = this.A03;
        long j4 = this.A04;
        long j5 = j3 - j4;
        if (jMin <= 0) {
            jMin = -1;
        }
        Object obj = c1o.A07;
        int i2 = c1o.A00;
        String str = c1o.A08;
        String str2 = str != null ? str : null;
        C1G.A04(uri);
        long jOpen = this.A09.open(new C1O(uri, obj, str2, map, bArr, 1, i2, j5, j4, jMin));
        this.A05 = jOpen >= 0 && jOpen < ((long) i);
        return (int) jOpen;
    }

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
        this.A09.cancel();
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final void close() {
        this.A09.close();
        this.A07 = null;
        this.A06 = null;
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> responseHeaders = this.A09.getResponseHeaders();
        C7384Etj.A0U(responseHeaders);
        return responseHeaders;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A09.getUri();
    }

    public DDf(CXK cxk, int i, int i2) {
        this.A09 = cxk;
        this.A08 = i;
        this.A0A = i2;
    }
}
