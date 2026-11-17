package com.facebook.aura.file.view.api;

import X.AnonymousClass005;
import com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChipProvider;

/* loaded from: classes.dex */
public class ContentViewerPageAccessoryProviderStatic {
    public static ContentViewerPageAccessoryRenderer renderer(int i) {
        if (i == 0) {
            return FeaturedProductLightboxChipProvider.INSTANCE.renderer();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
