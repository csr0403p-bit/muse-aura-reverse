package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.CheckoutLodgingPolicy;
import com.facebook.aura.navigation.key.CheckoutLodgingPolicySheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RichApprovalCardKt$ShopifyRichCard$5$1 extends AbstractC7559F3s implements G0U<CheckoutLodgingPolicy, Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ G0V<HatchComponent, AuraNavKey, Unit> $tap;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CheckoutLodgingPolicy checkoutLodgingPolicy) {
        C7384Etj.A0Y(checkoutLodgingPolicy, 0);
        this.$tap.invoke(null, new CheckoutLodgingPolicySheetKey(this.$approval.approvalId, checkoutLodgingPolicy));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RichApprovalCardKt$ShopifyRichCard$5$1(G0V<? super HatchComponent, ? super AuraNavKey, Unit> g0v, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(1);
        this.$tap = g0v;
        this.$approval = agentPermissionApproval;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(CheckoutLodgingPolicy checkoutLodgingPolicy) {
        invoke2(checkoutLodgingPolicy);
        return Unit.INSTANCE;
    }
}
