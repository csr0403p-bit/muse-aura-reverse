package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSwipeableMenuState$progressToThreshold$2 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ AuraSwipeableMenuState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableMenuState$progressToThreshold$2(AuraSwipeableMenuState auraSwipeableMenuState) {
        super(0);
        this.this$0 = auraSwipeableMenuState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float fAbs = Math.abs(this.this$0.getOffset());
        Float f = this.this$0.thresholdOffset;
        return Float.valueOf(fAbs / (f != null ? f.floatValue() : r1.layoutWidth * 0.3f));
    }
}
