package com.facebook.aura.file.view.api;

import X.AHD;
import X.AnonymousClass002;
import X.C7384Etj;
import X.HxE;

/* loaded from: classes.dex */
public final class ContentViewerDataHolder {
    public static final int $stable = 0;
    public static final ContentViewerDataHolder INSTANCE = new ContentViewerDataHolder();
    public static int initialIndex;
    public static AHD<ContentItem> items;

    public final synchronized void clear() {
        items = null;
        initialIndex = 0;
    }

    public final synchronized HxE<AHD<ContentItem>, Integer> consumeItems() {
        HxE<AHD<ContentItem>, Integer> hxEA0p;
        AHD<ContentItem> ahd = items;
        hxEA0p = null;
        if (ahd != null) {
            int i = initialIndex;
            items = null;
            initialIndex = 0;
            hxEA0p = AnonymousClass002.A0p(ahd, i);
        }
        return hxEA0p;
    }

    public final synchronized void setItems(AHD<ContentItem> ahd, int i) {
        C7384Etj.A0Y(ahd, 0);
        items = ahd;
        initialIndex = i;
    }

    public static /* synthetic */ void setItems$default(ContentViewerDataHolder contentViewerDataHolder, AHD ahd, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        contentViewerDataHolder.setItems(ahd, i);
    }
}
