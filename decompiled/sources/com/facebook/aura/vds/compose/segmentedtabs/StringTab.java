package com.facebook.aura.vds.compose.segmentedtabs;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class StringTab implements AuraTab {
    public static final int $stable = 0;
    public final int resId;
    public final String string;

    public StringTab(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.string = str;
        this.resId = i;
    }

    @Override // com.facebook.aura.vds.compose.segmentedtabs.AuraTab
    public int getResId() {
        return this.resId;
    }

    public final String getString() {
        return this.string;
    }

    public /* synthetic */ StringTab(String str, int i, int i2, C06H c06h) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }
}
