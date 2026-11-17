package com.facebook.aura.widgets.intf;

import com.facebook.aura.widgets.SpaceWidgetPinner;

/* loaded from: classes.dex */
public final class SpaceWidgets {
    public static final SpaceWidgets INSTANCE = new SpaceWidgets();

    public final SpaceWidgetPinning getPinning() {
        int i = new int[]{0}[0];
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            return SpaceWidgetPinner.INSTANCE;
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", numValueOf));
    }
}
