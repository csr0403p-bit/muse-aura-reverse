package X;

/* loaded from: classes6.dex */
public final class GPS extends C06G implements GPY {
    public final GOU A00;
    public final C10511HoF A01;
    public final C10606Hye A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPS) {
                GPS gps = (GPS) obj;
                if (!C7384Etj.areEqual(this.A00, gps.A00) || !C7384Etj.areEqual(this.A02, gps.A02) || !C7384Etj.areEqual(this.A01, gps.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.GPY
    public final GOU AEe() {
        return this.A00;
    }

    @Override // X.GPY
    public final HoJ AF1() {
        return null;
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
        return this.A00.AJI();
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A00)) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        GOU gou = this.A00;
        C10606Hye c10606Hye = this.A02;
        C10511HoF c10511HoF = this.A01;
        StringBuilder sbA0f = C3cG.A0f(gou, "Store(dcpProductDetails=");
        sbA0f.append(", productInfo=");
        sbA0f.append(c10606Hye);
        return C3cJ.A0L(c10511HoF, ", externalSkuDetails=", sbA0f);
    }

    public GPS(GOU gou, C10511HoF c10511HoF, C10606Hye c10606Hye) {
        this.A00 = gou;
        this.A02 = c10606Hye;
        this.A01 = c10511HoF;
    }
}
