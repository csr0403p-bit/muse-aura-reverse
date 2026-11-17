package com.facebook.aura.ageverification;

import X.AbstractC0878AGe;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class SelfieGuidanceKt {
    public static final float CENTER_TOLERANCE = 0.15f;
    public static final float RECORDING_CENTER_TOLERANCE = 0.25f;
    public static final float RECORDING_MIN_HEIGHT_RATIO = 0.6f;
    public static final float TARGET_FACE_HEIGHT = 0.55f;

    public static final FaceGuidance guidance(FaceFrame faceFrame) {
        C7384Etj.A0Y(faceFrame, 0);
        NormalizedFace normalizedFace = (NormalizedFace) AbstractC0878AGe.A0K(faceFrame.faces);
        if (faceFrame.faces.size() > 1) {
            return FaceGuidance.ONLY_YOU;
        }
        if (normalizedFace == null || Math.abs(normalizedFace.centerX - 0.5f) > 0.15f || Math.abs(normalizedFace.centerY - 0.5f) > 0.15f) {
            return FaceGuidance.POSITION;
        }
        float f = normalizedFace.height;
        return f < 0.495f ? FaceGuidance.MOVE_CLOSER : f > 0.66f ? FaceGuidance.MOVE_AWAY : FaceGuidance.ALIGNED;
    }

    public static final boolean isInCircle(FaceFrame faceFrame) {
        C7384Etj.A0Y(faceFrame, 0);
        NormalizedFace normalizedFace = (NormalizedFace) AbstractC0878AGe.A0K(faceFrame.faces);
        return normalizedFace != null && Math.abs(normalizedFace.centerX - 0.5f) <= 0.25f && Math.abs(normalizedFace.centerY - 0.5f) <= 0.25f && normalizedFace.height >= 0.33f;
    }
}
