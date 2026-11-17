package X;

/* renamed from: X.Atl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1924Atl {
    public InterfaceC1497Ak4 A00;
    public InterfaceC1497Ak4 A01 = null;
    public final C1958Aux A02;

    public C1924Atl(InterfaceC1497Ak4 interfaceC1497Ak4, C1958Aux c1958Aux) {
        this.A02 = c1958Aux;
        this.A00 = interfaceC1497Ak4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[PHI: r1
  0x0027: PHI (r1v1 float) = (r1v0 float), (r1v5 float) binds: [B:12:0x001f, B:14:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[PHI: r1
  0x003d: PHI (r1v3 float) = (r1v2 float), (r1v4 float) binds: [B:17:0x0035, B:19:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A00(long r5) {
        /*
            r4 = this;
            X.Ak4 r2 = r4.A01
            if (r2 == 0) goto L15
            boolean r0 = r2.isAttached()
            if (r0 == 0) goto L43
            X.Ak4 r1 = r4.A00
            if (r1 == 0) goto L15
            r0 = 1
            X.AaC r4 = r1.APk(r2, r0)
        L13:
            if (r4 != 0) goto L17
        L15:
            X.AaC r4 = X.AaC.A04
        L17:
            float r3 = X.AnonymousClass001.A00(r5)
            float r1 = r4.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L27
            float r1 = r4.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L28
        L27:
            r3 = r1
        L28:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            float r2 = X.AnonymousClass001.A01(r5, r0)
            float r1 = r4.A03
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L3d
            float r1 = r4.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3e
        L3d:
            r2 = r1
        L3e:
            long r0 = X.AnonymousClass005.A0L(r3, r2)
            return r0
        L43:
            X.AaC r4 = X.AaC.A04
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1924Atl.A00(long):long");
    }

    public final int A01(long j, boolean z) {
        if (z) {
            j = A00(j);
        }
        return this.A02.A03.A0B(A02(j));
    }

    public final long A02(long j) {
        InterfaceC1497Ak4 interfaceC1497Ak4;
        InterfaceC1497Ak4 interfaceC1497Ak42 = this.A01;
        return (interfaceC1497Ak42 == null || !interfaceC1497Ak42.isAttached() || (interfaceC1497Ak4 = this.A00) == null || !interfaceC1497Ak4.isAttached()) ? j : interfaceC1497Ak42.APm(interfaceC1497Ak4, j);
    }

    public final boolean A03(long j) {
        long jA02 = A02(A00(j));
        C1958Aux c1958Aux = this.A02;
        int iA08 = c1958Aux.A03.A08(C8j5.A03(jA02));
        float fA03 = AnonymousClass003.A03(jA02);
        return fA03 >= c1958Aux.A00(iA08) && fA03 <= c1958Aux.A01(iA08);
    }
}
