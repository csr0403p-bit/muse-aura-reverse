package com.facebook.aura.vds.compose.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$isInitialSwipe$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$isInitialSwipe$2$1(AuraSwipeableMenuState auraSwipeableMenuState) {
        super(0);
        this.$swipeableMenuState = auraSwipeableMenuState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1N((Math.abs(this.$swipeableMenuState.getOffset()) > 100.0f ? 1 : (Math.abs(this.$swipeableMenuState.getOffset()) == 100.0f ? 0 : -1))));
    }
}
