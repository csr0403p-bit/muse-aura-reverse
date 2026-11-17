package X;

/* renamed from: X.9WD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WD extends C06G {
    public final C9Vm A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9WD) {
                C9WD c9wd = (C9WD) obj;
                if (!C7384Etj.areEqual(this.A02, c9wd.A02) || !C7384Etj.areEqual(this.A05, c9wd.A05) || this.A04 != c9wd.A04 || !C7384Etj.areEqual(this.A01, c9wd.A01) || !C7384Etj.areEqual(this.A03, c9wd.A03) || this.A00 != c9wd.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (((C0KA.A01((AnonymousClass001.A0G(this.A02) + AnonymousClass006.A0D(this.A05)) * 31, this.A04) + AnonymousClass006.A0G(this.A01)) * 31) + AnonymousClass005.A0H(this.A03)) * 31);
    }

    public C9WD(C9Vm c9Vm, Integer num, String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A05 = num;
        this.A04 = z;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = c9Vm;
    }
}
