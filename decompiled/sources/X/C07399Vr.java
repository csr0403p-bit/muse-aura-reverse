package X;

/* renamed from: X.9Vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07399Vr extends C06G {
    public final Double A00;
    public final Double A01;
    public final String A02;
    public final String A03;

    public C07399Vr() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07399Vr) {
                C07399Vr c07399Vr = (C07399Vr) obj;
                if (!C7384Etj.areEqual(this.A00, c07399Vr.A00) || !C7384Etj.areEqual(this.A01, c07399Vr.A01) || !C7384Etj.areEqual(this.A02, c07399Vr.A02) || !C7384Etj.areEqual(this.A03, c07399Vr.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass006.A0D(this.A00) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass006.A0G(this.A03)) * 31;
    }

    public C07399Vr(Double d, Double d2, String str, String str2) {
        this.A00 = d;
        this.A01 = d2;
        this.A02 = str;
        this.A03 = str2;
    }
}
