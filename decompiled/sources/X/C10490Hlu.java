package X;

import java.util.List;

/* renamed from: X.Hlu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10490Hlu extends C06G {
    public final List<HmS> A00;

    public C10490Hlu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C10490Hlu) && C7384Etj.areEqual(this.A00, ((C10490Hlu) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M("GraphQLIapOffer(subscriptionOffers=", this.A00);
    }

    public C10490Hlu(List<HmS> list) {
        this.A00 = list;
    }
}
