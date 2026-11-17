package X;

/* renamed from: X.E5x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6444E5x {
    public long A00;
    public C6444E5x A01;
    public E6Q A02;
    public C5414DiA A03;
    public E6W A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC6006Dtp A08;
    public final AbstractC5823DqC A09;
    public final Object A0A;
    public final InterfaceC5921Ds8[] A0B;
    public final InterfaceC6022DuF[] A0C;
    public final E7Y A0D;
    public final boolean[] A0E;

    public final long A03(E6W e6w, boolean[] zArr, long j, boolean z) {
        int length;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= e6w.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
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
        A00(this);
        this.A04 = e6w;
        A01(this);
        InterfaceC6006Dtp interfaceC6006Dtp = this.A08;
        InterfaceC5441Dic[] interfaceC5441DicArr = e6w.A04;
        long jAcS = interfaceC6006Dtp.AcS(interfaceC6022DuFArr, interfaceC5441DicArr, this.A0E, zArr, j);
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

    public static void A00(C6444E5x c6444E5x) {
        if (c6444E5x.A01 != null) {
            return;
        }
        int i = 0;
        while (true) {
            E6W e6w = c6444E5x.A04;
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

    public static void A01(C6444E5x c6444E5x) {
        if (c6444E5x.A01 != null) {
            return;
        }
        int i = 0;
        while (true) {
            E6W e6w = c6444E5x.A04;
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

    public final long A02() {
        if (!this.A07) {
            return this.A02.A03;
        }
        if (this.A06) {
            long jAD8 = this.A08.AD8();
            if (jAD8 != Long.MIN_VALUE) {
                return jAD8;
            }
        }
        return this.A02.A00;
    }

    public final void A05() {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A08;
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

    public final void A06(long j) {
        C1G.A08(AnonymousClass002.A1Y(this.A01));
        if (this.A07) {
            this.A08.AZv(j - this.A00);
        }
    }

    public final boolean A07() {
        if (this.A07) {
            return !this.A06 || this.A08.AD8() == Long.MIN_VALUE;
        }
        return false;
    }

    public C6444E5x(E6Q e6q, C6430E5i c6430E5i, AbstractC5823DqC abstractC5823DqC, E6W e6w, InterfaceC5538DkF interfaceC5538DkF, InterfaceC5921Ds8[] interfaceC5921Ds8Arr, long j) {
        this.A0B = interfaceC5921Ds8Arr;
        this.A00 = j;
        this.A09 = abstractC5823DqC;
        E6V e6v = new E6V(this, c6430E5i);
        this.A0D = e6v;
        Dy6 dy6 = e6q.A04;
        this.A0A = dy6.A04;
        this.A02 = e6q;
        this.A03 = C5414DiA.A03;
        this.A04 = e6w;
        int length = interfaceC5921Ds8Arr.length;
        this.A0C = new InterfaceC6022DuF[length];
        this.A0E = new boolean[length];
        long j2 = e6q.A03;
        long j3 = e6q.A01;
        C6003Dtm c6003DtmA08 = e6v.A01.A08(dy6, interfaceC5538DkF, j2);
        this.A08 = j3 != -9223372036854775807L ? new C6001Dtk(c6003DtmA08, 0L, j3, true) : c6003DtmA08;
    }

    public final void A04() {
        A00(this);
        E7Y e7y = this.A0D;
        InterfaceC6006Dtp interfaceC6006Dtp = this.A08;
        try {
            if (interfaceC6006Dtp instanceof C6001Dtk) {
                interfaceC6006Dtp = ((C6001Dtk) interfaceC6006Dtp).A06;
            }
            ((E6V) e7y).A01.A0B(interfaceC6006Dtp);
        } catch (RuntimeException e) {
            CNC.A05("MediaPeriodHolder", "Period release failed.", e);
        }
    }
}
