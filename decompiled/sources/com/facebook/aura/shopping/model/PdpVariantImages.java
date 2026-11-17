package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpVariantImages extends C06G {
    public static final int $stable = 8;
    public final List<PdpImage> images;
    public final String productId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, PdpVariantImages$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PdpVariantImages> serializer() {
            return PdpVariantImages$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpVariantImages) {
                PdpVariantImages pdpVariantImages = (PdpVariantImages) obj;
                if (!C7384Etj.areEqual(this.productId, pdpVariantImages.productId) || !C7384Etj.areEqual(this.images, pdpVariantImages.images)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpVariantImages copy$default(PdpVariantImages pdpVariantImages, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpVariantImages.productId;
        }
        if ((i & 2) != 0) {
            list = pdpVariantImages.images;
        }
        AnonymousClass003.A0u(str, list);
        return new PdpVariantImages(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpVariantImages pdpVariantImages, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(pdpVariantImages.productId, c9iZ, 0);
        c9j5.AAQ(pdpVariantImages.images, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final String component1() {
        return this.productId;
    }

    public final List<PdpImage> component2() {
        return this.images;
    }

    public final List<PdpImage> getImages() {
        return this.images;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.images, AnonymousClass001.A0G(this.productId));
    }

    public PdpVariantImages(String str, List<PdpImage> list) {
        AnonymousClass003.A0u(str, list);
        this.productId = str;
        this.images = list;
    }

    public final PdpVariantImages copy(String str, List<PdpImage> list) {
        AnonymousClass003.A0u(str, list);
        return new PdpVariantImages(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpVariantImages(int i, String str, List list, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PdpVariantImages$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.productId = str;
        this.images = list;
    }
}
