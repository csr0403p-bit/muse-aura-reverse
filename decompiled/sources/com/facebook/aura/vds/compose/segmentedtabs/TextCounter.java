package com.facebook.aura.vds.compose.segmentedtabs;

/* loaded from: classes.dex */
public final class TextCounter implements AuraTab {
    public static final int $stable = 0;
    public final int count;
    public final int resId;

    public final int getCount() {
        return this.count;
    }

    @Override // com.facebook.aura.vds.compose.segmentedtabs.AuraTab
    public int getResId() {
        return this.resId;
    }

    public TextCounter(int i, int i2) {
        this.resId = i;
        this.count = i2;
    }
}
