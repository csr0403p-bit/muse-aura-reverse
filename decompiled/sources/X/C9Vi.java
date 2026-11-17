package X;

/* renamed from: X.9Vi, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vi extends C06G {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C9Vi() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Vi) {
                C9Vi c9Vi = (C9Vi) obj;
                if (!C7384Etj.areEqual(this.A03, c9Vi.A03) || !C7384Etj.areEqual(this.A00, c9Vi.A00) || !C7384Etj.areEqual(this.A02, c9Vi.A02) || !C7384Etj.areEqual(this.A01, c9Vi.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass006.A0G(this.A03) * 31) + AnonymousClass006.A0G(this.A00)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass005.A0H(this.A01);
    }

    public C9Vi(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }
}
