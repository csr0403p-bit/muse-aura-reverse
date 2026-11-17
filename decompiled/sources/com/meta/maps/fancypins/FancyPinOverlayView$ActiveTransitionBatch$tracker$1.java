package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.meta.maps.fancypins.FancyPinOverlayView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$ActiveTransitionBatch$tracker$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ FancyPinOverlayView this$0;
    public final /* synthetic */ FancyPinOverlayView.ActiveTransitionBatch this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$ActiveTransitionBatch$tracker$1(FancyPinOverlayView fancyPinOverlayView, FancyPinOverlayView.ActiveTransitionBatch activeTransitionBatch) {
        super(0);
        this.this$0 = fancyPinOverlayView;
        this.this$1 = activeTransitionBatch;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        FancyPinOverlayView fancyPinOverlayView = this.this$0;
        float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
        return Boolean.valueOf(AnonymousClass002.A1Z(fancyPinOverlayView.activeTransitionBatch, this.this$1));
    }
}
