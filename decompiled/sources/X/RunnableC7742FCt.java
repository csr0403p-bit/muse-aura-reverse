package X;

/* renamed from: X.FCt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7742FCt implements Runnable {
    public static final String __redex_internal_original_name = "RenderCallback";
    public boolean A00;
    public final Runnable A01;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00) {
            return;
        }
        this.A01.run();
    }

    public RunnableC7742FCt(Runnable runnable) {
        this.A01 = runnable;
    }
}
