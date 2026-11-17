package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraBuyCreditsViewModel $buyCreditsViewModel;
    public final /* synthetic */ MutableState<Boolean> $clearedStaleNotice$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$1$1(AuraBuyCreditsViewModel auraBuyCreditsViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.$buyCreditsViewModel = auraBuyCreditsViewModel;
        this.$clearedStaleNotice$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!MutableState.A0A((MutableState) this.$clearedStaleNotice$delegate)) {
            MutableState.A09(true, this.$clearedStaleNotice$delegate);
            this.$buyCreditsViewModel.clearCheckoutNotice();
        }
        return new C78g() { // from class: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
