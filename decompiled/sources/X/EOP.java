package X;

/* loaded from: classes5.dex */
public final class EOP implements EOW {
    public final Integer A00;
    public final EP0 A01;
    public final EOO A02;

    @Override // X.EOW
    public final Integer ACC() {
        return this.A00;
    }

    @Override // X.EOW
    public final EP0 ACR() {
        return this.A01;
    }

    @Override // X.EOW
    public final EOO AE5() {
        return this.A02;
    }

    @Override // X.EOW
    public final /* bridge */ EOO AMG() {
        return null;
    }

    public EOP() {
        EP0 ep0 = EP0.A0A;
        this.A01 = ep0;
        this.A00 = C79.A01;
        this.A02 = new EOO(new EO0(C79.A0K, "content://com.instagram.lite.provider.IgLiteUserValuesProvider", "com.instagram.lite", null, new Dt3("content://com.instagram.lite.provider.IgLiteUserValuesProvider", 2), new ENy(ep0)), null);
    }
}
