package X;

import java.util.List;

/* renamed from: X.9Fg, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Fg extends C06G {
    public final List<C9Tm> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9Fg) && C7384Etj.areEqual(this.A00, ((C9Fg) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C9Fg(List<C9Tm> list) {
        this.A00 = list;
    }
}
