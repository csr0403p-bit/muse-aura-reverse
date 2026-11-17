package com.meta.maps.display;

import X.AnonymousClass005;
import java.util.List;

/* loaded from: classes6.dex */
public final class VisibilityChange {
    public List<VisibleFeature> allVisible;
    public List<VisibleFeature> appeared;
    public List<VisibleFeature> disappeared;

    public VisibilityChange(List<VisibleFeature> list, List<VisibleFeature> list2, List<VisibleFeature> list3) {
        AnonymousClass005.A0x(list, list2, list3);
        this.appeared = list;
        this.disappeared = list2;
        this.allVisible = list3;
    }
}
