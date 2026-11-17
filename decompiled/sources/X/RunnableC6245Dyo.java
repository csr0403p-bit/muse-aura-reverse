package X;

/* renamed from: X.Dyo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6245Dyo implements Runnable {
    public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9";
    public final /* synthetic */ C6205Dxp A00;
    public final /* synthetic */ String A01;

    @Override // java.lang.Runnable
    public final void run() {
        C6205Dxp c6205Dxp = this.A00;
        c6205Dxp.A01.onVideoDecoderReleased(this.A01);
    }

    public /* synthetic */ RunnableC6245Dyo(C6205Dxp c6205Dxp, String str) {
        this.A00 = c6205Dxp;
        this.A01 = str;
    }
}
