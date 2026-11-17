package X;

/* renamed from: X.DXr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5100DXr extends C06G {
    public Boolean A07 = null;
    public Boolean A08 = null;
    public Boolean A00 = null;
    public Boolean A05 = null;
    public Boolean A01 = null;
    public Boolean A03 = null;
    public Boolean A04 = null;
    public Boolean A02 = null;
    public Boolean A06 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5100DXr) {
                C5100DXr c5100DXr = (C5100DXr) obj;
                if (!C7384Etj.areEqual(this.A07, c5100DXr.A07) || !C7384Etj.areEqual(this.A08, c5100DXr.A08) || !C7384Etj.areEqual(this.A00, c5100DXr.A00) || !C7384Etj.areEqual(this.A05, c5100DXr.A05) || !C7384Etj.areEqual(this.A01, c5100DXr.A01) || !C7384Etj.areEqual(this.A03, c5100DXr.A03) || !C7384Etj.areEqual(this.A04, c5100DXr.A04) || !C7384Etj.areEqual(this.A02, c5100DXr.A02) || !C7384Etj.areEqual(this.A06, c5100DXr.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass006.A0D(this.A07) * 31) + AnonymousClass006.A0D(this.A08)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + C3cH.A02(this.A06);
    }

    public final String toString() {
        Boolean bool = this.A00;
        Boolean boolA0i = AnonymousClass001.A0i();
        String strA0M = boolA0i.equals(bool) ? "Mobile;" : "";
        if (boolA0i.equals(this.A08)) {
            strA0M = FGI.A0M(strA0M, "Wifi;");
        }
        if (boolA0i.equals(this.A05)) {
            strA0M = FGI.A0M(strA0M, "Roaming;");
        }
        if (boolA0i.equals(this.A07)) {
            strA0M = FGI.A0M(strA0M, "VPN;");
        }
        if (boolA0i.equals(this.A01)) {
            strA0M = FGI.A0M(strA0M, "Enterprise;");
        }
        if (boolA0i.equals(this.A03)) {
            strA0M = FGI.A0M(strA0M, "Metered;");
        }
        if (boolA0i.equals(this.A04)) {
            strA0M = FGI.A0M(strA0M, "Validated;");
        }
        if (boolA0i.equals(this.A02)) {
            strA0M = FGI.A0M(strA0M, "Captive;");
        }
        return boolA0i.equals(this.A06) ? FGI.A0M(strA0M, "Satellite;") : strA0M;
    }
}
