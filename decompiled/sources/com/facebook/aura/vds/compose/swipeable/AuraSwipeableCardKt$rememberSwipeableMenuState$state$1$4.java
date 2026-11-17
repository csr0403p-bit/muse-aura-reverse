package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$rememberSwipeableMenuState$state$1$4 extends AbstractC7559F3s implements G0U<AuraSwipeableMenuStateDragAnchors, Boolean> {
    public static final AuraSwipeableCardKt$rememberSwipeableMenuState$state$1$4 INSTANCE = new AuraSwipeableCardKt$rememberSwipeableMenuState$state$1$4();

    public AuraSwipeableCardKt$rememberSwipeableMenuState$state$1$4() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors) {
        C7384Etj.A0Y(auraSwipeableMenuStateDragAnchors, 0);
        return Boolean.valueOf(auraSwipeableMenuStateDragAnchors != AuraSwipeableMenuStateDragAnchors.START_ACTION);
    }
}
