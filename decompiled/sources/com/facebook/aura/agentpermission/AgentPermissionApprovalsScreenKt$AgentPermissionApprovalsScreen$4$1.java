package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C0CD;
import X.C1BO;
import X.C3cH;
import X.C7384Etj;
import X.C7438Evz;
import X.F2X;
import X.G0U;
import X.G0V;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgentPermissionDecisionSheetKey;
import com.facebook.aura.navigation.key.AgentPermissionHistoryDetailsSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C1BO<AgentPermissionApprovalsUiState> $uiState$delegate;
    public final /* synthetic */ AgentPermissionApprovalsViewModel $viewModel;

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0V<HatchAgentPermissionsRepository.AgentPermissionApproval, Integer, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, AgentPermissionApprovalsViewModel.class, BrowserOperationCatalogKt.SUBMIT, "submit(Lcom/facebook/aura/gateway/HatchAgentPermissionsRepository$AgentPermissionApproval;I)V", 0);
        }

        public final void invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, int i) {
            ((AgentPermissionApprovalsViewModel) AnonymousClass006.A0o(agentPermissionApproval, this)).submit(agentPermissionApproval, i);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Integer num) {
            invoke(agentPermissionApproval, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            C7384Etj.A0Y(agentPermissionApproval, 0);
            this.$navigator.navigate((AuraNavKey) new AgentPermissionDecisionSheetKey(agentPermissionApproval.approvalId), false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavigator auraNavigator) {
            super(1);
            this.$navigator = auraNavigator;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            invoke2(agentPermissionApproval);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $sessionId;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            C7384Etj.A0Y(agentPermissionApproval, 0);
            this.$navigator.navigate((AuraNavKey) new AgentPermissionHistoryDetailsSheetKey(agentPermissionApproval.approvalId, this.$sessionId), false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraNavigator auraNavigator, String str) {
            super(1);
            this.$navigator = auraNavigator;
            this.$sessionId = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            invoke2(agentPermissionApproval);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AgentPermissionApprovalsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AgentPermissionApprovalsViewModel agentPermissionApprovalsViewModel) {
            super(0);
            this.$viewModel = agentPermissionApprovalsViewModel;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.loadHistory(true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends F2X implements Function0<Unit> {
        public AnonymousClass5(Object obj) {
            super(0, obj, AgentPermissionApprovalsViewModel.class, "loadHistory", "loadHistory(Z)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AgentPermissionApprovalsViewModel) this.receiver).loadHistory(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        AgentPermissionApprovalsScreenKt.openApprovalsSection(c0cd, C3cH.A0J(this.$uiState$delegate), new AnonymousClass1(this.$viewModel), new AnonymousClass2(this.$navigator));
        AgentPermissionApprovalsScreenKt.actionedApprovalsSection(c0cd, C3cH.A0J(this.$uiState$delegate), new AnonymousClass3(this.$navigator, this.$sessionId));
        AgentPermissionApprovalsUiState agentPermissionApprovalsUiStateA0J = C3cH.A0J(this.$uiState$delegate);
        AgentPermissionApprovalsViewModel agentPermissionApprovalsViewModel = this.$viewModel;
        AgentPermissionApprovalsScreenKt.approvalsStatusItem(c0cd, agentPermissionApprovalsUiStateA0J, new AnonymousClass4(agentPermissionApprovalsViewModel), new AnonymousClass5(agentPermissionApprovalsViewModel));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1(AgentPermissionApprovalsViewModel agentPermissionApprovalsViewModel, C1BO<AgentPermissionApprovalsUiState> c1bo, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$viewModel = agentPermissionApprovalsViewModel;
        this.$uiState$delegate = c1bo;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
