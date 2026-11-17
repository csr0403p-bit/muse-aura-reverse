package X;

/* loaded from: classes5.dex */
public final class EP7 implements EOW {
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

    public EP7() {
        EP0 ep0 = EP0.A07;
        this.A00 = ep0;
        this.A01 = C79.A00;
        this.A02 = new EOO(ENx.A00("com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider", "com.facebook.katana", "user_values", "com.facebook.katana.fbpermission.LITE_PROVIDER_ACCESS", ep0), ENx.A00("com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider", "com.facebook.wakizashi", "user_values", "com.facebook.katana.fbpermission.LITE_PROVIDER_ACCESS", this.A00));
        this.A03 = new EOO(ENx.A02("com.facebook.katana", this.A00), ENx.A02("com.facebook.wakizashi", this.A00));
    }
}
