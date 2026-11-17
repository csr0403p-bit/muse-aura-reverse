package X;

import android.graphics.Path;
import android.util.Log;

/* renamed from: X.FdS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8411FdS {
    public char A00;
    public final float[] A01;

    public static void A00(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = d3;
        double d5 = f2;
        double d6 = f5;
        double d7 = ((d3 * dCos) + (d5 * dSin)) / d6;
        double d8 = f6;
        double d9 = (((-f) * dSin) + (d5 * dCos)) / d8;
        double d10 = f4;
        double d11 = ((f3 * dCos) + (d10 * dSin)) / d6;
        double d12 = (((-f3) * dSin) + (d10 * dCos)) / d8;
        double d13 = d7 - d11;
        double d14 = d9 - d12;
        double d15 = (d7 + d11) / 2.0d;
        double d16 = (d9 + d12) / 2.0d;
        double d17 = (d13 * d13) + (d14 * d14);
        if (d17 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d18 = (1.0d / d17) - 0.25d;
        if (d18 < 0.0d) {
            StringBuilder sbA0x = C60O.A0x("Points are too far apart ");
            sbA0x.append(d17);
            Log.w("PathParser", sbA0x.toString());
            float fSqrt = (float) (Math.sqrt(d17) / 1.99999d);
            A00(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d18);
        double d19 = d13 * dSqrt;
        double d20 = dSqrt * d14;
        if (z == z2) {
            d = d15 - d20;
            d2 = d16 + d19;
        } else {
            d = d15 + d20;
            d2 = d16 - d19;
        }
        double dAtan2 = Math.atan2(d9 - d2, d7 - d);
        double dAtan22 = Math.atan2(d12 - d2, d11 - d) - dAtan2;
        if (z2 != C8j3.A1Q((dAtan22 > 0.0d ? 1 : (dAtan22 == 0.0d ? 0 : -1)))) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d21 = d * d6;
        double d22 = d2 * d8;
        double d23 = (d21 * dCos) - (d22 * dSin);
        double d24 = (d21 * dSin) + (d22 * dCos);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(dAtan2);
        double dSin2 = Math.sin(dAtan2);
        double d25 = -d6;
        double d26 = d25 * dCos;
        double d27 = d8 * dSin;
        double d28 = (d26 * dSin2) - (d27 * dCos2);
        double d29 = d25 * dSin;
        double d30 = d8 * dCos;
        double d31 = (dSin2 * d29) + (dCos2 * d30);
        double d32 = dAtan22 / iCeil;
        double d33 = dAtan2;
        int i = 0;
        while (i < iCeil) {
            dAtan2 += d32;
            double dSin3 = Math.sin(dAtan2);
            double dCos3 = Math.cos(dAtan2);
            double d34 = (d23 + ((d6 * dCos) * dCos3)) - (d27 * dSin3);
            double d35 = d24 + (d6 * dSin * dCos3) + (d30 * dSin3);
            double d36 = (d26 * dSin3) - (d27 * dCos3);
            double d37 = (dSin3 * d29) + (dCos3 * d30);
            double d38 = dAtan2 - d33;
            double dTan = Math.tan(d38 / 2.0d);
            double dSin4 = (Math.sin(d38) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d4 + (d28 * dSin4)), (float) (d5 + (d31 * dSin4)), (float) (d34 - (dSin4 * d36)), (float) (d35 - (dSin4 * d37)), (float) d34, (float) d35);
            i++;
            d4 = d34;
            d33 = dAtan2;
            d31 = d37;
            d5 = d35;
            d28 = d36;
        }
    }

    public C8411FdS(C8411FdS c8411FdS) {
        this.A00 = c8411FdS.A00;
        float[] fArr = c8411FdS.A01;
        int length = fArr.length;
        int iMin = Math.min(length, length);
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        this.A01 = fArr2;
    }

    public C8411FdS(float[] fArr, char c) {
        this.A00 = c;
        this.A01 = fArr;
    }
}
