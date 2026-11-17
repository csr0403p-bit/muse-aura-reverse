package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$HatchLinkOrderSheet$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchLinkOrderViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkOrderSheetKt$HatchLinkOrderSheet$2$1(HatchLinkOrderViewModel hatchLinkOrderViewModel) {
        super(0);
        this.$viewModel = hatchLinkOrderViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onEvent(HatchLinkOrderEvent.ContinuePressed.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
