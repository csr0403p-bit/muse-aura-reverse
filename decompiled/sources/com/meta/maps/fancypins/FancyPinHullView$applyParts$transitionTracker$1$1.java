package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinHullView$applyParts$transitionTracker$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ long $generation;
    public final /* synthetic */ FancyPinHullView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinHullView$applyParts$transitionTracker$1$1(FancyPinHullView fancyPinHullView, long j) {
        super(0);
        this.this$0 = fancyPinHullView;
        this.$generation = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1M((this.this$0.applyGeneration > this.$generation ? 1 : (this.this$0.applyGeneration == this.$generation ? 0 : -1))));
    }
}
