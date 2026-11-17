package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class DyV implements Runnable {
    public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7";
    public final /* synthetic */ C6154Dwx A00;
    public final /* synthetic */ C2461Bbo A01;
    public final /* synthetic */ C6205Dxp A02;

    @Override // java.lang.Runnable
    public final void run() {
        C6205Dxp c6205Dxp = this.A02;
        c6205Dxp.A01.onVideoInputFormatChanged(this.A00, this.A01);
    }

    public /* synthetic */ DyV(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo, C6205Dxp c6205Dxp) {
        this.A02 = c6205Dxp;
        this.A00 = c6154Dwx;
        this.A01 = c2461Bbo;
    }
}
