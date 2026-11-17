package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.C8j4;
import X.C98f;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$6$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C98f $entrypoint;
    public final /* synthetic */ boolean $hasPacks;
    public final /* synthetic */ MutableState<Integer> $loggedPacksHash$delegate;
    public final /* synthetic */ C1BO<AuraBuyCreditsViewModel.UiState> $uiState$delegate;
    public final /* synthetic */ HatchNMEGaiWaterfallEventLogger $waterfallLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$6$1(boolean z, HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f, C1BO<AuraBuyCreditsViewModel.UiState> c1bo, MutableState<Integer> mutableState) {
        super(1);
        this.$hasPacks = z;
        this.$waterfallLogger = hatchNMEGaiWaterfallEventLogger;
        this.$entrypoint = c98f;
        this.$uiState$delegate = c1bo;
        this.$loggedPacksHash$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Integer value;
        int iHashCode = C8j4.A1D(this.$uiState$delegate).hashCode();
        if (this.$hasPacks && ((value = this.$loggedPacksHash$delegate.getValue()) == null || iHashCode != value.intValue())) {
            MutableState.A07(iHashCode, this.$loggedPacksHash$delegate);
            AuraBuyCreditsBottomSheetKt.logPackPriceImpressions(C8j4.A1D(this.$uiState$delegate), this.$waterfallLogger, this.$entrypoint);
        }
        return new C78g() { // from class: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$6$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
