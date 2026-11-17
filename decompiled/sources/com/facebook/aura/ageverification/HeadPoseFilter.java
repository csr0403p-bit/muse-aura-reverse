package com.facebook.aura.ageverification;

import X.ATD;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HeadPoseFilter {
    public static final int $stable = 8;
    public Float pitch;
    public Float yaw;

    private final float correct(float f, float f2) {
        float fA03 = ATD.A03(f + f2, -0.5f, 0.5f);
        if (Math.abs(fA03) <= 0.019444445f) {
            return 0.0f;
        }
        return fA03;
    }

    public final HeadPose filter(NormalizedFace normalizedFace) {
        C7384Etj.A0Y(normalizedFace, 0);
        float fSmooth = smooth(this.yaw, correct(normalize(normalizedFace.yawDegrees), 0.0055555557f));
        float fSmooth2 = smooth(this.pitch, correct(normalize(normalizedFace.pitchDegrees), 0.0f));
        this.yaw = Float.valueOf(fSmooth);
        this.pitch = Float.valueOf(fSmooth2);
        return new HeadPose(fSmooth, fSmooth2);
    }

    public final void reset() {
        this.yaw = null;
        this.pitch = null;
    }

    private final float normalize(float f) {
        return ATD.A03(f, -90.0f, 90.0f) / 180.0f;
    }

    private final float smooth(Float f, float f2) {
        if (f == null) {
            return f2;
        }
        float fFloatValue = f.floatValue();
        float f3 = f2 - fFloatValue;
        return fFloatValue + ((Math.abs(f3) >= 0.04f ? 0.8f : 0.35f) * f3);
    }
}
