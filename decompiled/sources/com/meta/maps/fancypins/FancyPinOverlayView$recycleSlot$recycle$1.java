package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import com.meta.maps.fancypins.FancyPinOverlayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$recycleSlot$recycle$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $clearPresentationHistory;
    public final /* synthetic */ FancyPinHullView $hull;
    public final /* synthetic */ FancyPinHullReuseKey $reuseKey;
    public final /* synthetic */ int $slotIndex;
    public final /* synthetic */ FancyPinOverlayView this$0;

    /* renamed from: com.meta.maps.fancypins.FancyPinOverlayView$recycleSlot$recycle$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ boolean $clearPresentationHistory;
        public final /* synthetic */ FancyPinHullView $hull;
        public final /* synthetic */ FancyPinHullReuseKey $reuseKey;
        public final /* synthetic */ int $slotIndex;
        public final /* synthetic */ FancyPinOverlayView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FancyPinOverlayView fancyPinOverlayView, int i, boolean z, FancyPinHullView fancyPinHullView, FancyPinHullReuseKey fancyPinHullReuseKey) {
            super(0);
            this.this$0 = fancyPinOverlayView;
            this.$slotIndex = i;
            this.$clearPresentationHistory = z;
            this.$hull = fancyPinHullView;
            this.$reuseKey = fancyPinHullReuseKey;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FancyPinOverlayView fancyPinOverlayView = this.this$0;
            float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
            fancyPinOverlayView.realizedHulls.remove(this.$slotIndex);
            this.this$0.realizedReuseKeys.remove(this.$slotIndex);
            this.this$0.pendingHullAppearances.remove(this.$slotIndex);
            if (this.$clearPresentationHistory) {
                this.this$0.clearPresentationHistory(this.$slotIndex);
            }
            this.this$0.detachHull(this.$hull);
            this.this$0.pool.recycle(this.$hull, this.$reuseKey);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$recycleSlot$recycle$1(FancyPinOverlayView fancyPinOverlayView, int i, FancyPinHullView fancyPinHullView, boolean z, FancyPinHullReuseKey fancyPinHullReuseKey) {
        super(0);
        this.this$0 = fancyPinOverlayView;
        this.$slotIndex = i;
        this.$hull = fancyPinHullView;
        this.$clearPresentationHistory = z;
        this.$reuseKey = fancyPinHullReuseKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws Throwable {
        FancyPinOverlayView.RetiringHull retiringHullCancelRetirement = this.this$0.cancelRetirement(this.$slotIndex, this.$hull, false);
        this.this$0.cancelAppearance(this.$slotIndex, this.$hull, false);
        FancyPinOverlayView fancyPinOverlayView = this.this$0;
        fancyPinOverlayView.recycleThenCompleteRetirement(retiringHullCancelRetirement, new AnonymousClass1(fancyPinOverlayView, this.$slotIndex, this.$clearPresentationHistory, this.$hull, this.$reuseKey));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
