package X;

import java.time.Instant;

/* renamed from: X.Fug, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8963Fug {
    public final Double A00;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final Double A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Instant A0A;
    public final Instant A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8963Fug) {
                C8963Fug c8963Fug = (C8963Fug) obj;
                if (!this.A06.equals(c8963Fug.A06) || !this.A0B.equals(c8963Fug.A0B) || !this.A0A.equals(c8963Fug.A0A) || !this.A09.equals(c8963Fug.A09) || !this.A07.equals(c8963Fug.A07) || !this.A08.equals(c8963Fug.A08) || !C7384Etj.areEqual(this.A00, c8963Fug.A00) || !C7384Etj.areEqual(this.A01, c8963Fug.A01) || !C7384Etj.areEqual(this.A02, c8963Fug.A02) || !C7384Etj.areEqual(this.A04, c8963Fug.A04) || !C7384Etj.areEqual(this.A05, c8963Fug.A05) || !C7384Etj.areEqual(this.A03, c8963Fug.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass005.A0I(this.A08, AnonymousClass005.A0I(this.A07, AnonymousClass005.A0I(this.A09, AnonymousClass005.A0F(this.A0A, AnonymousClass005.A0F(this.A0B, AnonymousClass001.A0G(this.A06)))))) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0D(this.A03)) * 31;
    }

    public final String toString() {
        String str = this.A06;
        Instant instant = this.A0B;
        Instant instant2 = this.A0A;
        String str2 = this.A09;
        String str3 = this.A07;
        String str4 = this.A08;
        Double d = this.A00;
        Double d2 = this.A01;
        Double d3 = this.A02;
        Double d4 = this.A04;
        Double d5 = this.A05;
        Double d6 = this.A03;
        StringBuilder sbA0x = C3cI.A0x("MetaHealthSleepSession(id=", str);
        AbstractC7610F5x.A1K(instant, instant2, sbA0x);
        AbstractC7610F5x.A1N(str2, str3, sbA0x);
        sbA0x.append(", sourceBundleId=");
        sbA0x.append(str4);
        sbA0x.append(", awakeDurationSec=");
        sbA0x.append(d);
        sbA0x.append(", coreDurationSec=");
        sbA0x.append(d2);
        sbA0x.append(", deepDurationSec=");
        sbA0x.append(d3);
        sbA0x.append(", remDurationSec=");
        sbA0x.append(d4);
        sbA0x.append(", unspecifiedDurationSec=");
        sbA0x.append(d5);
        sbA0x.append(", inBedDurationSec=");
        sbA0x.append(d6);
        return C3cJ.A0L(null, ", extra=", sbA0x);
    }

    public C8963Fug(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, String str, String str2, String str3, String str4, Instant instant, Instant instant2) {
        this.A06 = str;
        this.A0B = instant;
        this.A0A = instant2;
        this.A09 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
        this.A04 = d4;
        this.A05 = d5;
        this.A03 = d6;
    }
}
