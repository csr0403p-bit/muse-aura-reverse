package X;

/* renamed from: X.FBg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7708FBg {
    public final C7705FBd A00;
    public final C7705FBd A01;

    public C7708FBg(C7705FBd c7705FBd, C7705FBd c7705FBd2) {
        C7384Etj.A0Y(c7705FBd, 0);
        this.A00 = c7705FBd;
        this.A01 = c7705FBd2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7708FBg) {
                C7708FBg c7708FBg = (C7708FBg) obj;
                if (!this.A00.equals(c7708FBg.A00) || !C7384Etj.areEqual(this.A01, c7708FBg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", sessionlessCacheSnapshot=", C3cG.A0f(this.A00, "Snapshot(sessionCacheSnapshot="));
    }
}
