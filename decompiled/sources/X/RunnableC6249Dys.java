package X;

/* renamed from: X.Dys, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6249Dys implements Runnable {
    public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6205Dxp A02;
    public final /* synthetic */ String A03;

    @Override // java.lang.Runnable
    public final void run() {
        C6205Dxp c6205Dxp = this.A02;
        c6205Dxp.A01.onVideoDecoderInitialized(this.A03, this.A00, this.A01);
    }

    public /* synthetic */ RunnableC6249Dys(C6205Dxp c6205Dxp, String str, long j, long j2) {
        this.A02 = c6205Dxp;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }
}
