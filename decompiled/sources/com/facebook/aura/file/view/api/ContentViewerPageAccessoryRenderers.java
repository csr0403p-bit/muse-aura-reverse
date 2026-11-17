package com.facebook.aura.file.view.api;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChipProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ContentViewerPageAccessoryRenderers {
    public static final int $stable = 0;
    public static final ContentViewerPageAccessoryRenderers INSTANCE = new ContentViewerPageAccessoryRenderers();

    public final ContentViewerPageAccessoryRenderer rendererFor(ContentViewerPageAccessory contentViewerPageAccessory) {
        Object next;
        C7384Etj.A0Y(contentViewerPageAccessory, 0);
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(FeaturedProductLightboxChipProvider.INSTANCE.renderer());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ContentViewerPageAccessoryRenderer) next).owns(contentViewerPageAccessory)) {
                break;
            }
        }
        return (ContentViewerPageAccessoryRenderer) next;
    }
}
