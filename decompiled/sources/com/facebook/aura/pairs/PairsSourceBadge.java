package com.facebook.aura.pairs;

import X.B6A;
import X.C06H;

/* loaded from: classes3.dex */
public final class PairsSourceBadge {
    public final boolean gradient;
    public final int icon;
    public final float iconSize;
    public final B6A tint;

    public /* synthetic */ PairsSourceBadge(int i, B6A b6a, boolean z, float f, int i2, C06H c06h) {
        this(i, b6a, z, (i2 & 8) != 0 ? 11.0f : f);
    }

    public final boolean getGradient() {
        return this.gradient;
    }

    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1678getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
    public final B6A m1679getTintQN2ZGVo() {
        return this.tint;
    }

    public PairsSourceBadge(int i, B6A b6a, boolean z, float f) {
        this.icon = i;
        this.tint = b6a;
        this.gradient = z;
        this.iconSize = f;
    }

    public /* synthetic */ PairsSourceBadge(int i, B6A b6a, boolean z, float f, C06H c06h) {
        this(i, b6a, z, f);
    }
}
