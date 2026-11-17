package X;

import java.util.List;

/* renamed from: X.8sP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8sP extends C06G {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8sP) && C7384Etj.areEqual(this.A00, ((C8sP) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) * 31;
    }

    public C8sP(List list) {
        this.A00 = list;
    }

    public C8sP() {
        this(C0881AGi.A00);
    }
}
