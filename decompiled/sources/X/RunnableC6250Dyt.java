package X;

/* renamed from: X.Dyt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6250Dyt implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Dy9 A02;
    public final /* synthetic */ String A03;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A02;
        dy9.A01.onAudioDecoderInitialized(this.A03, this.A00, this.A01);
    }

    public /* synthetic */ RunnableC6250Dyt(Dy9 dy9, String str, long j, long j2) {
        this.A02 = dy9;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }
}
