package X;

/* loaded from: classes5.dex */
public final class BhF {
    public static BhF A03;
    public final long A00;
    public final boolean A01;
    public final boolean A02;
    public static final BhF A05 = new BhF(0, false, false);
    public static final BhF A04 = new BhF(500, true, false);

    static {
        new BhF(100L, true, false);
        A03 = new BhF(0L, false, true);
    }

    public BhF(long j, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = j;
        if (z2) {
            BeS.A06(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.A01 = z2;
    }
}
