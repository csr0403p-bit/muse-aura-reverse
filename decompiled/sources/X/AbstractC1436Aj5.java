package X;

/* renamed from: X.Aj5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1436Aj5 {
    public static final AeA<Object> A00;

    public static final int A00(AbB abB) {
        int i = abB instanceof InterfaceC1240AfW ? 3 : 1;
        if (abB instanceof InterfaceC1242AfZ) {
            i |= 4;
        }
        if (abB instanceof AbD) {
            i |= 8;
        }
        if (abB instanceof InterfaceC1243Afa) {
            i |= 16;
        }
        if (abB instanceof AbF) {
            i |= 256;
        }
        if (abB instanceof AbC) {
            i |= 64;
        }
        return abB instanceof InterfaceC1224Af2 ? 524288 | i : i;
    }

    static {
        AeA<Object> aeA = AbstractC1189Ads.A00;
        A00 = new AeA<>(6);
    }

    public static final int A01(AbstractC1439Aj8 abstractC1439Aj8) {
        int i;
        int i2 = abstractC1439Aj8.kindSet;
        if (i2 != 0) {
            return i2;
        }
        AeA<Object> aeA = A00;
        Class<?> cls = abstractC1439Aj8.getClass();
        int iA04 = aeA.A04(cls);
        if (iA04 >= 0) {
            return aeA.A02[iA04];
        }
        int i3 = abstractC1439Aj8 instanceof InterfaceC1356Ahh ? 3 : 1;
        if (abstractC1439Aj8 instanceof InterfaceC1332AhJ) {
            i3 |= 4;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1476Ajj) {
            i3 |= 8;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1348AhZ) {
            i3 |= 16;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1219Aex) {
            i3 |= 32;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1411Aig) {
            i3 |= 64;
        }
        if (abstractC1439Aj8 instanceof C3UR) {
            i = 4194304;
            i3 |= i;
        } else {
            i = 128;
            if (abstractC1439Aj8 instanceof InterfaceC1403AiY) {
                i3 |= 128;
                i = 4194304;
                i3 |= i;
            } else if (abstractC1439Aj8 instanceof InterfaceC1407Aic) {
                i3 |= i;
            }
        }
        if (abstractC1439Aj8 instanceof InterfaceC1487Aju) {
            i3 |= 256;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1357Ahi) {
            i3 |= 512;
        }
        if (abstractC1439Aj8 instanceof C1506AkD) {
            i3 |= 1024;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1449AjI) {
            i3 |= 2048;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1448AjH) {
            i3 |= 4096;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1527Akg) {
            i3 |= 8192;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1452AjL) {
            i3 |= 16384;
        }
        if (abstractC1439Aj8 instanceof C1Z2) {
            i3 |= 32768;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1237AfR) {
            i3 |= 262144;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1224Af2) {
            i3 |= 524288;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1413Aii) {
            i3 |= 1048576;
        }
        if (abstractC1439Aj8 instanceof InterfaceC1447AjG) {
            i3 |= 2097152;
        }
        if (abstractC1439Aj8 instanceof Aef) {
            i3 |= 8388608;
        }
        aeA.A07(cls, i3);
        return i3;
    }

    public static final int A02(AbstractC1439Aj8 abstractC1439Aj8) {
        if (!(abstractC1439Aj8 instanceof AbstractC1437Aj6)) {
            return A01(abstractC1439Aj8);
        }
        AbstractC1437Aj6 abstractC1437Aj6 = (AbstractC1437Aj6) abstractC1439Aj8;
        int iA02 = abstractC1437Aj6.A01;
        for (AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6.A00; abstractC1439Aj82 != null; abstractC1439Aj82 = abstractC1439Aj82.child) {
            iA02 |= A02(abstractC1439Aj82);
        }
        return iA02;
    }

    public static final void A03(AbstractC1439Aj8 abstractC1439Aj8) {
        if (abstractC1439Aj8.isAttached) {
            A05(abstractC1439Aj8, -1, 1);
        } else {
            ASP.A01("autoInvalidateInsertedNode called on unattached node");
            throw F60.createAndThrow();
        }
    }

    public static final void A04(AbstractC1439Aj8 abstractC1439Aj8) {
        if (abstractC1439Aj8.isAttached) {
            A05(abstractC1439Aj8, -1, 0);
        } else {
            ASP.A01("autoInvalidateUpdatedNode called on unattached node");
            throw F60.createAndThrow();
        }
    }

    public static final void A05(AbstractC1439Aj8 abstractC1439Aj8, int i, int i2) {
        if (!(abstractC1439Aj8 instanceof AbstractC1437Aj6)) {
            A06(abstractC1439Aj8, i & abstractC1439Aj8.kindSet, i2);
            return;
        }
        AbstractC1437Aj6 abstractC1437Aj6 = (AbstractC1437Aj6) abstractC1439Aj8;
        int i3 = abstractC1437Aj6.A01;
        A06(abstractC1439Aj8, i3 & i, i2);
        int i4 = (i3 ^ (-1)) & i;
        for (AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6.A00; abstractC1439Aj82 != null; abstractC1439Aj82 = abstractC1439Aj82.child) {
            A05(abstractC1439Aj82, i4, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0119, code lost:
    
        X.AbstractC1414Aij.A09(r5, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.AbstractC1439Aj8 r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1436Aj5.A06(X.Aj8, int, int):void");
    }
}
