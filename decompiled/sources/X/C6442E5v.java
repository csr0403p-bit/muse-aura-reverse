package X;

import androidx.media3.common.Timeline;

/* renamed from: X.E5v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6442E5v {
    public long A00;
    public C6442E5v A01;
    public E6Q A02;
    public C5414DiA A03;
    public E6W A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC6006Dtp A09;
    public final Object A0A;
    public final InterfaceC5921Ds8[] A0B;
    public final InterfaceC6022DuF[] A0C;
    public final C6430E5i A0D;
    public final AbstractC5823DqC A0E;
    public final boolean[] A0F;

    public final long A04(E6W e6w, boolean[] zArr, long j, boolean z) {
        int length;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= e6w.A00) {
                break;
            }
            boolean[] zArr2 = this.A0F;
            if (z || !e6w.A00(this.A04, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        InterfaceC6022DuF[] interfaceC6022DuFArr = this.A0C;
        int i2 = 0;
        while (true) {
            length = this.A0B.length;
            if (i2 >= length) {
                break;
            }
            i2++;
        }
        A01(this);
        this.A04 = e6w;
        A02(this);
        InterfaceC6006Dtp interfaceC6006Dtp = this.A09;
        InterfaceC5441Dic[] interfaceC5441DicArr = e6w.A04;
        long jAcS = interfaceC6006Dtp.AcS(interfaceC6022DuFArr, interfaceC5441DicArr, this.A0F, zArr, j);
        for (int i3 = 0; i3 < length; i3++) {
        }
        this.A06 = false;
        for (int i4 = 0; i4 < interfaceC6022DuFArr.length; i4++) {
            if (interfaceC6022DuFArr[i4] != null) {
                C1G.A08(AnonymousClass002.A1X(e6w.A03[i4]));
                this.A06 = true;
            } else {
                C1G.A08(AnonymousClass002.A1Y(interfaceC5441DicArr[i4]));
            }
        }
        return jAcS;
    }

    public final void A08(Timeline timeline, float f, boolean z) {
        this.A08 = true;
        this.A03 = this.A09.ALu();
        E6W e6wA05 = A05(timeline, f, z);
        E6Q e6q = this.A02;
        long jA07 = e6q.A03;
        long j = e6q.A00;
        if (j != -9223372036854775807L && jA07 >= j) {
            jA07 = BV5.A07(j - 1);
        }
        long jA04 = A04(e6wA05, new boolean[this.A0B.length], jA07, false);
        long j2 = this.A00;
        E6Q e6q2 = this.A02;
        this.A00 = j2 + (e6q2.A03 - jA04);
        this.A02 = e6q2.A01(jA04);
    }

    public static long A00(C6442E5v c6442E5v) {
        return c6442E5v.A02.A03 + c6442E5v.A00;
    }

    public static void A01(C6442E5v c6442E5v) {
        if (c6442E5v.A01 != null) {
            return;
        }
        int i = 0;
        while (true) {
            E6W e6w = c6442E5v.A04;
            if (i >= e6w.A00) {
                return;
            }
            boolean zA1X = AnonymousClass002.A1X(e6w.A03[i]);
            InterfaceC5441Dic interfaceC5441Dic = e6w.A04[i];
            if (zA1X && interfaceC5441Dic != null) {
                interfaceC5441Dic.A90();
            }
            i++;
        }
    }

    public static void A02(C6442E5v c6442E5v) {
        if (c6442E5v.A01 != null) {
            return;
        }
        int i = 0;
        while (true) {
            E6W e6w = c6442E5v.A04;
            if (i >= e6w.A00) {
                return;
            }
            boolean zA1X = AnonymousClass002.A1X(e6w.A03[i]);
            InterfaceC5441Dic interfaceC5441Dic = e6w.A04[i];
            if (zA1X && interfaceC5441Dic != null) {
                interfaceC5441Dic.A9v();
            }
            i++;
        }
    }

    public final long A03() {
        if (!this.A08) {
            return this.A02.A03;
        }
        if (this.A06) {
            long jAD8 = this.A09.AD8();
            if (jAD8 != Long.MIN_VALUE) {
                return jAD8;
            }
        }
        return this.A02.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.E6W A05(androidx.media3.common.Timeline r5, float r6, boolean r7) {
        /*
            r4 = this;
            X.DqC r3 = r4.A0E
            X.Ds8[] r2 = r4.A0B
            X.DiA r1 = r4.A03
            X.E6Q r0 = r4.A02
            X.Dy6 r0 = r0.A04
            X.E6W r5 = r3.A09(r5, r0, r1, r2)
            r4 = 0
            r3 = 0
        L10:
            int r0 = r5.A00
            if (r3 >= r0) goto L2f
            X.Dsl[] r0 = r5.A03
            r0 = r0[r3]
            boolean r2 = X.AnonymousClass002.A1X(r0)
            r1 = 1
            X.Dic[] r0 = r5.A04
            r0 = r0[r3]
            if (r2 == 0) goto L2c
            if (r0 != 0) goto L26
        L25:
            r1 = 0
        L26:
            X.C1G.A08(r1)
            int r3 = r3 + 1
            goto L10
        L2c:
            if (r0 != 0) goto L25
            goto L26
        L2f:
            X.Dic[] r2 = r5.A04
            int r1 = r2.length
        L32:
            if (r4 >= r1) goto L41
            r0 = r2[r4]
            if (r0 == 0) goto L3e
            r0.AUe(r6)
            r0.AUa(r7)
        L3e:
            int r4 = r4 + 1
            goto L32
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6442E5v.A05(androidx.media3.common.Timeline, float, boolean):X.E6W");
    }

    public final void A07() {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A09;
        if (interfaceC6006Dtp instanceof C6001Dtk) {
            long j = this.A02.A01;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C6001Dtk c6001Dtk = (C6001Dtk) interfaceC6006Dtp;
            c6001Dtk.A02 = 0L;
            c6001Dtk.A00 = j;
        }
    }

    public final boolean A09() {
        if (this.A08) {
            return !this.A06 || this.A09.AD8() == Long.MIN_VALUE;
        }
        return false;
    }

    public C6442E5v(E6Q e6q, C6430E5i c6430E5i, AbstractC5823DqC abstractC5823DqC, E6W e6w, InterfaceC5538DkF interfaceC5538DkF, InterfaceC5921Ds8[] interfaceC5921Ds8Arr, long j) {
        this.A0B = interfaceC5921Ds8Arr;
        this.A00 = j;
        this.A0E = abstractC5823DqC;
        this.A0D = c6430E5i;
        Dy6 dy6 = e6q.A04;
        this.A0A = dy6.A04;
        this.A02 = e6q;
        this.A03 = C5414DiA.A03;
        this.A04 = e6w;
        int length = interfaceC5921Ds8Arr.length;
        this.A0C = new InterfaceC6022DuF[length];
        this.A0F = new boolean[length];
        long j2 = e6q.A03;
        long j3 = e6q.A01;
        boolean z = e6q.A09;
        C6003Dtm c6003DtmA08 = c6430E5i.A08(dy6, interfaceC5538DkF, j2);
        this.A09 = j3 != -9223372036854775807L ? new C6001Dtk(c6003DtmA08, 0L, j3, !z) : c6003DtmA08;
    }

    public final void A06() {
        A01(this);
        C6430E5i c6430E5i = this.A0D;
        InterfaceC6006Dtp interfaceC6006Dtp = this.A09;
        try {
            if (interfaceC6006Dtp instanceof C6001Dtk) {
                interfaceC6006Dtp = ((C6001Dtk) interfaceC6006Dtp).A06;
            }
            c6430E5i.A0B(interfaceC6006Dtp);
        } catch (RuntimeException e) {
            CNC.A05("MediaPeriodHolder2", "Period release failed.", e);
        }
    }
}
