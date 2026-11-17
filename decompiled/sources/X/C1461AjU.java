package X;

/* renamed from: X.AjU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1461AjU {
    public C1453AjM[] A00;
    public final C0910AHm<C1453AjM> A01 = C0910AHm.A01(new C1453AjM[16]);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.Aj8] */
    public static final void A00(C1453AjM c1453AjM, C1461AjU c1461AjU) {
        if (c1453AjM.A01 > 0) {
            C1459AjS c1459AjS = c1453AjM.A0d;
            if (c1459AjS.A05 == C79.A0P) {
                C1454AjN c1454AjN = c1459AjS.A0G;
                if (!c1454AjN.A0J && !c1454AjN.A0L && !c1453AjM.A0R && c1454AjN.A0G) {
                    AbstractC1439Aj8 abstractC1439Aj8 = c1453AjM.A0f.A02;
                    if ((abstractC1439Aj8.aggregateChildKindSet & 256) != 0) {
                        do {
                            if ((abstractC1439Aj8.kindSet & 256) != 0) {
                                AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj8;
                                C0910AHm c0910AHm = null;
                                do {
                                    if (abstractC1437Aj6A00 instanceof InterfaceC1487Aju) {
                                        InterfaceC1487Aju interfaceC1487Aju = (InterfaceC1487Aju) abstractC1437Aj6A00;
                                        interfaceC1487Aju.ATW(AbstractC1414Aij.A06(interfaceC1487Aju, 256));
                                    } else if ((abstractC1437Aj6A00.kindSet & 256) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                                        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6A00.A00;
                                        int i = 0;
                                        abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                        while (abstractC1439Aj82 != null) {
                                            if ((abstractC1439Aj82.kindSet & 256) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    abstractC1437Aj6A00 = abstractC1439Aj82;
                                                } else {
                                                    if (c0910AHm == null) {
                                                        c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                                    }
                                                    if (abstractC1437Aj6A00 != 0) {
                                                        c0910AHm.A0G(abstractC1437Aj6A00);
                                                        abstractC1437Aj6A00 = 0;
                                                    }
                                                    c0910AHm.A0G(abstractC1439Aj82);
                                                }
                                            }
                                            abstractC1439Aj82 = abstractC1439Aj82.child;
                                            abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                                } while (abstractC1437Aj6A00 != 0);
                            }
                            if ((abstractC1439Aj8.aggregateChildKindSet & 256) == 0) {
                                break;
                            } else {
                                abstractC1439Aj8 = abstractC1439Aj8.child;
                            }
                        } while (abstractC1439Aj8 != null);
                    }
                }
            }
            c1453AjM.A0U = false;
            C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
            C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
            int i2 = c0910AHmA0D.A00;
            for (int i3 = 0; i3 < i2; i3++) {
                A00(c1453AjMArr[i3], c1461AjU);
            }
        }
    }
}
