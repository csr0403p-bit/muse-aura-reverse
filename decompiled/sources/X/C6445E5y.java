package X;

/* renamed from: X.E5y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6445E5y {
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = false;
    public final int A03;
    public final InterfaceC6068Dv6 A04;
    public final InterfaceC6068Dv6 A05;

    public static int A00(E68 e68, C6442E5v c6442E5v, InterfaceC6068Dv6 interfaceC6068Dv6, C6445E5y c6445E5y, E6W e6w) {
        InterfaceC6068Dv6 interfaceC6068Dv62;
        int i;
        if (interfaceC6068Dv6 == null || !AnonymousClass002.A1L(interfaceC6068Dv6.AL0()) || ((interfaceC6068Dv6 == (interfaceC6068Dv62 = c6445E5y.A04) && ((i = c6445E5y.A00) == 2 || i == 4)) || (interfaceC6068Dv6 == c6445E5y.A05 && c6445E5y.A00 == 3))) {
            return 1;
        }
        InterfaceC6022DuF interfaceC6022DuFAL9 = interfaceC6068Dv6.AL9();
        InterfaceC6022DuF[] interfaceC6022DuFArr = c6442E5v.A0C;
        int i2 = c6445E5y.A03;
        boolean zA1Z = AnonymousClass006.A1Z(interfaceC6022DuFAL9, interfaceC6022DuFArr[i2]);
        boolean zA1X = AnonymousClass002.A1X(e6w.A03[i2]);
        if (zA1X && !zA1Z) {
            return 1;
        }
        if (interfaceC6068Dv6.AOI()) {
            if (!interfaceC6068Dv6.isEnded()) {
                return 0;
            }
            A02(e68, interfaceC6068Dv6, c6445E5y);
            if (!zA1X || c6445E5y.A09()) {
                A04(c6445E5y, interfaceC6068Dv6 == interfaceC6068Dv62);
                return 1;
            }
            return 1;
        }
        InterfaceC5441Dic interfaceC5441Dic = e6w.A04[i2];
        int length = interfaceC5441Dic != null ? interfaceC5441Dic.length() : 0;
        C6154Dwx[] c6154DwxArr = new C6154Dwx[length];
        for (int i3 = 0; i3 < length; i3++) {
            interfaceC5441Dic.getClass();
            c6154DwxArr[i3] = interfaceC5441Dic.AFq(i3);
        }
        InterfaceC6022DuF interfaceC6022DuF = interfaceC6022DuFArr[i2];
        interfaceC6022DuF.getClass();
        E6Q e6q = c6442E5v.A02;
        long j = e6q.A03;
        long j2 = c6442E5v.A00;
        interfaceC6068Dv6.Ab0(e6q.A04, interfaceC6022DuF, c6154DwxArr, j + j2, j2);
        return 3;
    }

    public static InterfaceC6068Dv6 A01(C6442E5v c6442E5v, C6445E5y c6445E5y) {
        InterfaceC6022DuF interfaceC6022DuF;
        if (c6442E5v != null && (interfaceC6022DuF = c6442E5v.A0C[c6445E5y.A03]) != null) {
            InterfaceC6068Dv6 interfaceC6068Dv6 = c6445E5y.A04;
            if (interfaceC6068Dv6.AL9() == interfaceC6022DuF || ((interfaceC6068Dv6 = c6445E5y.A05) != null && interfaceC6068Dv6.AL9() == interfaceC6022DuF)) {
                return interfaceC6068Dv6;
            }
        }
        return null;
    }

    public static void A04(C6445E5y c6445E5y, boolean z) {
        if (z) {
            if (c6445E5y.A01) {
                c6445E5y.A04.reset();
                c6445E5y.A01 = false;
                return;
            }
            return;
        }
        if (c6445E5y.A02) {
            InterfaceC6068Dv6 interfaceC6068Dv6 = c6445E5y.A05;
            interfaceC6068Dv6.getClass();
            interfaceC6068Dv6.reset();
            c6445E5y.A02 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r9.AJR() >= X.C6442E5v.A00(r1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(X.C6442E5v r8, X.InterfaceC6068Dv6 r9, X.C6445E5y r10) {
        /*
            r7 = 1
            if (r9 == 0) goto L39
            X.DuF[] r0 = r8.A0C
            int r6 = r10.A03
            r0 = r0[r6]
            X.DuF r5 = r9.AL9()
            if (r5 == 0) goto L39
            if (r5 != r0) goto L3a
            boolean r0 = r9.ANH()
            if (r0 != 0) goto L39
            X.E5v r1 = r8.A01
            X.E6Q r0 = r8.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L3a
            if (r1 == 0) goto L3a
            boolean r0 = r1.A08
            if (r0 == 0) goto L3a
            boolean r0 = r9 instanceof X.E0H
            if (r0 != 0) goto L39
            boolean r0 = r9 instanceof X.C5401Dhu
            if (r0 != 0) goto L39
            long r3 = r9.AJR()
            long r1 = X.C6442E5v.A00(r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L3a
        L39:
            return r7
        L3a:
            X.E5v r0 = r8.A01
            if (r0 == 0) goto L45
            X.DuF[] r0 = r0.A0C
            r0 = r0[r6]
            if (r0 != r5) goto L45
            return r7
        L45:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6445E5y.A05(X.E5v, X.Dv6, X.E5y):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.E68 r2, X.InterfaceC6068Dv6 r3, X.C6445E5y r4) {
        /*
            X.Dv6 r0 = r4.A04
            if (r0 == r3) goto L9
            X.Dv6 r1 = r4.A05
            r0 = 0
            if (r1 != r3) goto La
        L9:
            r0 = 1
        La:
            X.C1G.A08(r0)
            int r0 = r3.AL0()
            boolean r0 = X.AnonymousClass002.A1L(r0)
            if (r0 == 0) goto L30
            X.Dv6 r0 = r2.A01
            if (r3 != r0) goto L23
            r0 = 0
            r2.A00 = r0
            r2.A01 = r0
            r0 = 1
            r2.A02 = r0
        L23:
            int r1 = r3.AL0()
            r0 = 2
            if (r1 != r0) goto L2d
            r3.stop()
        L2d:
            r3.A90()
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6445E5y.A02(X.E68, X.Dv6, X.E5y):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A06() {
        /*
            r3 = this;
            X.Dv6 r0 = r3.A04
            int r0 = r0.AL0()
            boolean r2 = X.AnonymousClass002.A1L(r0)
            X.Dv6 r0 = r3.A05
            if (r0 == 0) goto L19
            int r0 = r0.AL0()
            boolean r1 = X.AnonymousClass002.A1L(r0)
            r0 = 1
            if (r1 != 0) goto L1a
        L19:
            r0 = 0
        L1a:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6445E5y.A06():int");
    }

    public final void A07() {
        if (!AnonymousClass002.A1L(this.A04.AL0())) {
            A04(this, true);
        }
        InterfaceC6068Dv6 interfaceC6068Dv6 = this.A05;
        if (interfaceC6068Dv6 == null || AnonymousClass002.A1L(interfaceC6068Dv6.AL0())) {
            return;
        }
        A04(this, false);
    }

    public final void A08() {
        InterfaceC6068Dv6 interfaceC6068Dv6 = this.A04;
        if ((interfaceC6068Dv6.AL0() != 1 || this.A00 == 4) && ((interfaceC6068Dv6 = this.A05) == null || interfaceC6068Dv6.AL0() != 1 || this.A00 == 3)) {
            return;
        }
        interfaceC6068Dv6.start();
    }

    public final boolean A09() {
        int i = this.A00;
        return i == 2 || i == 4 || i == 3;
    }

    public C6445E5y(InterfaceC6068Dv6 interfaceC6068Dv6, InterfaceC6068Dv6 interfaceC6068Dv62, int i) {
        this.A04 = interfaceC6068Dv6;
        this.A03 = i;
        this.A05 = interfaceC6068Dv62;
    }

    public static void A03(InterfaceC6068Dv6 interfaceC6068Dv6, long j) {
        interfaceC6068Dv6.AdF();
        if (interfaceC6068Dv6 instanceof E0H) {
            E0H e0h = (E0H) interfaceC6068Dv6;
            C1G.A08(((AbstractC6146Dwo) e0h).A0B);
            e0h.A02 = j;
        }
    }
}
