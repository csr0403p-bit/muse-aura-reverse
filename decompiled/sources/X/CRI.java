package X;

/* loaded from: classes5.dex */
public final class CRI {
    public static final CRI A02;
    public static final CRI A03;
    public final RuntimeException A00;
    public final boolean A01;

    static {
        if (CR9.A03) {
            return;
        }
        A03 = new CRI(null, false);
        A02 = new CRI(null, true);
    }

    public CRI(RuntimeException runtimeException, boolean z) {
        this.A01 = z;
        this.A00 = runtimeException;
    }
}
