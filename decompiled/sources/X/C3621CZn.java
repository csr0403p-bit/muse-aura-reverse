package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.CZn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3621CZn {
    public final int A00;
    public final int A01;
    public final CZo A02;
    public final Integer A03;
    public final Set<EnumC3622CZp> A04;
    public final boolean A05;

    public C3621CZn(CZo cZo, Integer num, Set set, int i, int i2, boolean z) {
        this.A05 = z;
        this.A03 = num;
        this.A02 = cZo;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = Collections.unmodifiableSet(BV4.A0x(set));
    }
}
