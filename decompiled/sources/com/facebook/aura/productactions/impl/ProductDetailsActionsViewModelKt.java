package com.facebook.aura.productactions.impl;

import X.AHI;
import X.AIW;
import X.AnonymousClass001;
import X.C0924AIa;
import X.C3cG;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.conversation.viewmodel.ReplyContext;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.model.ReplyElementSupport;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;

/* loaded from: classes4.dex */
public abstract class ProductDetailsActionsViewModelKt {
    public static final String validProductShareUrl(String str) {
        Uri uri;
        String scheme;
        String scheme2;
        String host;
        if (str == null || ((((scheme = (uri = Uri.parse(str)).getScheme()) == null || !scheme.equalsIgnoreCase("https")) && ((scheme2 = uri.getScheme()) == null || !scheme2.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP))) || (host = uri.getHost()) == null || C7BY.A0j(host))) {
            return null;
        }
        return uri.toString();
    }

    public static final ProductDetailsActionsUiState productDetailsActionsState(ProductDetailsHeaderContext productDetailsHeaderContext, ShoppingResultProduct shoppingResultProduct, ReplyElementSupport replyElementSupport) {
        ShoppingProductSource shoppingProductSource = productDetailsHeaderContext.source;
        ReplyContext replyContextProductReplyContext = (shoppingResultProduct == null || shoppingProductSource == null || C7BY.A0j(shoppingResultProduct.name)) ? null : ShoppingProductReplyKt.productReplyContext(shoppingResultProduct, shoppingProductSource, replyElementSupport);
        String strValidProductShareUrl = validProductShareUrl(productDetailsHeaderContext.websiteUrl);
        if (replyContextProductReplyContext == null) {
            replyContextProductReplyContext = ShoppingProductReplyKt.entityReplyContext(productDetailsHeaderContext, replyElementSupport);
        }
        boolean z = productDetailsHeaderContext.actionsEnabled;
        String str = productDetailsHeaderContext.productId;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        String loggingValue = ShoppingResultsPresentationKt.getLoggingValue(productDetailsHeaderContext.productType);
        if (loggingValue != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PRODUCT_TYPE, loggingValue, c0924AIaA0u);
        }
        String str2 = productDetailsHeaderContext.hostMessageId;
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.HOST_MESSAGE_ID, str2, c0924AIaA0u);
        }
        return new ProductDetailsActionsUiState(replyContextProductReplyContext, strValidProductShareUrl, z, str, AIW.A0K(c0924AIaA0u), AHI.A01, null);
    }
}
