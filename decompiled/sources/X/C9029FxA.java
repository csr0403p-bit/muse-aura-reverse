package X;

import java.time.Duration;
import java.util.Set;

/* renamed from: X.FxA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9029FxA {
    public final C9025Fx3 A00;
    public final Duration A01;
    public final Set<C9012Fwp> A02;
    public final Set<C8993FwW<?>> A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.request.AggregateGroupByDurationRequest");
                C9029FxA c9029FxA = (C9029FxA) obj;
                if (!this.A03.equals(c9029FxA.A03) || !this.A00.equals(c9029FxA.A00) || !this.A01.equals(c9029FxA.A01) || !this.A02.equals(c9029FxA.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A03))));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<+LX/FwW<*>;>;LX/Fx3;Ljava/time/Duration;Ljava/util/Set<LX/Fwp;>;)V */
    public C9029FxA(C9025Fx3 c9025Fx3, Duration duration, Set set, Set set2) {
        AnonymousClass005.A0x(set, c9025Fx3, duration);
        this.A03 = set;
        this.A00 = c9025Fx3;
        this.A01 = duration;
        this.A02 = set2;
        if ((c9025Fx3.A03 != null || c9025Fx3.A02 != null) && !duration.equals(Duration.ofMinutes(duration.toMinutes()))) {
            throw C60O.A0i("Either set Duration with at least MINUTE units or use AggregateGroupByPeriodRequest");
        }
    }
}
