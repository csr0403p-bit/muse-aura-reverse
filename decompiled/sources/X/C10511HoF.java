package X;

/* renamed from: X.HoF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10511HoF extends C06G {
    public final HxP A00;
    public final Hr9 A01;
    public final HoJ A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10511HoF) {
                C10511HoF c10511HoF = (C10511HoF) obj;
                if (this.A01 != c10511HoF.A01 || this.A00 != c10511HoF.A00 || !C7384Etj.areEqual(this.A02, c10511HoF.A02) || !C7384Etj.areEqual(this.A03, c10511HoF.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A0E(this.A01) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass005.A0H(this.A03);
    }

    public final String toString() {
        Hr9 hr9 = this.A01;
        HxP hxP = this.A00;
        HoJ hoJ = this.A02;
        String str = this.A03;
        StringBuilder sbA0f = C3cG.A0f(hr9, "IapExternalSkuDetails(billingType=");
        sbA0f.append(", platformMode=");
        sbA0f.append(hxP);
        sbA0f.append(", dynamicToken=");
        sbA0f.append(hoJ);
        return C3cJ.A0N(", loggingPayload=", str, sbA0f);
    }

    public C10511HoF(HxP hxP, Hr9 hr9, HoJ hoJ, String str) {
        this.A01 = hr9;
        this.A00 = hxP;
        this.A02 = hoJ;
        this.A03 = str;
    }
}
