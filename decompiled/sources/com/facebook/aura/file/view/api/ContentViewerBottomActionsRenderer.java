package com.facebook.aura.file.view.api;

import X.BFM;
import X.BRg;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface ContentViewerBottomActionsRenderer {
    void Content(ContentViewerBottomActions contentViewerBottomActions, Function0<Unit> function0, BRg bRg, BFM bfm, int i);

    boolean owns(ContentViewerBottomActions contentViewerBottomActions);
}
