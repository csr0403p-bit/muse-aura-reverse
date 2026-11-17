package com.meta.maps.fancypins;

import X.C3cI;
import X.C7438Evz;
import X.Ht9;
import X.InterfaceC2349BUy;

/* loaded from: classes6.dex */
public final /* synthetic */ class FancyPinOverlayView$orderingObserver$1 implements InterfaceC2349BUy, FancyPinOrderingObserver {
    public final /* synthetic */ FancyPinOverlayView $tmp0;

    public FancyPinOverlayView$orderingObserver$1(FancyPinOverlayView fancyPinOverlayView) {
        this.$tmp0 = fancyPinOverlayView;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FancyPinOrderingObserver) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(0, this.$tmp0, FancyPinOverlayView.class, "refreshActiveDrawingKeys", "refreshActiveDrawingKeys()V", 0);
    }

    @Override // com.meta.maps.fancypins.FancyPinOrderingObserver
    public final void onOrderingChanged() {
        this.$tmp0.refreshActiveDrawingKeys();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
