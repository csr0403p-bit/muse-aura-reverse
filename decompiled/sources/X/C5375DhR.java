package X;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import java.nio.charset.StandardCharsets;

/* renamed from: X.DhR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5375DhR implements InterfaceC5563Dkg {
    public Uri A01;
    public final C5426DiN A03;
    public final /* synthetic */ C5366DhI A05;
    public final C5406Dhz A02 = new C5406Dhz();
    public final C5407Di0 A04 = new C5407Di0(1);
    public long A00 = -9223372036854775807L;

    public C5375DhR(InterfaceC5538DkF interfaceC5538DkF, C5366DhI c5366DhI) {
        this.A05 = c5366DhI;
        this.A03 = new C5426DiN(null, null, interfaceC5538DkF);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(X.AbstractC5411Di6 r6, boolean r7) {
        /*
            r5 = this;
            long r3 = r5.A00
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            long r1 = r6.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L13
        L12:
            r2 = 0
        L13:
            X.DhI r1 = r5.A05
            X.Dky r0 = r1.A00
            boolean r0 = r0.A0S
            if (r0 == 0) goto L2a
            boolean r0 = r1.A02
            if (r0 != 0) goto L28
            if (r2 != 0) goto L23
            if (r7 == 0) goto L2a
        L23:
            java.lang.String r0 = "forward_seek_forced"
            X.C5366DhI.A00(r1, r0)
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5375DhR.A00(X.Di6, boolean):boolean");
    }

    @Override // X.InterfaceC5563Dkg
    public final void ABq(C6154Dwx c6154Dwx) {
        this.A03.ABq(c6154Dwx);
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ int Abu(C1L c1l, int i, boolean z) {
        return this.A03.Aby(c1l, i, 0, z);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abv(E1P e1p, int i) {
        this.A03.Abv(e1p, i);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abw(E1P e1p, int i, int i2) {
        this.A03.Abv(e1p, i);
    }

    @Override // X.InterfaceC5563Dkg
    public final int Aby(C1L c1l, int i, int i2, boolean z) {
        return this.A03.Aby(c1l, i, 0, z);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abz(DjB djB, int i, int i2, int i3, long j) {
        long jA01;
        byte[] bArr;
        C5426DiN c5426DiN = this.A03;
        c5426DiN.Abz(djB, i, i2, i3, j);
        while (c5426DiN.A0E(false)) {
            C5407Di0 c5407Di0 = this.A04;
            c5407Di0.A02();
            if (c5426DiN.A05(c5407Di0, this.A02, 0, false) == -4) {
                c5407Di0.A03();
                long j2 = ((Di2) c5407Di0).A00;
                C5366DhI c5366DhI = this.A05;
                C5402Dhv c5402DhvA8E = c5366DhI.A06.A8E(c5407Di0);
                if (c5402DhvA8E != null) {
                    DYO dyo = (DYO) c5402DhvA8E.A01[0];
                    String str = dyo.A03;
                    String str2 = dyo.A04;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            long jA0E = Util.A0E(new String(dyo.A05, StandardCharsets.UTF_8));
                            if (jA0E != -9223372036854775807L) {
                                BV4.A1D(c5366DhI.A04, new C5373DhP(j2, jA0E), 1);
                            }
                        } catch (ParserException unused) {
                        }
                    } else if ("livedash:trace:f0e6005d-acc5-4de5-b754-00301ef34c80".equals(str)) {
                        Uri uri = this.A01;
                        if (dyo.A02 == 1 && (bArr = dyo.A05) != null && uri != null) {
                            BV4.A1D(c5366DhI.A04, new C5372DhO(uri, new String(bArr)), 1001);
                        }
                    } else if (!str.contains("urn:fb:metadata")) {
                        BV4.A1D(c5366DhI.A04, new Object[]{dyo.A05, dyo.A03, Long.valueOf(dyo.A02)}, 1004);
                    }
                }
            }
        }
        C5430DiR c5430DiR = c5426DiN.A0S;
        synchronized (c5426DiN) {
            int i4 = c5426DiN.A03;
            jA01 = i4 == 0 ? -1L : C5426DiN.A01(c5426DiN, i4);
        }
        c5430DiR.A05(jA01);
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void A9m(long j) {
    }
}
