package com.facebook.aura.ageverification;

import X.AnonymousClass005;
import X.C06H;

/* loaded from: classes.dex */
public final class AgeStepInfoRow {
    public static final int $stable = 0;
    public final int iconRes;
    public final boolean namesApp;
    public final int textRes;

    public final int getIconRes() {
        return this.iconRes;
    }

    public final boolean getNamesApp() {
        return this.namesApp;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    public AgeStepInfoRow(int i, int i2, boolean z) {
        this.iconRes = i;
        this.textRes = i2;
        this.namesApp = z;
    }

    public /* synthetic */ AgeStepInfoRow(int i, int i2, boolean z, int i3, C06H c06h) {
        this(i, i2, AnonymousClass005.A1O(i3, z));
    }
}
