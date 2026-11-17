package X;

import java.time.Instant;
import java.util.Map;

/* renamed from: X.Fuh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8964Fuh {
    public final double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Instant A06;
    public final Instant A07;
    public final Map<String, Double> A08;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Double;>;Ljava/lang/String;)V */
    public C8964Fuh(String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Map map, double d) {
        AnonymousClass005.A16(str2, str3, instant, instant2, 1);
        C7384Etj.A0Y(str4, 6);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = d;
        this.A05 = str3;
        this.A07 = instant;
        this.A06 = instant2;
        this.A03 = str4;
        this.A08 = map;
        this.A04 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8964Fuh) {
                C8964Fuh c8964Fuh = (C8964Fuh) obj;
                if (!C7384Etj.areEqual(this.A02, c8964Fuh.A02) || !this.A01.equals(c8964Fuh.A01) || Double.compare(this.A00, c8964Fuh.A00) != 0 || !this.A05.equals(c8964Fuh.A05) || !this.A07.equals(c8964Fuh.A07) || !this.A06.equals(c8964Fuh.A06) || !this.A03.equals(c8964Fuh.A03) || !C7384Etj.areEqual(this.A08, c8964Fuh.A08) || !C7384Etj.areEqual(this.A04, c8964Fuh.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0I(this.A03, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A07, AnonymousClass005.A0I(this.A05, HsK.A01(this.A00, AnonymousClass005.A0I(this.A01, AnonymousClass006.A0G(this.A02) * 31)))))) + AnonymousClass006.A0D(this.A08)) * 31) + AnonymousClass005.A0H(this.A04);
    }

    public final String toString() {
        String str = this.A02;
        String str2 = this.A01;
        double d = this.A00;
        String str3 = this.A05;
        Instant instant = this.A07;
        Instant instant2 = this.A06;
        String str4 = this.A03;
        Map<String, Double> map = this.A08;
        String str5 = this.A04;
        StringBuilder sbA0x = C3cI.A0x("MetaHealthSample(id=", str);
        sbA0x.append(", dataType=");
        sbA0x.append(str2);
        sbA0x.append(", value=");
        sbA0x.append(d);
        sbA0x.append(", unit=");
        sbA0x.append(str3);
        AbstractC7610F5x.A1K(instant, instant2, sbA0x);
        sbA0x.append(", sourceBundleId=");
        sbA0x.append(str4);
        sbA0x.append(", data=");
        sbA0x.append(map);
        return C3cJ.A0N(", timezone=", str5, sbA0x);
    }
}
