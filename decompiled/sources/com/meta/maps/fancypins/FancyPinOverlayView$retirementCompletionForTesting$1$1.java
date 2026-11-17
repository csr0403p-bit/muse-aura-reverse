package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import com.meta.maps.fancypins.FancyPinOverlayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$retirementCompletionForTesting$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FancyPinOverlayView.RetiringHull $retirement;
    public final /* synthetic */ int $slotIndex;
    public final /* synthetic */ FancyPinOverlayView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$retirementCompletionForTesting$1$1(FancyPinOverlayView fancyPinOverlayView, int i, FancyPinOverlayView.RetiringHull retiringHull) {
        super(0);
        this.this$0 = fancyPinOverlayView;
        this.$slotIndex = i;
        this.$retirement = retiringHull;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws Throwable {
        this.this$0.finishRetirement(this.$slotIndex, this.$retirement);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
        invoke2();
        return Unit.INSTANCE;
    }
}
