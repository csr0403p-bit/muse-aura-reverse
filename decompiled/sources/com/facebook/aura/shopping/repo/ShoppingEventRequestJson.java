package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingEventRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String citation_id;
    public final String client_interaction_id;
    public final ShoppingDisplayedCartJson displayed_cart;
    public final String message_id;
    public final String product_id;
    public final String product_url;
    public final String session_id;
    public final String type;
    public final String widget_id;

    public final class Companion {
        public final C9hr<ShoppingEventRequestJson> serializer() {
            return ShoppingEventRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ShoppingEventRequestJson shoppingEventRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingEventRequestJson.type, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingEventRequestJson.product_id != null) {
            c9j5.AAP(shoppingEventRequestJson.product_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shoppingEventRequestJson.product_url != null) {
            c9j5.AAP(shoppingEventRequestJson.product_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shoppingEventRequestJson.session_id != null) {
            c9j5.AAP(shoppingEventRequestJson.session_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shoppingEventRequestJson.widget_id != null) {
            c9j5.AAP(shoppingEventRequestJson.widget_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || shoppingEventRequestJson.message_id != null) {
            c9j5.AAP(shoppingEventRequestJson.message_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || shoppingEventRequestJson.citation_id != null) {
            c9j5.AAP(shoppingEventRequestJson.citation_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || shoppingEventRequestJson.displayed_cart != null) {
            c9j5.AAP(shoppingEventRequestJson.displayed_cart, ShoppingDisplayedCartJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || shoppingEventRequestJson.client_interaction_id != null) {
            c9j5.AAP(shoppingEventRequestJson.client_interaction_id, C07779iq.A01, c9iZ, 8);
        }
    }

    public final ShoppingEventRequestJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, ShoppingDisplayedCartJson shoppingDisplayedCartJson, String str8) {
        C7384Etj.A0Y(str, 0);
        return new ShoppingEventRequestJson(str, str2, str3, str4, str5, str6, str7, shoppingDisplayedCartJson, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingEventRequestJson) {
                ShoppingEventRequestJson shoppingEventRequestJson = (ShoppingEventRequestJson) obj;
                if (!C7384Etj.areEqual(this.type, shoppingEventRequestJson.type) || !C7384Etj.areEqual(this.product_id, shoppingEventRequestJson.product_id) || !C7384Etj.areEqual(this.product_url, shoppingEventRequestJson.product_url) || !C7384Etj.areEqual(this.session_id, shoppingEventRequestJson.session_id) || !C7384Etj.areEqual(this.widget_id, shoppingEventRequestJson.widget_id) || !C7384Etj.areEqual(this.message_id, shoppingEventRequestJson.message_id) || !C7384Etj.areEqual(this.citation_id, shoppingEventRequestJson.citation_id) || !C7384Etj.areEqual(this.displayed_cart, shoppingEventRequestJson.displayed_cart) || !C7384Etj.areEqual(this.client_interaction_id, shoppingEventRequestJson.client_interaction_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShoppingEventRequestJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, ShoppingDisplayedCartJson shoppingDisplayedCartJson, String str8, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShoppingEventRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.product_id = null;
        } else {
            this.product_id = str2;
        }
        if ((i & 4) == 0) {
            this.product_url = null;
        } else {
            this.product_url = str3;
        }
        if ((i & 8) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str4;
        }
        if ((i & 16) == 0) {
            this.widget_id = null;
        } else {
            this.widget_id = str5;
        }
        if ((i & 32) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str6;
        }
        if ((i & 64) == 0) {
            this.citation_id = null;
        } else {
            this.citation_id = str7;
        }
        if ((i & 128) == 0) {
            this.displayed_cart = null;
        } else {
            this.displayed_cart = shoppingDisplayedCartJson;
        }
        if ((i & 256) == 0) {
            this.client_interaction_id = null;
        } else {
            this.client_interaction_id = str8;
        }
    }

    public static /* synthetic */ ShoppingEventRequestJson copy$default(ShoppingEventRequestJson shoppingEventRequestJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, ShoppingDisplayedCartJson shoppingDisplayedCartJson, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingEventRequestJson.type;
        }
        if ((i & 2) != 0) {
            str2 = shoppingEventRequestJson.product_id;
        }
        if ((i & 4) != 0) {
            str3 = shoppingEventRequestJson.product_url;
        }
        if ((i & 8) != 0) {
            str4 = shoppingEventRequestJson.session_id;
        }
        if ((i & 16) != 0) {
            str5 = shoppingEventRequestJson.widget_id;
        }
        if ((i & 32) != 0) {
            str6 = shoppingEventRequestJson.message_id;
        }
        if ((i & 64) != 0) {
            str7 = shoppingEventRequestJson.citation_id;
        }
        if ((i & 128) != 0) {
            shoppingDisplayedCartJson = shoppingEventRequestJson.displayed_cart;
        }
        if ((i & 256) != 0) {
            str8 = shoppingEventRequestJson.client_interaction_id;
        }
        return shoppingEventRequestJson.copy(str, str2, str3, str4, str5, str6, str7, shoppingDisplayedCartJson, str8);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.product_id;
    }

    public final String component3() {
        return this.product_url;
    }

    public final String component4() {
        return this.session_id;
    }

    public final String component5() {
        return this.widget_id;
    }

    public final String component6() {
        return this.message_id;
    }

    public final String component7() {
        return this.citation_id;
    }

    public final ShoppingDisplayedCartJson component8() {
        return this.displayed_cart;
    }

    public final String component9() {
        return this.client_interaction_id;
    }

    public final String getCitation_id() {
        return this.citation_id;
    }

    public final String getClient_interaction_id() {
        return this.client_interaction_id;
    }

    public final ShoppingDisplayedCartJson getDisplayed_cart() {
        return this.displayed_cart;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getProduct_url() {
        return this.product_url;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWidget_id() {
        return this.widget_id;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.product_id)) * 31) + AnonymousClass006.A0G(this.product_url)) * 31) + AnonymousClass006.A0G(this.session_id)) * 31) + AnonymousClass006.A0G(this.widget_id)) * 31) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass006.A0G(this.citation_id)) * 31) + AnonymousClass006.A0D(this.displayed_cart)) * 31) + AnonymousClass005.A0H(this.client_interaction_id);
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingEventRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, ShoppingDisplayedCartJson shoppingDisplayedCartJson, String str8) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.product_id = str2;
        this.product_url = str3;
        this.session_id = str4;
        this.widget_id = str5;
        this.message_id = str6;
        this.citation_id = str7;
        this.displayed_cart = shoppingDisplayedCartJson;
        this.client_interaction_id = str8;
    }

    public /* synthetic */ ShoppingEventRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, ShoppingDisplayedCartJson shoppingDisplayedCartJson, String str8, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : shoppingDisplayedCartJson, (i & 256) != 0 ? null : str8);
    }
}
