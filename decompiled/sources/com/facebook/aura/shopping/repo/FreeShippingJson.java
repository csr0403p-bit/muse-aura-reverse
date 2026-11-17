package com.facebook.aura.shopping.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.ProductShippingReturns;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FreeShippingJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer max_days_to_arrival;
    public final Integer min_days_to_arrival;
    public final ShippingMoneyJson order_minimum;

    public final class Companion {
        public final C9hr<FreeShippingJson> serializer() {
            return FreeShippingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(FreeShippingJson freeShippingJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || freeShippingJson.order_minimum != null) {
            c9j5.AAP(freeShippingJson.order_minimum, ShippingMoneyJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || freeShippingJson.min_days_to_arrival != null) {
            c9j5.AAP(freeShippingJson.min_days_to_arrival, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || freeShippingJson.max_days_to_arrival != null) {
            c9j5.AAP(freeShippingJson.max_days_to_arrival, C07729ii.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FreeShippingJson) {
                FreeShippingJson freeShippingJson = (FreeShippingJson) obj;
                if (!C7384Etj.areEqual(this.order_minimum, freeShippingJson.order_minimum) || !C7384Etj.areEqual(this.min_days_to_arrival, freeShippingJson.min_days_to_arrival) || !C7384Etj.areEqual(this.max_days_to_arrival, freeShippingJson.max_days_to_arrival)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FreeShippingJson copy$default(FreeShippingJson freeShippingJson, ShippingMoneyJson shippingMoneyJson, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            shippingMoneyJson = freeShippingJson.order_minimum;
        }
        if ((i & 2) != 0) {
            num = freeShippingJson.min_days_to_arrival;
        }
        if ((i & 4) != 0) {
            num2 = freeShippingJson.max_days_to_arrival;
        }
        return new FreeShippingJson(shippingMoneyJson, num, num2);
    }

    public final ShippingMoneyJson component1() {
        return this.order_minimum;
    }

    public final Integer component2() {
        return this.min_days_to_arrival;
    }

    public final Integer component3() {
        return this.max_days_to_arrival;
    }

    public final FreeShippingJson copy(ShippingMoneyJson shippingMoneyJson, Integer num, Integer num2) {
        return new FreeShippingJson(shippingMoneyJson, num, num2);
    }

    public final Integer getMax_days_to_arrival() {
        return this.max_days_to_arrival;
    }

    public final Integer getMin_days_to_arrival() {
        return this.min_days_to_arrival;
    }

    public final ShippingMoneyJson getOrder_minimum() {
        return this.order_minimum;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.order_minimum) * 31) + AnonymousClass006.A0D(this.min_days_to_arrival)) * 31) + C3cH.A02(this.max_days_to_arrival);
    }

    public final ProductShippingReturns.FreeShipping toDomain() {
        ShippingMoneyJson shippingMoneyJson = this.order_minimum;
        return new ProductShippingReturns.FreeShipping(shippingMoneyJson != null ? shippingMoneyJson.toPdpPrice() : null, this.min_days_to_arrival, this.max_days_to_arrival);
    }

    public FreeShippingJson(ShippingMoneyJson shippingMoneyJson, Integer num, Integer num2) {
        this.order_minimum = shippingMoneyJson;
        this.min_days_to_arrival = num;
        this.max_days_to_arrival = num2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FreeShippingJson(int i, ShippingMoneyJson shippingMoneyJson, Integer num, Integer num2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.order_minimum = null;
        } else {
            this.order_minimum = shippingMoneyJson;
        }
        if ((i & 2) == 0) {
            this.min_days_to_arrival = null;
        } else {
            this.min_days_to_arrival = num;
        }
        if ((i & 4) == 0) {
            this.max_days_to_arrival = null;
        } else {
            this.max_days_to_arrival = num2;
        }
    }

    public /* synthetic */ FreeShippingJson(ShippingMoneyJson shippingMoneyJson, Integer num, Integer num2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : shippingMoneyJson, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }

    public FreeShippingJson() {
        this(null, null, null);
    }
}
