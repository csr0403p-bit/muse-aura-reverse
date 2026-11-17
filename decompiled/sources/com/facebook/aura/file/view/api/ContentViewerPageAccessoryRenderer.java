package com.facebook.aura.file.view.api;

import X.BFM;
import X.BRg;

/* loaded from: classes.dex */
public interface ContentViewerPageAccessoryRenderer {
    void Content(ContentViewerPageAccessory contentViewerPageAccessory, BRg bRg, BFM bfm, int i);

    boolean owns(ContentViewerPageAccessory contentViewerPageAccessory);
}
