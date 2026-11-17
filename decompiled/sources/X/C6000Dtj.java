package X;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* renamed from: X.Dtj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6000Dtj extends AbstractC6008Dtr {
    public ClippingMediaSource$IllegalClippingException A00;
    public long A01;
    public long A02;
    public C5999Dti A03;
    public final long A04;
    public final long A05;
    public final C5998Dth A06;
    public final ArrayList<C6001Dtk> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(androidx.media3.common.Timeline r15, X.C6000Dtj r16) {
        /*
            r7 = r16
            X.Dth r1 = r7.A06
            r6 = 0
            r2 = 0
            r11 = r15
            r15.A0E(r1, r6, r2)
            long r4 = r1.A05
            X.Dti r0 = r7.A03
            r14 = -9223372036854775808
            if (r0 == 0) goto L2c
            java.util.ArrayList<X.Dtk> r8 = r7.A07
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L2c
            boolean r0 = r7.A08
            if (r0 != 0) goto L2c
            long r12 = r7.A02
            long r12 = r12 - r4
            long r0 = r7.A04
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L5c
            long r14 = r7.A01
            long r14 = r14 - r4
            goto L5c
        L2c:
            long r12 = r7.A05
            long r2 = r7.A04
            r9 = r2
            boolean r0 = r7.A0B
            if (r0 == 0) goto L39
            long r0 = r1.A02
            long r12 = r12 + r0
            long r2 = r2 + r0
        L39:
            long r0 = r4 + r12
            r7.A02 = r0
            int r8 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r8 == 0) goto L43
            long r14 = r4 + r2
        L43:
            r7.A01 = r14
            java.util.ArrayList<X.Dtk> r8 = r7.A07
            int r9 = r8.size()
            r5 = 0
        L4c:
            if (r5 >= r9) goto L5b
            java.lang.Object r4 = r8.get(r5)
            X.Dtk r4 = (X.C6001Dtk) r4
            r4.A02 = r0
            r4.A00 = r14
            int r5 = r5 + 1
            goto L4c
        L5b:
            r14 = r2
        L5c:
            boolean r0 = r7.A09     // Catch: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException -> L68
            X.Dti r10 = new X.Dti     // Catch: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException -> L68
            r16 = r0
            r10.<init>(r11, r12, r14, r16)     // Catch: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException -> L68
            r7.A03 = r10     // Catch: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException -> L68
            goto L7c
        L68:
            r1 = move-exception
            r7.A00 = r1
        L6b:
            int r0 = r8.size()
            if (r6 >= r0) goto L7f
            java.lang.Object r0 = r8.get(r6)
            X.Dtk r0 = (X.C6001Dtk) r0
            r0.A03 = r1
            int r6 = r6 + 1
            goto L6b
        L7c:
            r7.A0A(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6000Dtj.A00(androidx.media3.common.Timeline, X.Dtj):void");
    }

    @Override // X.InterfaceC6009Dts
    public final InterfaceC6006Dtp A7x(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        C6001Dtk c6001Dtk = new C6001Dtk(((AbstractC6008Dtr) this).A00.A7x(dy6, interfaceC5538DkF, j), this.A02, this.A01, this.A0A);
        this.A07.add(c6001Dtk);
        return c6001Dtk;
    }

    @Override // X.AbstractC6010Dtt, X.InterfaceC6009Dts
    public final void AQS() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.A00;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.AQS();
    }

    @Override // X.InterfaceC6009Dts
    public final void AaI(InterfaceC6006Dtp interfaceC6006Dtp) {
        ArrayList<C6001Dtk> arrayList = this.A07;
        C1G.A08(arrayList.remove(interfaceC6006Dtp));
        ((AbstractC6008Dtr) this).A00.AaI(((C6001Dtk) interfaceC6006Dtp).A06);
        if (!arrayList.isEmpty() || this.A08) {
            return;
        }
        C5999Dti c5999Dti = this.A03;
        c5999Dti.getClass();
        A00(((Du4) c5999Dti).A00, this);
    }

    public C6000Dtj(InterfaceC6009Dts interfaceC6009Dts, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(interfaceC6009Dts);
        this.A05 = j2;
        this.A04 = j;
        this.A0A = z3;
        this.A08 = z;
        this.A0B = z4;
        this.A09 = z2;
        this.A07 = C3cG.A0h();
        this.A06 = new C5998Dth();
    }

    @Override // X.AbstractC6010Dtt, X.AbstractC6011Dtu
    public final void A0B() {
        super.A0B();
        this.A00 = null;
        this.A03 = null;
    }
}
