package X;

/* loaded from: classes5.dex */
public final class F55 implements CQG {
    public final int $t;
    public final Object A00;

    public F55(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.CQG
    public final void onFailure(Throwable th) {
        if (this.$t == 0) {
            CFK.A08("QuickPerformanceLoggerImpl", "Failed to notify metadata collection or to visit QPL event", th);
        } else {
            C7384Etj.A0Y(th, 0);
            BV7.A1K(th, (HtJ) this.A00);
        }
    }

    @Override // X.CQG
    public final void onSuccess(Object obj) {
        if (this.$t != 0) {
            C7384Etj.A0Y(obj, 0);
            ((HtJ) this.A00).resumeWith(obj);
        }
    }
}
