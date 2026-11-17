package X;

/* renamed from: X.FMt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7963FMt {
    public final FOP A00;
    public final FOO A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7963FMt) {
                C7963FMt c7963FMt = (C7963FMt) obj;
                if (!C7384Etj.areEqual(this.A01, c7963FMt.A01) || !C7384Etj.areEqual(this.A00, c7963FMt.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0D(this.A01) * 31) + C3cH.A02(this.A00);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", backHandler=", C3cG.A0f(this.A01, "BackButtonUpdated(backButtonOverride="));
    }

    public C7963FMt(FOP fop, FOO foo) {
        this.A01 = foo;
        this.A00 = fop;
    }
}
