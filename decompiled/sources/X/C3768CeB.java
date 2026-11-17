package X;

import java.util.Set;

/* renamed from: X.CeB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3768CeB extends AbstractC3771CeE {
    public final long A00;
    public final long A01 = 86400000;
    public final Set<EnumC3767CeA> A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3771CeE) {
                C3768CeB c3768CeB = (C3768CeB) ((AbstractC3771CeE) obj);
                if (this.A00 != c3768CeB.A00 || this.A01 != c3768CeB.A01 || !this.A02.equals(c3768CeB.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode() ^ ((((((int) this.A00) ^ 1000003) * 1000003) ^ ((int) this.A01)) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ConfigValue{delta=");
        sbA0x.append(this.A00);
        sbA0x.append(", maxAllowedDelay=");
        sbA0x.append(this.A01);
        sbA0x.append(", flags=");
        return BV8.A0v(this.A02, sbA0x);
    }

    public C3768CeB(long j, Set set) {
        this.A00 = j;
        this.A02 = set;
    }
}
