package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$AuraSwipeableCard$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $handlerActionSend;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableCardKt$AuraSwipeableCard$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$handlerActionSend = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState.A09(false, this.$handlerActionSend);
        return new C78g() { // from class: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
