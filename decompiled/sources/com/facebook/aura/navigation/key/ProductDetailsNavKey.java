package com.facebook.aura.navigation.key;

import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.shopping.model.ShoppingProductSource;

/* loaded from: classes4.dex */
public interface ProductDetailsNavKey extends AuraNavKey {
    String getHostMessageId();

    String getProductId();

    String getSessionId();

    ShoppingProductSource getSource();
}
