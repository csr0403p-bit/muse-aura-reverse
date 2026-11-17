package com.facebook.aura.markdown.parser.custom.extensions;

import X.AnonymousClass001;
import X.C7384Etj;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import java.util.List;

/* loaded from: classes.dex */
public final class ImageGroupPayload {
    public final List<AuraInline.Image> images;

    public ImageGroupPayload(List<AuraInline.Image> list) {
        C7384Etj.A0Y(list, 0);
        this.images = list;
    }

    public final ImageGroupPayload copy(List<AuraInline.Image> list) {
        C7384Etj.A0Y(list, 0);
        return new ImageGroupPayload(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImageGroupPayload) && C7384Etj.areEqual(this.images, ((ImageGroupPayload) obj).images));
    }

    public static /* synthetic */ ImageGroupPayload copy$default(ImageGroupPayload imageGroupPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imageGroupPayload.images;
        }
        C7384Etj.A0Y(list, 0);
        return new ImageGroupPayload(list);
    }

    public final List<AuraInline.Image> component1() {
        return this.images;
    }

    public final List<AuraInline.Image> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode();
    }

    public String toString() {
        List<AuraInline.Image> list = this.images;
        StringBuilder sb = new StringBuilder("ImageGroupPayload(images=");
        sb.append(list);
        return AnonymousClass001.A0v(")", sb);
    }
}
