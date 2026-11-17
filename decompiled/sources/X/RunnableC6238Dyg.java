package X;

/* renamed from: X.Dyg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6238Dyg implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0";
    public final /* synthetic */ C6173DxG A00;
    public final /* synthetic */ Dy9 A01;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A01;
        dy9.A01.onAudioEnabled(this.A00);
    }

    public /* synthetic */ RunnableC6238Dyg(C6173DxG c6173DxG, Dy9 dy9) {
        this.A01 = dy9;
        this.A00 = c6173DxG;
    }
}
