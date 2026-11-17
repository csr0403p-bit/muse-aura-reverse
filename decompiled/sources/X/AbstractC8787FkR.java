package X;

/* renamed from: X.FkR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8787FkR {
    public static int A02(float f, int i, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float fA00 = A00(((i >> 16) & 255) / 255.0f);
        float fA002 = A00(((i >> 8) & 255) / 255.0f);
        float fA003 = A00((i & 255) / 255.0f);
        float fA004 = A00(((i2 >> 16) & 255) / 255.0f);
        float fA005 = A00(((i2 >> 8) & 255) / 255.0f);
        float fA006 = A00((i2 & 255) / 255.0f);
        float fA02 = C8j3.A02(((i2 >> 24) & 255) / 255.0f, ((i >> 24) & 255) / 255.0f, f);
        float fA022 = C8j3.A02(fA004, fA00, f);
        float fA023 = C8j3.A02(fA005, fA002, f);
        float fA01 = AbstractC7607F5u.A01(fA006, fA003, f);
        return (Math.round(A01(fA022) * 255.0f) << 16) | (Math.round(fA02 * 255.0f) << 24) | (Math.round(A01(fA023) * 255.0f) << 8) | Math.round(A01(fA01) * 255.0f);
    }

    public static float A00(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float A01(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
