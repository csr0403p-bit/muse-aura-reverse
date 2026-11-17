package X;

import java.util.List;

/* renamed from: X.9Vd, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vd extends C06G {
    public final List<C9WD> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9Vd) && C7384Etj.areEqual(this.A00, ((C9Vd) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C9Vd(List<C9WD> list) {
        this.A00 = list;
    }

    public C9Vd() {
        this(C0881AGi.A00);
    }
}
