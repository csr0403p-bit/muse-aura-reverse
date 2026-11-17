package X;

/* loaded from: classes5.dex */
public final class CQk {
    public static final CQk A02;
    public static final CQk A03;
    public final Throwable A00;
    public final boolean A01;

    static {
        if (CQU.GENERATE_CANCELLATION_CAUSES) {
            return;
        }
        A02 = new CQk(null, false);
        A03 = new CQk(null, true);
    }

    public CQk(Throwable wasInterrupted, boolean cause) {
        this.A01 = cause;
        this.A00 = wasInterrupted;
    }
}
