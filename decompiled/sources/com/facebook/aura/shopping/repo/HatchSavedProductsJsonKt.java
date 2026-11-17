package com.facebook.aura.shopping.repo;

import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;

/* loaded from: classes4.dex */
public abstract class HatchSavedProductsJsonKt {
    public static final SavedDefaultRequestJson toRequestJson(ShoppingSaveTarget shoppingSaveTarget, String str) {
        C7384Etj.A0Y(shoppingSaveTarget, 0);
        if (shoppingSaveTarget instanceof ShoppingSaveTarget.WidgetProduct) {
            ShoppingSaveTarget.WidgetProduct widgetProduct = (ShoppingSaveTarget.WidgetProduct) shoppingSaveTarget;
            return new SavedDefaultRequestJson(widgetProduct.widgetId, widgetProduct.productId, null, null, str);
        }
        if (shoppingSaveTarget instanceof ShoppingSaveTarget.WidgetCitation) {
            ShoppingSaveTarget.WidgetCitation widgetCitation = (ShoppingSaveTarget.WidgetCitation) shoppingSaveTarget;
            return new SavedDefaultRequestJson(widgetCitation.widgetId, null, widgetCitation.citationId, null, str);
        }
        if (!(shoppingSaveTarget instanceof ShoppingSaveTarget.Citation)) {
            throw C3cG.A0q();
        }
        ShoppingSaveTarget.Citation citation = (ShoppingSaveTarget.Citation) shoppingSaveTarget;
        return new SavedDefaultRequestJson(null, null, citation.citationId, citation.messageId, str);
    }
}
