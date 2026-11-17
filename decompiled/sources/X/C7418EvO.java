package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* renamed from: X.EvO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7418EvO<F, S> {
    public final F A00;
    public final S A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7418EvO)) {
            return false;
        }
        C7418EvO c7418EvO = (C7418EvO) obj;
        return Ht0.A00(c7418EvO.A00, this.A00) && Ht0.A00(c7418EvO.A01, this.A01);
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

    public C7418EvO(F f, S s) {
        this.A00 = f;
        this.A01 = s;
    }
}
