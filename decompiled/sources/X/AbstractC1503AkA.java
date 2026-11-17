package X;

/* renamed from: X.AkA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1503AkA {
    /* JADX WARN: Incorrect types in method signature: (LX/AkD;LX/AkD;ILX/G0U<-LX/AkD;Ljava/lang/Boolean;>;)Z */
    public static final boolean A01(C1506AkD c1506AkD, C1506AkD c1506AkD2, G0U g0u, int i) {
        if (A00(c1506AkD, c1506AkD2, g0u, i)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC1217Aev.A00(c1506AkD, new C2342BUq(AbstractC1414Aij.A01(c1506AkD).ACD(), c1506AkD, c1506AkD2, g0u, i, 0), i);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0026, code lost:
    
        X.AbstractC1414Aij.A09(r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(X.C1506AkD r10, X.G0U<? super X.C1506AkD, java.lang.Boolean> r11) {
        /*
            r0 = 16
            X.AkD[] r0 = new X.C1506AkD[r0]
            r4 = 0
            X.AHm r6 = X.C0910AHm.A02(r0, r4)
            r9 = 1024(0x400, float:1.435E-42)
            X.Aj8 r8 = r10.node
            boolean r0 = r8.isAttached
            if (r0 != 0) goto L1b
            java.lang.String r0 = "visitChildren called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1b:
            X.AHm r7 = X.C0910AHm.A00()
            X.Aj8 r0 = r8.child
            if (r0 == 0) goto L34
            r7.A0G(r0)
        L26:
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L7e
            X.Aj8 r8 = X.C0910AHm.A03(r7, r0)
            int r0 = r8.aggregateChildKindSet
            r0 = r0 & r9
            if (r0 != 0) goto L3a
        L34:
            X.AbstractC1414Aij.A09(r7, r8)
            goto L26
        L38:
            if (r8 == 0) goto L26
        L3a:
            int r0 = r8.kindSet
            r0 = r0 & r9
            if (r0 == 0) goto L7b
            r3 = 0
        L40:
            boolean r0 = r8 instanceof X.C1506AkD
            if (r0 == 0) goto L4e
            r6.A0G(r8)
        L47:
            X.Aj8 r8 = X.AbstractC1414Aij.A00(r3)
        L4b:
            if (r8 == 0) goto L26
            goto L40
        L4e:
            int r0 = r8.kindSet
            r0 = r0 & r9
            if (r0 == 0) goto L47
            boolean r0 = r8 instanceof X.AbstractC1437Aj6
            if (r0 == 0) goto L47
            r0 = r8
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0
            X.Aj8 r2 = r0.A00
            r1 = 0
        L5d:
            if (r2 == 0) goto L78
            int r0 = r2.kindSet
            r0 = r0 & r9
            if (r0 == 0) goto L69
            int r1 = r1 + 1
            if (r1 != r5) goto L6c
            r8 = r2
        L69:
            X.Aj8 r2 = r2.child
            goto L5d
        L6c:
            X.AHm r3 = X.C8j4.A0W(r3)
            X.Aj8 r8 = X.C8j4.A0X(r3, r8)
            r3.A0G(r2)
            goto L69
        L78:
            if (r1 != r5) goto L47
            goto L4b
        L7b:
            X.Aj8 r8 = r8.child
            goto L38
        L7e:
            X.Ajr r0 = X.C1484Ajr.A00
            r6.A0D(r0)
            int r3 = r6.A00
            int r3 = r3 - r5
            T[] r2 = r6.A01
            int r0 = r2.length
            if (r3 >= r0) goto La1
        L8b:
            if (r3 < 0) goto La1
            r1 = r2[r3]
            X.AkD r1 = (X.C1506AkD) r1
            boolean r0 = X.AbstractC1485Ajs.A03(r1)
            if (r0 == 0) goto L9e
            boolean r0 = A02(r1, r11)
            if (r0 == 0) goto L9e
            return r5
        L9e:
            int r3 = r3 + (-1)
            goto L8b
        La1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1503AkA.A04(X.AkD, X.G0U):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x002e, code lost:
    
        X.AbstractC1414Aij.A09(r4, r8);
     */
    /* JADX WARN: Incorrect types in method signature: (LX/AkD;LX/AkD;ILX/G0U<-LX/AkD;Ljava/lang/Boolean;>;)Z */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0151 A[PHI: r3
  0x0151: PHI (r3v5 X.AHm) = (r3v4 X.AHm), (r3v4 X.AHm), (r3v7 X.AHm) binds: [B:91:0x012a, B:93:0x012e, B:104:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[LOOP:7: B:86:0x011e->B:158:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C1506AkD r11, X.C1506AkD r12, X.G0U r13, int r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1503AkA.A00(X.AkD, X.AkD, X.G0U, int):boolean");
    }

    public static final boolean A02(C1506AkD c1506AkD, G0U<? super C1506AkD, Boolean> g0u) {
        Boolean boolInvoke;
        int iA00 = C1506AkD.A00(c1506AkD);
        if (iA00 != 1) {
            if (iA00 == 0) {
                return A04(c1506AkD, g0u);
            }
            if (iA00 != 3) {
                throw C3cG.A0q();
            }
            if (!A04(c1506AkD, g0u)) {
                if (c1506AkD.A02().A0B) {
                    boolInvoke = g0u.invoke(c1506AkD);
                    if (!AnonymousClass001.A1X(boolInvoke)) {
                    }
                }
                return false;
            }
            return true;
        }
        C1506AkD c1506AkDA01 = AbstractC1485Ajs.A01(c1506AkD);
        if (c1506AkDA01 == null) {
            throw C3cG.A0Q("ActiveParent must have a focusedChild");
        }
        int iA002 = C1506AkD.A00(c1506AkDA01);
        if (iA002 != 1) {
            if (iA002 == 0) {
                return A01(c1506AkD, c1506AkDA01, g0u, 2);
            }
            if (iA002 != 3) {
                throw C3cG.A0q();
            }
            throw C3cG.A0Q("ActiveParent must have a focusedChild");
        }
        if (!A02(c1506AkDA01, g0u) && !A01(c1506AkD, c1506AkDA01, g0u, 2)) {
            if (c1506AkDA01.A02().A0B) {
                boolInvoke = g0u.invoke(c1506AkDA01);
                if (!AnonymousClass001.A1X(boolInvoke)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0057, code lost:
    
        X.AbstractC1414Aij.A09(r4, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(X.C1506AkD r9, X.G0U<? super X.C1506AkD, java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1503AkA.A03(X.AkD, X.G0U):boolean");
    }
}
