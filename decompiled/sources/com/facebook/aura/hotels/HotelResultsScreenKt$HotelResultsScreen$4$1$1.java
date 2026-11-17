package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HotelResultsScreenKt$HotelResultsScreen$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HotelResultsViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelResultsScreenKt$HotelResultsScreen$4$1$1(HotelResultsViewModel hotelResultsViewModel) {
        super(0);
        this.$model = hotelResultsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.load(true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
