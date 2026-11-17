package X;

/* renamed from: X.57l, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C57l extends C06G implements InterfaceC05673vm {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57l) {
                C57l c57l = (C57l) obj;
                if (this.A02 != c57l.A02 || this.A03 != c57l.A03 || this.A04 != c57l.A04 || !C7384Etj.areEqual(this.A00, c57l.A00) || !C7384Etj.areEqual(this.A01, c57l.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C0KA.A01(C0KA.A01(C0KA.A02(this.A02), this.A03), this.A04) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass005.A0H(this.A01);
    }

    public final String toString() {
        boolean z = this.A02;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        Integer num = this.A00;
        String str = this.A01;
        StringBuilder sb = new StringBuilder("Ended(connectionDropped=");
        sb.append(z);
        sb.append(", endedByDevXAgent=");
        sb.append(z2);
        sb.append(", shouldStartNewSession=");
        sb.append(z3);
        sb.append(", reason=");
        sb.append(num);
        return C3cJ.A0N(", subReason=", str, sb);
    }

    public C57l(Integer num, String str, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A00 = num;
        this.A01 = str;
    }
}
