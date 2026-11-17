package X;

/* loaded from: classes5.dex */
public final class EP5 implements EOW {
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

    public EP5() {
        EP0 ep0 = EP0.A0F;
        this.A00 = ep0;
        this.A01 = C79.A0P;
        this.A02 = new EOO(ENx.A00("com.instagram.barcelona.liteprovider.BarcelonaLiteContentProvider", "com.instagram.barcelona", null, null, ep0), null);
        this.A03 = new EOO(ENx.A02("com.instagram.barcelona", this.A00), null);
    }
}
