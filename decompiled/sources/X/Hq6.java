package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class Hq6 {
    public final int A00;
    public final HyR A01;
    public final List<Object> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hq6) {
                Hq6 hq6 = (Hq6) obj;
                if (!this.A01.equals(hq6.A01) || !this.A02.equals(hq6.A02) || this.A00 != hq6.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)) + this.A00;
    }

    public final String toString() {
        HyR hyR = this.A01;
        List<Object> list = this.A02;
        int i = this.A00;
        StringBuilder sbA0f = C3cG.A0f(hyR, "LispyCall(identifier=");
        sbA0f.append(", arguments=");
        sbA0f.append(list);
        return AbstractC7610F5x.A0x(", offset=", sbA0f, i);
    }

    public Hq6(HyR hyR, List<? extends Object> list, int i) {
        this.A01 = hyR;
        this.A02 = list;
        this.A00 = i;
    }
}
