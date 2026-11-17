package X;

/* renamed from: X.GSb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9618GSb implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$1";
    public final /* synthetic */ GSV A00;

    public RunnableC9618GSb(GSV gsv) {
        this.A00 = gsv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GSV gsv = this.A00;
        gsv.A03.setTaskRunner(new HlA(gsv));
    }
}
