package com.facebook.aura.ageverification;

import X.AbstractC0878AGe;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class FrontalSnapshotSelector {
    public static final int $stable = 8;
    public FaceSnapshot best;
    public long lastTakenMs = -1;

    public final void offer(FaceFrame faceFrame, long j) {
        FaceSnapshot faceSnapshotInvoke;
        C7384Etj.A0Y(faceFrame, 0);
        NormalizedFace normalizedFace = (NormalizedFace) AbstractC0878AGe.A0K(faceFrame.faces);
        if (normalizedFace != null) {
            long j2 = this.lastTakenMs;
            if (j2 == -1 || j - j2 >= 500) {
                float fAbs = Math.abs(normalizedFace.yawDegrees) + Math.abs(normalizedFace.pitchDegrees);
                FaceSnapshot faceSnapshot = this.best;
                if ((faceSnapshot == null || (fAbs < faceSnapshot.penalty && faceSnapshot.nv21.isDone())) && (faceSnapshotInvoke = faceFrame.snapshot.invoke(Float.valueOf(fAbs))) != null) {
                    this.best = faceSnapshotInvoke;
                    this.lastTakenMs = j;
                }
            }
        }
    }

    public final void reset() {
        this.best = null;
        this.lastTakenMs = -1L;
    }

    public final FaceSnapshot getBest() {
        return this.best;
    }
}
