package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$sendServerDecisions$results$1", f = "HatchAgentPermissionsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$sendServerDecisions$results$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Map<String, ? extends ApprovalDecisionResultJson>>, Object> {
    public final /* synthetic */ DecideApprovalsResultJson $response;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$sendServerDecisions$results$1(DecideApprovalsResultJson decideApprovalsResultJson, HtJ<? super HatchAgentPermissionsRepository$sendServerDecisions$results$1> htJ) {
        super(2, htJ);
        this.$response = decideApprovalsResultJson;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAgentPermissionsRepository$sendServerDecisions$results$1(this.$response, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Map<String, ? extends ApprovalDecisionResultJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super Map<String, ApprovalDecisionResultJson>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.$response.decodedResults();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super Map<String, ApprovalDecisionResultJson>> htJ) {
        return new HatchAgentPermissionsRepository$sendServerDecisions$results$1(this.$response, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
