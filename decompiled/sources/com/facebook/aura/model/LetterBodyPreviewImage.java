package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LetterBodyPreviewImage extends C06G implements LetterBodyPreview {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final LetterBodyPreviewImageData data;

    public final class Companion {
        public final C9hr<LetterBodyPreviewImage> serializer() {
            return LetterBodyPreviewImage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final LetterBodyPreviewImage copy(LetterBodyPreviewImageData letterBodyPreviewImageData) {
        C7384Etj.A0Y(letterBodyPreviewImageData, 0);
        return new LetterBodyPreviewImage(letterBodyPreviewImageData);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LetterBodyPreviewImage) && C7384Etj.areEqual(this.data, ((LetterBodyPreviewImage) obj).data));
    }

    public /* synthetic */ LetterBodyPreviewImage(int i, LetterBodyPreviewImageData letterBodyPreviewImageData, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LetterBodyPreviewImage$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.data = letterBodyPreviewImageData;
    }

    public static /* synthetic */ LetterBodyPreviewImage copy$default(LetterBodyPreviewImage letterBodyPreviewImage, LetterBodyPreviewImageData letterBodyPreviewImageData, int i, Object obj) {
        if ((i & 1) != 0) {
            letterBodyPreviewImageData = letterBodyPreviewImage.data;
        }
        C7384Etj.A0Y(letterBodyPreviewImageData, 0);
        return new LetterBodyPreviewImage(letterBodyPreviewImageData);
    }

    public final LetterBodyPreviewImageData component1() {
        return this.data;
    }

    public final LetterBodyPreviewImageData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public LetterBodyPreviewImage(LetterBodyPreviewImageData letterBodyPreviewImageData) {
        C7384Etj.A0Y(letterBodyPreviewImageData, 0);
        this.data = letterBodyPreviewImageData;
    }
}
