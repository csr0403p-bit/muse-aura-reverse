package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$10$1 extends AbstractC7559F3s implements G0U<Integer, Integer> {
    public static final AuraSidePanelTabsKt$AuraSidePanelTabs$10$1 INSTANCE = new AuraSidePanelTabsKt$AuraSidePanelTabs$10$1();

    public AuraSidePanelTabsKt$AuraSidePanelTabs$10$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        int iA0F = AnonymousClass001.A0F(num);
        if (iA0F < 1) {
            iA0F = 1;
        }
        return Integer.valueOf(iA0F);
    }

    public final Integer invoke(int i) {
        if (i < 1) {
            i = 1;
        }
        return Integer.valueOf(i);
    }
}
