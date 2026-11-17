package com.facebook.aura.shopping.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ProductImageRecovery extends C06G {
    public static final int $stable = 0;
    public final G0U<String, Unit> onLoadFailed;
    public final ProductImageResolution resolution;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductImageRecovery) {
                ProductImageRecovery productImageRecovery = (ProductImageRecovery) obj;
                if (!C7384Etj.areEqual(this.resolution, productImageRecovery.resolution) || !C7384Etj.areEqual(this.onLoadFailed, productImageRecovery.onLoadFailed)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProductImageRecovery copy$default(ProductImageRecovery productImageRecovery, ProductImageResolution productImageResolution, G0U g0u, int i, Object obj) {
        if ((i & 1) != 0) {
            productImageResolution = productImageRecovery.resolution;
        }
        if ((i & 2) != 0) {
            g0u = productImageRecovery.onLoadFailed;
        }
        AnonymousClass003.A0u(productImageResolution, g0u);
        return new ProductImageRecovery(productImageResolution, g0u);
    }

    public final ProductImageResolution component1() {
        return this.resolution;
    }

    public final G0U<String, Unit> component2() {
        return this.onLoadFailed;
    }

    public final G0U<String, Unit> getOnLoadFailed() {
        return this.onLoadFailed;
    }

    public final ProductImageResolution getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.onLoadFailed, AnonymousClass005.A0E(this.resolution));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductImageRecovery(ProductImageResolution productImageResolution, G0U<? super String, Unit> g0u) {
        AnonymousClass003.A0u(productImageResolution, g0u);
        this.resolution = productImageResolution;
        this.onLoadFailed = g0u;
    }

    public final ProductImageRecovery copy(ProductImageResolution productImageResolution, G0U<? super String, Unit> g0u) {
        AnonymousClass003.A0u(productImageResolution, g0u);
        return new ProductImageRecovery(productImageResolution, g0u);
    }

    public String toString() {
        return super.toString();
    }
}
