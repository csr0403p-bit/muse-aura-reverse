package X;

/* renamed from: X.Ajm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1479Ajm {
    public static final long A00 = (1023 << 50) ^ (-1);
    public static final long A01;
    public static final long A02;

    static {
        long j = 33554431 << 25;
        A01 = (-1) ^ j;
        A02 = 33554431 | (Math.min(0, 1023) << 50) | j;
    }
}
