package X;

/* renamed from: X.EkG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7289EkG implements Runnable {
    public static final String __redex_internal_original_name = "AnimatedDrawable2$invalidateRunnable$1";
    public final /* synthetic */ C7279Ek5 A00;

    public RunnableC7289EkG(C7279Ek5 c7279Ek5) {
        this.A00 = c7279Ek5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7279Ek5 c7279Ek5 = this.A00;
        c7279Ek5.unscheduleSelf(this);
        c7279Ek5.invalidateSelf();
    }
}
