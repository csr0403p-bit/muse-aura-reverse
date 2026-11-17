package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class E15 implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda12";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Dy9 A01;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A01;
        dy9.A01.onAudioPositionAdvancing(this.A00);
    }

    public /* synthetic */ E15(Dy9 dy9, long j) {
        this.A01 = dy9;
        this.A00 = j;
    }
}
