package com.facebook.aura.confidentialvm.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmDataChoiceScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$2$1", f = "ConfidentialVmSubscriptionEndedActions.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $switchViewModel;
    public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$2$1(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, AuraNavigator auraNavigator, HtJ<? super ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = confidentialVmSubscriptionEndedViewModel;
        this.$switchViewModel = confidentialVmSwitchViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$2$1(this.$viewModel, this.$switchViewModel, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel = this.$viewModel;
            C20Q<Integer> c20q = confidentialVmSubscriptionEndedViewModel.continueConfirmed;
            final ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$switchViewModel;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super Integer> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A0F(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(int i2, HtJ<? super Unit> htJ) {
                    if (confidentialVmSubscriptionEndedViewModel.claimContinue(i2)) {
                        confidentialVmSwitchViewModel.onSwitchBackConfirmed(ConfidentialVmSwitchEntryPoint.SUBSCRIPTION_ENDED);
                        auraNavigator.navigate((AuraNavKey) ConfidentialVmDataChoiceScreenKey.INSTANCE, false);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
