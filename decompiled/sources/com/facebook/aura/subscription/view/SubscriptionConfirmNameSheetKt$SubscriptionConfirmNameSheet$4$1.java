package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;
    public final /* synthetic */ HatchScreen $originScreen;
    public final /* synthetic */ HatchSubsurface $originSubsurface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$4$1(FragmentActivity fragmentActivity, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen) {
        super(1);
        this.$activity = fragmentActivity;
        this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        this.$originSubsurface = hatchSubsurface;
        this.$originScreen = hatchScreen;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final FragmentActivity fragmentActivity = this.$activity;
        final AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel = this.$nameGateViewModel;
        final HatchSubsurface hatchSubsurface = this.$originSubsurface;
        final HatchScreen hatchScreen = this.$originScreen;
        return new C78g() { // from class: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                AuraSubscriptionNameGateViewModel.NameExit nameExitNameCollectionExit;
                FragmentActivity fragmentActivity2 = fragmentActivity;
                if ((fragmentActivity2 == null || !fragmentActivity2.isChangingConfigurations()) && (nameExitNameCollectionExit = auraSubscriptionNameGateViewModel.nameCollectionExit()) != null) {
                    SubscriptionSheetHelpersKt.logCheckoutOutcome(hatchSubsurface, hatchScreen, nameExitNameCollectionExit.payMetadata, nameExitNameCollectionExit.failureReason, nameExitNameCollectionExit.result);
                }
            }
        };
    }
}
