package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class E16 implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7";
    public final /* synthetic */ Dy9 A00;
    public final /* synthetic */ boolean A01;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A00;
        dy9.A01.onSkipSilenceEnabledChanged(this.A01);
    }

    public /* synthetic */ E16(Dy9 dy9, boolean z) {
        this.A00 = dy9;
        this.A01 = z;
    }
}
