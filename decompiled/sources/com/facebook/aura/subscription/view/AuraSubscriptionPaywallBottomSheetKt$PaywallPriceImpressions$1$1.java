package com.facebook.aura.subscription.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.BO6;
import X.C0Yr;
import X.C60R;
import X.C7384Etj;
import X.C78g;
import X.C98d;
import X.C98f;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.iap.HatchTierPrice;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallPriceImpressions$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
    public final /* synthetic */ MutableState<Integer> $loggedPricesHash$delegate;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ BO6<String, HatchTierPrice> $prices;
    public final /* synthetic */ boolean $screenImpressionLogged;
    public final /* synthetic */ C98d $waterfallStage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallPriceImpressions$1$1(BO6<String, HatchTierPrice> bo6, boolean z, AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, C98d c98d, C98f c98f, MutableState<Integer> mutableState) {
        super(1);
        this.$prices = bo6;
        this.$screenImpressionLogged = z;
        this.$loaded = loaded;
        this.$waterfallStage = c98d;
        this.$nmeEntryPoint = c98f;
        this.$loggedPricesHash$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        BO6<String, HatchTierPrice> bo6;
        Integer value;
        Object next;
        int iA01 = C60R.A01(this.$prices);
        if (this.$screenImpressionLogged && this.$loaded != null && (bo6 = this.$prices) != null && !bo6.isEmpty() && ((value = this.$loggedPricesHash$delegate.getValue()) == null || iA01 != value.intValue())) {
            MutableState.A07(iA01, this.$loggedPricesHash$delegate);
            AuraSubscriptionPaywallViewModel.UiState.Loaded loaded = this.$loaded;
            AHD<SubscriptionProduct> ahd = loaded.products;
            BO6<String, HatchTierPrice> bo62 = loaded.prices;
            Iterator it = ahd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(((SubscriptionProduct) next).productId, loaded.defaultSelectedProductId)) {
                    break;
                }
            }
            AuraSubscriptionPaywallBottomSheetKt.logTierPriceImpressions(ahd, bo62, (SubscriptionProduct) next, this.$waterfallStage, this.$nmeEntryPoint);
        }
        return new C78g() { // from class: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallPriceImpressions$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
