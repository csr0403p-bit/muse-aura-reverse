package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchLinkOrderSheetKt$HatchLinkOrderSheet$7$1$1 extends C7438Evz implements G0U<HatchLinkOrderEvent, Unit> {
    public HatchLinkOrderSheetKt$HatchLinkOrderSheet$7$1$1(Object obj) {
        super(1, obj, HatchLinkOrderViewModel.class, "onEvent", "onEvent(Lcom/facebook/aura/devices/link/ordering/HatchLinkOrderEvent;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchLinkOrderEvent hatchLinkOrderEvent) {
        ((HatchLinkOrderViewModel) AnonymousClass006.A0o(hatchLinkOrderEvent, this)).onEvent(hatchLinkOrderEvent);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchLinkOrderEvent hatchLinkOrderEvent) {
        invoke2(hatchLinkOrderEvent);
        return Unit.INSTANCE;
    }
}
