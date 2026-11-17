package X;

/* renamed from: X.DqQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5834DqQ implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$tryAutoResumeAfterFocusLoss$1$1";
    public final /* synthetic */ C5627DmA A00;

    public RunnableC5834DqQ(C5627DmA c5627DmA) {
        this.A00 = c5627DmA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5645DmZ c5645DmZ;
        C5627DmA c5627DmA = this.A00;
        if (c5627DmA.A0b.get() && (c5645DmZ = c5627DmA.A16) != null && c5645DmZ.A01()) {
            c5627DmA.A0a.set(false);
            C5627DmA.A02(c5627DmA);
        }
    }
}
