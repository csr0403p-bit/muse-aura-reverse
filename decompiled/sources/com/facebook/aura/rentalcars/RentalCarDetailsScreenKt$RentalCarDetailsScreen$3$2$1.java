package com.facebook.aura.rentalcars;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class RentalCarDetailsScreenKt$RentalCarDetailsScreen$3$2$1 extends C7438Evz implements Function0<Unit> {
    public RentalCarDetailsScreenKt$RentalCarDetailsScreen$3$2$1(Object obj) {
        super(0, obj, RentalCarDetailsViewModel.class, "book", "book()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RentalCarDetailsViewModel) this.receiver).book();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
