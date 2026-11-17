package com.facebook.aura.partners.voice.infra;

import X.ATD;
import X.Ab3;
import X.CFK;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;

/* loaded from: classes2.dex */
public abstract class VideoConfigJsonKt {
    public static final int CROP_OFFSET_ALIGNMENT = 2;
    public static final float DISPLAY_CROP_CENTER_X = 0.5f;
    public static final float DISPLAY_CROP_SIZE = 1.0f;
    public static final float DISPLAY_CROP_TOLERANCE = 0.001f;
    public static final int SOURCE_HEIGHT = 768;
    public static final int SOURCE_WIDTH = 448;
    public static final String TAG = "VideoConfigJson";

    public static final HatchVideoCrop resolveHatchVoiceVideoCrop(Float f, Float f2, Float f3, boolean z) {
        if (z) {
            return new HatchVideoCrop(0, 0);
        }
        HatchVideoCrop hatchVideoCrop = new HatchVideoCrop(0, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH);
        if (f != null && f2 != null && f3 != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue) <= Float.MAX_VALUE) {
                float fFloatValue2 = f2.floatValue();
                if (Math.abs(fFloatValue2) <= Float.MAX_VALUE) {
                    float fFloatValue3 = f3.floatValue();
                    if (Math.abs(fFloatValue3) <= Float.MAX_VALUE && Math.abs(fFloatValue - 0.5f) <= 0.001f && Math.abs(fFloatValue3 - 1.0f) <= 0.001f) {
                        float f4 = 224.0f / 768.0f;
                        float f5 = 1.0f - f4;
                        float fA03 = ATD.A03(fFloatValue2, f4, f5);
                        if (fFloatValue2 < f4 - 0.001f || fFloatValue2 > 0.001f + f5) {
                            CFK.A0H(TAG, "display_crop y=%f outside [%f, %f]; clamped to %f", f2, Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(fA03));
                        }
                        int iA01 = Ab3.A01((fA03 * 768.0f) - 224.0f);
                        if (iA01 < 0) {
                            iA01 = 0;
                        } else if (iA01 > 320) {
                            iA01 = HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH;
                        }
                        int i = iA01 - (iA01 % 2);
                        return new HatchVideoCrop(i, 320 - i);
                    }
                }
            }
            CFK.A0H(TAG, "display_crop x=%f y=%f size=%f is not the expected centred square; using the top square", f, f2, f3);
        }
        return hatchVideoCrop;
    }
}
