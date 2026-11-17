package X;

/* renamed from: X.Gds, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9688Gds extends HyP {
    public final Hzd A00;
    public final EnumC9704GeI A01;

    public C9688Gds(EnumC9704GeI enumC9704GeI, Hzd hzd) {
        C7384Etj.A0Y(hzd, 1);
        this.A01 = enumC9704GeI;
        this.A00 = hzd;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9688Gds) {
                C9688Gds c9688Gds = (C9688Gds) obj;
                if (this.A01 != c9688Gds.A01 || !C7384Etj.areEqual(this.A00, c9688Gds.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }
}
