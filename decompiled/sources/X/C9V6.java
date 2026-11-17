package X;

/* renamed from: X.9V6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V6 extends C06G {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9V6) {
                C9V6 c9v6 = (C9V6) obj;
                if (!C7384Etj.areEqual(this.A01, c9v6.A01) || !C7384Etj.areEqual(this.A00, c9v6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public C9V6(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
