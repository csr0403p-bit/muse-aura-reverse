package com.facebook.aura.vds.compose.segmentedtabs;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IconTextTab implements AuraTab {
    public static final int $stable = 0;
    public final int iconResId;
    public final int resId;
    public final String string;

    public IconTextTab(int i, String str, int i2) {
        C7384Etj.A0Y(str, 1);
        this.iconResId = i;
        this.string = str;
        this.resId = i2;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @Override // com.facebook.aura.vds.compose.segmentedtabs.AuraTab
    public int getResId() {
        return this.resId;
    }

    public final String getString() {
        return this.string;
    }

    public /* synthetic */ IconTextTab(int i, String str, int i2, int i3, C06H c06h) {
        this(i, str, (i3 & 4) != 0 ? 0 : i2);
    }
}
