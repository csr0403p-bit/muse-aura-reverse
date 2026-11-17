package X;

import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;

/* renamed from: X.Acp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1157Acp {
    public static final float[] A00;

    static {
        float fA00;
        float f;
        float f2;
        float f3;
        float[] fArr = new float[FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE];
        A00 = fArr;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f6 = i / 100.0f;
            float f7 = 1.0f;
            while (true) {
                fA00 = C8j3.A00(f7, f4) + f4;
                f = 1.0f - fA00;
                f2 = fA00 * 3.0f * f;
                f3 = fA00 * fA00 * fA00;
                float f8 = (((f * 0.175f) + (fA00 * 0.35000002f)) * f2) + f3;
                if (C8j3.A01(f8, f6) < 1.0E-5d) {
                    break;
                } else if (f8 > f6) {
                    f7 = fA00;
                } else {
                    f4 = fA00;
                }
            }
            fArr[i] = (f2 * ((f * 0.5f) + fA00)) + f3;
            float f9 = 1.0f;
            while (true) {
                float f10 = ((f9 - f5) / 2.0f) + f5;
                float f11 = 1.0f - f10;
                float f12 = (((f11 * 0.5f) + f10) * f10 * 3.0f * f11) + (f10 * f10 * f10);
                if (C8j3.A01(f12, f6) >= 1.0E-5d) {
                    if (f12 > f6) {
                        f9 = f10;
                    } else {
                        f5 = f10;
                    }
                }
            }
        }
        fArr[100] = 1.0f;
    }
}
