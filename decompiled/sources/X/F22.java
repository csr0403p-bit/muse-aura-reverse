package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes5.dex */
public final class F22<T> {
    public T A00;
    public T A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7418EvO)) {
            return false;
        }
        C7418EvO c7418EvO = (C7418EvO) obj;
        F f = c7418EvO.A00;
        Object obj2 = this.A00;
        if (f != obj2 && (f == 0 || !f.equals(obj2))) {
            return false;
        }
        S s = c7418EvO.A01;
        Object obj3 = this.A01;
        return s == obj3 || (s != 0 && s.equals(obj3));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00) ^ C3cH.A02(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Pair{");
        sbA0x.append(this.A00);
        sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        return BV8.A0v(this.A01, sbA0x);
    }
}
