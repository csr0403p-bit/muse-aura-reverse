package com.facebook.aura.productactions.lightbox;

import com.facebook.aura.file.view.api.ContentViewerPageAccessoryProvider;
import com.facebook.aura.file.view.api.ContentViewerPageAccessoryRenderer;

/* loaded from: classes.dex */
public final class FeaturedProductLightboxChipProvider implements ContentViewerPageAccessoryProvider {
    public static final int $stable = 0;
    public static final FeaturedProductLightboxChipProvider INSTANCE = new FeaturedProductLightboxChipProvider();

    @Override // com.facebook.aura.file.view.api.ContentViewerPageAccessoryProvider
    public ContentViewerPageAccessoryRenderer renderer() {
        return FeaturedProductLightboxChip.INSTANCE;
    }
}
