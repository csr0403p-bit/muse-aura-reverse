package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.checkout.ui.HatchFormState;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEvent;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$DetailsStep$1$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchFormState $formState;
    public final /* synthetic */ G0U<HatchLinkOrderEvent, Unit> $onEvent;
    public final /* synthetic */ HatchLinkOrderFormState $state;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$onEvent.invoke(new HatchLinkOrderEvent.EditAddressPressed(str, HatchLinkOrderSheetKt.withDetails(this.$state.input, this.$formState.collected())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkOrderSheetKt$DetailsStep$1$3$1(G0U<? super HatchLinkOrderEvent, Unit> g0u, HatchLinkOrderFormState hatchLinkOrderFormState, HatchFormState hatchFormState) {
        super(1);
        this.$onEvent = g0u;
        this.$state = hatchLinkOrderFormState;
        this.$formState = hatchFormState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
