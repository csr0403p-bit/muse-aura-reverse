package com.facebook.aura.productactions.lightbox;

import com.facebook.aura.file.view.api.ContentViewerBottomActionsProvider;
import com.facebook.aura.file.view.api.ContentViewerBottomActionsRenderer;

/* loaded from: classes.dex */
public final class ProductMediaLightboxActionsProvider implements ContentViewerBottomActionsProvider {
    public static final int $stable = 0;
    public static final ProductMediaLightboxActionsProvider INSTANCE = new ProductMediaLightboxActionsProvider();

    @Override // com.facebook.aura.file.view.api.ContentViewerBottomActionsProvider
    public ContentViewerBottomActionsRenderer renderer() {
        return ProductMediaLightboxActions.INSTANCE;
    }
}
