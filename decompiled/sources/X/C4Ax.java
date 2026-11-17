package X;

/* renamed from: X.4Ax, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Ax {
    public final String A00;
    public final String A01;

    public C4Ax(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4Ax) {
                C4Ax c4Ax = (C4Ax) obj;
                if (!this.A01.equals(c4Ax.A01) || !this.A00.equals(c4Ax.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public final String toString() {
        return FGI.A0h("InstalledApp(packageName=", this.A01, ", label=", this.A00, ")");
    }
}
