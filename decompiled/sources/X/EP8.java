package X;

/* loaded from: classes5.dex */
public final class EP8 implements EOW {
    public final EP0 A00;
    public final Integer A01;
    public final EOO A02;
    public final EOO A03;

    @Override // X.EOW
    public final Integer ACC() {
        return this.A01;
    }

    @Override // X.EOW
    public final EP0 ACR() {
        return this.A00;
    }

    @Override // X.EOW
    public final EOO AE5() {
        return this.A02;
    }

    @Override // X.EOW
    public final EOO AMG() {
        return this.A03;
    }

    public EP8() {
        EP0 ep0 = EP0.A0C;
        this.A00 = ep0;
        this.A01 = C79.A00;
        this.A02 = new EOO(ENx.A00("com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider", "com.facebook.orca", "user_values", "com.facebook.katana.fbpermission.LITE_PROVIDER_ACCESS", ep0), null);
        this.A03 = new EOO(ENx.A02("com.facebook.orca", this.A00), null);
    }
}
