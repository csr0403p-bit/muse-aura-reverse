package X;

/* renamed from: X.GPs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9581GPs extends C06G {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9581GPs) {
                C9581GPs c9581GPs = (C9581GPs) obj;
                if (this.A00 != c9581GPs.A00 || this.A01 != c9581GPs.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        Integer num = this.A01;
        return i + BV5.A03(num, AbstractC9582GPt.A00(num));
    }

    public C9581GPs(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
