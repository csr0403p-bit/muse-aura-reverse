package X;

/* renamed from: X.AiW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1401AiW {
    public static final AbstractC1439Aj8 A00(C1Z3 c1z3, int i) {
        AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1439Aj8) c1z3).node.child;
        if (abstractC1439Aj8 != null && (abstractC1439Aj8.aggregateChildKindSet & i) != 0) {
            do {
                int i2 = abstractC1439Aj8.kindSet;
                if ((i2 & 2) != 0) {
                    break;
                }
                if ((i2 & i) != 0) {
                    return abstractC1439Aj8;
                }
                abstractC1439Aj8 = abstractC1439Aj8.child;
            } while (abstractC1439Aj8 != null);
        }
        return null;
    }
}
