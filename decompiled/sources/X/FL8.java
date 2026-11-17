package X;

/* loaded from: classes6.dex */
public final class FL8 implements Runnable {
    public static final String __redex_internal_original_name = "RenderLifecycleExtensionV2BinderUtils$bind$runnable$1";
    public final /* synthetic */ FLR A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ FDW A03;
    public final /* synthetic */ Runnable A04;

    public FL8(FLR flr, FBB fbb, FDW fdw, FDW fdw2, Runnable runnable) {
        this.A00 = flr;
        this.A03 = fdw;
        this.A04 = runnable;
        this.A02 = fdw2;
        this.A01 = fbb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FLR flr = this.A00;
        flr.A00 = null;
        if (!flr.A01) {
            flr.A01 = true;
            HsM hsMA0Z = AbstractC7608F5v.A0Z(this.A03);
            if (hsMA0Z != null) {
                FDW fdw = this.A02;
                F9J.A03(this.A01, fdw, C9115Fyg.A02(fdw), hsMA0Z, 1);
            }
        }
        HsM hsMA0a = AbstractC7608F5v.A0a(this.A03);
        if (hsMA0a != null) {
            FDW fdw2 = this.A02;
            F9J.A03(this.A01, fdw2, C9115Fyg.A02(fdw2), hsMA0a, 1);
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
