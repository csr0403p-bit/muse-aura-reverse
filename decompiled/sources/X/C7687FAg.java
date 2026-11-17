package X;

/* renamed from: X.FAg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7687FAg {
    public final C7708FBg A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C7687FAg) && C7384Etj.areEqual(this.A00, ((C7687FAg) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Snapshot(cacheStoreSnapshot=", this.A00);
    }

    public /* synthetic */ C7687FAg(C7708FBg c7708FBg) {
        this.A00 = c7708FBg;
    }
}
