package X;

import android.net.Uri;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FT3 extends C06G {
    public final Uri A02;
    public final FKE A03;
    public final HiK A04;
    public final FJ1 A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final G0U<String, Unit> A0B;
    public final G0U<Integer, Unit> A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final int A01 = -1;
    public final int A00 = -1;

    public FT3(Uri uri, FKE fke, HiK hiK, FJ1 fj1, Integer num, String str, String str2, String str3, String str4, G0U g0u, G0U g0u2, boolean z, boolean z2, boolean z3) {
        this.A05 = fj1;
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A07 = str4;
        this.A0E = z;
        this.A0D = z2;
        this.A04 = hiK;
        this.A03 = fke;
        this.A0C = g0u;
        this.A02 = uri;
        this.A0B = g0u2;
        this.A0F = z3;
        this.A06 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FT3) {
                FT3 ft3 = (FT3) obj;
                if (!C7384Etj.areEqual(this.A05, ft3.A05) || !C7384Etj.areEqual(this.A08, ft3.A08) || !C7384Etj.areEqual(this.A09, ft3.A09) || !C7384Etj.areEqual(this.A0A, ft3.A0A) || !C7384Etj.areEqual(this.A07, ft3.A07) || this.A0E != ft3.A0E || this.A0D != ft3.A0D || this.A04 != ft3.A04 || this.A01 != ft3.A01 || this.A00 != ft3.A00 || !C7384Etj.areEqual(this.A03, ft3.A03) || !C7384Etj.areEqual(this.A0C, ft3.A0C) || !C7384Etj.areEqual(this.A02, ft3.A02) || !C7384Etj.areEqual(this.A0B, ft3.A0B) || this.A0F != ft3.A0F || !C7384Etj.areEqual(this.A06, ft3.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(((((((((((((AnonymousClass005.A0F(this.A04, C0KA.A01(C0KA.A01((((((AnonymousClass005.A0I(this.A08, AnonymousClass006.A0D(this.A05) * 31) + AnonymousClass006.A0G(this.A09)) * 31) + AnonymousClass006.A0G(this.A0A)) * 31) + AnonymousClass006.A0G(this.A07)) * 31, this.A0E), this.A0D)) * 31) + this.A01) * 31) + this.A00) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A0C)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A0B)) * 31, this.A0F) + C3cH.A02(this.A06);
    }
}
