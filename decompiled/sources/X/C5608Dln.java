package X;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Dln, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5608Dln {
    public Uri A00;
    public C5798Dpi A01;
    public C5913Drw A02;
    public ImmutableList<C5567Dkl> A03;
    public Object A04;
    public String A05;
    public String A06;
    public long A07;
    public C5881DrH A08;
    public C5714Dnx A09;
    public C10388Har A0A;
    public String A0B;
    public List<StreamKey> A0C;

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5704Dnm A00() {
        /*
            r12 = this;
            r1 = r12
            X.Dnx r3 = r12.A09
            android.net.Uri r0 = r3.A00
            if (r0 == 0) goto Lc
            java.util.UUID r2 = r3.A03
            r0 = 0
            if (r2 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            X.C1G.A08(r0)
            android.net.Uri r4 = r12.A00
            r5 = 0
            if (r4 == 0) goto L54
            java.lang.String r8 = r12.A06
            java.util.UUID r0 = r3.A03
            if (r0 == 0) goto L20
            X.Dlo r5 = new X.Dlo
            r5.<init>(r3)
        L20:
            java.util.List<androidx.media3.common.StreamKey> r10 = r12.A0C
            java.lang.String r9 = r12.A0B
            com.google.common.collect.ImmutableList<X.Dkl> r6 = r12.A03
            java.lang.Object r7 = r12.A04
            long r11 = r12.A07
            X.Dkm r3 = new X.Dkm
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L2f:
            X.Dnm r0 = X.C5704Dnm.A08
            java.lang.String r10 = r1.A05
            if (r10 != 0) goto L37
            java.lang.String r10 = ""
        L37:
            X.DrH r0 = r1.A08
            X.DuL r5 = new X.DuL
            r5.<init>(r0)
            X.Dpi r0 = r1.A01
            X.DpJ r6 = new X.DpJ
            r6.<init>(r0)
            X.Har r9 = r1.A0A
            if (r9 != 0) goto L4b
            X.Har r9 = X.C10388Har.A0Y
        L4b:
            X.Drw r8 = r1.A02
            X.Dnm r4 = new X.Dnm
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L54:
            r3 = r5
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5608Dln.A00():X.Dnm");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Dnx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.Dnx] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    public C5608Dln(C5704Dnm c5704Dnm) {
        ?? c5714Dnx;
        this();
        AbstractC5802Dpm abstractC5802Dpm = c5704Dnm.A00;
        C5881DrH c5881DrH = new C5881DrH();
        c5881DrH.A01 = abstractC5802Dpm.A01;
        c5881DrH.A00 = abstractC5802Dpm.A00;
        c5881DrH.A04 = abstractC5802Dpm.A04;
        c5881DrH.A03 = abstractC5802Dpm.A03;
        c5881DrH.A05 = abstractC5802Dpm.A05;
        c5881DrH.A02 = abstractC5802Dpm.A02;
        this.A08 = c5881DrH;
        this.A05 = c5704Dnm.A07;
        this.A0A = c5704Dnm.A06;
        this.A01 = new C5798Dpi(c5704Dnm.A02);
        this.A02 = c5704Dnm.A05;
        C5568Dkm c5568Dkm = c5704Dnm.A03;
        if (c5568Dkm != null) {
            this.A0B = c5568Dkm.A05;
            this.A06 = c5568Dkm.A06;
            this.A00 = c5568Dkm.A01;
            this.A0C = c5568Dkm.A07;
            this.A03 = c5568Dkm.A03;
            this.A04 = c5568Dkm.A04;
            C5609Dlo c5609Dlo = c5568Dkm.A02;
            if (c5609Dlo != null) {
                C5714Dnx c5714Dnx2 = new C5714Dnx();
                c5714Dnx.A03 = c5609Dlo.A05;
                c5714Dnx.A00 = c5609Dlo.A00;
                c5714Dnx.A02 = c5609Dlo.A03;
                c5714Dnx.A05 = c5609Dlo.A08;
                c5714Dnx.A06 = c5609Dlo.A09;
                c5714Dnx.A04 = c5609Dlo.A07;
                c5714Dnx.A01 = c5609Dlo.A01;
                c5714Dnx.A07 = c5609Dlo.A0A;
                c5714Dnx = c5714Dnx2;
            } else {
                c5714Dnx = new C5714Dnx();
            }
            this.A09 = c5714Dnx;
            this.A07 = c5568Dkm.A00;
        }
    }

    public C5608Dln() {
        this.A08 = new C5881DrH();
        this.A09 = new C5714Dnx();
        this.A0C = Collections.EMPTY_LIST;
        this.A03 = ImmutableList.of();
        this.A01 = new C5798Dpi();
        this.A02 = C5913Drw.A01;
        this.A07 = -9223372036854775807L;
    }
}
