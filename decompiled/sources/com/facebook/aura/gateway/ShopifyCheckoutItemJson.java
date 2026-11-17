package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ShopifyCheckoutItemJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String currency;
    public final String id;
    public final String image_url;
    public final List<String> image_urls;
    public final String name;
    public final String product_url;
    public final String quantity;
    public final String total_amount;
    public final String unit_amount;
    public final List<String> variant_options;

    public final class Companion {
        public final C9hr<ShopifyCheckoutItemJson> serializer() {
            return ShopifyCheckoutItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, ShopifyCheckoutItemJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, ShopifyCheckoutItemJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShopifyCheckoutItemJson) {
                ShopifyCheckoutItemJson shopifyCheckoutItemJson = (ShopifyCheckoutItemJson) obj;
                if (!C7384Etj.areEqual(this.id, shopifyCheckoutItemJson.id) || !C7384Etj.areEqual(this.name, shopifyCheckoutItemJson.name) || !C7384Etj.areEqual(this.quantity, shopifyCheckoutItemJson.quantity) || !C7384Etj.areEqual(this.unit_amount, shopifyCheckoutItemJson.unit_amount) || !C7384Etj.areEqual(this.total_amount, shopifyCheckoutItemJson.total_amount) || !C7384Etj.areEqual(this.currency, shopifyCheckoutItemJson.currency) || !C7384Etj.areEqual(this.image_url, shopifyCheckoutItemJson.image_url) || !C7384Etj.areEqual(this.image_urls, shopifyCheckoutItemJson.image_urls) || !C7384Etj.areEqual(this.product_url, shopifyCheckoutItemJson.product_url) || !C7384Etj.areEqual(this.variant_options, shopifyCheckoutItemJson.variant_options)) {
                }
            }
            return false;
        }
        return true;
    }

    public ShopifyCheckoutItemJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, List<String> list2) {
        C7384Etj.A0Y(list2, 9);
        this.id = str;
        this.name = str2;
        this.quantity = str3;
        this.unit_amount = str4;
        this.total_amount = str5;
        this.currency = str6;
        this.image_url = str7;
        this.image_urls = list;
        this.product_url = str8;
        this.variant_options = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopifyCheckoutItemJson copy$default(ShopifyCheckoutItemJson shopifyCheckoutItemJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopifyCheckoutItemJson.id;
        }
        if ((i & 2) != 0) {
            str2 = shopifyCheckoutItemJson.name;
        }
        if ((i & 4) != 0) {
            str3 = shopifyCheckoutItemJson.quantity;
        }
        if ((i & 8) != 0) {
            str4 = shopifyCheckoutItemJson.unit_amount;
        }
        if ((i & 16) != 0) {
            str5 = shopifyCheckoutItemJson.total_amount;
        }
        if ((i & 32) != 0) {
            str6 = shopifyCheckoutItemJson.currency;
        }
        if ((i & 64) != 0) {
            str7 = shopifyCheckoutItemJson.image_url;
        }
        if ((i & 128) != 0) {
            list = shopifyCheckoutItemJson.image_urls;
        }
        if ((i & 256) != 0) {
            str8 = shopifyCheckoutItemJson.product_url;
        }
        if ((i & 512) != 0) {
            list2 = shopifyCheckoutItemJson.variant_options;
        }
        return shopifyCheckoutItemJson.copy(str, str2, str3, str4, str5, str6, str7, list, str8, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ShopifyCheckoutItemJson shopifyCheckoutItemJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || shopifyCheckoutItemJson.id != null) {
            c9j5.AAP(shopifyCheckoutItemJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || shopifyCheckoutItemJson.name != null) {
            c9j5.AAP(shopifyCheckoutItemJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shopifyCheckoutItemJson.quantity != null) {
            c9j5.AAP(shopifyCheckoutItemJson.quantity, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shopifyCheckoutItemJson.unit_amount != null) {
            c9j5.AAP(shopifyCheckoutItemJson.unit_amount, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shopifyCheckoutItemJson.total_amount != null) {
            c9j5.AAP(shopifyCheckoutItemJson.total_amount, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || shopifyCheckoutItemJson.currency != null) {
            c9j5.AAP(shopifyCheckoutItemJson.currency, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || shopifyCheckoutItemJson.image_url != null) {
            c9j5.AAP(shopifyCheckoutItemJson.image_url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || shopifyCheckoutItemJson.image_urls != null) {
            c9j5.AAP(shopifyCheckoutItemJson.image_urls, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || shopifyCheckoutItemJson.product_url != null) {
            c9j5.AAP(shopifyCheckoutItemJson.product_url, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(shopifyCheckoutItemJson.variant_options)) {
            c9j5.AAQ(shopifyCheckoutItemJson.variant_options, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final List<String> component10() {
        return this.variant_options;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.quantity;
    }

    public final String component4() {
        return this.unit_amount;
    }

    public final String component5() {
        return this.total_amount;
    }

    public final String component6() {
        return this.currency;
    }

    public final String component7() {
        return this.image_url;
    }

    public final List<String> component8() {
        return this.image_urls;
    }

    public final String component9() {
        return this.product_url;
    }

    public final ShopifyCheckoutItemJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, List<String> list2) {
        C7384Etj.A0Y(list2, 9);
        return new ShopifyCheckoutItemJson(str, str2, str3, str4, str5, str6, str7, list, str8, list2);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final List<String> getImage_urls() {
        return this.image_urls;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProduct_url() {
        return this.product_url;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getTotal_amount() {
        return this.total_amount;
    }

    public final String getUnit_amount() {
        return this.unit_amount;
    }

    public final List<String> getVariant_options() {
        return this.variant_options;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.variant_options, ((((((((((((((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.quantity)) * 31) + AnonymousClass006.A0G(this.unit_amount)) * 31) + AnonymousClass006.A0G(this.total_amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + AnonymousClass006.A0D(this.image_urls)) * 31) + AnonymousClass005.A0H(this.product_url)) * 31);
    }

    public final HatchAgentPermissionsRepository.ShopifyCheckoutItem toDomain() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.quantity;
        String str4 = this.unit_amount;
        String str5 = this.total_amount;
        String str6 = this.currency;
        String str7 = this.image_url;
        String str8 = null;
        if (str7 == null || C7BY.A0j(str7)) {
            List<String> list = this.image_urls;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!C7BY.A0j(next)) {
                        str8 = next;
                        break;
                    }
                }
                str8 = str8;
            }
        } else {
            str8 = str7;
        }
        return new HatchAgentPermissionsRepository.ShopifyCheckoutItem(str, str2, str3, str4, str5, str6, str8, this.product_url, this.variant_options);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShopifyCheckoutItemJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? C0881AGi.A00 : list2);
    }

    public /* synthetic */ ShopifyCheckoutItemJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.quantity = null;
        } else {
            this.quantity = str3;
        }
        if ((i & 8) == 0) {
            this.unit_amount = null;
        } else {
            this.unit_amount = str4;
        }
        if ((i & 16) == 0) {
            this.total_amount = null;
        } else {
            this.total_amount = str5;
        }
        if ((i & 32) == 0) {
            this.currency = null;
        } else {
            this.currency = str6;
        }
        if ((i & 64) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str7;
        }
        if ((i & 128) == 0) {
            this.image_urls = null;
        } else {
            this.image_urls = list;
        }
        if ((i & 256) == 0) {
            this.product_url = null;
        } else {
            this.product_url = str8;
        }
        if ((i & 512) == 0) {
            this.variant_options = C0881AGi.A00;
        } else {
            this.variant_options = list2;
        }
    }

    public ShopifyCheckoutItemJson() {
        this(null, null, null, null, null, null, null, null, null, C0881AGi.A00);
    }
}
