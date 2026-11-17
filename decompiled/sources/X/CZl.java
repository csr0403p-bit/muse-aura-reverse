package X;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CZl {
    public final CZx A00;
    public final C3621CZn A01;
    public final Integer A02;
    public final List<CZl> A03;
    public final Set<CZm> A04;
    public final boolean A05;
    public final boolean A06;

    public CZl(CZx cZx, C3621CZn c3621CZn, Integer num, List list, Set set, boolean z, boolean z2) {
        this.A01 = c3621CZn;
        this.A00 = cZx;
        this.A02 = num;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = Collections.unmodifiableSet(BV4.A0x(set));
        this.A03 = BV5.A13(list);
    }
}
