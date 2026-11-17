package X;

/* renamed from: X.AkE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1507AkE {
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e A[PHI: r16
  0x014e: PHI (r16v2 boolean) = (r16v1 boolean), (r16v5 boolean) binds: [B:63:0x00cc, B:110:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.C1506AkD r18) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1507AkE.A01(X.AkD):boolean");
    }

    public static final Integer A00(C1506AkD c1506AkD, int i) {
        int iA00 = C1506AkD.A00(c1506AkD);
        if (iA00 == 0 || iA00 != 1) {
            return C79.A00;
        }
        C1506AkD c1506AkDA01 = AbstractC1485Ajs.A01(c1506AkD);
        if (c1506AkDA01 == null) {
            throw C60O.A0i("ActiveParent with no focused child");
        }
        Integer numA00 = A00(c1506AkDA01, i);
        Integer num = C79.A00;
        if (numA00 != num) {
            return numA00;
        }
        if (!c1506AkD.A02) {
            c1506AkD.A02 = true;
            try {
                C1519AkT c1519AkTA02 = c1506AkD.A02();
                C1528Akh c1528Akh = new C1528Akh(i);
                InterfaceC1536Aks interfaceC1536AksA01 = AbstractC1414Aij.A01(c1506AkD);
                C1506AkD c1506AkDACD = interfaceC1536AksA01.ACD();
                c1519AkTA02.A0A.invoke(c1528Akh);
                C1506AkD c1506AkDACD2 = interfaceC1536AksA01.ACD();
                if (c1528Akh.A00) {
                    num = C79.A01;
                } else if (c1506AkDACD != c1506AkDACD2 && c1506AkDACD2 != null) {
                    num = C79.A0C;
                }
            } finally {
                c1506AkD.A02 = false;
            }
        }
        return num;
    }

    public static final boolean A02(C1506AkD c1506AkD, boolean z) {
        int iA00 = C1506AkD.A00(c1506AkD);
        if (iA00 != 0 && iA00 == 1) {
            C1506AkD c1506AkDA01 = AbstractC1485Ajs.A01(c1506AkD);
            if (c1506AkDA01 != null && !A02(c1506AkDA01, z)) {
                return false;
            }
            c1506AkD.A06(EnumC1443AjC.A03, EnumC1443AjC.A04);
        }
        return true;
    }
}
