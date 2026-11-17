package X;

/* loaded from: classes6.dex */
public final class GPX extends C06G implements GPY {
    public final C10574Huh A00;
    public final C10511HoF A01;
    public final C10606Hye A02;
    public final GOU A03;

    public GPX(GOU gou, C10574Huh c10574Huh, C10511HoF c10511HoF, C10606Hye c10606Hye) {
        C7384Etj.A0Y(c10511HoF, 3);
        this.A02 = c10606Hye;
        this.A00 = c10574Huh;
        this.A03 = gou;
        this.A01 = c10511HoF;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPX) {
                GPX gpx = (GPX) obj;
                if (!C7384Etj.areEqual(this.A02, gpx.A02) || !C7384Etj.areEqual(this.A00, gpx.A00) || !C7384Etj.areEqual(this.A03, gpx.A03) || !C7384Etj.areEqual(this.A01, gpx.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.GPY
    public final GOU AEe() {
        return this.A03;
    }

    @Override // X.GPY
    public final HoJ AF1() {
        return this.A01.A02;
    }

    @Override // X.GPY
    public final C10511HoF AFV() {
        return this.A01;
    }

    @Override // X.GPY
    public final C10606Hye AJ9() {
        return this.A02;
    }

    @Override // X.GPY
    public final C10574Huh AJH() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A02)) + AnonymousClass006.A0D(this.A03)) * 31);
    }

    public final String toString() {
        C10606Hye c10606Hye = this.A02;
        C10574Huh c10574Huh = this.A00;
        GOU gou = this.A03;
        C10511HoF c10511HoF = this.A01;
        StringBuilder sbA0f = C3cG.A0f(c10606Hye, "Catalog(productInfo=");
        sbA0f.append(", purchasePrice=");
        sbA0f.append(c10574Huh);
        sbA0f.append(", dcpProductDetails=");
        sbA0f.append(gou);
        return C3cJ.A0L(c10511HoF, ", externalSkuDetails=", sbA0f);
    }
}
