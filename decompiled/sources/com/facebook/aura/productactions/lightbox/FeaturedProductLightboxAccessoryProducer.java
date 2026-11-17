package com.facebook.aura.productactions.lightbox;

import X.AnonymousClass003;
import com.facebook.aura.file.view.api.ContentViewerPageAccessory;
import com.facebook.aura.file.view.api.ContentViewerPageAccessoryProducer;
import com.facebook.aura.file.view.api.ContentViewerPageContext;
import com.facebook.aura.model.HatchAttachmentFile;

/* loaded from: classes4.dex */
public final class FeaturedProductLightboxAccessoryProducer implements ContentViewerPageAccessoryProducer {
    public static final int $stable = 0;
    public static final FeaturedProductLightboxAccessoryProducer INSTANCE = new FeaturedProductLightboxAccessoryProducer();

    @Override // com.facebook.aura.file.view.api.ContentViewerPageAccessoryProducer
    public ContentViewerPageAccessory accessoryFor(HatchAttachmentFile hatchAttachmentFile, ContentViewerPageContext contentViewerPageContext) {
        AnonymousClass003.A0u(hatchAttachmentFile, contentViewerPageContext);
        return FeaturedProductLightboxAccessoryKt.featuredProductLightboxAccessory(hatchAttachmentFile, contentViewerPageContext);
    }
}
