package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC7559F3s;
import X.BL4;
import X.C8j3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$AuraSwipeableCard$4$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableCardKt$AuraSwipeableCard$4$1(AuraSwipeableMenuState auraSwipeableMenuState) {
        super(1);
        this.$swipeableMenuState = auraSwipeableMenuState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m2634invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m2634invokeozmzZPI(long j) {
        this.$swipeableMenuState.setLayoutWidth(C8j3.A0G(j));
    }
}
