package X;

/* loaded from: classes5.dex */
public final class EOQ implements EOW {
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

    public EOQ() {
        EP0 ep0 = EP0.A08;
        this.A01 = ep0;
        this.A00 = C79.A00;
        this.A02 = new EOO(new EO0(C79.A0C, "content://com.facebook.lite.provider.UserValuesProvider/user_values", "com.facebook.lite", null, new Dt3("content://com.facebook.lite.provider.UserValuesProvider/user_values", 2), new ENy(ep0)), null);
    }
}
