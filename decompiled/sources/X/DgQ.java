package X;

import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class DgQ extends C5330DgR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    @Override // X.C5330DgR, X.InterfaceC5334DgV
    public final C5333DgU AFY(C5332DgT c5332DgT, C5335DgW c5335DgW) {
        HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException;
        C5333DgU c5333DgUAFY = super.AFY(c5332DgT, c5335DgW);
        if (c5333DgUAFY != null) {
            return c5333DgUAFY;
        }
        IOException iOException = c5335DgW.A03;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || (httpDataSource$InvalidResponseCodeException = (HttpDataSource$InvalidResponseCodeException) iOException) == null) {
            return null;
        }
        int i = httpDataSource$InvalidResponseCodeException.responseCode;
        if (i != 429 && i != 500 && i != 502 && i != 503 && i != 504) {
            return null;
        }
        if (c5332DgT.A02 - c5332DgT.A00 > 1) {
            return new C5333DgU(1, 300000L);
        }
        if (c5332DgT.A03 - c5332DgT.A01 > 1) {
            return new C5333DgU(2, 60000L);
        }
        return null;
    }

    public DgQ(int i, int i2, int i3, int i4, int i5) {
        super(i);
        this.A00 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A02 = i5;
    }

    @Override // X.C5330DgR, X.InterfaceC5334DgV
    public final int AHm(int i) {
        return Math.max(super.AHm(i), this.A03);
    }
}
