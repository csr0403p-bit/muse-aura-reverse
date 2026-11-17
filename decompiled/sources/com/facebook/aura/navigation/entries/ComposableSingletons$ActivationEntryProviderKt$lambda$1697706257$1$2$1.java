package com.facebook.aura.navigation.entries;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.OnboardingGateScreenKey;
import com.facebook.aura.onboarding.OnboardingStartupGate;
import com.facebook.aura.ui.HatchSetupAnimationState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$2$1", f = "ActivationEntryProvider.kt", l = {97}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<AuraActivationViewModel.UiState> $uiState$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$2$1(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, C1BO<AuraActivationViewModel.UiState> c1bo, HtJ<? super ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$2$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$2$1(this.$userSession, this.$navigator, this.$uiState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AuraNavKey auraNavKey;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$uiState$delegate.getValue().activationState == ActivationState.FULLY_ACTIVATED) {
                auraNavKey = OnboardingStartupGate.Companion.getInstance(this.$userSession).hasCompletedOnboarding() ? ConversationTabScreenKey.INSTANCE : OnboardingGateScreenKey.INSTANCE;
                if (C7384Etj.areEqual(auraNavKey, ConversationTabScreenKey.INSTANCE)) {
                    HatchSetupAnimationState hatchSetupAnimationState = HatchSetupAnimationState.INSTANCE;
                    this.L$0 = auraNavKey;
                    this.label = 1;
                    if (hatchSetupAnimationState.finishAfterHold(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        auraNavKey = (AuraNavKey) this.L$0;
        Hwg.A00(obj);
        this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
        this.$navigator.navigate(auraNavKey, true);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
