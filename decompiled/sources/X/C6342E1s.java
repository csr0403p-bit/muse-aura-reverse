package X;

import com.facebook.forker.Process;

/* renamed from: X.E1s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6342E1s implements InterfaceC6401E4d {
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public InterfaceC5563Dkg A0A;
    public C6343E1t A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G = 0;
    public boolean A0H;
    public final C6340E1q A0I;
    public final E1P A0J;
    public final E1P A0K;

    public static int A00(int a, int b) {
        long j = a + b;
        int i = (int) j;
        if (AnonymousClass002.A1M((j > i ? 1 : (j == i ? 0 : -1)))) {
            return i;
        }
        StringBuilder sbA0x = C3cI.A0x("overflow: ", "checkedAdd");
        sbA0x.append("(");
        sbA0x.append(a);
        C8j3.A1K(sbA0x);
        sbA0x.append(b);
        throw new ArithmeticException(BV7.A10(sbA0x));
    }

    public static void A02(C6340E1q c6340E1q) {
        int i;
        int iA08 = c6340E1q.A08(2);
        if (iA08 == 0) {
            i = 6;
        } else {
            int iA01 = A01(c6340E1q, 5, 8, 16) + 1;
            if (iA08 != 1) {
                if (iA08 == 2) {
                    boolean zA0I = c6340E1q.A0I();
                    int i2 = 5;
                    int i3 = zA0I ? 1 : 5;
                    int i4 = 6;
                    if (zA0I) {
                        i2 = 7;
                        i4 = 8;
                    }
                    int i5 = 0;
                    while (i5 < iA01) {
                        if (c6340E1q.A0I()) {
                            c6340E1q.A0C(7);
                        } else {
                            if (c6340E1q.A08(2) == 3 && c6340E1q.A08(i2) * i3 != 0) {
                                c6340E1q.A0A();
                            }
                            int iA082 = c6340E1q.A08(i4) * i3;
                            if (iA082 != 0 && iA082 != 180) {
                                c6340E1q.A0A();
                            }
                            c6340E1q.A0A();
                            if (iA082 != 0 && iA082 != 180 && c6340E1q.A0I()) {
                                i5++;
                            }
                        }
                        i5++;
                    }
                    return;
                }
                return;
            }
            i = iA01 * 7;
        }
        c6340E1q.A0C(i);
    }

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A0G = 0;
        this.A07 = 0;
        this.A0J.A0P(2);
        this.A04 = 0;
        this.A03 = 0;
        this.A05 = Process.WAIT_RESULT_STOPPED;
        this.A06 = -1;
        this.A08 = 0;
        this.A09 = -1L;
        this.A0D = false;
        this.A0E = false;
        this.A0H = true;
        this.A0F = true;
        this.A00 = -9.223372036854776E18d;
        this.A01 = -9.223372036854776E18d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x037e, code lost:
    
        throw X.BV6.A0V(r0, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6342E1s.A6w(X.E1P):void");
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A02 = i;
        if (!this.A0F && (this.A03 != 0 || !this.A0H)) {
            this.A0E = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.A0E) {
                this.A01 = d;
            } else {
                this.A00 = d;
            }
        }
    }

    public C6342E1s() {
        E1P e1p = new E1P();
        e1p.A02 = new byte[15];
        e1p.A00 = 2;
        this.A0J = e1p;
        this.A0I = new C6340E1q();
        this.A0K = BV6.A0X();
        this.A0B = new C6343E1t();
        this.A05 = Process.WAIT_RESULT_STOPPED;
        this.A06 = -1;
        this.A09 = -1L;
        this.A0F = true;
        this.A0H = true;
        this.A00 = -9.223372036854776E18d;
        this.A01 = -9.223372036854776E18d;
    }

    public static int A01(C6340E1q c6340E1q, int i, int i2, int i3) {
        C1G.A07(BV7.A1S(Math.max(Math.max(i, i2), i3), 31));
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        A00(A00(i4, i5), 1 << i3);
        if (c6340E1q.A06() >= i) {
            int iA08 = c6340E1q.A08(i);
            if (iA08 != i4) {
                return iA08;
            }
            if (c6340E1q.A06() >= i2) {
                int iA082 = c6340E1q.A08(i2);
                int i6 = iA08 + iA082;
                if (iA082 != i5) {
                    return i6;
                }
                if (c6340E1q.A06() >= i3) {
                    return i6 + c6340E1q.A08(i3);
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A0C = E4I.A01(e4i);
        this.A0A = E4I.A00(interfaceC6413E4p, e4i);
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
    }
}
