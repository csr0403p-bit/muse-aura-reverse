package X;

/* renamed from: X.9Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07589Wt extends C06G {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07589Wt) {
                C07589Wt c07589Wt = (C07589Wt) obj;
                if (!C7384Etj.areEqual(this.A00, c07589Wt.A00) || this.A01 != c07589Wt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.A00) * 31, this.A01);
    }

    public C07589Wt(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public C07589Wt() {
        this(null, false);
    }
}
