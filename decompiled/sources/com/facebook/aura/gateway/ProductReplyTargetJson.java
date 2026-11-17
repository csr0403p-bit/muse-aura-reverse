package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.ReplyAttribution;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ProductReplyTargetJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement index;
    public final String name;
    public final String presentationEventId;
    public final String presentation_event_id;
    public final ProductReplyTargetJson product;
    public final String productId;
    public final String product_id;
    public final String type;
    public final String url;

    public final class Companion {
        public final C9hr<ProductReplyTargetJson> serializer() {
            return ProductReplyTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ProductReplyTargetJson copy$default(ProductReplyTargetJson productReplyTargetJson, String str, ProductReplyTargetJson productReplyTargetJson2, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, int i, Object obj) {
        String str8 = str;
        ProductReplyTargetJson productReplyTargetJson3 = productReplyTargetJson2;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        JsonElement jsonElement2 = jsonElement;
        if ((i & 1) != 0) {
            str8 = productReplyTargetJson.type;
        }
        if ((i & 2) != 0) {
            productReplyTargetJson3 = productReplyTargetJson.product;
        }
        if ((i & 4) != 0) {
            str9 = productReplyTargetJson.presentation_event_id;
        }
        if ((i & 8) != 0) {
            str10 = productReplyTargetJson.presentationEventId;
        }
        if ((i & 16) != 0) {
            str11 = productReplyTargetJson.product_id;
        }
        if ((i & 32) != 0) {
            str12 = productReplyTargetJson.productId;
        }
        if ((i & 64) != 0) {
            str13 = productReplyTargetJson.url;
        }
        if ((i & 128) != 0) {
            str14 = productReplyTargetJson.name;
        }
        if ((i & 256) != 0) {
            jsonElement2 = productReplyTargetJson.index;
        }
        return new ProductReplyTargetJson(str8, productReplyTargetJson3, str9, str10, str11, str12, str13, str14, jsonElement2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ProductReplyTargetJson productReplyTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || productReplyTargetJson.type != null) {
            c9j5.AAP(productReplyTargetJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || productReplyTargetJson.product != null) {
            c9j5.AAP(productReplyTargetJson.product, ProductReplyTargetJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || productReplyTargetJson.presentation_event_id != null) {
            c9j5.AAP(productReplyTargetJson.presentation_event_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || productReplyTargetJson.presentationEventId != null) {
            c9j5.AAP(productReplyTargetJson.presentationEventId, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || productReplyTargetJson.product_id != null) {
            c9j5.AAP(productReplyTargetJson.product_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || productReplyTargetJson.productId != null) {
            c9j5.AAP(productReplyTargetJson.productId, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || productReplyTargetJson.url != null) {
            c9j5.AAP(productReplyTargetJson.url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || productReplyTargetJson.name != null) {
            c9j5.AAP(productReplyTargetJson.name, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || productReplyTargetJson.index != null) {
            c9j5.AAP(productReplyTargetJson.index, JsonElementSerializer.A00, c9iZ, 8);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductReplyTargetJson) {
                ProductReplyTargetJson productReplyTargetJson = (ProductReplyTargetJson) obj;
                if (!C7384Etj.areEqual(this.type, productReplyTargetJson.type) || !C7384Etj.areEqual(this.product, productReplyTargetJson.product) || !C7384Etj.areEqual(this.presentation_event_id, productReplyTargetJson.presentation_event_id) || !C7384Etj.areEqual(this.presentationEventId, productReplyTargetJson.presentationEventId) || !C7384Etj.areEqual(this.product_id, productReplyTargetJson.product_id) || !C7384Etj.areEqual(this.productId, productReplyTargetJson.productId) || !C7384Etj.areEqual(this.url, productReplyTargetJson.url) || !C7384Etj.areEqual(this.name, productReplyTargetJson.name) || !C7384Etj.areEqual(this.index, productReplyTargetJson.index)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.type;
    }

    public final ProductReplyTargetJson component2() {
        return this.product;
    }

    public final String component3() {
        return this.presentation_event_id;
    }

    public final String component4() {
        return this.presentationEventId;
    }

    public final String component5() {
        return this.product_id;
    }

    public final String component6() {
        return this.productId;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.name;
    }

    public final JsonElement component9() {
        return this.index;
    }

    public final ProductReplyTargetJson copy(String str, ProductReplyTargetJson productReplyTargetJson, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement) {
        return new ProductReplyTargetJson(str, productReplyTargetJson, str2, str3, str4, str5, str6, str7, jsonElement);
    }

    public final JsonElement getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPresentationEventId() {
        return this.presentationEventId;
    }

    public final String getPresentation_event_id() {
        return this.presentation_event_id;
    }

    public final ProductReplyTargetJson getProduct() {
        return this.product;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((((((AnonymousClass006.A0G(this.type) * 31) + AnonymousClass006.A0D(this.product)) * 31) + AnonymousClass006.A0G(this.presentation_event_id)) * 31) + AnonymousClass006.A0G(this.presentationEventId)) * 31) + AnonymousClass006.A0G(this.product_id)) * 31) + AnonymousClass006.A0G(this.productId)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + C3cH.A02(this.index);
    }

    public final ReplyAttribution.Product toAttribution() {
        Integer num;
        String str = this.presentation_event_id;
        if ((str == null || C7BY.A0j(str)) && ((str = this.presentationEventId) == null || C7BY.A0j(str))) {
            str = null;
        }
        String str2 = this.product_id;
        if ((str2 == null || C7BY.A0j(str2)) && ((str2 = this.productId) == null || C7BY.A0j(str2))) {
            str2 = null;
        }
        String str3 = this.url;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        if (str == null && str2 == null && str3 == null) {
            return null;
        }
        JsonElement jsonElement = this.index;
        if (jsonElement != null) {
            try {
                num = (Integer) HatchJsonKt.HatchJson.A01(C07729ii.A00, jsonElement);
            } catch (SerializationException unused) {
                num = null;
            }
        } else {
            num = null;
        }
        String str4 = this.name;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        return new ReplyAttribution.Product(str, str2, str3, str4, num);
    }

    public ProductReplyTargetJson(String str, ProductReplyTargetJson productReplyTargetJson, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement) {
        this.type = str;
        this.product = productReplyTargetJson;
        this.presentation_event_id = str2;
        this.presentationEventId = str3;
        this.product_id = str4;
        this.productId = str5;
        this.url = str6;
        this.name = str7;
        this.index = jsonElement;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ProductReplyTargetJson(String str, ProductReplyTargetJson productReplyTargetJson, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : productReplyTargetJson, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : jsonElement);
    }

    public /* synthetic */ ProductReplyTargetJson(int i, String str, ProductReplyTargetJson productReplyTargetJson, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.product = null;
        } else {
            this.product = productReplyTargetJson;
        }
        if ((i & 4) == 0) {
            this.presentation_event_id = null;
        } else {
            this.presentation_event_id = str2;
        }
        if ((i & 8) == 0) {
            this.presentationEventId = null;
        } else {
            this.presentationEventId = str3;
        }
        if ((i & 16) == 0) {
            this.product_id = null;
        } else {
            this.product_id = str4;
        }
        if ((i & 32) == 0) {
            this.productId = null;
        } else {
            this.productId = str5;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str6;
        }
        if ((i & 128) == 0) {
            this.name = null;
        } else {
            this.name = str7;
        }
        if ((i & 256) == 0) {
            this.index = null;
        } else {
            this.index = jsonElement;
        }
    }

    public ProductReplyTargetJson() {
        this(null, null, null, null, null, null, null, null, null);
    }
}
