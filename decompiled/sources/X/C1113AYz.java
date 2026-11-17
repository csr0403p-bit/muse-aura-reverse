package X;

/* renamed from: X.AYz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1113AYz implements InterfaceC1180Adj {
    public final C1BO A00;
    public final C1BO A01;
    public final /* synthetic */ InterfaceC1180Adj A02;

    @Override // X.InterfaceC1180Adj
    public final float A98(float f) {
        return this.A02.A98(f);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADN() {
        return C1BO.A0F(this.A00);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADO() {
        return C1BO.A0F(this.A01);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean AOz() {
        return this.A02.AOz();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0V<-LX/3Q0;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    @Override // X.InterfaceC1180Adj
    public final Object AcF(C3UY c3uy, HtJ htJ, G0V g0v) {
        return this.A02.AcF(c3uy, htJ, g0v);
    }

    public C1113AYz(InterfaceC1180Adj interfaceC1180Adj, AZ0 az0) {
        this.A02 = interfaceC1180Adj;
        this.A01 = new BBP(null, C2298BSy.A00(az0, 9));
        this.A00 = new BBP(null, C2298BSy.A00(az0, 10));
    }
}
