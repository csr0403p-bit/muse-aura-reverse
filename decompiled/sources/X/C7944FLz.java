package X;

/* renamed from: X.FLz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7944FLz {
    public final HiG A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7944FLz) && this.A00 == ((C7944FLz) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M("TransitionUpdate(animationType=", this.A00);
    }

    public C7944FLz(HiG hiG) {
        this.A00 = hiG;
    }
}
