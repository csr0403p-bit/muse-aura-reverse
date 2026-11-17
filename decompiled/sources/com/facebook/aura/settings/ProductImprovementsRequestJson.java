package com.facebook.aura.settings;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ProductImprovementsRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean training_enabled;

    public final class Companion {
        public final C9hr<ProductImprovementsRequestJson> serializer() {
            return ProductImprovementsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductImprovementsRequestJson) && this.training_enabled == ((ProductImprovementsRequestJson) obj).training_enabled);
    }

    public /* synthetic */ ProductImprovementsRequestJson(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ProductImprovementsRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.training_enabled = z;
    }

    public static /* synthetic */ ProductImprovementsRequestJson copy$default(ProductImprovementsRequestJson productImprovementsRequestJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = productImprovementsRequestJson.training_enabled;
        }
        return new ProductImprovementsRequestJson(z);
    }

    public final boolean component1() {
        return this.training_enabled;
    }

    public final ProductImprovementsRequestJson copy(boolean z) {
        return new ProductImprovementsRequestJson(z);
    }

    public final boolean getTraining_enabled() {
        return this.training_enabled;
    }

    public int hashCode() {
        return this.training_enabled ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public ProductImprovementsRequestJson(boolean z) {
        this.training_enabled = z;
    }
}
