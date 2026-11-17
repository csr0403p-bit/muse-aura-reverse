package com.facebook.aura.hotels;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class HotelSelectionSheetKt$HotelSelectionSheet$4$4$1 extends C7438Evz implements Function0<Unit> {
    public HotelSelectionSheetKt$HotelSelectionSheet$4$4$1(Object obj) {
        super(0, obj, HotelSelectionViewModel.class, "reserve", "reserve()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HotelSelectionViewModel) this.receiver).reserve();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
