package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.BV4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinViewRegistry$clearRetirements$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FancyPinViewRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinViewRegistry$clearRetirements$1(FancyPinViewRegistry fancyPinViewRegistry) {
        super(0);
        this.this$0 = fancyPinViewRegistry;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.retirementsBySlot = BV4.A0B();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
