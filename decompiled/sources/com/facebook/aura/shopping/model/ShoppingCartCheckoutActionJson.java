package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingCartCheckoutActionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String type;

    public final class Companion {
        public final C9hr<ShoppingCartCheckoutActionJson> serializer() {
            return ShoppingCartCheckoutActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingCartCheckoutActionJson.type)) {
            c9j5.AAV(shoppingCartCheckoutActionJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingCartCheckoutActionJson.label)) {
            c9j5.AAV(shoppingCartCheckoutActionJson.label, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartCheckoutActionJson) {
                ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson = (ShoppingCartCheckoutActionJson) obj;
                if (!C7384Etj.areEqual(this.type, shoppingCartCheckoutActionJson.type) || !C7384Etj.areEqual(this.label, shoppingCartCheckoutActionJson.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCartCheckoutActionJson copy$default(ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartCheckoutActionJson.type;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCartCheckoutActionJson.label;
        }
        AnonymousClass003.A0u(str, str2);
        return new ShoppingCartCheckoutActionJson(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.label, AnonymousClass001.A0G(this.type));
    }

    public ShoppingCartCheckoutActionJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.type = str;
        this.label = str2;
    }

    public final ShoppingCartCheckoutActionJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ShoppingCartCheckoutActionJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCartCheckoutActionJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
    }

    public /* synthetic */ ShoppingCartCheckoutActionJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public ShoppingCartCheckoutActionJson() {
        this("", "");
    }
}
