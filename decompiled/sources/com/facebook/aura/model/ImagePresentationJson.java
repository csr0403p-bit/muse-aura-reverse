package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ImagePresentationJson extends C06G {
    public static final int $stable = 8;
    public final List<HatchAttachmentFileJson> images;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ImagePresentationJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ImagePresentationJson> serializer() {
            return ImagePresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ImagePresentationJson copy(List<HatchAttachmentFileJson> list) {
        C7384Etj.A0Y(list, 0);
        return new ImagePresentationJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImagePresentationJson) && C7384Etj.areEqual(this.images, ((ImagePresentationJson) obj).images));
    }

    public static /* synthetic */ ImagePresentationJson copy$default(ImagePresentationJson imagePresentationJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imagePresentationJson.images;
        }
        C7384Etj.A0Y(list, 0);
        return new ImagePresentationJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ImagePresentationJson imagePresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(imagePresentationJson.images)) {
            c9j5.AAQ(imagePresentationJson.images, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<HatchAttachmentFileJson> component1() {
        return this.images;
    }

    public final List<HatchAttachmentFileJson> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode();
    }

    public final ImageGalleryPresentationData toDomain() {
        List<HatchAttachmentFileJson> list = this.images;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchAttachmentFileJson> it = list.iterator();
        while (it.hasNext()) {
            HatchAttachmentFile domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return new ImageGalleryPresentationData(arrayListA0h);
    }

    public /* synthetic */ ImagePresentationJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.images = C0881AGi.A00;
        } else {
            this.images = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ImagePresentationJson(List<HatchAttachmentFileJson> list) {
        C7384Etj.A0Y(list, 0);
        this.images = list;
    }

    public /* synthetic */ ImagePresentationJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public ImagePresentationJson() {
        this(C0881AGi.A00);
    }
}
