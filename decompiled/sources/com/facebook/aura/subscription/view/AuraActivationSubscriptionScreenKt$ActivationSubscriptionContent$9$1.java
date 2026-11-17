package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C98f;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $currentTierCode;
    public final /* synthetic */ PaywallFunnel $funnel;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ MutableState<Boolean> $screenImpressionLogged$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$9$1(PaywallFunnel paywallFunnel, C98f c98f, String str, AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, MutableState<Boolean> mutableState) {
        super(0);
        this.$funnel = paywallFunnel;
        this.$nmeEntryPoint = c98f;
        this.$currentTierCode = str;
        this.$loaded = loaded;
        this.$screenImpressionLogged$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object next;
        PaywallFunnel paywallFunnel = this.$funnel;
        C98f c98f = this.$nmeEntryPoint;
        String str = this.$currentTierCode;
        AuraSubscriptionPaywallViewModel.UiState.Loaded loaded = this.$loaded;
        Iterator it = loaded.products.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C7384Etj.areEqual(((SubscriptionProduct) next).productId, loaded.defaultSelectedProductId)) {
                    break;
                }
            }
        }
        AuraSubscriptionPaywallBottomSheetKt.logPaywallScreenImpression(paywallFunnel, c98f, str, (SubscriptionProduct) next, false);
        MutableState.A09(true, this.$screenImpressionLogged$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
