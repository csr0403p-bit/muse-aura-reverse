package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.ShoppingConnectorJson;
import com.facebook.aura.shopping.model.ShoppingSecondaryActionJson;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TextEntitySegmentOneofJson extends C06G {
    public final ShoppingProductEntityJson product;
    public final String text;
    public static final Companion Companion = new Companion();
    public static final int $stable = ShoppingConnectorJson.$stable | ShoppingSecondaryActionJson.$stable;

    public final class Companion {
        public final C9hr<TextEntitySegmentOneofJson> serializer() {
            return TextEntitySegmentOneofJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(TextEntitySegmentOneofJson textEntitySegmentOneofJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || textEntitySegmentOneofJson.text != null) {
            c9j5.AAP(textEntitySegmentOneofJson.text, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || textEntitySegmentOneofJson.product != null) {
            c9j5.AAP(textEntitySegmentOneofJson.product, ShoppingProductEntityJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextEntitySegmentOneofJson) {
                TextEntitySegmentOneofJson textEntitySegmentOneofJson = (TextEntitySegmentOneofJson) obj;
                if (!C7384Etj.areEqual(this.text, textEntitySegmentOneofJson.text) || !C7384Etj.areEqual(this.product, textEntitySegmentOneofJson.product)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TextEntitySegmentOneofJson copy$default(TextEntitySegmentOneofJson textEntitySegmentOneofJson, String str, ShoppingProductEntityJson shoppingProductEntityJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textEntitySegmentOneofJson.text;
        }
        if ((i & 2) != 0) {
            shoppingProductEntityJson = textEntitySegmentOneofJson.product;
        }
        return new TextEntitySegmentOneofJson(str, shoppingProductEntityJson);
    }

    public final String component1() {
        return this.text;
    }

    public final ShoppingProductEntityJson component2() {
        return this.product;
    }

    public final TextEntitySegmentOneofJson copy(String str, ShoppingProductEntityJson shoppingProductEntityJson) {
        return new TextEntitySegmentOneofJson(str, shoppingProductEntityJson);
    }

    public final ShoppingProductEntityJson getProduct() {
        return this.product;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.text) * 31) + C3cH.A02(this.product);
    }

    public TextEntitySegmentOneofJson(String str, ShoppingProductEntityJson shoppingProductEntityJson) {
        this.text = str;
        this.product = shoppingProductEntityJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TextEntitySegmentOneofJson(int i, String str, ShoppingProductEntityJson shoppingProductEntityJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.product = null;
        } else {
            this.product = shoppingProductEntityJson;
        }
    }

    public /* synthetic */ TextEntitySegmentOneofJson(String str, ShoppingProductEntityJson shoppingProductEntityJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : shoppingProductEntityJson);
    }

    public TextEntitySegmentOneofJson() {
        this(null, null);
    }
}
