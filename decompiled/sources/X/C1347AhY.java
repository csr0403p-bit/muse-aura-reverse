package X;

/* renamed from: X.AhY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1347AhY implements InterfaceC1382AiC {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // X.InterfaceC1382AiC
    public final boolean ANr(AbstractC1439Aj8 abstractC1439Aj8) {
        C0910AHm c0910AHmA0W = null;
        while (abstractC1439Aj8 != 0) {
            if (abstractC1439Aj8 instanceof InterfaceC1348AhZ) {
                if (((InterfaceC1348AhZ) abstractC1439Aj8).interceptOutOfBoundsChildEvents()) {
                    return true;
                }
            } else if ((abstractC1439Aj8.kindSet & 16) != 0 && (abstractC1439Aj8 instanceof AbstractC1437Aj6)) {
                AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.A00;
                int i = 0;
                abstractC1439Aj8 = abstractC1439Aj8;
                while (abstractC1439Aj82 != null) {
                    if ((abstractC1439Aj82.kindSet & 16) != 0) {
                        i++;
                        if (i == 1) {
                            abstractC1439Aj8 = abstractC1439Aj82;
                        } else {
                            c0910AHmA0W = C8j4.A0W(c0910AHmA0W);
                            abstractC1439Aj8 = C8j4.A0X(c0910AHmA0W, abstractC1439Aj8);
                            c0910AHmA0W.A0G(abstractC1439Aj82);
                        }
                    }
                    abstractC1439Aj82 = abstractC1439Aj82.child;
                    abstractC1439Aj8 = abstractC1439Aj8;
                }
                if (i == 1) {
                }
            }
            abstractC1439Aj8 = AbstractC1414Aij.A00(c0910AHmA0W);
        }
        return false;
    }

    @Override // X.InterfaceC1382AiC
    public final /* synthetic */ boolean AfT(AbstractC1439Aj8 abstractC1439Aj8) {
        return true;
    }

    @Override // X.InterfaceC1382AiC
    public final boolean AfU(C1453AjM c1453AjM) {
        return true;
    }

    @Override // X.InterfaceC1382AiC
    public final void A6E(C0923AHz c0923AHz, C1453AjM c1453AjM, int i, long j, boolean z) {
        AbstractC1387AiH abstractC1387AiH = c1453AjM.A0f.A04;
        abstractC1387AiH.A0x(c0923AHz, AbstractC1387AiH.A0S, i, AbstractC1387AiH.A08(abstractC1387AiH, j, true), z);
    }

    @Override // X.InterfaceC1382AiC
    public final int AAm() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // X.InterfaceC1382AiC
    public final boolean AfL(C0923AHz c0923AHz, C1453AjM c1453AjM) {
        AbstractC1387AiH abstractC1387AiH = c1453AjM.A0f.A04;
        AeA<Object> aeA = AbstractC1436Aj5.A00;
        AbstractC1439Aj8 abstractC1439Aj8A0C = AbstractC1387AiH.A0C(abstractC1387AiH, false);
        if (abstractC1439Aj8A0C == null || !abstractC1439Aj8A0C.isAttached) {
            return false;
        }
        AbstractC1439Aj8 abstractC1439Aj8 = abstractC1439Aj8A0C.node;
        if (!abstractC1439Aj8.isAttached) {
            ASP.A01("visitLocalDescendants called on an unattached node");
            throw F60.createAndThrow();
        }
        if ((abstractC1439Aj8.aggregateChildKindSet & 16) == 0) {
            return false;
        }
        do {
            if ((abstractC1439Aj8.kindSet & 16) != 0) {
                C0910AHm c0910AHmA0W = null;
                AbstractC1437Aj6 abstractC1437Aj6A0X = abstractC1439Aj8;
                do {
                    if (abstractC1437Aj6A0X instanceof InterfaceC1348AhZ) {
                        if (((InterfaceC1348AhZ) abstractC1437Aj6A0X).sharePointerInputWithSiblings()) {
                            c0923AHz.A00 = c0923AHz.size() - 1;
                            return true;
                        }
                    } else if ((abstractC1437Aj6A0X.kindSet & 16) != 0 && (abstractC1437Aj6A0X instanceof AbstractC1437Aj6)) {
                        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6A0X.A00;
                        int i = 0;
                        abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                        while (abstractC1439Aj82 != null) {
                            if ((abstractC1439Aj82.kindSet & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC1437Aj6A0X = abstractC1439Aj82;
                                } else {
                                    c0910AHmA0W = C8j4.A0W(c0910AHmA0W);
                                    abstractC1437Aj6A0X = C8j4.A0X(c0910AHmA0W, abstractC1437Aj6A0X);
                                    c0910AHmA0W.A0G(abstractC1439Aj82);
                                }
                            }
                            abstractC1439Aj82 = abstractC1439Aj82.child;
                            abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC1437Aj6A0X = AbstractC1414Aij.A00(c0910AHmA0W);
                } while (abstractC1437Aj6A0X != 0);
            }
            abstractC1439Aj8 = abstractC1439Aj8.child;
        } while (abstractC1439Aj8 != null);
        return false;
    }
}
