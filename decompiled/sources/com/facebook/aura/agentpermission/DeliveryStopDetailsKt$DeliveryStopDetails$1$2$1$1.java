package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.DeliveryCheckoutHandoff;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class DeliveryStopDetailsKt$DeliveryStopDetails$1$2$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ DeliveryStopInstructionsUiState $instructions;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        DeliveryCheckoutHandoff deliveryCheckoutHandoff = this.$instructions.handoff;
        if (deliveryCheckoutHandoff != null) {
            AnonymousClass005.A0u(hatchSectionScope, new DeliveryStopDetailsKt$DeliveryStopDetails$1$2$1$1$1$1(deliveryCheckoutHandoff), 650053740);
        }
        String str = this.$instructions.text;
        if (str != null) {
            AnonymousClass005.A0u(hatchSectionScope, new DeliveryStopDetailsKt$DeliveryStopDetails$1$2$1$1$2$1(str), 159269524);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryStopDetailsKt$DeliveryStopDetails$1$2$1$1(DeliveryStopInstructionsUiState deliveryStopInstructionsUiState) {
        super(1);
        this.$instructions = deliveryStopInstructionsUiState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
