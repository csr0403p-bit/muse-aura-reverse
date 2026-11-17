package X;

import java.util.Comparator;

/* renamed from: X.2FI, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2FI implements Comparator {
    public final /* synthetic */ G0U[] A00;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (G0U g0u : this.A00) {
            int iA00 = AbstractC7536F0j.A00((Comparable) g0u.invoke(obj), (Comparable) g0u.invoke(obj2));
            if (iA00 != 0) {
                return iA00;
            }
        }
        return 0;
    }
}
