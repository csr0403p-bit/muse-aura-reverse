package X;

/* loaded from: classes6.dex */
public final class GSX extends C06G {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public GSX() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GSX) {
                GSX gsx = (GSX) obj;
                if (this.A0A != gsx.A0A || this.A09 != gsx.A09 || this.A0C != gsx.A0C || this.A07 != gsx.A07 || this.A08 != gsx.A08 || this.A0B != gsx.A0B || !C7384Etj.areEqual(this.A03, gsx.A03) || !C7384Etj.areEqual(this.A04, gsx.A04) || !C7384Etj.areEqual(this.A00, gsx.A00) || !C7384Etj.areEqual(this.A01, gsx.A01) || !C7384Etj.areEqual(this.A02, gsx.A02) || !C7384Etj.areEqual(this.A06, gsx.A06) || !C7384Etj.areEqual(this.A05, gsx.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01((C0KA.A02(this.A0A) + 1237) * 31, this.A09), this.A0C) + 1237) * 31, this.A07), this.A08), this.A0B) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A05)) * 31;
    }

    public GSX(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0A = z;
        this.A09 = z2;
        this.A0C = z3;
        this.A07 = z4;
        this.A08 = z5;
        this.A0B = z6;
        this.A03 = num;
        this.A04 = num2;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A06 = str;
        this.A05 = str2;
    }
}
