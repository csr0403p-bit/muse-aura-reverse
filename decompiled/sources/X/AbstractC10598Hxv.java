package X;

/* renamed from: X.Hxv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10598Hxv {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03 = 3 | (4 << 32);

    static {
        long j = 3 << 32;
        A01 = j;
        A02 = 1 | j;
        A00 = j | 2;
    }

    public static String A00(long j) {
        return j == A01 ? "Rgb" : j == A02 ? "Xyz" : j == A00 ? "Lab" : j == A03 ? "Cmyk" : "Unknown";
    }
}
