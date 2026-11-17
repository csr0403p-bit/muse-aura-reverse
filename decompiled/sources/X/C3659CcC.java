package X;

/* renamed from: X.CcC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3659CcC {
    public final EnumC10410Hbh A00;
    public final CcE A01;
    public final Boolean A02;

    public /* synthetic */ C3659CcC(EnumC10410Hbh enumC10410Hbh, CcE ccE, Boolean bool) {
        this.A00 = enumC10410Hbh;
        this.A02 = bool;
        this.A01 = ccE;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3659CcC) {
                C3659CcC c3659CcC = (C3659CcC) obj;
                if (!CS7.A01(this.A00, c3659CcC.A00) || !CS7.A01(this.A02, c3659CcC.A02) || !CS7.A01(this.A01, c3659CcC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A0A(this.A00, this.A02, null, this.A01);
    }
}
