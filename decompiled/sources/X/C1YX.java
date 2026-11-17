package X;

/* renamed from: X.1YX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YX {
    public final ApQ A00;
    public final InterfaceC2128Ayu A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1YX) {
                C1YX c1yx = (C1YX) obj;
                if (!C7384Etj.areEqual(this.A00, c1yx.A00) || !C7384Etj.areEqual(this.A01, c1yx.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedText(text=");
        sb.append((Object) this.A00);
        sb.append(", offsetMapping=");
        return AnonymousClass007.A0Z(this.A01, sb);
    }

    public C1YX(ApQ apQ, InterfaceC2128Ayu interfaceC2128Ayu) {
        this.A00 = apQ;
        this.A01 = interfaceC2128Ayu;
    }
}
