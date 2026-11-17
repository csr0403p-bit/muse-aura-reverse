package X;

import java.util.List;

/* renamed from: X.9WF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WF extends C06G {
    public final int A00;
    public final List<C9VX> A01;

    public C9WF(List<C9VX> list, int i) {
        C7384Etj.A0Y(list, 0);
        this.A01 = list;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9WF) {
                C9WF c9wf = (C9WF) obj;
                if (!C7384Etj.areEqual(this.A01, c9wf.A01) || this.A00 != c9wf.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + this.A00;
    }

    public C9WF() {
        this(C0881AGi.A00, -1);
    }
}
