package com.facebook.aura.rentalcars;

import X.F2X;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class RentalCarDetailsScreenKt$RentalCarDetailsScreen$2$1 extends F2X implements Function0<Unit> {
    public RentalCarDetailsScreenKt$RentalCarDetailsScreen$2$1(Object obj) {
        super(0, obj, AuraNavigator.class, "back", "back()Z", 8);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraNavigator) this.receiver).back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
