package X;

import java.util.Set;

/* renamed from: X.EuL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7389EuL extends C06G {
    public static final C7389EuL A04 = new C7389EuL(C79.A00, A3q.A00);
    public final Integer A02;
    public final Set A03;
    public final int A01 = -1;
    public final float A00 = -1.0f;

    public C7389EuL(Integer num, Set set) {
        this.A02 = num;
        this.A03 = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7389EuL) {
                C7389EuL c7389EuL = (C7389EuL) obj;
                if (this.A02 != c7389EuL.A02 || !C7384Etj.areEqual(this.A03, c7389EuL.A03) || Double.compare(0.0d, 0.0d) != 0 || this.A01 != c7389EuL.A01 || Float.compare(this.A00, c7389EuL.A00) != 0 || Float.compare(0.0f, 0.0f) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return AnonymousClass005.A02(AnonymousClass005.A02((((AnonymousClass005.A0F(this.A03, BV5.A03(num, AbstractC7393EuW.A00(num)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(0.0d))) * 31) + this.A01) * 31, this.A00), 0.0f) + 1237;
    }
}
