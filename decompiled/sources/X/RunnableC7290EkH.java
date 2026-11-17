package X;

/* renamed from: X.EkH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7290EkH implements Runnable {
    public static final String __redex_internal_original_name = "KAnimatedDrawable2$invalidateRunnable$1";
    public final /* synthetic */ C7280Ek6 A00;

    public RunnableC7290EkH(C7280Ek6 c7280Ek6) {
        this.A00 = c7280Ek6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7280Ek6 c7280Ek6 = this.A00;
        c7280Ek6.unscheduleSelf(this);
        c7280Ek6.invalidateSelf();
    }
}
