package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class EncodedImage {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String base64;
    public ImageMimeType mimeType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EncodedImage) {
                EncodedImage encodedImage = (EncodedImage) obj;
                if (this.mimeType != encodedImage.mimeType || !C7384Etj.areEqual(this.base64, encodedImage.base64)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setBase64(String str) {
        C7384Etj.A0Y(str, 0);
        this.base64 = str;
    }

    public final void setMimeType(ImageMimeType imageMimeType) {
        C7384Etj.A0Y(imageMimeType, 0);
        this.mimeType = imageMimeType;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ EncodedImage copy$default(EncodedImage encodedImage, ImageMimeType imageMimeType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            imageMimeType = encodedImage.mimeType;
        }
        if ((i & 2) != 0) {
            str = encodedImage.base64;
        }
        AnonymousClass003.A0u(imageMimeType, str);
        return new EncodedImage(imageMimeType, str);
    }

    public final ImageMimeType component1() {
        return this.mimeType;
    }

    public final String component2() {
        return this.base64;
    }

    public final String getBase64() {
        return this.base64;
    }

    public final ImageMimeType getMimeType() {
        return this.mimeType;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.base64, AnonymousClass005.A0E(this.mimeType));
    }

    public String toString() {
        return C3cJ.A0N(", base64=", this.base64, C3cG.A0f(this.mimeType, "EncodedImage(mimeType="));
    }

    public EncodedImage(ImageMimeType imageMimeType, String str) {
        AnonymousClass003.A0u(imageMimeType, str);
        this.mimeType = imageMimeType;
        this.base64 = str;
    }

    public final EncodedImage copy(ImageMimeType imageMimeType, String str) {
        AnonymousClass003.A0u(imageMimeType, str);
        return new EncodedImage(imageMimeType, str);
    }
}
