package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1BO;
import X.G0V;
import com.facebook.aura.status.viewmodel.HatchStatusUiState;
import com.facebook.aura.status.viewmodel.HatchStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$HatchStatusScreen$5$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ C1BO<HatchStatusUiState> $uiState$delegate;
    public final /* synthetic */ HatchStatusViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$HatchStatusScreen$5$1$1$1(HatchStatusViewModel hatchStatusViewModel, Function0<Unit> function0, C1BO<HatchStatusUiState> c1bo) {
        super(2);
        this.$viewModel = hatchStatusViewModel;
        this.$onDismissRequest = function0;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchStatusScreenKt.HeaderButtons(this.$viewModel, this.$uiState$delegate.getValue(), this.$onDismissRequest, null, bfm, 0, 8);
        } else {
            bfm.Afo();
        }
    }
}
