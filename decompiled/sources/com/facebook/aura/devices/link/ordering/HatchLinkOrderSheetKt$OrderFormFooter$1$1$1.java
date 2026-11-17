package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.checkout.ui.HatchFormState;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$OrderFormFooter$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchFormState $formState;
    public final /* synthetic */ G0U<HatchLinkOrderEvent, Unit> $onEvent;
    public final /* synthetic */ HatchLinkOrderFormState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkOrderSheetKt$OrderFormFooter$1$1$1(G0U<? super HatchLinkOrderEvent, Unit> g0u, HatchLinkOrderFormState hatchLinkOrderFormState, HatchFormState hatchFormState) {
        super(0);
        this.$onEvent = g0u;
        this.$state = hatchLinkOrderFormState;
        this.$formState = hatchFormState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onEvent.invoke(new HatchLinkOrderEvent.SubmitPressed(HatchLinkOrderSheetKt.withDetails(this.$state.input, this.$formState.collected())));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
