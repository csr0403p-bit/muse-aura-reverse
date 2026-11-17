package X;

/* renamed from: X.FLa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7928FLa {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ HsM A02;
    public final /* synthetic */ HsM A03;

    public C7928FLa(FBB fbb, FDW fdw, HsM hsM, HsM hsM2) {
        this.A02 = hsM;
        this.A01 = fdw;
        this.A00 = fbb;
        this.A03 = hsM2;
    }

    public final void A00(Hky hky) {
        HsM hsM = this.A02;
        if (hsM != null) {
            FDW fdw = this.A01;
            FBB fbb = this.A00;
            String str = hky == Hky.A03 ? "forward" : "back";
            C9115Fyg c9115FygA02 = C9115Fyg.A02(fbb);
            c9115FygA02.A06(str, 1);
            F9J.A02(fbb, fdw, c9115FygA02, hsM);
        }
    }
}
