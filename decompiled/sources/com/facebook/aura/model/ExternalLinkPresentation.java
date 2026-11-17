package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class ExternalLinkPresentation extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ShoppingCheckoutAttribution shoppingCheckout;
    public final String url;
    public final String widgetId;

    public final class Companion {
        public final C9hr<ExternalLinkPresentation> serializer() {
            return ExternalLinkPresentation$$serializer.INSTANCE;
        }

        public final ExternalLinkPresentation fromJson(JsonElement jsonElement, String str) {
            return ExternalLinkPresentationJsonKt.parseExternalLinkPresentation(jsonElement, str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ExternalLinkPresentation(String str, String str2, ShoppingCheckoutAttribution shoppingCheckoutAttribution) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.widgetId = str2;
        this.shoppingCheckout = shoppingCheckoutAttribution;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ExternalLinkPresentation externalLinkPresentation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(externalLinkPresentation.url, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || externalLinkPresentation.widgetId != null) {
            c9j5.AAP(externalLinkPresentation.widgetId, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || externalLinkPresentation.shoppingCheckout != null) {
            c9j5.AAP(externalLinkPresentation.shoppingCheckout, ShoppingCheckoutAttribution$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final ExternalLinkPresentation copy(String str, String str2, ShoppingCheckoutAttribution shoppingCheckoutAttribution) {
        C7384Etj.A0Y(str, 0);
        return new ExternalLinkPresentation(str, str2, shoppingCheckoutAttribution);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ExternalLinkPresentation) {
                ExternalLinkPresentation externalLinkPresentation = (ExternalLinkPresentation) obj;
                if (!C7384Etj.areEqual(this.url, externalLinkPresentation.url) || !C7384Etj.areEqual(this.widgetId, externalLinkPresentation.widgetId) || !C7384Etj.areEqual(this.shoppingCheckout, externalLinkPresentation.shoppingCheckout)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ExternalLinkPresentation copy$default(ExternalLinkPresentation externalLinkPresentation, String str, String str2, ShoppingCheckoutAttribution shoppingCheckoutAttribution, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalLinkPresentation.url;
        }
        if ((i & 2) != 0) {
            str2 = externalLinkPresentation.widgetId;
        }
        if ((i & 4) != 0) {
            shoppingCheckoutAttribution = externalLinkPresentation.shoppingCheckout;
        }
        return externalLinkPresentation.copy(str, str2, shoppingCheckoutAttribution);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.widgetId;
    }

    public final ShoppingCheckoutAttribution component3() {
        return this.shoppingCheckout;
    }

    public final ShoppingCheckoutAttribution getShoppingCheckout() {
        return this.shoppingCheckout;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.widgetId)) * 31) + C3cH.A02(this.shoppingCheckout);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ExternalLinkPresentation(int i, String str, String str2, ShoppingCheckoutAttribution shoppingCheckoutAttribution, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ExternalLinkPresentation$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.widgetId = null;
        } else {
            this.widgetId = str2;
        }
        if ((i & 4) == 0) {
            this.shoppingCheckout = null;
        } else {
            this.shoppingCheckout = shoppingCheckoutAttribution;
        }
    }

    public /* synthetic */ ExternalLinkPresentation(String str, String str2, ShoppingCheckoutAttribution shoppingCheckoutAttribution, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : shoppingCheckoutAttribution);
    }
}
