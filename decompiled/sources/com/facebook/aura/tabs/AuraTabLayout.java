package com.facebook.aura.tabs;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraTabLayout {
    public static final int $stable = 0;
    public final AHD<AuraTabItem> items;
    public final boolean sortingEnabled;
    public final boolean spacesEnabled;
    public final int tabCapacity;
    public final int tabCount;
    public final AHD<AuraTabItem> tabs;

    /* JADX WARN: Multi-variable type inference failed */
    public AuraTabLayout(AHD<? extends AuraTabItem> ahd, int i, int i2, boolean z, boolean z2) {
        C7384Etj.A0Y(ahd, 0);
        this.items = ahd;
        this.tabCount = i;
        this.tabCapacity = i2;
        this.sortingEnabled = z;
        this.spacesEnabled = z2;
        this.tabs = AGI.A07(AbstractC0878AGe.A0a(ahd, i));
    }

    public final AHD<AuraTabItem> getItems() {
        return this.items;
    }

    public final boolean getSortingEnabled() {
        return this.sortingEnabled;
    }

    public final boolean getSpacesEnabled() {
        return this.spacesEnabled;
    }

    public final int getTabCapacity() {
        return this.tabCapacity;
    }

    public final int getTabCount() {
        return this.tabCount;
    }

    public final AHD<AuraTabItem> getTabs() {
        return this.tabs;
    }

    public /* synthetic */ AuraTabLayout(AHD ahd, int i, int i2, boolean z, boolean z2, int i3, C06H c06h) {
        this(ahd, i, (i3 & 4) != 0 ? i : i2, z, z2);
    }
}
