package X;

/* loaded from: classes5.dex */
public final class EP3 implements EOW {
    public final EP0 A00;
    public final Integer A01;
    public final EOO A02;

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
    public final /* bridge */ EOO AMG() {
        return null;
    }

    public EP3() {
        EP0 ep0 = EP0.A09;
        this.A00 = ep0;
        this.A01 = C79.A0K;
        this.A02 = new EOO(ENx.A02("com.facebook.aura", ep0), null);
    }
}
