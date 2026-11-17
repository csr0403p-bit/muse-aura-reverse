package com.facebook.aura.productactions.impl;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7BY;
import com.facebook.aura.conversation.viewmodel.ReplyContext;
import com.facebook.aura.gateway.MarketplaceMapWidgetJsonKt;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.model.ReplyElementReference;
import com.facebook.aura.model.ReplyElementSupport;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes3.dex */
public abstract class ShoppingProductReplyKt {
    public static final ReplyContext entityReplyContext(ProductDetailsHeaderContext productDetailsHeaderContext, ReplyElementSupport replyElementSupport) {
        String str;
        ReplyElementReference replyElementReferenceEntity;
        String str2;
        String strA0l;
        boolean zA1a = AnonymousClass002.A1a(productDetailsHeaderContext, replyElementSupport);
        ShoppingProductType shoppingProductType = productDetailsHeaderContext.productType;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shoppingProductType.ordinal();
        if (iOrdinal != 0) {
            str = iOrdinal == zA1a ? MarketplaceMapWidgetJsonKt.MARKETPLACE_LISTING_KIND : "catalog_product";
            return null;
        }
        ReplyElementReference.Companion companion = ReplyElementReference.Companion;
        String str3 = productDetailsHeaderContext.entityId;
        if (str3 != null && (replyElementReferenceEntity = companion.entity(str, str3)) != null && replyElementSupport.supports(replyElementReferenceEntity, str) && (str2 = productDetailsHeaderContext.displayedName) != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
            return elementReplyContext(new ReplyAttribution.Element(replyElementReferenceEntity, "product", null, strA0l, productDetailsHeaderContext.displayedImageUrl, false, null));
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShoppingProductType.values().length];
            try {
                AnonymousClass002.A13(ShoppingProductType.CATALOG, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ShoppingProductType.MARKETPLACE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ReplyContext elementReplyContext(ReplyAttribution.Element element) {
        String str = element.title;
        if (str == null) {
            str = "";
        }
        return new ReplyContext(element, str, null, element.imageUrl);
    }

    public static final ReplyContext productReplyContext(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, ReplyElementSupport replyElementSupport) {
        Integer num;
        ReplyElementReference replyElementReferenceWidget;
        AnonymousClass005.A0x(shoppingResultProduct, shoppingProductSource, replyElementSupport);
        String str = shoppingProductSource.messageId;
        String str2 = shoppingProductSource.citationId;
        if (str == null || str2 == null) {
            String str3 = shoppingProductSource.widgetId;
            if (str3 != null && (num = shoppingProductSource.wireIndex) != null) {
                replyElementReferenceWidget = ReplyElementReference.Companion.widget(str3, num.intValue(), shoppingResultProduct.citationId);
            }
            return null;
        }
        replyElementReferenceWidget = ReplyElementReference.Companion.chip(str, str2);
        if (replyElementReferenceWidget != null) {
            if (replyElementSupport.supports(replyElementReferenceWidget, "entity_chip".equals(replyElementReferenceWidget.type) ? "product" : shoppingProductSource.kind)) {
                String strA0l = AnonymousClass002.A0l(shoppingResultProduct.name);
                if (strA0l.length() > 0) {
                    String str4 = shoppingResultProduct.imageUrl;
                    if (!shoppingResultProduct.isImageAvailable || shoppingResultProduct.isUnavailable) {
                        str4 = null;
                    }
                    String str5 = shoppingProductSource.kind;
                    if (!"widget_element".equals(replyElementReferenceWidget.type)) {
                        str5 = null;
                    }
                    boolean z = shoppingResultProduct.isUnavailable;
                    String str6 = shoppingProductSource.presentationEventId;
                    return elementReplyContext(new ReplyAttribution.Element(replyElementReferenceWidget, "product", str5, strA0l, str4, z, (str6 == null || C7BY.A0j(str6)) ? null : new ReplyAttribution.Presentation(str6, strA0l, null, strA0l)));
                }
            }
        }
        return null;
    }
}
