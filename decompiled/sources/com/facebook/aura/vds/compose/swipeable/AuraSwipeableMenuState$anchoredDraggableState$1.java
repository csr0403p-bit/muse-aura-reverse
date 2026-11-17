package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes4.dex */
public final class AuraSwipeableMenuState$anchoredDraggableState$1 extends AbstractC7559F3s implements G0U<Float, Float> {
    public static final AuraSwipeableMenuState$anchoredDraggableState$1 INSTANCE = new AuraSwipeableMenuState$anchoredDraggableState$1();

    public AuraSwipeableMenuState$anchoredDraggableState$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return Float.valueOf(AnonymousClass001.A02(f) * 0.3f);
    }

    public final Float invoke(float f) {
        return Float.valueOf(f * 0.3f);
    }
}
