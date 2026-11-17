package X;

/* loaded from: classes5.dex */
public final class EP9 implements EOW {
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

    public EP9() {
        EP0 ep0 = EP0.A0G;
        this.A00 = ep0;
        this.A01 = C79.A0K;
        this.A02 = new EOO(ENx.A01("com.facebook.vibes", "com.facebook.vibes.access.contentprovider.VibesUserValuesProvider", "com.facebook.vibes.fbpermission.SSO_ACCESS", ep0), ENx.A01("com.facebook.vibes_debug", "com.facebook.vibes_debug.access.contentprovider.VibesUserValuesProvider", "com.facebook.vibes.fbpermission.SSO_ACCESS", ep0));
        this.A03 = new EOO(ENx.A02("com.facebook.vibes", this.A00), ENx.A02("com.facebook.vibes_debug", this.A00));
    }
}
