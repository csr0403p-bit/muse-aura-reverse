package com.facebook.aura.productactions.lightbox;

import X.AbstractC0885AGm;
import X.C0881AGi;
import X.C0893AGu;
import X.C7384Etj;
import X.F60;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchTextEntitySegment;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.ShoppingResultsPresentationData;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeaturedProductIndex {
    public final HashMap<String, FeaturedProductMatch> chips;
    public final List<HatchMessage> messages;
    public final HashMap<String, FeaturedProductMatch> rows;

    public FeaturedProductIndex(List<HatchMessage> list) {
        ShoppingResultsPresentationData shoppingResultsPresentationData;
        ShoppingResultsPresentation shoppingResultsPresentation;
        FeaturedProductMatch featuredProductMatch;
        String strNormalizedCitationId;
        C7384Etj.A0Y(list, 0);
        this.messages = list;
        this.chips = new HashMap<>();
        this.rows = new HashMap<>();
        Iterator<T> it = new C0893AGu(list).iterator();
        while (it.hasNext()) {
            HatchMessage hatchMessage = (HatchMessage) it.next();
            List<HatchTextEntitySegment> list2 = hatchMessage.segments;
            if (list2 != null) {
                Iterator<HatchTextEntitySegment> it2 = list2.iterator();
                while (it2.hasNext()) {
                    ShoppingResultProduct shoppingResultProduct = it2.next().product;
                    if (shoppingResultProduct != null && (strNormalizedCitationId = FeaturedProductLightboxAccessoryKt.normalizedCitationId(shoppingResultProduct.citationId)) != null && !this.chips.containsKey(strNormalizedCitationId)) {
                        this.chips.put(strNormalizedCitationId, !shoppingResultProduct.isUnavailable ? new FeaturedProductMatch(shoppingResultProduct, new ShoppingProductSource(null, null, 0, null, null, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS, hatchMessage.id, shoppingResultProduct.citationId), hatchMessage.id, null) : null);
                    }
                }
            }
            List list3 = hatchMessage.presentations;
            for (HatchWidgetPresentation hatchWidgetPresentation : list3 == null ? C0881AGi.A00 : list3) {
                HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
                if ((hatchPresentationData instanceof ShoppingResultsPresentationData) && (shoppingResultsPresentationData = (ShoppingResultsPresentationData) hatchPresentationData) != null && (shoppingResultsPresentation = shoppingResultsPresentationData.shoppingResults) != null) {
                    int i = 0;
                    for (ShoppingResultProduct shoppingResultProduct2 : shoppingResultsPresentation.products) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC0885AGm.A14();
                            throw F60.createAndThrow();
                        }
                        ShoppingResultProduct shoppingResultProduct3 = shoppingResultProduct2;
                        String strNormalizedCitationId2 = FeaturedProductLightboxAccessoryKt.normalizedCitationId(shoppingResultProduct3.citationId);
                        if (strNormalizedCitationId2 != null && !this.rows.containsKey(strNormalizedCitationId2)) {
                            HashMap<String, FeaturedProductMatch> map = this.rows;
                            if (shoppingResultProduct3.isUnavailable) {
                                featuredProductMatch = null;
                            } else {
                                ShoppingProductSource shoppingProductSource = new ShoppingProductSource(hatchWidgetPresentation.presentationId, ShoppingResultsPresentationKt.shoppingReplyPresentationEventId(hatchWidgetPresentation.presentationEventId), i, shoppingResultsPresentation.widgetId, shoppingResultProduct3.wireIndex, shoppingResultsPresentation.kind, null, null);
                                String str = hatchWidgetPresentation.hostMessageId;
                                featuredProductMatch = new FeaturedProductMatch(shoppingResultProduct3, shoppingProductSource, str == null ? hatchMessage.id : str, hatchWidgetPresentation.presentationId);
                            }
                            map.put(strNormalizedCitationId2, featuredProductMatch);
                        }
                        i = i2;
                    }
                }
            }
        }
    }

    public final FeaturedProductMatch match(String str) {
        C7384Etj.A0Y(str, 0);
        String strNormalizedCitationId = FeaturedProductLightboxAccessoryKt.normalizedCitationId(str);
        if (strNormalizedCitationId == null) {
            return null;
        }
        return (this.chips.containsKey(strNormalizedCitationId) ? this.chips : this.rows).get(strNormalizedCitationId);
    }

    public final List<HatchMessage> getMessages() {
        return this.messages;
    }
}
