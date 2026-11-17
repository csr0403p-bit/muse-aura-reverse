package com.facebook.aura.vds.compose.segmentedtabs;

import X.C06H;
import X.C1822Arm;

/* loaded from: classes.dex */
public final class TextTab implements AuraTab {
    public static final int $stable = 0;
    public final int resId;
    public final C1822Arm textStyle;

    @Override // com.facebook.aura.vds.compose.segmentedtabs.AuraTab
    public int getResId() {
        return this.resId;
    }

    public final C1822Arm getTextStyle() {
        return this.textStyle;
    }

    public TextTab(int i, C1822Arm c1822Arm) {
        this.resId = i;
        this.textStyle = c1822Arm;
    }

    public /* synthetic */ TextTab(int i, C1822Arm c1822Arm, int i2, C06H c06h) {
        this(i, (i2 & 2) != 0 ? null : c1822Arm);
    }
}
