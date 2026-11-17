package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.DDu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4901DDu implements C1J {
    public byte[] A00;
    public int A01;
    public C1O A02;
    public DDj A03;
    public final int A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.C1J
    public final long open(C1O c1o) {
        C7384Etj.A0Y(c1o, 0);
        this.A02 = c1o;
        DDj dDj = this.A03;
        if (dDj != null) {
            dDj.AWl(c1o, DEK.CACHED);
        }
        this.A01 = 0;
        DDj dDj2 = this.A03;
        if (dDj2 != null) {
            dDj2.AWm(this, c1o, false);
        }
        return this.A04;
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        int i3 = this.A04;
        int i4 = this.A01;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return -1;
        }
        if (i2 > i5) {
            i2 = i5;
        }
        byte[] bArr2 = this.A00;
        if (bArr2 == null) {
            return 0;
        }
        if (i2 > 0) {
            System.arraycopy(bArr2, i4, bArr, i, i2);
            this.A01 += i2;
            DDj dDj = this.A03;
            if (dDj != null) {
                C1O c1o = this.A02;
                C1O c1o2 = AbstractC4889DDd.A00;
                if (c1o == null) {
                    c1o = AbstractC4889DDd.A00;
                }
                dDj.AS2(this, c1o, i2, false);
            }
        }
        return i2;
    }

    @Override // X.C1J
    public final void close() {
        DDj dDj = this.A03;
        if (dDj != null) {
            if (this.A07 && this.A02 == null) {
                return;
            }
            C1O c1o = this.A02;
            C1O c1o2 = AbstractC4889DDd.A00;
            if (c1o == null) {
                c1o = AbstractC4889DDd.A00;
            }
            dDj.AWh(this, c1o, false);
            this.A03 = null;
        }
    }

    @Override // X.C1J
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return null;
    }

    public C4901DDu(DDj dDj, Integer num, byte[] bArr, int i, boolean z, boolean z2) {
        this.A00 = bArr;
        this.A04 = i;
        this.A03 = dDj;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = num;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        this.A03 = (DDj) C7384Etj.A08(cxb);
    }
}
