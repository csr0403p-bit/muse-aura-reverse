package com.facebook.aura.file.view.api;

import X.AnonymousClass005;
import com.facebook.aura.productactions.lightbox.ProductMediaLightboxActionsProvider;

/* loaded from: classes.dex */
public class ContentViewerBottomActionsProviderStatic {
    public static ContentViewerBottomActionsRenderer renderer(int i) {
        if (i == 0) {
            return ProductMediaLightboxActionsProvider.INSTANCE.renderer();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
