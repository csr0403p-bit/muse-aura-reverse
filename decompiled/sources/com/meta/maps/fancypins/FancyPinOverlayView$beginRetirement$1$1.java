package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import android.view.ViewParent;
import com.meta.maps.fancypins.FancyPinOverlayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$beginRetirement$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FancyPinOverlayView.RetiringHull $existingRetirement;
    public final /* synthetic */ FancyPinOverlayView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinOverlayView$beginRetirement$1$1(FancyPinOverlayView.RetiringHull retiringHull, FancyPinOverlayView fancyPinOverlayView) {
        super(0);
        this.$existingRetirement = retiringHull;
        this.this$0 = fancyPinOverlayView;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ViewParent parent = this.$existingRetirement.hull.getParent();
        FancyPinOverlayView fancyPinOverlayView = this.this$0;
        if (parent == fancyPinOverlayView) {
            fancyPinOverlayView.detachHull(this.$existingRetirement.hull);
        }
        this.$existingRetirement.hull.prepareForReuse();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
