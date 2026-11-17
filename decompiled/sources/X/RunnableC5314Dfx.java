package X;

/* renamed from: X.Dfx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5314Dfx implements Runnable {
    public static final String __redex_internal_original_name = "LiveData$1";
    public final /* synthetic */ AbstractC5306Dfp A00;

    public RunnableC5314Dfx(AbstractC5306Dfp abstractC5306Dfp) {
        this.A00 = abstractC5306Dfp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AbstractC5306Dfp abstractC5306Dfp = this.A00;
        synchronized (abstractC5306Dfp.A06) {
            obj = abstractC5306Dfp.A09;
            abstractC5306Dfp.A09 = AbstractC5306Dfp.A0A;
        }
        abstractC5306Dfp.A0A(obj);
    }
}
