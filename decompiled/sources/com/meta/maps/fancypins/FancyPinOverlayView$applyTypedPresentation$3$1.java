package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BV4;
import X.G0V;
import com.meta.maps.fancypins.FancyPinOverlayView;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$applyTypedPresentation$3$1 extends AbstractC7559F3s implements G0V<String, FancyPinPartAnimationHint, FancyPinPendingCompletion> {
    public final /* synthetic */ int $applyingFrameGeneration;
    public final /* synthetic */ FancyPinOverlayView.ActiveTransitionBatch $batch;
    public final /* synthetic */ Map<String, MutablePartRenderState> $nextStates;
    public final /* synthetic */ FancyPinPresentation $presentation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$applyTypedPresentation$3$1(Map<String, MutablePartRenderState> map, int i, FancyPinOverlayView.ActiveTransitionBatch activeTransitionBatch, FancyPinPresentation fancyPinPresentation) {
        super(2);
        this.$nextStates = map;
        this.$applyingFrameGeneration = i;
        this.$batch = activeTransitionBatch;
        this.$presentation = fancyPinPresentation;
    }

    @Override // X.G0V
    public final FancyPinPendingCompletion invoke(String str, FancyPinPartAnimationHint fancyPinPartAnimationHint) {
        AnonymousClass003.A0u(str, fancyPinPartAnimationHint);
        MutablePartRenderState mutablePartRenderState = this.$nextStates.get(str);
        if (mutablePartRenderState == null) {
            throw BV4.A0U();
        }
        return this.$batch.beginPart(this.$presentation.pin.id, str, fancyPinPartAnimationHint, mutablePartRenderState.pendingSnapshot(this.$applyingFrameGeneration));
    }
}
