package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> $uiState$delegate;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> $uiState$delegate;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> c1bo) {
            super(3);
            this.$viewModel = hatchDataPrivacySettingsViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchDataPrivacySettingsViewModel.AiTrainingUiState aiTrainingUiState = this.$uiState$delegate.getValue().aiTraining;
                HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(hatchDataPrivacySettingsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$2$1$1$1$1(hatchDataPrivacySettingsViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(hatchDataPrivacySettingsViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$2$1$1$2$1(hatchDataPrivacySettingsViewModel2);
                    bfm.Ai0(objAaT2);
                }
                HatchDataPrivacySettingsScreenKt.AiTrainingToggleCard(aiTrainingUiState, function0, (G0U) ((InterfaceC7353EnQ) objAaT2), null, bfm, HatchDataPrivacySettingsViewModel.AiTrainingUiState.$stable, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$viewModel, this.$uiState$delegate), 493938221);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$2$1(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> c1bo) {
        super(1);
        this.$viewModel = hatchDataPrivacySettingsViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
