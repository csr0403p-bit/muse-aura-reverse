package com.facebook.aura.conversation.view;

import X.AGO;
import X.AKH;
import com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate;

/* loaded from: classes.dex */
public abstract class LocalGenericListSelectionsKt {
    public static final AKH<GenericListSelectionDelegate> LocalGenericListSelections = new AGO(LocalGenericListSelectionsKt$LocalGenericListSelections$1.INSTANCE);

    public static final AKH<GenericListSelectionDelegate> getLocalGenericListSelections() {
        return LocalGenericListSelections;
    }
}
