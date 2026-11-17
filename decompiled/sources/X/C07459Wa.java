package X;

import java.util.List;

/* renamed from: X.9Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07459Wa extends C06G {
    public final String A00;
    public final String A01;
    public final List<String> A02;
    public final boolean A03;
    public final boolean A04;

    public C07459Wa() {
        this(null, null, C0881AGi.A00, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07459Wa) {
                C07459Wa c07459Wa = (C07459Wa) obj;
                if (!C7384Etj.areEqual(this.A02, c07459Wa.A02) || !C7384Etj.areEqual(this.A00, c07459Wa.A00) || !C7384Etj.areEqual(this.A01, c07459Wa.A01) || this.A04 != c07459Wa.A04 || this.A03 != c07459Wa.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(C0KA.A01((((AnonymousClass005.A0E(this.A02) + AnonymousClass006.A0G(this.A00)) * 31) + AnonymousClass005.A0H(this.A01)) * 31, this.A04), this.A03) + 1237;
    }

    public C07459Wa(String str, String str2, List list, boolean z, boolean z2) {
        C7384Etj.A0Y(list, 0);
        this.A02 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A03 = z2;
    }
}
