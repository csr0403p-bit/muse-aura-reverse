package com.facebook.aura.shopping.model;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpRating extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int reviewCount;
    public final double value;

    public final class Companion {
        public final C9hr<PdpRating> serializer() {
            return PdpRating$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpRating pdpRating, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAD(c9iZ, pdpRating.value, 0);
        c9j5.AAK(c9iZ, 1, pdpRating.reviewCount);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpRating) {
                PdpRating pdpRating = (PdpRating) obj;
                if (Double.compare(this.value, pdpRating.value) != 0 || this.reviewCount != pdpRating.reviewCount) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpRating copy$default(PdpRating pdpRating, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = pdpRating.value;
        }
        if ((i2 & 2) != 0) {
            i = pdpRating.reviewCount;
        }
        return new PdpRating(d, i);
    }

    public final double component1() {
        return this.value;
    }

    public final int component2() {
        return this.reviewCount;
    }

    public final PdpRating copy(double d, int i) {
        return new PdpRating(d, i);
    }

    public final int getReviewCount() {
        return this.reviewCount;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (AnonymousClass002.A0A(Double.doubleToLongBits(this.value)) * 31) + this.reviewCount;
    }

    public PdpRating(double d, int i) {
        this.value = d;
        this.reviewCount = i;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpRating(int i, double d, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PdpRating$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.value = d;
        this.reviewCount = i2;
    }
}
