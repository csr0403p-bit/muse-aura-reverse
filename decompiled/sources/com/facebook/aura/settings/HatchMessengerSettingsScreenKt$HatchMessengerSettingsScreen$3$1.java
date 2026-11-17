package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import android.content.Context;
import com.facebook.aura.toast.api.ToastApi;

/* loaded from: classes.dex */
public final class HatchMessengerSettingsScreenKt$HatchMessengerSettingsScreen$3$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<HatchMessengerUiState> $uiState$delegate;
    public final /* synthetic */ HatchMessengerViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        Integer num = this.$uiState$delegate.getValue().pendingToastResId;
        if (num != null) {
            Context context = this.$context;
            HatchMessengerViewModel hatchMessengerViewModel = this.$viewModel;
            ToastApi.INSTANCE.showToast(context.getString(num.intValue()));
            hatchMessengerViewModel.consumePendingToast();
        }
        if (this.$uiState$delegate.getValue().connectPhase == MessengerConnectPhase.AWAITING_RETURN) {
            this.$viewModel.onResumeFromMessenger();
        }
        this.$viewModel.invalidateFBAccountCache();
        this.$viewModel.fetchLinkedFBAccounts();
        return new InterfaceC06807bD() { // from class: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$HatchMessengerSettingsScreen$3$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessengerSettingsScreenKt$HatchMessengerSettingsScreen$3$1(HatchMessengerViewModel hatchMessengerViewModel, C1BO<HatchMessengerUiState> c1bo, Context context) {
        super(1);
        this.$viewModel = hatchMessengerViewModel;
        this.$uiState$delegate = c1bo;
        this.$context = context;
    }
}
