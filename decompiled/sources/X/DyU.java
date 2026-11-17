package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class DyU implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6";
    public final /* synthetic */ C6154Dwx A00;
    public final /* synthetic */ C2461Bbo A01;
    public final /* synthetic */ Dy9 A02;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A02;
        dy9.A01.onAudioInputFormatChanged(this.A00, this.A01);
    }

    public /* synthetic */ DyU(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo, Dy9 dy9) {
        this.A02 = dy9;
        this.A00 = c6154Dwx;
        this.A01 = c2461Bbo;
    }
}
