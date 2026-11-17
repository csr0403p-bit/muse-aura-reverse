package com.meta.maps.fancypins;

import X.AnonymousClass005;
import java.util.List;

/* loaded from: classes6.dex */
public final class VariantLayout {
    public final LayoutRect boundingBox;
    public final String id;
    public final List<PartLayout> layout;

    public VariantLayout(String str, List<PartLayout> list, LayoutRect layoutRect) {
        AnonymousClass005.A0x(str, list, layoutRect);
        this.id = str;
        this.layout = list;
        this.boundingBox = layoutRect;
    }
}
