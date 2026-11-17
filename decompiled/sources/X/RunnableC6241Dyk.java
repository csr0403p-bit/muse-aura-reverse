package X;

/* renamed from: X.Dyk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6241Dyk implements Runnable {
    public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6";
    public final /* synthetic */ C6173DxG A00;
    public final /* synthetic */ C6205Dxp A01;

    @Override // java.lang.Runnable
    public final void run() {
        C6205Dxp c6205Dxp = this.A01;
        c6205Dxp.A01.onVideoEnabled(this.A00);
    }

    public /* synthetic */ RunnableC6241Dyk(C6173DxG c6173DxG, C6205Dxp c6205Dxp) {
        this.A01 = c6205Dxp;
        this.A00 = c6173DxG;
    }
}
