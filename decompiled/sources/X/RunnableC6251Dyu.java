package X;

/* renamed from: X.Dyu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6251Dyu implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9";
    public final /* synthetic */ Dy9 A00;
    public final /* synthetic */ String A01;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A00;
        dy9.A01.onAudioDecoderReleased(this.A01);
    }

    public /* synthetic */ RunnableC6251Dyu(Dy9 dy9, String str) {
        this.A00 = dy9;
        this.A01 = str;
    }
}
