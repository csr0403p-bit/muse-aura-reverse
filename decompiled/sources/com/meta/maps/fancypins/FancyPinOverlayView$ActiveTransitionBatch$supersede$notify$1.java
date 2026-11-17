package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.F60;
import com.meta.maps.fancypins.FancyPinOverlayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$ActiveTransitionBatch$supersede$notify$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FancyPinOverlayView.ActiveTransitionBatch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$ActiveTransitionBatch$supersede$notify$1(FancyPinOverlayView.ActiveTransitionBatch activeTransitionBatch) {
        super(0);
        this.this$0 = activeTransitionBatch;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FancyPinOverlayView.ActiveTransitionBatch activeTransitionBatch = this.this$0;
        FancyPinTransitionObserver fancyPinTransitionObserver = activeTransitionBatch.observer;
        FancyPinTransitionBatchStatus fancyPinTransitionBatchStatus = FancyPinTransitionBatchStatus.SUPERSEDED;
        FancyPinTransitionBatch fancyPinTransitionBatch = activeTransitionBatch.snapshot;
        if (fancyPinTransitionBatch == null) {
            C7384Etj.A0b("snapshot");
            throw F60.createAndThrow();
        }
        fancyPinTransitionObserver.onTransition(fancyPinTransitionBatchStatus, fancyPinTransitionBatch);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
