package com.meta.maps.fancypins;

import X.AnonymousClass003;

/* loaded from: classes6.dex */
public final class PartLayout {
    public final double alpha;
    public final String id;
    public final int placementIndex;
    public final LayoutRect rect;
    public final int zIndex;

    public PartLayout(String str, LayoutRect layoutRect, int i, double d, int i2) {
        AnonymousClass003.A0u(str, layoutRect);
        this.id = str;
        this.rect = layoutRect;
        this.zIndex = i;
        this.alpha = d;
        this.placementIndex = i2;
    }
}
