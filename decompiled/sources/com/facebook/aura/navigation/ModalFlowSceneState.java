package com.facebook.aura.navigation;

import X.AnonymousClass003;
import X.BRL;
import java.util.List;

/* loaded from: classes.dex */
public final class ModalFlowSceneState<T> {
    public final List<BRL<T>> flowEntries;
    public final boolean isHiddenByOverlay;
    public final List<BRL<T>> overlaidEntries;

    public final List<BRL<T>> getFlowEntries() {
        return this.flowEntries;
    }

    public final List<BRL<T>> getOverlaidEntries() {
        return this.overlaidEntries;
    }

    public final boolean isHiddenByOverlay() {
        return this.isHiddenByOverlay;
    }

    public ModalFlowSceneState(List<BRL<T>> list, List<BRL<T>> list2, boolean z) {
        AnonymousClass003.A0u(list, list2);
        this.flowEntries = list;
        this.overlaidEntries = list2;
        this.isHiddenByOverlay = z;
    }
}
