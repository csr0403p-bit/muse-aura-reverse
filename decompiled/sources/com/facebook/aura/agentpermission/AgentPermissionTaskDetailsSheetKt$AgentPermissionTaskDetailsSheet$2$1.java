package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$2$1", f = "AgentPermissionTaskDetailsSheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<HatchAgentPermissionsRepository.AgentPermissionApproval> $approval$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$2$1(AuraNavigator auraNavigator, C1BO<HatchAgentPermissionsRepository.AgentPermissionApproval> c1bo, HtJ<? super AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$2$1> htJ) {
        super(2, htJ);
        this.$navigator = auraNavigator;
        this.$approval$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$2$1(this.$navigator, this.$approval$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$approval$delegate.getValue() == null) {
            this.$navigator.back();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
