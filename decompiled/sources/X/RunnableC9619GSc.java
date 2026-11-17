package X;

/* renamed from: X.GSc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9619GSc implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$notifyMicrophoneMute$1";
    public final /* synthetic */ GSV A00;
    public final /* synthetic */ boolean A01;

    public RunnableC9619GSc(GSV gsv, boolean z) {
        this.A00 = gsv;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03.notifyMicrophoneMute(this.A01);
    }
}
