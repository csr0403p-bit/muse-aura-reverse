package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.C06G;
import X.C07C;
import X.C10G;
import X.C3U4;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgentPermissionTaskDetailsSheetKt$GenericTaskDetails$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ HatchScreen $screen;

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$GenericTaskDetails$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
                AgentPermissionRequestPreviewKt.m177AgentPermissionRequestPreviewContenthYmLsZ8(agentPermissionApproval.requestPreviewDocument, agentPermissionApproval.requestPreview, C06G.A0T(bfm), C06G.A08(bfm), this.$approval, this.$screen, C3U4.A09(C10G.A02, 16.0f), bfm, 1572864 | HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument.$stable | (HatchAgentPermissionsRepository.AgentPermissionApproval.$stable << 12), 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$approval, this.$screen), -1496802367);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionTaskDetailsSheetKt$GenericTaskDetails$1$2$1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen) {
        super(1);
        this.$approval = agentPermissionApproval;
        this.$screen = hatchScreen;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
