package X;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* renamed from: X.CWu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3604CWu extends CX9 {
    public int A00;
    public int A01;
    public C1O A02;
    public byte[] A03;

    public C3604CWu() {
        super(false);
    }

    @Override // X.C1J
    public final void close() {
        if (this.A03 != null) {
            this.A03 = null;
            transferEnded();
        }
        this.A02 = null;
    }

    @Override // X.C1J
    public final Uri getUri() {
        C1O c1o = this.A02;
        if (c1o != null) {
            return c1o.A06;
        }
        return null;
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
        System.arraycopy(this.A03, this.A01, bArr, i, iMin);
        this.A01 += iMin;
        this.A00 -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws ParserException, DataSourceException {
        byte[] bArrDecode;
        transferInitializing(c1o);
        this.A02 = c1o;
        Uri uriNormalizeScheme = c1o.A06.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C1G.A09("data".equals(scheme), FGI.A0M("Unsupported scheme: ", scheme));
        String[] strArrA1a = BV4.A1a(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrA1a.length != 2) {
            throw new ParserException(AnonymousClass007.A0a("Unexpected URI format: ", uriNormalizeScheme), null, 0, true);
        }
        String str = strArrA1a[1];
        if (strArrA1a[0].contains(AnonymousClass000.A00(21))) {
            try {
                bArrDecode = Base64.decode(str, 0);
                this.A03 = bArrDecode;
            } catch (IllegalArgumentException e) {
                throw new ParserException(FGI.A0M("Error while parsing Base64 encoded string: ", str), e, 0, true);
            }
        } else {
            bArrDecode = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.A03 = bArrDecode;
        }
        long j = c1o.A04;
        int length = bArrDecode.length;
        if (j > length) {
            this.A03 = null;
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
        transferStarted(c1o);
        return j2 == -1 ? this.A00 : j2;
    }
}
