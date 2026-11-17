package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class VisualFrameEvidence {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public VisualFrameGeometry geometry;
    public ProtectedImage image;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualFrameEvidence) {
                VisualFrameEvidence visualFrameEvidence = (VisualFrameEvidence) obj;
                if (!C7384Etj.areEqual(this.geometry, visualFrameEvidence.geometry) || !C7384Etj.areEqual(this.image, visualFrameEvidence.image)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setGeometry(VisualFrameGeometry visualFrameGeometry) {
        C7384Etj.A0Y(visualFrameGeometry, 0);
        this.geometry = visualFrameGeometry;
    }

    public final void setImage(ProtectedImage protectedImage) {
        C7384Etj.A0Y(protectedImage, 0);
        this.image = protectedImage;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ VisualFrameEvidence copy$default(VisualFrameEvidence visualFrameEvidence, VisualFrameGeometry visualFrameGeometry, ProtectedImage protectedImage, int i, Object obj) {
        if ((i & 1) != 0) {
            visualFrameGeometry = visualFrameEvidence.geometry;
        }
        if ((i & 2) != 0) {
            protectedImage = visualFrameEvidence.image;
        }
        AnonymousClass003.A0u(visualFrameGeometry, protectedImage);
        return new VisualFrameEvidence(visualFrameGeometry, protectedImage);
    }

    public final VisualFrameGeometry component1() {
        return this.geometry;
    }

    public final ProtectedImage component2() {
        return this.image;
    }

    public final VisualFrameGeometry getGeometry() {
        return this.geometry;
    }

    public final ProtectedImage getImage() {
        return this.image;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.image, AnonymousClass005.A0E(this.geometry));
    }

    public String toString() {
        return C3cJ.A0L(this.image, ", image=", C3cG.A0f(this.geometry, "VisualFrameEvidence(geometry="));
    }

    public VisualFrameEvidence(VisualFrameGeometry visualFrameGeometry, ProtectedImage protectedImage) {
        AnonymousClass003.A0u(visualFrameGeometry, protectedImage);
        this.geometry = visualFrameGeometry;
        this.image = protectedImage;
    }

    public final VisualFrameEvidence copy(VisualFrameGeometry visualFrameGeometry, ProtectedImage protectedImage) {
        AnonymousClass003.A0u(visualFrameGeometry, protectedImage);
        return new VisualFrameEvidence(visualFrameGeometry, protectedImage);
    }
}
