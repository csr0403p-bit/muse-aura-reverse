package X;

/* renamed from: X.Dyr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6248Dyr implements Runnable {
    public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6205Dxp A02;

    @Override // java.lang.Runnable
    public final void run() {
        C6205Dxp c6205Dxp = this.A02;
        c6205Dxp.A01.onDroppedFrames(this.A00, this.A01);
    }

    public /* synthetic */ RunnableC6248Dyr(C6205Dxp c6205Dxp, int i, long j) {
        this.A02 = c6205Dxp;
        this.A00 = i;
        this.A01 = j;
    }
}
