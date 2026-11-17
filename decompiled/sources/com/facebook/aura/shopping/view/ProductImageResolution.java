package com.facebook.aura.shopping.view;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ProductImageResolution extends C06G {
    public static final int $stable = 0;
    public final AHD<String> imageUrls;
    public final boolean needsPreviewLookup;
    public final boolean reservesHero;

    public ProductImageResolution(AHD<String> ahd, boolean z, boolean z2) {
        C7384Etj.A0Y(ahd, 0);
        this.imageUrls = ahd;
        this.reservesHero = z;
        this.needsPreviewLookup = z2;
    }

    public final ProductImageResolution copy(AHD<String> ahd, boolean z, boolean z2) {
        C7384Etj.A0Y(ahd, 0);
        return new ProductImageResolution(ahd, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductImageResolution) {
                ProductImageResolution productImageResolution = (ProductImageResolution) obj;
                if (!C7384Etj.areEqual(this.imageUrls, productImageResolution.imageUrls) || this.reservesHero != productImageResolution.reservesHero || this.needsPreviewLookup != productImageResolution.needsPreviewLookup) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductImageResolution copy$default(ProductImageResolution productImageResolution, AHD ahd, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = productImageResolution.imageUrls;
        }
        if ((i & 2) != 0) {
            z = productImageResolution.reservesHero;
        }
        if ((i & 4) != 0) {
            z2 = productImageResolution.needsPreviewLookup;
        }
        return productImageResolution.copy(ahd, z, z2);
    }

    public final AHD<String> component1() {
        return this.imageUrls;
    }

    public final boolean component2() {
        return this.reservesHero;
    }

    public final boolean component3() {
        return this.needsPreviewLookup;
    }

    public final AHD<String> getImageUrls() {
        return this.imageUrls;
    }

    public final boolean getNeedsPreviewLookup() {
        return this.needsPreviewLookup;
    }

    public final boolean getReservesHero() {
        return this.reservesHero;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.imageUrls), this.reservesHero), this.needsPreviewLookup);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ProductImageResolution(AHD ahd, boolean z, boolean z2, int i, C06H c06h) {
        this(ahd, z, AnonymousClass005.A1O(i, z2));
    }
}
