package X;

/* loaded from: classes4.dex */
public abstract class AQY {
    public static final long A01(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final long A00(long j) {
        return C8j3.A0S(Math.round(AnonymousClass001.A00(j)), Math.round(AnonymousClass001.A01(j, 4294967295L)));
    }
}
