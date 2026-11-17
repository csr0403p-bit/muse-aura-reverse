package X;

/* loaded from: classes5.dex */
public final class EOf implements EOW {
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

    public EOf() {
        EP0 ep0 = EP0.A0B;
        this.A00 = ep0;
        this.A01 = C79.A01;
        this.A02 = new EOO(ENx.A00("com.instagram.liteprovider.FirstPartyUserValuesLiteProviderV2", "com.instagram.android", null, null, ep0), null);
        this.A03 = new EOO(ENx.A02("com.instagram.android", this.A00), null);
    }
}
