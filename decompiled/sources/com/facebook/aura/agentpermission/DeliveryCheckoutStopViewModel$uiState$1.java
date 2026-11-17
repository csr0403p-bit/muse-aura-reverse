package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$uiState$1", f = "DeliveryCheckoutStopViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class DeliveryCheckoutStopViewModel$uiState$1 extends AbstractC07127nr implements G0W<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, Boolean, HtJ<? super DeliveryCheckoutStopUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ DeliveryCheckoutStopViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCheckoutStopViewModel$uiState$1(DeliveryCheckoutStopViewModel deliveryCheckoutStopViewModel, HtJ<? super DeliveryCheckoutStopViewModel$uiState$1> htJ) {
        super(3, htJ);
        this.this$0 = deliveryCheckoutStopViewModel;
    }

    public final Object invoke(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, boolean z, HtJ<? super DeliveryCheckoutStopUiState> htJ) {
        DeliveryCheckoutStopViewModel$uiState$1 deliveryCheckoutStopViewModel$uiState$1 = new DeliveryCheckoutStopViewModel$uiState$1(this.this$0, htJ);
        deliveryCheckoutStopViewModel$uiState$1.L$0 = list;
        deliveryCheckoutStopViewModel$uiState$1.Z$0 = z;
        return deliveryCheckoutStopViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        DeliveryCheckoutStopViewModel deliveryCheckoutStopViewModel = this.this$0;
        return deliveryCheckoutStopViewModel.stopUiState(deliveryCheckoutStopViewModel.selectedStop(list), z);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, Boolean bool, HtJ<? super DeliveryCheckoutStopUiState> htJ) {
        return invoke((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, AnonymousClass001.A1X(bool), htJ);
    }
}
