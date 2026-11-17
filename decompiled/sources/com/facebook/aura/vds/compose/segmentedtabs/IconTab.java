package com.facebook.aura.vds.compose.segmentedtabs;

import X.C06H;

/* loaded from: classes.dex */
public final class IconTab implements AuraTab {
    public static final int $stable = 0;
    public final Integer contentDescriptionId;
    public final int resId;

    public final Integer getContentDescriptionId() {
        return this.contentDescriptionId;
    }

    @Override // com.facebook.aura.vds.compose.segmentedtabs.AuraTab
    public int getResId() {
        return this.resId;
    }

    public IconTab(int i, Integer num) {
        this.resId = i;
        this.contentDescriptionId = num;
    }

    public /* synthetic */ IconTab(int i, Integer num, int i2, C06H c06h) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
