package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C78N;
import X.G0W;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmArtifact;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$2$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ ConfidentialVmArtifact $artifact;
    public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$2$1$1$1(ConfidentialVmArtifact confidentialVmArtifact, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, C1BO<ConfidentialVmSwitchUiState> c1bo) {
        super(3);
        this.$artifact = confidentialVmArtifact;
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            ConfidentialVmArtifact confidentialVmArtifact = this.$artifact;
            boolean zContains = this.$uiState$delegate.getValue().selectedArtifactIds.contains(this.$artifact.id);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$artifact, bfm.A67(this.$viewModel));
            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
            ConfidentialVmArtifact confidentialVmArtifact2 = this.$artifact;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$2$1$1$1$1$1(confidentialVmSwitchViewModel, confidentialVmArtifact2);
                bfm.Ai0(objAaT);
            }
            ConfidentialVmReviewArtifactsScreenKt.ArtifactRow(confidentialVmArtifact, zContains, (Function0) objAaT, null, bfm, 0, 8);
            return;
        }
        bfm.Afo();
    }
}
