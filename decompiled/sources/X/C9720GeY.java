package X;

/* renamed from: X.GeY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9720GeY extends C06G {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public C9720GeY() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9720GeY) {
                C9720GeY c9720GeY = (C9720GeY) obj;
                if (!C7384Etj.areEqual(this.A03, c9720GeY.A03) || !C7384Etj.areEqual(this.A04, c9720GeY.A04) || !C7384Etj.areEqual(this.A00, c9720GeY.A00) || !C7384Etj.areEqual(this.A01, c9720GeY.A01) || this.A02 != c9720GeY.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0G = ((((((AnonymousClass006.A0G(this.A03) * 31) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A01)) * 31;
        Integer num = this.A02;
        return iA0G + (num != null ? BV5.A03(num, GPJ.A01(num)) : 0);
    }

    public C9720GeY(Boolean bool, Boolean bool2, Integer num, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = num;
    }
}
