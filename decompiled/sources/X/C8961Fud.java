package X;

import java.util.List;

/* renamed from: X.Fud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8961Fud {
    public final List A00;
    public final List<C8963Fug> A01;
    public final List<C8962Fuf> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8961Fud) {
                C8961Fud c8961Fud = (C8961Fud) obj;
                if (!this.A01.equals(c8961Fud.A01) || !this.A02.equals(c8961Fud.A02) || !this.A00.equals(c8961Fud.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)));
    }

    public final String toString() {
        List<C8963Fug> list = this.A01;
        List<C8962Fuf> list2 = this.A02;
        List list3 = this.A00;
        StringBuilder sbA0f = C3cG.A0f(list, "HealthQueryFilterResult(sleep=");
        sbA0f.append(", workouts=");
        sbA0f.append(list2);
        return C3cJ.A0L(list3, ", events=", sbA0f);
    }

    public C8961Fud(List list, List list2, List list3) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = list3;
    }
}
