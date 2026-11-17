package X;

/* renamed from: X.Ee6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7003Ee6 {
    public static final C7003Ee6 A02 = new C7003Ee6("UNKNOWN", null);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7003Ee6) {
                C7003Ee6 c7003Ee6 = (C7003Ee6) obj;
                if (!this.A00.equals(c7003Ee6.A00) || !C7384Etj.areEqual(this.A01, c7003Ee6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A00) + AnonymousClass006.A0G(this.A01);
    }

    public final String toString() {
        return this.A00;
    }

    public C7003Ee6(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
