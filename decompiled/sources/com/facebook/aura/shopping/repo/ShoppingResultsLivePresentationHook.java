package com.facebook.aura.shopping.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import com.facebook.aura.conversation.api.ConversationLivePresentationHook;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.ShoppingResultsPresentationData;
import com.facebook.aura.shopping.model.PdpCouponPrice;
import com.facebook.aura.shopping.model.ShoppingCouponPriceKey;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ShoppingResultsLivePresentationHook implements ConversationLivePresentationHook {
    public static final ShoppingResultsLivePresentationHook INSTANCE = new ShoppingResultsLivePresentationHook();

    @Override // com.facebook.aura.conversation.api.ConversationLivePresentationHook
    public void onLivePresentation(AbstractC3358CGz abstractC3358CGz, HatchWidgetPresentation hatchWidgetPresentation) {
        ShoppingResultsPresentationData shoppingResultsPresentationData;
        ShoppingResultsPresentation shoppingResultsPresentation;
        Map<ShoppingCouponPriceKey, PdpCouponPrice> map;
        AnonymousClass003.A0u(abstractC3358CGz, hatchWidgetPresentation);
        HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
        if (!(hatchPresentationData instanceof ShoppingResultsPresentationData) || (shoppingResultsPresentationData = (ShoppingResultsPresentationData) hatchPresentationData) == null || (shoppingResultsPresentation = shoppingResultsPresentationData.shoppingResults) == null || (map = shoppingResultsPresentation.couponPrices) == null || map.isEmpty()) {
            return;
        }
        HatchProductDetailsRepository.Companion.getInstance(abstractC3358CGz).storeShoppingResultCouponPrices(map);
    }
}
