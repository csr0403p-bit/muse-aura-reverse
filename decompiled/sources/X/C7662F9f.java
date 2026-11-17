package X;

/* renamed from: X.F9f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7662F9f extends AbstractC7629F7m {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7662F9f) {
                C7662F9f c7662F9f = (C7662F9f) obj;
                if (!C7384Etj.areEqual(this.A01, c7662F9f.A01) || !C7384Etj.areEqual(this.A00, c7662F9f.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", snapshot=", C3cI.A0x("SnapshotUpdate(dataModuleType=", this.A01));
    }

    public C7662F9f(String str, Object obj) {
        AnonymousClass003.A0u(str, obj);
        this.A01 = str;
        this.A00 = obj;
    }
}
