package X;

/* loaded from: classes6.dex */
public abstract class FMB {
    public static final void A00(float[] fArr, float[] fArr2, float f) {
        int i = 0;
        do {
            float f2 = fArr[i];
            float fPow = f2 + (f * (f2 < Math.abs(f) ? 1.0f + ((float) Math.pow((f2 / r1) - 1.0f, 3.0d)) : 1.0f));
            if (fPow < 0.0f) {
                fPow = 0.0f;
            }
            fArr2[i] = fPow;
            i++;
        } while (i < 8);
    }
}
