package com.meta.maps.fancypins;

import X.C3cI;
import X.C7438Evz;
import X.Ht9;
import X.InterfaceC2349BUy;
import com.meta.maps.fancypins.FancyPinOverlayView;

/* loaded from: classes6.dex */
public final /* synthetic */ class FancyPinOverlayView$ActiveTransitionBatch$tracker$2 implements InterfaceC2349BUy, FancyPinPartApplyCompletion {
    public final /* synthetic */ FancyPinOverlayView.ActiveTransitionBatch $tmp0;

    public FancyPinOverlayView$ActiveTransitionBatch$tracker$2(FancyPinOverlayView.ActiveTransitionBatch activeTransitionBatch) {
        this.$tmp0 = activeTransitionBatch;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FancyPinPartApplyCompletion) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(0, this.$tmp0, FancyPinOverlayView.ActiveTransitionBatch.class, "complete", "complete()V", 0);
    }

    @Override // com.meta.maps.fancypins.FancyPinPartApplyCompletion
    public final void onComplete() {
        this.$tmp0.complete();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
