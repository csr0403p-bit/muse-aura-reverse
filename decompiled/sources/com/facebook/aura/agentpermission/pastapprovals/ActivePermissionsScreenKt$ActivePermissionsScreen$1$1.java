package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$ActivePermissionsScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<ActivePermissionsUiState> $uiState$delegate;
    public final /* synthetic */ ActivePermissionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsScreenKt$ActivePermissionsScreen$1$1(ActivePermissionsViewModel activePermissionsViewModel, C1BO<ActivePermissionsUiState> c1bo) {
        super(1);
        this.$viewModel = activePermissionsViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$uiState$delegate.getValue().loadingState == ActivePermissionsLoadingState.IDLE) {
            this.$viewModel.loadPermissions(false);
        }
        return new C78g() { // from class: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
