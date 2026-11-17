package X;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class BMp {
    public static int A00(int i, int i2) {
        return A01(i * 32, i2 * 25);
    }

    public static /* synthetic */ int A01(long j, long j2) {
        return ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE) ? 1 : ((j ^ Long.MIN_VALUE) == (j2 ^ Long.MIN_VALUE) ? 0 : -1));
    }
}
