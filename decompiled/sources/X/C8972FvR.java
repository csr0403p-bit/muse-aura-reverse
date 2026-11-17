package X;

/* renamed from: X.FvR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8972FvR implements InterfaceC8974FvU {
    public final String A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.changes.DeletionChange");
                if (!this.A00.equals(((C8972FvR) obj).A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return FGI.A0U("DeletionChange(recordId='", this.A00, "')");
    }

    public C8972FvR(String str) {
        this.A00 = str;
    }
}
