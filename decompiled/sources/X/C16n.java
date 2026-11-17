package X;

/* renamed from: X.16n, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16n {
    public static final long A00(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
