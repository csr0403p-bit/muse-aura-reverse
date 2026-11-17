package X;

import java.util.List;

/* renamed from: X.9Vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07389Vo extends C06G {
    public final List<C07409Vs> A00;

    public C07389Vo(List<C07409Vs> list) {
        C7384Etj.A0Y(list, 0);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C07389Vo) && C7384Etj.areEqual(this.A00, ((C07389Vo) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C07389Vo() {
        this(C0881AGi.A00);
    }
}
