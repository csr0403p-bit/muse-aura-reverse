package X;

import java.util.Map;

/* renamed from: X.765, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass765 extends C77E {
    public final Map<AnonymousClass767<? extends Object>, Object> A00;

    public final boolean equals(Object obj) {
        return (obj instanceof AnonymousClass765) && C7384Etj.areEqual(this.A00, ((AnonymousClass765) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public AnonymousClass765(Map<AnonymousClass767<? extends Object>, Object> map) {
        this.A00 = map;
    }

    public AnonymousClass765() {
        this(C3cG.A0j());
    }
}
