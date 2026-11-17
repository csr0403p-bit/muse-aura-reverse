package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class E14 implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Dy9 A03;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A03;
        dy9.A01.onAudioUnderrun(this.A00, this.A01, this.A02);
    }

    public /* synthetic */ E14(Dy9 dy9, int i, long j, long j2) {
        this.A03 = dy9;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }
}
