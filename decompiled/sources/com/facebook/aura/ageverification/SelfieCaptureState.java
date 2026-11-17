package com.facebook.aura.ageverification;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.ageverification.SelfieStep;

/* loaded from: classes3.dex */
public final class SelfieCaptureState extends C06G {
    public static final int $stable = 0;
    public final AHD<HeadMovement> completed;
    public final boolean frontalHeld;
    public final FaceGuidance guidance;
    public final HeadMovement movement;
    public final boolean outOfCircle;
    public final boolean recaptureNotice;
    public final SelfieStep step;

    public static /* synthetic */ SelfieCaptureState copy$default(SelfieCaptureState selfieCaptureState, SelfieStep selfieStep, FaceGuidance faceGuidance, HeadMovement headMovement, AHD ahd, boolean z, boolean z2, boolean z3, int i, Object obj) {
        SelfieStep selfieStep2 = selfieStep;
        FaceGuidance faceGuidance2 = faceGuidance;
        HeadMovement headMovement2 = headMovement;
        AHD ahd2 = ahd;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            selfieStep2 = selfieCaptureState.step;
        }
        if ((i & 2) != 0) {
            faceGuidance2 = selfieCaptureState.guidance;
        }
        if ((i & 4) != 0) {
            headMovement2 = selfieCaptureState.movement;
        }
        if ((i & 8) != 0) {
            ahd2 = selfieCaptureState.completed;
        }
        if ((i & 16) != 0) {
            z4 = selfieCaptureState.frontalHeld;
        }
        if ((i & 32) != 0) {
            z5 = selfieCaptureState.outOfCircle;
        }
        if ((i & 64) != 0) {
            z6 = selfieCaptureState.recaptureNotice;
        }
        AnonymousClass005.A0y(selfieStep2, faceGuidance2, ahd2);
        return new SelfieCaptureState(selfieStep2, faceGuidance2, headMovement2, ahd2, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelfieCaptureState) {
                SelfieCaptureState selfieCaptureState = (SelfieCaptureState) obj;
                if (!C7384Etj.areEqual(this.step, selfieCaptureState.step) || this.guidance != selfieCaptureState.guidance || this.movement != selfieCaptureState.movement || !C7384Etj.areEqual(this.completed, selfieCaptureState.completed) || this.frontalHeld != selfieCaptureState.frontalHeld || this.outOfCircle != selfieCaptureState.outOfCircle || this.recaptureNotice != selfieCaptureState.recaptureNotice) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SelfieCaptureState(SelfieStep selfieStep, FaceGuidance faceGuidance, HeadMovement headMovement, AHD ahd, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this((i & 1) != 0 ? SelfieStep.Positioning.INSTANCE : selfieStep, (i & 2) != 0 ? FaceGuidance.POSITION : faceGuidance, (i & 4) != 0 ? null : headMovement, (i & 8) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1Q(i, z), AnonymousClass002.A1R(i, z2), z3);
    }

    public final SelfieStep component1() {
        return this.step;
    }

    public final FaceGuidance component2() {
        return this.guidance;
    }

    public final HeadMovement component3() {
        return this.movement;
    }

    public final AHD<HeadMovement> component4() {
        return this.completed;
    }

    public final boolean component5() {
        return this.frontalHeld;
    }

    public final boolean component6() {
        return this.outOfCircle;
    }

    public final boolean component7() {
        return this.recaptureNotice;
    }

    public final AHD<HeadMovement> getCompleted() {
        return this.completed;
    }

    public final boolean getDone() {
        return this.movement == null && !this.completed.isEmpty();
    }

    public final boolean getFrontalHeld() {
        return this.frontalHeld;
    }

    public final FaceGuidance getGuidance() {
        return this.guidance;
    }

    public final HeadMovement getMovement() {
        return this.movement;
    }

    public final boolean getOutOfCircle() {
        return this.outOfCircle;
    }

    public final boolean getRecaptureNotice() {
        return this.recaptureNotice;
    }

    public final SelfieStep getStep() {
        return this.step;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.completed, (AnonymousClass005.A0F(this.guidance, AnonymousClass005.A0E(this.step)) + AnonymousClass006.A0D(this.movement)) * 31), this.frontalHeld), this.outOfCircle), this.recaptureNotice);
    }

    public final SelfieCaptureState copy(SelfieStep selfieStep, FaceGuidance faceGuidance, HeadMovement headMovement, AHD<? extends HeadMovement> ahd, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A0y(selfieStep, faceGuidance, ahd);
        return new SelfieCaptureState(selfieStep, faceGuidance, headMovement, ahd, z, z2, z3);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelfieCaptureState(SelfieStep selfieStep, FaceGuidance faceGuidance, HeadMovement headMovement, AHD<? extends HeadMovement> ahd, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A0y(selfieStep, faceGuidance, ahd);
        this.step = selfieStep;
        this.guidance = faceGuidance;
        this.movement = headMovement;
        this.completed = ahd;
        this.frontalHeld = z;
        this.outOfCircle = z2;
        this.recaptureNotice = z3;
    }
}
