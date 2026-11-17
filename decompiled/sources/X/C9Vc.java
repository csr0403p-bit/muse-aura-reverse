package X;

/* renamed from: X.9Vc, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vc extends C06G {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Vc) {
                C9Vc c9Vc = (C9Vc) obj;
                if (!C7384Etj.areEqual(this.A01, c9Vc.A01) || this.A02 != c9Vc.A02 || !C7384Etj.areEqual(this.A00, c9Vc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(AnonymousClass001.A0G(this.A01), this.A02) + AnonymousClass006.A0G(this.A00);
    }

    public C9Vc(String str, boolean z, String str2) {
        this.A01 = str;
        this.A02 = z;
        this.A00 = str2;
    }
}
