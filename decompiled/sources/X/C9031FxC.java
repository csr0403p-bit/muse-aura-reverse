package X;

import java.util.Set;

/* renamed from: X.FxC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9031FxC {
    public final C9025Fx3 A00;
    public final Set<C9012Fwp> A01;
    public final Set<C8993FwW<?>> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.request.AggregateRequest");
                C9031FxC c9031FxC = (C9031FxC) obj;
                if (!this.A02.equals(c9031FxC.A02) || !this.A00.equals(c9031FxC.A00) || !this.A01.equals(c9031FxC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A02)));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<+LX/FwW<*>;>;LX/Fx3;Ljava/util/Set<LX/Fwp;>;)V */
    public C9031FxC(C9025Fx3 c9025Fx3, Set set, Set set2) {
        AnonymousClass003.A0u(set, c9025Fx3);
        this.A02 = set;
        this.A00 = c9025Fx3;
        this.A01 = set2;
    }
}
