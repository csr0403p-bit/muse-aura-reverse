package X;

/* renamed from: X.3WD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C3WD {
    public static final int A01(float f, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final float A00(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }
}
