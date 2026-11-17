package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.deeplink.HatchDeferredDeeplinks;

/* loaded from: classes.dex */
public final class HatchIntentViewModelKt$DeeplinkNavigation$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Boolean> $isOnboarding$delegate;
    public final /* synthetic */ C1BO<Boolean> $isReadyForNavigation$delegate;
    public final /* synthetic */ C1BO<HatchDeferredDeeplinks.Link> $linkAwaitingActivation$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ HatchIntentViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIntentViewModelKt$DeeplinkNavigation$1$1(HatchIntentViewModel hatchIntentViewModel, AbstractC3358CGz abstractC3358CGz, C1BO<HatchDeferredDeeplinks.Link> c1bo, C1BO<Boolean> c1bo2, C1BO<Boolean> c1bo3) {
        super(1);
        this.$viewModel = hatchIntentViewModel;
        this.$userSession = abstractC3358CGz;
        this.$linkAwaitingActivation$delegate = c1bo;
        this.$isReadyForNavigation$delegate = c1bo2;
        this.$isOnboarding$delegate = c1bo3;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchDeferredDeeplinks.Link value = this.$linkAwaitingActivation$delegate.getValue();
        if (value != null && C1BO.A0F(this.$isReadyForNavigation$delegate) && !C1BO.A0F(this.$isOnboarding$delegate)) {
            this.$viewModel.resolveAfterActivation(value, this.$userSession);
        }
        return new C78g() { // from class: com.facebook.aura.deeplink.HatchIntentViewModelKt$DeeplinkNavigation$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
