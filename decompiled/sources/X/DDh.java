package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DDh {
    public long A00;
    public long A01;
    public long A02;
    public final int A03;
    public final Uri A04;
    public final C4890DDe A05;
    public final String A06;
    public final byte[] A07;

    public final C1O A00() {
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.A04;
        byte[] bArr = this.A07;
        long j = this.A00;
        long j2 = this.A02;
        long j3 = j - j2;
        long j4 = this.A01;
        if (j4 <= 0) {
            j4 = -1;
        }
        String str = this.A06;
        int i = this.A03;
        C4890DDe c4890DDe = this.A05;
        C1G.A04(uri);
        return new C1O(uri, c4890DDe, str, map, bArr, 1, i, j3, j2, j4);
    }

    public DDh(C1O c1o, String str) {
        this.A06 = str;
        this.A00 = c1o.A02;
        this.A02 = c1o.A04;
        this.A04 = c1o.A06;
        this.A03 = c1o.A00;
        this.A07 = c1o.A0A;
        this.A01 = c1o.A03;
        C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
        C7384Etj.A0U(c4890DDeA00);
        this.A05 = c4890DDeA00;
    }
}
