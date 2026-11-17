package X;

/* loaded from: classes5.dex */
public final class CNY extends AbstractC3446CNr<Void> implements Runnable {
    public static final String __redex_internal_original_name = "MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask";
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }

    public CNY(Runnable delegate) {
        delegate.getClass();
        this.A00 = delegate;
    }

    @Override // X.CQU
    public final String pendingToString() {
        return BV8.A0u(this.A00, C60O.A0x("task=["));
    }
}
