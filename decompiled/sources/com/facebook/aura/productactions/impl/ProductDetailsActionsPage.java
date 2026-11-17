package com.facebook.aura.productactions.impl;

import X.AnonymousClass005;
import X.C20Q;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;

/* loaded from: classes4.dex */
public final class ProductDetailsActionsPage {
    public static final int $stable = ProductDetailsHeaderContext.$stable;
    public final C20Q<ProductDetailsHeaderContext> contexts;
    public final C20Q<ProductDetailsPresentation> details;
    public final ProductDetailsHeaderContext initialContext;

    public final C20Q<ProductDetailsHeaderContext> getContexts() {
        return this.contexts;
    }

    public final C20Q<ProductDetailsPresentation> getDetails() {
        return this.details;
    }

    public final ProductDetailsHeaderContext getInitialContext() {
        return this.initialContext;
    }

    public ProductDetailsActionsPage(ProductDetailsHeaderContext productDetailsHeaderContext, C20Q<ProductDetailsHeaderContext> c20q, C20Q<ProductDetailsPresentation> c20q2) {
        AnonymousClass005.A0x(productDetailsHeaderContext, c20q, c20q2);
        this.initialContext = productDetailsHeaderContext;
        this.contexts = c20q;
        this.details = c20q2;
    }
}
