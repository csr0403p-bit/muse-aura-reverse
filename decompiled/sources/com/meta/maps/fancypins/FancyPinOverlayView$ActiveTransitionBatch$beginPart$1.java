package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import com.meta.maps.fancypins.FancyPinOverlayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$ActiveTransitionBatch$beginPart$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FancyPinTransitionToken $token;
    public final /* synthetic */ FancyPinOverlayView.ActiveTransitionBatch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$ActiveTransitionBatch$beginPart$1(FancyPinOverlayView.ActiveTransitionBatch activeTransitionBatch, FancyPinTransitionToken fancyPinTransitionToken) {
        super(0);
        this.this$0 = activeTransitionBatch;
        this.$token = fancyPinTransitionToken;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.tokens.remove(this.$token);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
