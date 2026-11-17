package X;

/* renamed from: X.GBb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9248GBb implements Runnable {
    public static final String __redex_internal_original_name = "LimitedDispatcher$Worker";
    public Runnable A00;
    public final /* synthetic */ GBQ A01;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.A00.run();
            } catch (Throwable th) {
                HwS.A00(C6ys.A00, th);
            }
            GBQ gbq = this.A01;
            Runnable runnableA00 = GBQ.A00(gbq);
            if (runnableA00 == null) {
                return;
            }
            try {
                this.A00 = runnableA00;
                i++;
                if (i >= 16) {
                    GBK gbk = gbq.A01;
                    if (GBI.A02(gbq, gbk)) {
                        GBI.A01(this, gbq, gbk);
                        return;
                    }
                }
            } catch (Throwable th2) {
                GBQ gbq2 = this.A01;
                synchronized (gbq2.A00) {
                    GBQ.A06.decrementAndGet(gbq2);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC9248GBb(Runnable runnable, Runnable runnable2) {
        this.A01 = runnable2;
        this.A00 = runnable;
    }
}
