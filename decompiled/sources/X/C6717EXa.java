package X;

/* renamed from: X.EXa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6717EXa implements InterfaceC9726Gee {
    public GOU A00;
    public String A01;
    public String A02;

    @Override // X.InterfaceC9726Gee
    public final void AdG(GOU gou) {
        C7384Etj.A0Y(gou, 0);
        this.A00 = gou;
    }

    @Override // X.InterfaceC9726Gee
    public final C79e A5Q() {
        String strAKi;
        GOU gou = this.A00;
        if (gou == null || (strAKi = gou.AKi()) == null) {
            strAKi = "com.facebook.iac.test.consumable";
        }
        return new EXZ(this.A00, strAKi, this.A02, this.A01);
    }

    @Override // X.InterfaceC9726Gee
    public final void Acf(String str) {
    }

    @Override // X.InterfaceC9726Gee
    public final void Act(String str) {
        this.A01 = str;
    }

    @Override // X.InterfaceC9726Gee
    public final void AeK(String str) {
        this.A02 = str;
    }

    @Override // X.InterfaceC9726Gee
    public final /* synthetic */ void AeS(String str) {
    }

    @Override // X.InterfaceC9726Gee
    public final void Aep(String str, Integer num, String str2) {
    }
}
