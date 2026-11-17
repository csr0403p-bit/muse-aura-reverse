package X;

/* renamed from: X.Fcf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC8366Fcf implements Runnable {
    public static final String __redex_internal_original_name = "SplashScreen$Impl$$ExternalSyntheticLambda1";
    public final /* synthetic */ InterfaceC8368Fci A00;
    public final /* synthetic */ C8364Fcd A01;

    @Override // java.lang.Runnable
    public final void run() {
        C8364Fcd c8364Fcd = this.A01;
        InterfaceC8368Fci interfaceC8368Fci = this.A00;
        c8364Fcd.A00.A00().bringToFront();
        interfaceC8368Fci.onSplashScreenExit(c8364Fcd);
    }

    public /* synthetic */ RunnableC8366Fcf(InterfaceC8368Fci interfaceC8368Fci, C8364Fcd c8364Fcd) {
        this.A01 = c8364Fcd;
        this.A00 = interfaceC8368Fci;
    }
}
