package com.facebook.aura.file.view.api;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import com.facebook.aura.productactions.lightbox.ProductMediaLightboxActionsProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ContentViewerBottomActionsRenderers {
    public static final int $stable = 0;
    public static final ContentViewerBottomActionsRenderers INSTANCE = new ContentViewerBottomActionsRenderers();

    public final ContentViewerBottomActionsRenderer rendererFor(ContentViewerBottomActions contentViewerBottomActions) {
        Object next;
        C7384Etj.A0Y(contentViewerBottomActions, 0);
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(ProductMediaLightboxActionsProvider.INSTANCE.renderer());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ContentViewerBottomActionsRenderer) next).owns(contentViewerBottomActions)) {
                break;
            }
        }
        return (ContentViewerBottomActionsRenderer) next;
    }
}
