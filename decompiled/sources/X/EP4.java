package X;

/* loaded from: classes5.dex */
public final class EP4 implements EOW {
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

    public EP4() {
        EP0 ep0 = EP0.A0E;
        this.A00 = ep0;
        this.A01 = C79.A0K;
        this.A02 = new EOO(ENx.A01("com.oculus.twilight", "com.oculus.twilight.contentprovider.FamilyAppsUserValuesProvider", "com.oculus.twilight.fbpermission.SSO_ACCESS", ep0), null);
        this.A03 = new EOO(ENx.A02("com.oculus.twilight", this.A00), null);
    }
}
