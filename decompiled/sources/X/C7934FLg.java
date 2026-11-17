package X;

/* renamed from: X.FLg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7934FLg implements InterfaceC7937FLj {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ FKG A02;

    public C7934FLg(FBB fbb, FDW fdw, FKG fkg) {
        this.A02 = fkg;
        this.A01 = fdw;
        this.A00 = fbb;
    }

    @Override // X.InterfaceC7937FLj
    public final void onRefresh() {
        this.A02.A01 = true;
        FDW fdw = this.A01;
        HsM hsMA0a = AbstractC7608F5v.A0a(fdw);
        if (hsMA0a != null) {
            F6D.A03(this.A00, fdw, C9115Fyg.A01(fdw).A05(), hsMA0a);
        }
    }
}
