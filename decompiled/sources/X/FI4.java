package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FI4 {
    public static final Integer[] A01 = {C79.A01, C79.A0C, C79.A0K, C79.A00};
    public final float[] A00;

    public static Object A01(Object[] objArr, int i, boolean z) {
        boolean z2;
        if (i < 0) {
            throw BV5.A0Q("Invalid physical side: ", i);
        }
        Object obj = objArr[i];
        if (obj == null) {
            if (i != 3) {
                z2 = i != 1;
                return null;
            }
            obj = objArr[z2 != z ? (char) 4 : (char) 5];
            if (obj == null) {
                return null;
            }
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FI4) && Arrays.equals(this.A00, ((FI4) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public FI4(float f, float f2, float f3, float f4) {
        float fA00 = A00(f);
        float fA002 = A00(f2);
        float fA003 = A00(f3);
        float fA004 = A00(f4);
        float[] fArr = new float[4];
        AbstractC7607F5u.A1S(fArr, fA00, fA002, fA003);
        fArr[3] = fA004;
        this.A00 = fArr;
    }

    public static float A00(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, f);
    }
}
