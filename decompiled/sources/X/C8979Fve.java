package X;

import java.util.List;

/* renamed from: X.Fve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8979Fve {
    public final Fw6 A00;
    public final List<EnumC8984Fw7> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8979Fve) {
                C8979Fve c8979Fve = (C8979Fve) obj;
                if (!this.A00.equals(c8979Fve.A00) || !this.A01.equals(c8979Fve.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", aggregations=", C3cG.A0f(this.A00, "MetricAggregation(metricName="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8979Fve(Fw6 fw6, List<? extends EnumC8984Fw7> list) {
        this.A00 = fw6;
        this.A01 = list;
    }
}
