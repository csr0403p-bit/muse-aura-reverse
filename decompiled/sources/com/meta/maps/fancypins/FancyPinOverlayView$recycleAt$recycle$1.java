package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$recycleAt$recycle$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FancyPinHullView $hull;
    public final /* synthetic */ int $index;
    public final /* synthetic */ FancyPinHullReuseKey $reuseKey;
    public final /* synthetic */ int $slotIndex;
    public final /* synthetic */ FancyPinOverlayView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$recycleAt$recycle$1(FancyPinOverlayView fancyPinOverlayView, int i, int i2, FancyPinHullView fancyPinHullView, FancyPinHullReuseKey fancyPinHullReuseKey) {
        super(0);
        this.this$0 = fancyPinOverlayView;
        this.$index = i;
        this.$slotIndex = i2;
        this.$hull = fancyPinHullView;
        this.$reuseKey = fancyPinHullReuseKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FancyPinOverlayView fancyPinOverlayView = this.this$0;
        float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
        fancyPinOverlayView.realizedHulls.removeAt(this.$index);
        this.this$0.realizedReuseKeys.removeAt(this.$index);
        this.this$0.lastAppliedPinIds.remove(this.$slotIndex);
        this.this$0.clearPresentationHistory(this.$slotIndex);
        FancyPinOverlayView fancyPinOverlayView2 = this.this$0;
        FancyPinHullView fancyPinHullView = this.$hull;
        C7384Etj.A0X(fancyPinHullView);
        fancyPinOverlayView2.detachHull(fancyPinHullView);
        FancyPinHullPool fancyPinHullPool = this.this$0.pool;
        FancyPinHullView fancyPinHullView2 = this.$hull;
        C7384Etj.A0X(fancyPinHullView2);
        FancyPinHullReuseKey fancyPinHullReuseKey = this.$reuseKey;
        C7384Etj.A0X(fancyPinHullReuseKey);
        fancyPinHullPool.recycle(fancyPinHullView2, fancyPinHullReuseKey);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
