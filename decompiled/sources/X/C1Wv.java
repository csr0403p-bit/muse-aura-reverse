package X;

/* renamed from: X.1Wv, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Wv {
    public static final long A00(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long A01(long j) {
        return AnonymousClass005.A0M(AnonymousClass001.A00(j) / 2.0f, AnonymousClass001.A01(j, 4294967295L) / 2.0f);
    }
}
