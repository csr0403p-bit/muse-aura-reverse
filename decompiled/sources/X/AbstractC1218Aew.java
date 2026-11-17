package X;

/* renamed from: X.Aew, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1218Aew {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1Z3, X.Aex] */
    public static Object A00(InterfaceC1219Aex interfaceC1219Aex, ARR arr) {
        AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1439Aj8) interfaceC1219Aex).node;
        if (!abstractC1439Aj8.isAttached) {
            throw C60O.A0i("ModifierLocal accessed from an unattached node");
        }
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.parent;
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(interfaceC1219Aex);
        if (c1453AjMA04 != null) {
            while (true) {
                if ((c1453AjMA04.A0f.A02.aggregateChildKindSet & 32) != 0) {
                    while (abstractC1439Aj82 != null) {
                        if ((abstractC1439Aj82.kindSet & 32) != 0) {
                            AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj82;
                            C0910AHm c0910AHm = null;
                            do {
                                if (abstractC1437Aj6A00 instanceof InterfaceC1219Aex) {
                                    ARP arpAJE = ((InterfaceC1219Aex) abstractC1437Aj6A00).AJE();
                                    if (arpAJE.A02(arr)) {
                                        return arpAJE.A00(arr);
                                    }
                                } else if ((abstractC1437Aj6A00.kindSet & 32) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                                    AbstractC1439Aj8 abstractC1439Aj83 = abstractC1437Aj6A00.A00;
                                    int i = 0;
                                    abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                    while (abstractC1439Aj83 != null) {
                                        if ((abstractC1439Aj83.kindSet & 32) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC1437Aj6A00 = abstractC1439Aj83;
                                            } else {
                                                if (c0910AHm == null) {
                                                    c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                                }
                                                if (abstractC1437Aj6A00 != 0) {
                                                    c0910AHm.A0G(abstractC1437Aj6A00);
                                                    abstractC1437Aj6A00 = 0;
                                                }
                                                c0910AHm.A0G(abstractC1439Aj83);
                                            }
                                        }
                                        abstractC1439Aj83 = abstractC1439Aj83.child;
                                        abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                            } while (abstractC1437Aj6A00 != 0);
                        }
                        abstractC1439Aj82 = abstractC1439Aj82.parent;
                    }
                }
                c1453AjMA04 = c1453AjMA04.A0E();
                if (c1453AjMA04 == null) {
                    break;
                }
                C1438Aj7 c1438Aj7 = c1453AjMA04.A0f;
                abstractC1439Aj82 = c1438Aj7 != null ? c1438Aj7.A06 : null;
            }
        }
        return arr.A00.invoke();
    }
}
