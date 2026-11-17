package com.facebook.aura.vds.compose.swipeable;

import X.AXN;
import X.AbstractC7559F3s;
import X.C2ae;
import X.C8j3;
import X.G0U;

/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$AuraSwipeableCard$6$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableCardKt$AuraSwipeableCard$6$1$1(AuraSwipeableMenuState auraSwipeableMenuState) {
        super(1);
        this.$swipeableMenuState = auraSwipeableMenuState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return C8j3.A0l(m2636invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m2636invokeBjo55l4(AXN axn) {
        return ((int) this.$swipeableMenuState.getOffset()) << 32;
    }
}
