package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class RentalCarDetailsSectionsKt$RentalCarLocationRows$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ RentalCarLocation $dropoff;
    public final /* synthetic */ MutableState<RentalCarLocation> $mapsLocation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarDetailsSectionsKt$RentalCarLocationRows$1$3$1$1(RentalCarLocation rentalCarLocation, MutableState<RentalCarLocation> mutableState) {
        super(0);
        this.$dropoff = rentalCarLocation;
        this.$mapsLocation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$mapsLocation$delegate.Af8(this.$dropoff);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
