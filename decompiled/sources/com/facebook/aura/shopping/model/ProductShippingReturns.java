package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.C9iZ;
import X.C9j5;
import X.Ey9;
import X.F0C;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ProductShippingReturns extends C06G {
    public final Integer fastestShippingDays;
    public final Boolean freeReturns;
    public final FreeShipping freeShipping;
    public final List<FulfillmentMethod> fulfillmentMethods;
    public final String membershipFreeShipping;
    public final Boolean notReturnable;
    public final String returnPolicyText;
    public final Integer returnWindowDays;
    public static final Companion Companion = new Companion();
    public static final int $stable = PdpPrice.$stable;
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, ProductShippingReturns$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<ProductShippingReturns> serializer() {
            return ProductShippingReturns$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Serializable
    public final class FreeShipping extends C06G {
        public final Integer maxDaysToArrival;
        public final Integer minDaysToArrival;
        public final PdpPrice orderMinimum;
        public static final Companion Companion = new Companion();
        public static final int $stable = PdpPrice.$stable;

        public final class Companion {
            public final C9hr<FreeShipping> serializer() {
                return ProductShippingReturns$FreeShipping$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(FreeShipping freeShipping, C9j5 c9j5, C9iZ c9iZ) {
            boolean zAfR = c9j5.AfR();
            if (zAfR || freeShipping.orderMinimum != null) {
                c9j5.AAP(freeShipping.orderMinimum, PdpPrice$$serializer.INSTANCE, c9iZ, 0);
            }
            if (zAfR || freeShipping.minDaysToArrival != null) {
                c9j5.AAP(freeShipping.minDaysToArrival, C07729ii.A00, c9iZ, 1);
            }
            if (zAfR || freeShipping.maxDaysToArrival != null) {
                c9j5.AAP(freeShipping.maxDaysToArrival, C07729ii.A00, c9iZ, 2);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FreeShipping) {
                    FreeShipping freeShipping = (FreeShipping) obj;
                    if (!C7384Etj.areEqual(this.orderMinimum, freeShipping.orderMinimum) || !C7384Etj.areEqual(this.minDaysToArrival, freeShipping.minDaysToArrival) || !C7384Etj.areEqual(this.maxDaysToArrival, freeShipping.maxDaysToArrival)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FreeShipping copy$default(FreeShipping freeShipping, PdpPrice pdpPrice, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                pdpPrice = freeShipping.orderMinimum;
            }
            if ((i & 2) != 0) {
                num = freeShipping.minDaysToArrival;
            }
            if ((i & 4) != 0) {
                num2 = freeShipping.maxDaysToArrival;
            }
            return new FreeShipping(pdpPrice, num, num2);
        }

        public final PdpPrice component1() {
            return this.orderMinimum;
        }

        public final Integer component2() {
            return this.minDaysToArrival;
        }

        public final Integer component3() {
            return this.maxDaysToArrival;
        }

        public final FreeShipping copy(PdpPrice pdpPrice, Integer num, Integer num2) {
            return new FreeShipping(pdpPrice, num, num2);
        }

        public final Integer getMaxDaysToArrival() {
            return this.maxDaysToArrival;
        }

        public final Integer getMinDaysToArrival() {
            return this.minDaysToArrival;
        }

        public final PdpPrice getOrderMinimum() {
            return this.orderMinimum;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0D(this.orderMinimum) * 31) + AnonymousClass006.A0D(this.minDaysToArrival)) * 31) + C3cH.A02(this.maxDaysToArrival);
        }

        public FreeShipping(PdpPrice pdpPrice, Integer num, Integer num2) {
            this.orderMinimum = pdpPrice;
            this.minDaysToArrival = num;
            this.maxDaysToArrival = num2;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ FreeShipping(int i, PdpPrice pdpPrice, Integer num, Integer num2, C2hx c2hx) {
            if ((i & 1) == 0) {
                this.orderMinimum = null;
            } else {
                this.orderMinimum = pdpPrice;
            }
            if ((i & 2) == 0) {
                this.minDaysToArrival = null;
            } else {
                this.minDaysToArrival = num;
            }
            if ((i & 4) == 0) {
                this.maxDaysToArrival = null;
            } else {
                this.maxDaysToArrival = num2;
            }
        }

        public /* synthetic */ FreeShipping(PdpPrice pdpPrice, Integer num, Integer num2, int i, C06H c06h) {
            this((i & 1) != 0 ? null : pdpPrice, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
        }

        public FreeShipping() {
            this(null, null, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public final class FulfillmentMethod {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FulfillmentMethod[] $VALUES;
        public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final FulfillmentMethod DELIVERY;
        public static final FulfillmentMethod SHIPPING;

        public final class Companion {

            /* renamed from: com.facebook.aura.shopping.model.ProductShippingReturns$FulfillmentMethod$Companion$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final C9hr<Object> invoke() {
                    return C9iL.A01("com.facebook.aura.shopping.model.ProductShippingReturns.FulfillmentMethod", FulfillmentMethod.values());
                }
            }

            private final /* synthetic */ C9hr get$cachedSerializer() {
                return AnonymousClass001.A12(FulfillmentMethod.$cachedSerializer$delegate);
            }

            public final C9hr<FulfillmentMethod> serializer() {
                return AnonymousClass001.A12(FulfillmentMethod.$cachedSerializer$delegate);
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        static {
            FulfillmentMethod fulfillmentMethod = new FulfillmentMethod("SHIPPING", 0);
            SHIPPING = fulfillmentMethod;
            FulfillmentMethod fulfillmentMethod2 = new FulfillmentMethod("DELIVERY", 1);
            DELIVERY = fulfillmentMethod2;
            FulfillmentMethod[] fulfillmentMethodArr = {fulfillmentMethod, fulfillmentMethod2};
            $VALUES = fulfillmentMethodArr;
            $ENTRIES = C3cG.A0w(fulfillmentMethodArr);
            Companion = new Companion();
            $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
        }

        public static Ey9<FulfillmentMethod> getEntries() {
            return $ENTRIES;
        }

        public static FulfillmentMethod valueOf(String str) {
            return (FulfillmentMethod) Enum.valueOf(FulfillmentMethod.class, str);
        }

        public static FulfillmentMethod[] values() {
            return (FulfillmentMethod[]) $VALUES.clone();
        }

        public FulfillmentMethod(String str, int i) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductShippingReturns(FreeShipping freeShipping, Integer num, Boolean bool, Integer num2, List<? extends FulfillmentMethod> list, String str, String str2, Boolean bool2) {
        C7384Etj.A0Y(list, 4);
        this.freeShipping = freeShipping;
        this.fastestShippingDays = num;
        this.freeReturns = bool;
        this.returnWindowDays = num2;
        this.fulfillmentMethods = list;
        this.membershipFreeShipping = str;
        this.returnPolicyText = str2;
        this.notReturnable = bool2;
    }

    public final ProductShippingReturns copy(FreeShipping freeShipping, Integer num, Boolean bool, Integer num2, List<? extends FulfillmentMethod> list, String str, String str2, Boolean bool2) {
        C7384Etj.A0Y(list, 4);
        return new ProductShippingReturns(freeShipping, num, bool, num2, list, str, str2, bool2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductShippingReturns) {
                ProductShippingReturns productShippingReturns = (ProductShippingReturns) obj;
                if (!C7384Etj.areEqual(this.freeShipping, productShippingReturns.freeShipping) || !C7384Etj.areEqual(this.fastestShippingDays, productShippingReturns.fastestShippingDays) || !C7384Etj.areEqual(this.freeReturns, productShippingReturns.freeReturns) || !C7384Etj.areEqual(this.returnWindowDays, productShippingReturns.returnWindowDays) || !C7384Etj.areEqual(this.fulfillmentMethods, productShippingReturns.fulfillmentMethods) || !C7384Etj.areEqual(this.membershipFreeShipping, productShippingReturns.membershipFreeShipping) || !C7384Etj.areEqual(this.returnPolicyText, productShippingReturns.returnPolicyText) || !C7384Etj.areEqual(this.notReturnable, productShippingReturns.notReturnable)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductShippingReturns copy$default(ProductShippingReturns productShippingReturns, FreeShipping freeShipping, Integer num, Boolean bool, Integer num2, List list, String str, String str2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            freeShipping = productShippingReturns.freeShipping;
        }
        if ((i & 2) != 0) {
            num = productShippingReturns.fastestShippingDays;
        }
        if ((i & 4) != 0) {
            bool = productShippingReturns.freeReturns;
        }
        if ((i & 8) != 0) {
            num2 = productShippingReturns.returnWindowDays;
        }
        if ((i & 16) != 0) {
            list = productShippingReturns.fulfillmentMethods;
        }
        if ((i & 32) != 0) {
            str = productShippingReturns.membershipFreeShipping;
        }
        if ((i & 64) != 0) {
            str2 = productShippingReturns.returnPolicyText;
        }
        if ((i & 128) != 0) {
            bool2 = productShippingReturns.notReturnable;
        }
        return productShippingReturns.copy(freeShipping, num, bool, num2, list, str, str2, bool2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ProductShippingReturns productShippingReturns, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || productShippingReturns.freeShipping != null) {
            c9j5.AAP(productShippingReturns.freeShipping, ProductShippingReturns$FreeShipping$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || productShippingReturns.fastestShippingDays != null) {
            c9j5.AAP(productShippingReturns.fastestShippingDays, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || productShippingReturns.freeReturns != null) {
            c9j5.AAP(productShippingReturns.freeReturns, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || productShippingReturns.returnWindowDays != null) {
            c9j5.AAP(productShippingReturns.returnWindowDays, C07729ii.A00, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(productShippingReturns.fulfillmentMethods)) {
            c9j5.AAQ(productShippingReturns.fulfillmentMethods, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || productShippingReturns.membershipFreeShipping != null) {
            c9j5.AAP(productShippingReturns.membershipFreeShipping, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || productShippingReturns.returnPolicyText != null) {
            c9j5.AAP(productShippingReturns.returnPolicyText, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || productShippingReturns.notReturnable != null) {
            c9j5.AAP(productShippingReturns.notReturnable, C07839ix.A00, c9iZ, 7);
        }
    }

    public final FreeShipping component1() {
        return this.freeShipping;
    }

    public final Integer component2() {
        return this.fastestShippingDays;
    }

    public final Boolean component3() {
        return this.freeReturns;
    }

    public final Integer component4() {
        return this.returnWindowDays;
    }

    public final List<FulfillmentMethod> component5() {
        return this.fulfillmentMethods;
    }

    public final String component6() {
        return this.membershipFreeShipping;
    }

    public final String component7() {
        return this.returnPolicyText;
    }

    public final Boolean component8() {
        return this.notReturnable;
    }

    public final Integer getFastestShippingDays() {
        return this.fastestShippingDays;
    }

    public final Boolean getFreeReturns() {
        return this.freeReturns;
    }

    public final FreeShipping getFreeShipping() {
        return this.freeShipping;
    }

    public final List<FulfillmentMethod> getFulfillmentMethods() {
        return this.fulfillmentMethods;
    }

    public final String getMembershipFreeShipping() {
        return this.membershipFreeShipping;
    }

    public final Boolean getNotReturnable() {
        return this.notReturnable;
    }

    public final String getReturnPolicyText() {
        return this.returnPolicyText;
    }

    public final Integer getReturnWindowDays() {
        return this.returnWindowDays;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.fulfillmentMethods, ((((((AnonymousClass006.A0D(this.freeShipping) * 31) + AnonymousClass006.A0D(this.fastestShippingDays)) * 31) + AnonymousClass006.A0D(this.freeReturns)) * 31) + AnonymousClass006.A0D(this.returnWindowDays)) * 31) + AnonymousClass006.A0G(this.membershipFreeShipping)) * 31) + AnonymousClass006.A0G(this.returnPolicyText)) * 31) + C3cH.A02(this.notReturnable);
    }

    public final boolean isEmpty() {
        return this.freeShipping == null && this.fastestShippingDays == null && this.freeReturns == null && this.returnWindowDays == null && this.fulfillmentMethods.isEmpty() && this.membershipFreeShipping == null && this.returnPolicyText == null && this.notReturnable == null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ProductShippingReturns(FreeShipping freeShipping, Integer num, Boolean bool, Integer num2, List list, String str, String str2, Boolean bool2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : freeShipping, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : bool2);
    }

    public /* synthetic */ ProductShippingReturns(int i, FreeShipping freeShipping, Integer num, Boolean bool, Integer num2, List list, String str, String str2, Boolean bool2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.freeShipping = null;
        } else {
            this.freeShipping = freeShipping;
        }
        if ((i & 2) == 0) {
            this.fastestShippingDays = null;
        } else {
            this.fastestShippingDays = num;
        }
        if ((i & 4) == 0) {
            this.freeReturns = null;
        } else {
            this.freeReturns = bool;
        }
        if ((i & 8) == 0) {
            this.returnWindowDays = null;
        } else {
            this.returnWindowDays = num2;
        }
        if ((i & 16) == 0) {
            this.fulfillmentMethods = C0881AGi.A00;
        } else {
            this.fulfillmentMethods = list;
        }
        if ((i & 32) == 0) {
            this.membershipFreeShipping = null;
        } else {
            this.membershipFreeShipping = str;
        }
        if ((i & 64) == 0) {
            this.returnPolicyText = null;
        } else {
            this.returnPolicyText = str2;
        }
        if ((i & 128) == 0) {
            this.notReturnable = null;
        } else {
            this.notReturnable = bool2;
        }
    }

    public ProductShippingReturns() {
        this(null, null, null, null, C0881AGi.A00, null, null, null);
    }
}
