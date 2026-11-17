package X;

import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;

/* renamed from: X.DgR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5330DgR implements InterfaceC5334DgV {
    public final int A00;

    @Override // X.InterfaceC5334DgV
    public C5333DgU AFY(C5332DgT c5332DgT, C5335DgW c5335DgW) {
        long j;
        int i;
        IOException iOException = c5335DgW.A03;
        boolean z = false;
        if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503)) {
            z = true;
        }
        if (z) {
            int i2 = 1;
            if (c5332DgT.A02 - c5332DgT.A00 <= 1) {
                i2 = 2;
                j = c5332DgT.A03 - c5332DgT.A01 > 1 ? 60000L : 300000L;
            }
            return new C5333DgU(i2, j);
        }
        return null;
    }

    @Override // X.InterfaceC5334DgV
    public int AHm(int i) {
        int i2 = this.A00;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[PHI: r2
  0x00c2: PHI (r2v6 java.util.Map<java.lang.String, java.util.List<java.lang.String>>) = 
  (r2v3 java.util.Map<java.lang.String, java.util.List<java.lang.String>>)
  (r2v3 java.util.Map<java.lang.String, java.util.List<java.lang.String>>)
  (r2v20 java.util.Map<java.lang.String, java.util.List<java.lang.String>>)
  (r2v20 java.util.Map<java.lang.String, java.util.List<java.lang.String>>)
  (r2v20 java.util.Map<java.lang.String, java.util.List<java.lang.String>>)
  (r2v20 java.util.Map<java.lang.String, java.util.List<java.lang.String>>)
  (r2v20 java.util.Map<java.lang.String, java.util.List<java.lang.String>>)
 binds: [B:36:0x008d, B:38:0x0099, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:49:0x00bc, B:51:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5334DgV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AJn(X.C5335DgW r12) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5330DgR.AJn(X.DgW):long");
    }

    public C5330DgR(int i) {
        this.A00 = i;
    }

    public C5330DgR() {
        this(-1);
    }
}
