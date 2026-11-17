package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import android.util.SparseArray;
import com.meta.maps.fancypins.FancyPinOverlayView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$retireHulls$retire$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ List<FancyPinOverlayView.PendingRetirement> $retirements;
    public final /* synthetic */ FancyPinOverlayView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$retireHulls$retire$1(List<FancyPinOverlayView.PendingRetirement> list, FancyPinOverlayView fancyPinOverlayView) {
        super(0);
        this.$retirements = list;
        this.this$0 = fancyPinOverlayView;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws Throwable {
        for (FancyPinOverlayView.PendingRetirement pendingRetirement : this.$retirements) {
            FancyPinOverlayView fancyPinOverlayView = this.this$0;
            float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
            SparseArray<FancyPinOverlayView.RetiringHull> sparseArray = fancyPinOverlayView.retiringHulls;
            int i = pendingRetirement.slotIndex;
            FancyPinOverlayView.RetiringHull retiringHull = sparseArray.get(i);
            FancyPinHullView fancyPinHullView = retiringHull != null ? retiringHull.hull : null;
            FancyPinHullView fancyPinHullView2 = pendingRetirement.hull;
            if (fancyPinHullView != fancyPinHullView2 && fancyPinOverlayView.realizedHulls.get(i) == fancyPinHullView2 && fancyPinOverlayView.lastRowOutsideViewport(i)) {
                this.this$0.evictHiddenHullOutsideViewport(pendingRetirement.slotIndex, pendingRetirement.retirement, pendingRetirement.removedPinId, false);
            } else {
                this.this$0.beginRetirement(pendingRetirement.slotIndex, pendingRetirement.hull, pendingRetirement.retirement, pendingRetirement.removedPinId, pendingRetirement.updatesRemovalIdentity);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
