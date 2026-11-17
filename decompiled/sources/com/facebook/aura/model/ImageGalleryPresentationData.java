package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class ImageGalleryPresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 8;
    public final List<HatchAttachmentFile> images;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ImageGalleryPresentationData$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ImageGalleryPresentationData> serializer() {
            return ImageGalleryPresentationData$$serializer.INSTANCE;
        }

        public final ImageGalleryPresentationData fromJson(JsonElement jsonElement) {
            return HatchAttachmentPresentationJsonKt.parseImagePresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ImageGalleryPresentationData copy(List<HatchAttachmentFile> list) {
        C7384Etj.A0Y(list, 0);
        return new ImageGalleryPresentationData(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImageGalleryPresentationData) && C7384Etj.areEqual(this.images, ((ImageGalleryPresentationData) obj).images));
    }

    public /* synthetic */ ImageGalleryPresentationData(int i, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ImageGalleryPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.images = list;
    }

    public static /* synthetic */ ImageGalleryPresentationData copy$default(ImageGalleryPresentationData imageGalleryPresentationData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imageGalleryPresentationData.images;
        }
        C7384Etj.A0Y(list, 0);
        return new ImageGalleryPresentationData(list);
    }

    public final List<HatchAttachmentFile> component1() {
        return this.images;
    }

    public final List<HatchAttachmentFile> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ImageGalleryPresentationData(List<HatchAttachmentFile> list) {
        C7384Etj.A0Y(list, 0);
        this.images = list;
    }
}
