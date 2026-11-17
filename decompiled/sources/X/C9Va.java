package X;

import java.util.List;

/* renamed from: X.9Va, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Va extends C06G {
    public final List<C9Vc> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9Va) && C7384Etj.areEqual(this.A00, ((C9Va) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C9Va(List<C9Vc> list) {
        this.A00 = list;
    }

    public C9Va() {
        this(C0881AGi.A00);
    }
}
