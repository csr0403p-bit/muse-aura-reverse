package X;

/* renamed from: X.9Vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07409Vs extends C06G {
    public final C9Vm A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07409Vs) {
                C07409Vs c07409Vs = (C07409Vs) obj;
                if (!C7384Etj.areEqual(this.A04, c07409Vs.A04) || !C7384Etj.areEqual(this.A01, c07409Vs.A01) || !C7384Etj.areEqual(this.A02, c07409Vs.A02) || this.A00 != c07409Vs.A00 || !C7384Etj.areEqual(this.A03, c07409Vs.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A00, (((AnonymousClass001.A0G(this.A04) + AnonymousClass006.A0G(this.A01)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass005.A0H(this.A03);
    }

    public C07409Vs(C9Vm c9Vm, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = c9Vm;
        this.A03 = str4;
    }
}
