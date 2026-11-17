package X;

/* renamed from: X.FyV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9104FyV extends AbstractC9142FzB {
    public final C9072Fxy A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9104FyV) {
            return C7384Etj.areEqual(this.A00, ((C9104FyV) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("WeightTarget(mass="));
    }

    public C9104FyV(C9072Fxy c9072Fxy) {
        this.A00 = c9072Fxy;
    }
}
