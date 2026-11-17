package X;

/* renamed from: X.Fru, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8881Fru<T> {
    public final C8993FwW<T> A00;
    public final C8993FwW<T> A01;
    public final C8993FwW<T> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8881Fru) {
                C8881Fru c8881Fru = (C8881Fru) obj;
                if (!this.A00.equals(c8881Fru.A00) || !this.A02.equals(c8881Fru.A02) || !this.A01.equals(c8881Fru.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A00)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AggregateMetricsInfo(averageMetric=");
        sbA0x.append(this.A00);
        sbA0x.append(", minMetric=");
        sbA0x.append(this.A02);
        sbA0x.append(", maxMetric=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8881Fru(C8993FwW<? extends T> c8993FwW, C8993FwW<? extends T> c8993FwW2, C8993FwW<? extends T> c8993FwW3) {
        this.A00 = c8993FwW;
        this.A02 = c8993FwW2;
        this.A01 = c8993FwW3;
    }
}
