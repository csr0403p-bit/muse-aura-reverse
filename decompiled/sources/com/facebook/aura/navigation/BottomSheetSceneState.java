package com.facebook.aura.navigation;

import X.AnonymousClass003;
import X.BRL;
import java.util.List;

/* loaded from: classes2.dex */
public final class BottomSheetSceneState<T> {
    public final List<BRL<T>> overlaidEntries;
    public final List<BRL<T>> sheetEntries;

    public final List<BRL<T>> getOverlaidEntries() {
        return this.overlaidEntries;
    }

    public final List<BRL<T>> getSheetEntries() {
        return this.sheetEntries;
    }

    public BottomSheetSceneState(List<BRL<T>> list, List<BRL<T>> list2) {
        AnonymousClass003.A0u(list, list2);
        this.sheetEntries = list;
        this.overlaidEntries = list2;
    }
}
