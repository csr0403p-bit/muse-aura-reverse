package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationDeleteOption;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationKeepOption;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ ConfidentialVmDataMigrationCopy $copy;
    public final /* synthetic */ ConfidentialVmSwitchUiState $uiState;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmDataMigrationCopy $copy;
        public final /* synthetic */ ConfidentialVmSwitchUiState $uiState;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, ConfidentialVmSwitchUiState confidentialVmSwitchUiState, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel) {
            super(3);
            this.$copy = confidentialVmDataMigrationCopy;
            this.$uiState = confidentialVmSwitchUiState;
            this.$viewModel = confidentialVmSwitchViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption;
            boolean z = false;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy = this.$copy;
                if (confidentialVmDataMigrationCopy != null) {
                    confidentialVmDataMigrationKeepOption = confidentialVmDataMigrationCopy.keepOption;
                } else {
                    confidentialVmDataMigrationKeepOption = null;
                }
                ConfidentialVmSwitchUiState confidentialVmSwitchUiState = this.$uiState;
                boolean zIsSwitchingBack = confidentialVmSwitchUiState.isSwitchingBack();
                if (confidentialVmSwitchUiState.dataChoice == ConfidentialVmDataChoice.UPGRADE_MIGRATION) {
                    z = true;
                }
                boolean zA67 = bfm.A67(this.$viewModel);
                ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1$1$1$1(confidentialVmSwitchViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(confidentialVmSwitchViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1$1$2$1(confidentialVmSwitchViewModel2);
                    bfm.Ai0(objAaT2);
                }
                ConfidentialVmDataChoiceOptionsKt.ConfidentialVmKeepDataOption(confidentialVmDataMigrationKeepOption, zIsSwitchingBack, z, function0, (Function0) ((InterfaceC7353EnQ) objAaT2), C3U4.A04(BRg.A00, AuraDimensKt.SpacingMicro), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmDataMigrationCopy $copy;
        public final /* synthetic */ ConfidentialVmSwitchUiState $uiState;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, ConfidentialVmSwitchUiState confidentialVmSwitchUiState, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel) {
            super(3);
            this.$copy = confidentialVmDataMigrationCopy;
            this.$uiState = confidentialVmSwitchUiState;
            this.$viewModel = confidentialVmSwitchViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption;
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy = this.$copy;
                if (confidentialVmDataMigrationCopy != null) {
                    confidentialVmDataMigrationDeleteOption = confidentialVmDataMigrationCopy.deleteOption;
                } else {
                    confidentialVmDataMigrationDeleteOption = null;
                }
                ConfidentialVmSwitchUiState confidentialVmSwitchUiState = this.$uiState;
                boolean zIsSwitchingBack = confidentialVmSwitchUiState.isSwitchingBack();
                boolean zA1Z = AnonymousClass002.A1Z(confidentialVmSwitchUiState.dataChoice, ConfidentialVmDataChoice.START_FRESH);
                boolean zA67 = bfm.A67(this.$viewModel);
                ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1$2$1$1(confidentialVmSwitchViewModel);
                    bfm.Ai0(objAaT);
                }
                ConfidentialVmDataChoiceOptionsKt.ConfidentialVmStartFreshOption(confidentialVmDataMigrationDeleteOption, zIsSwitchingBack, zA1Z, (Function0) objAaT, C3U4.A03(BRg.A00, AuraDimensKt.SpacingMicro), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$copy, this.$uiState, this.$viewModel), -1483647491);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$copy, this.$uiState, this.$viewModel), -1715889612);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1(ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, ConfidentialVmSwitchUiState confidentialVmSwitchUiState, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel) {
        super(1);
        this.$copy = confidentialVmDataMigrationCopy;
        this.$uiState = confidentialVmSwitchUiState;
        this.$viewModel = confidentialVmSwitchViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
