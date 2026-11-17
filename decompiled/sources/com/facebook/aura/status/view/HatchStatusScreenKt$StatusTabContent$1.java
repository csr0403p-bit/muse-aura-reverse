package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import com.facebook.aura.status.viewmodel.HatchStatusUiState;
import com.facebook.aura.status.viewmodel.HatchStatusViewModel;
import com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$StatusTabContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isConnected;
    public final /* synthetic */ HatchStatusUiState $uiState;
    public final /* synthetic */ HatchStatusViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$StatusTabContent$1(HatchStatusUiState hatchStatusUiState, HatchStatusViewModel hatchStatusViewModel, boolean z) {
        super(2);
        this.$uiState = hatchStatusUiState;
        this.$viewModel = hatchStatusViewModel;
        this.$isConnected = z;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AHD<HatchUpcomingTaskUiModel> ahd = this.$uiState.upcomingTasks;
            HatchStatusViewModel hatchStatusViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(hatchStatusViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchStatusScreenKt$StatusTabContent$1$1$1(hatchStatusViewModel);
                bfm.Ai0(objAaT);
            }
            ActivityScheduledTasksKt.ActivityScheduledTasks(ahd, (G0U) ((InterfaceC7353EnQ) objAaT), this.$isConnected, null, null, bfm, 0, 24);
            return;
        }
        bfm.Afo();
    }
}
