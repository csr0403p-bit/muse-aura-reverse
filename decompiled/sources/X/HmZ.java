package X;

/* loaded from: classes6.dex */
public final class HmZ implements Runnable {
    public static final String __redex_internal_original_name = "BKBloksComponentsAndroidGboardContentExtensionBinderUtil$bind$1$onContentCommitted$1";
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ HsM A02;
    public final /* synthetic */ String A03;

    public HmZ(FBB fbb, FDW fdw, HsM hsM, String str) {
        this.A01 = fdw;
        this.A02 = hsM;
        this.A03 = str;
        this.A00 = fbb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FDW fdw = this.A01;
        HsM hsM = this.A02;
        F6D.A03(this.A00, fdw, C9115Fyg.A03(C9115Fyg.A00(), this.A03, 0), hsM);
    }
}
