package X;

import java.time.Instant;
import java.util.Map;

/* renamed from: X.Fuf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8962Fuf {
    public final double A00;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Instant A0A;
    public final Instant A0B;
    public final Map<String, String> A0C;
    public final Map<String, Double> A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8962Fuf) {
                C8962Fuf c8962Fuf = (C8962Fuf) obj;
                if (!this.A05.equals(c8962Fuf.A05) || !this.A09.equals(c8962Fuf.A09) || !this.A0B.equals(c8962Fuf.A0B) || !this.A0A.equals(c8962Fuf.A0A) || Double.compare(this.A00, c8962Fuf.A00) != 0 || !C7384Etj.areEqual(this.A02, c8962Fuf.A02) || !C7384Etj.areEqual(this.A01, c8962Fuf.A01) || !C7384Etj.areEqual(this.A03, c8962Fuf.A03) || !C7384Etj.areEqual(this.A04, c8962Fuf.A04) || !this.A08.equals(c8962Fuf.A08) || !this.A06.equals(c8962Fuf.A06) || !this.A07.equals(c8962Fuf.A07) || !this.A0D.equals(c8962Fuf.A0D) || !this.A0C.equals(c8962Fuf.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C8962Fuf(Double d, Double d2, Double d3, Double d4, String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, double d5) {
        C9jH c9jH = C9jH.A00;
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str4, 10);
        this.A05 = str;
        this.A09 = str2;
        this.A0B = instant;
        this.A0A = instant2;
        this.A00 = d5;
        this.A02 = d;
        this.A01 = d2;
        this.A03 = d3;
        this.A04 = d4;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A0D = c9jH;
        this.A0C = c9jH;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A0C, AnonymousClass005.A0F(this.A0D, AnonymousClass005.A0I(this.A07, AnonymousClass005.A0I(this.A06, AnonymousClass005.A0I(this.A08, (((((((HsK.A01(this.A00, AnonymousClass005.A0F(this.A0A, AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0I(this.A09, AnonymousClass001.A0G(this.A05))))) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + C3cH.A02(this.A04)) * 31)))));
    }

    public final String toString() {
        String str = this.A05;
        String str2 = this.A09;
        Instant instant = this.A0B;
        Instant instant2 = this.A0A;
        double d = this.A00;
        Double d2 = this.A02;
        Double d3 = this.A01;
        Double d4 = this.A03;
        Double d5 = this.A04;
        String str3 = this.A08;
        String str4 = this.A06;
        String str5 = this.A07;
        Map<String, Double> map = this.A0D;
        Map<String, String> map2 = this.A0C;
        StringBuilder sbA0x = C3cI.A0x("MetaHealthWorkoutSummary(id=", str);
        sbA0x.append(", workoutType=");
        sbA0x.append(str2);
        AbstractC7610F5x.A1K(instant, instant2, sbA0x);
        sbA0x.append(", durationSecs=");
        sbA0x.append(d);
        sbA0x.append(", energyBurnedKCal=");
        sbA0x.append(d2);
        sbA0x.append(", distanceMeters=");
        sbA0x.append(d3);
        sbA0x.append(", hrAverageBpm=");
        sbA0x.append(d4);
        sbA0x.append(", hrMaxBpm=");
        sbA0x.append(d5);
        AbstractC7610F5x.A1N(str3, str4, sbA0x);
        sbA0x.append(", sourceBundleId=");
        sbA0x.append(str5);
        sbA0x.append(", metrics=");
        sbA0x.append(map);
        return C3cJ.A0L(map2, ", metadata=", sbA0x);
    }
}
