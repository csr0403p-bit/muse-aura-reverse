package X;

import java.util.Map;

/* renamed from: X.EuC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7388EuC {
    public static void A00(Object obj, String str, Map map) {
        C7384Etj.A0Y(str, 0);
        if (obj == null) {
            obj = null;
        } else {
            C0861A6i c0861A6i = new C0861A6i(obj.getClass());
            if (!BV5.A1S(Boolean.TYPE, c0861A6i) && !BV5.A1S(Byte.TYPE, c0861A6i) && !BV5.A1S(Integer.TYPE, c0861A6i) && !BV5.A1S(Long.TYPE, c0861A6i) && !BV5.A1S(Float.TYPE, c0861A6i) && !BV5.A1S(Double.TYPE, c0861A6i) && !BV5.A1S(String.class, c0861A6i) && !BV5.A1S(Boolean[].class, c0861A6i) && !BV5.A1S(Byte[].class, c0861A6i) && !BV5.A1S(Integer[].class, c0861A6i) && !BV5.A1S(Long[].class, c0861A6i) && !BV5.A1S(Float[].class, c0861A6i) && !BV5.A1S(Double[].class, c0861A6i) && !BV5.A1S(String[].class, c0861A6i)) {
                if (BV5.A1S(boolean[].class, c0861A6i)) {
                    boolean[] zArr = (boolean[]) obj;
                    int length = zArr.length;
                    Boolean[] boolArr = new Boolean[length];
                    for (int i = 0; i < length; i++) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                    obj = boolArr;
                } else if (BV5.A1S(byte[].class, c0861A6i)) {
                    byte[] bArr = (byte[]) obj;
                    int length2 = bArr.length;
                    Byte[] bArr2 = new Byte[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        bArr2[i2] = Byte.valueOf(bArr[i2]);
                    }
                    obj = bArr2;
                } else if (BV5.A1S(int[].class, c0861A6i)) {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length;
                    Integer[] numArr = new Integer[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        numArr[i3] = Integer.valueOf(iArr[i3]);
                    }
                    obj = numArr;
                } else if (BV5.A1S(long[].class, c0861A6i)) {
                    long[] jArr = (long[]) obj;
                    int length4 = jArr.length;
                    Long[] lArr = new Long[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        lArr[i4] = Long.valueOf(jArr[i4]);
                    }
                    obj = lArr;
                } else if (BV5.A1S(float[].class, c0861A6i)) {
                    float[] fArr = (float[]) obj;
                    int length5 = fArr.length;
                    Float[] fArr2 = new Float[length5];
                    for (int i5 = 0; i5 < length5; i5++) {
                        fArr2[i5] = Float.valueOf(fArr[i5]);
                    }
                    obj = fArr2;
                } else {
                    if (!BV5.A1S(double[].class, c0861A6i)) {
                        throw BV5.A0P(c0861A6i, " has invalid type ", C3cI.A0x("Key ", str));
                    }
                    double[] dArr = (double[]) obj;
                    int length6 = dArr.length;
                    Double[] dArr2 = new Double[length6];
                    for (int i6 = 0; i6 < length6; i6++) {
                        dArr2[i6] = Double.valueOf(dArr[i6]);
                    }
                    obj = dArr2;
                }
            }
        }
        map.put(str, obj);
    }
}
