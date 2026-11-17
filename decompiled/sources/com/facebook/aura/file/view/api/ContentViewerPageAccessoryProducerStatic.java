package com.facebook.aura.file.view.api;

import X.AnonymousClass005;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.productactions.lightbox.FeaturedProductLightboxAccessoryProducer;

/* loaded from: classes4.dex */
public class ContentViewerPageAccessoryProducerStatic {
    public static int[] getKeys() {
        return new int[]{0};
    }

    public static ContentViewerPageAccessory accessoryFor(int i, HatchAttachmentFile hatchAttachmentFile, ContentViewerPageContext contentViewerPageContext) {
        if (i == 0) {
            return FeaturedProductLightboxAccessoryProducer.INSTANCE.accessoryFor(hatchAttachmentFile, contentViewerPageContext);
        }
        throw AnonymousClass005.A0c(i);
    }
}
