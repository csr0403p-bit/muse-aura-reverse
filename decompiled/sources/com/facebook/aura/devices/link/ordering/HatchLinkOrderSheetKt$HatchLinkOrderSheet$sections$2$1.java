package com.facebook.aura.devices.link.ordering;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchLinkOrderSheetKt$HatchLinkOrderSheet$sections$2$1 extends C7438Evz implements Function0<Unit> {
    public HatchLinkOrderSheetKt$HatchLinkOrderSheet$sections$2$1(Object obj) {
        super(0, obj, HatchLinkOrderViewModel.class, "clearAddressSuggestions", "clearAddressSuggestions()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchLinkOrderViewModel) this.receiver).clearAddressSuggestions();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
