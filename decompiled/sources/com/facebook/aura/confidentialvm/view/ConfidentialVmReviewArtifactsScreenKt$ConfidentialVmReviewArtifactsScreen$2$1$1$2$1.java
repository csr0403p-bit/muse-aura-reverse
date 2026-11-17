package com.facebook.aura.confidentialvm.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmArtifact;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<ConfidentialVmArtifact> ahd = this.$uiState$delegate.getValue().artifacts;
        ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
        C1BO<ConfidentialVmSwitchUiState> c1bo = this.$uiState$delegate;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$2$1$1$1((ConfidentialVmArtifact) it.next(), confidentialVmSwitchViewModel, c1bo), 1307946753);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$2$1(C1BO<ConfidentialVmSwitchUiState> c1bo, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel) {
        super(1);
        this.$uiState$delegate = c1bo;
        this.$viewModel = confidentialVmSwitchViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
