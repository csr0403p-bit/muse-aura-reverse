package com.facebook.aura.conversation.view;

import X.AaC;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ImageOptionPreviewRequest extends C06G {
    public static final int $stable = 0;
    public final float aspectRatio;
    public final int index;
    public final AaC sourceBounds;
    public final float sourceDim;

    public ImageOptionPreviewRequest(int i, AaC aaC, float f, float f2) {
        C7384Etj.A0Y(aaC, 1);
        this.index = i;
        this.sourceBounds = aaC;
        this.aspectRatio = f;
        this.sourceDim = f2;
    }

    public final ImageOptionPreviewRequest copy(int i, AaC aaC, float f, float f2) {
        C7384Etj.A0Y(aaC, 1);
        return new ImageOptionPreviewRequest(i, aaC, f, f2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImageOptionPreviewRequest) {
                ImageOptionPreviewRequest imageOptionPreviewRequest = (ImageOptionPreviewRequest) obj;
                if (this.index != imageOptionPreviewRequest.index || !C7384Etj.areEqual(this.sourceBounds, imageOptionPreviewRequest.sourceBounds) || Float.compare(this.aspectRatio, imageOptionPreviewRequest.aspectRatio) != 0 || Float.compare(this.sourceDim, imageOptionPreviewRequest.sourceDim) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ImageOptionPreviewRequest copy$default(ImageOptionPreviewRequest imageOptionPreviewRequest, int i, AaC aaC, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = imageOptionPreviewRequest.index;
        }
        if ((i2 & 2) != 0) {
            aaC = imageOptionPreviewRequest.sourceBounds;
        }
        if ((i2 & 4) != 0) {
            f = imageOptionPreviewRequest.aspectRatio;
        }
        if ((i2 & 8) != 0) {
            f2 = imageOptionPreviewRequest.sourceDim;
        }
        C7384Etj.A0Y(aaC, 1);
        return new ImageOptionPreviewRequest(i, aaC, f, f2);
    }

    public final int component1() {
        return this.index;
    }

    public final AaC component2() {
        return this.sourceBounds;
    }

    public final float component3() {
        return this.aspectRatio;
    }

    public final float component4() {
        return this.sourceDim;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getIndex() {
        return this.index;
    }

    public final AaC getSourceBounds() {
        return this.sourceBounds;
    }

    public final float getSourceDim() {
        return this.sourceDim;
    }

    public int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A0F(this.sourceBounds, this.index * 31), this.aspectRatio) + Float.floatToIntBits(this.sourceDim);
    }

    public String toString() {
        return super.toString();
    }
}
