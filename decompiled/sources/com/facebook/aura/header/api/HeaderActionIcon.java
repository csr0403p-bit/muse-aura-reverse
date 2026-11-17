package com.facebook.aura.header.api;

import X.AnonymousClass005;
import X.C06H;

/* loaded from: classes.dex */
public final class HeaderActionIcon {
    public static final int $stable = 0;
    public final int description;
    public final boolean destructive;
    public final boolean enabled;
    public final int res;

    public final int getDescription() {
        return this.description;
    }

    public final boolean getDestructive() {
        return this.destructive;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getRes() {
        return this.res;
    }

    public HeaderActionIcon(int i, int i2, boolean z, boolean z2) {
        this.res = i;
        this.description = i2;
        this.destructive = z;
        this.enabled = z2;
    }

    public /* synthetic */ HeaderActionIcon(int i, int i2, boolean z, boolean z2, int i3, C06H c06h) {
        this(i, i2, AnonymousClass005.A1O(i3, z), (i3 & 8) != 0 ? true : z2);
    }
}
