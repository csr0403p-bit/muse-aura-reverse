package com.facebook.aura.widgets.intf;

import X.AnonymousClass005;
import com.facebook.aura.widgets.SpaceWidgetPinner;

/* loaded from: classes.dex */
public class SpaceWidgetPinningProviderStatic {
    public static SpaceWidgetPinning pinning(int i) {
        if (i == 0) {
            return SpaceWidgetPinner.INSTANCE;
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
