package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.C0y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3170C0y {
    public final long A00;
    public final Map<C10, TreeSet<C0J>> A02 = BV4.A0u();
    public final Map<C10, Long> A01 = BV4.A0u();
    public final Map<C10, Float> A03 = BV4.A0u();

    public final void A00(C10 c10, float f) {
        if (f > 1.0f) {
            throw C60O.A0i("Percentage must be smaller than 1.0");
        }
        Map<C10, Float> map = this.A03;
        Iterator itA10 = BV5.A10(map);
        float fA02 = 0.0f;
        while (itA10.hasNext()) {
            fA02 += AnonymousClass001.A02(itA10.next());
        }
        if (fA02 + f > 1.0f) {
            throw C60O.A0i("Total utilization percentage of all cache types exceed 100% ");
        }
        map.put(c10, Float.valueOf(f));
    }

    public C3170C0y(Comparator<C0J> comparator, long j) {
        this.A00 = j;
        for (C10 c10 : C10.values()) {
            this.A02.put(c10, new TreeSet<>(comparator));
            BV4.A1I(c10, this.A01, 0L);
        }
    }
}
