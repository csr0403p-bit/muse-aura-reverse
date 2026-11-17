package com.facebook.aura.ageverification;

import X.ATD;
import X.BV6;
import X.Bo0;
import X.C0968AJv;
import X.C2887Bnv;
import X.C4208CqE;
import X.C7384Etj;
import X.InterfaceC2873Bng;
import android.graphics.Rect;
import android.media.Image;

/* loaded from: classes5.dex */
public abstract class FaceDetectionAnalyzerKt {
    public static final int LUMA_SAMPLE_STEP = 8;

    public static final NormalizedFace normalized(C4208CqE c4208CqE, int i, int i2, float f) {
        Rect rect = c4208CqE.A03;
        return new NormalizedFace(1.0f - ((rect.exactCenterX() - ((i - f) / 2.0f)) / f), (rect.exactCenterY() - ((i2 - f) / 2.0f)) / f, rect.height() / f, -c4208CqE.A02, c4208CqE.A01);
    }

    public static final float averageLuma(InterfaceC2873Bng interfaceC2873Bng) {
        Bo0 bo0 = interfaceC2873Bng.AIj()[0];
        C7384Etj.A0U(((C2887Bnv) bo0).A00.getBuffer());
        Image.Plane plane = ((C2887Bnv) bo0).A00;
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, interfaceC2873Bng.getHeight()), 8);
        int i = c0968AJvA0B.A00;
        int i2 = c0968AJvA0B.A01;
        int i3 = c0968AJvA0B.A02;
        long jA0C = 0;
        if (i3 > 0) {
            if (i > i2) {
                return 0.0f;
            }
        } else if (i3 >= 0 || i2 > i) {
            return 0.0f;
        }
        int i4 = 0;
        while (true) {
            C0968AJv c0968AJvA0B2 = ATD.A0B(ATD.A0C(0, interfaceC2873Bng.getWidth()), 8);
            int i5 = c0968AJvA0B2.A00;
            int i6 = c0968AJvA0B2.A01;
            int i7 = c0968AJvA0B2.A02;
            if (i7 <= 0 ? !(i7 >= 0 || i6 > i5) : i5 <= i6) {
                while (true) {
                    jA0C += BV6.A0C(r12, (i * rowStride) + (i5 * pixelStride));
                    i4++;
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (i == i2) {
                break;
            }
            i += i3;
        }
        if (i4 != 0) {
            return (jA0C / i4) / 255.0f;
        }
        return 0.0f;
    }
}
