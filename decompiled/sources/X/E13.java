package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class E13 implements Runnable {
    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5";
    public final /* synthetic */ Dy9 A00;
    public final /* synthetic */ Exception A01;

    @Override // java.lang.Runnable
    public final void run() {
        Dy9 dy9 = this.A00;
        dy9.A01.onAudioSinkError(this.A01);
    }

    public /* synthetic */ E13(Dy9 dy9, Exception exc) {
        this.A00 = dy9;
        this.A01 = exc;
    }
}
