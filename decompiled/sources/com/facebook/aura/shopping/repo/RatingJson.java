package com.facebook.aura.shopping.repo;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class RatingJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int count;
    public final double value;

    public final class Companion {
        public final C9hr<RatingJson> serializer() {
            return RatingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(RatingJson ratingJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || Double.compare(ratingJson.value, 0.0d) != 0) {
            c9j5.AAD(c9iZ, ratingJson.value, 0);
        }
        if (zAfR || ratingJson.count != 0) {
            c9j5.AAK(c9iZ, 1, ratingJson.count);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RatingJson) {
                RatingJson ratingJson = (RatingJson) obj;
                if (Double.compare(this.value, ratingJson.value) != 0 || this.count != ratingJson.count) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RatingJson copy$default(RatingJson ratingJson, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = ratingJson.value;
        }
        if ((i2 & 2) != 0) {
            i = ratingJson.count;
        }
        return new RatingJson(d, i);
    }

    public final double component1() {
        return this.value;
    }

    public final int component2() {
        return this.count;
    }

    public final RatingJson copy(double d, int i) {
        return new RatingJson(d, i);
    }

    public final int getCount() {
        return this.count;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (AnonymousClass002.A0A(Double.doubleToLongBits(this.value)) * 31) + this.count;
    }

    public RatingJson(double d, int i) {
        this.value = d;
        this.count = i;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RatingJson(int i, double d, int i2, C2hx c2hx) {
        this.value = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.count = 0;
        } else {
            this.count = i2;
        }
    }

    public /* synthetic */ RatingJson(double d, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 0.0d : d, C3cG.A01(i2, i));
    }

    public RatingJson() {
        this(0.0d, 0);
    }
}
