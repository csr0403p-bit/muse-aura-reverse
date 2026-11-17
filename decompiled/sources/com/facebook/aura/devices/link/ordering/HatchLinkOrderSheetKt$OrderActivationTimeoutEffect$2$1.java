package com.facebook.aura.devices.link.ordering;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkActivationDelayedDialogKey;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1", f = "HatchLinkOrderSheet.kt", l = {265}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchLinkOrderSheetKey $orderKey;
    public final /* synthetic */ HatchLinkOrderViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1(HatchLinkOrderViewModel hatchLinkOrderViewModel, AuraNavigator auraNavigator, HatchLinkOrderSheetKey hatchLinkOrderSheetKey, HtJ<? super HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchLinkOrderViewModel;
        this.$navigator = auraNavigator;
        this.$orderKey = hatchLinkOrderSheetKey;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1(this.$viewModel, this.$navigator, this.$orderKey, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HatchLinkOrderViewModel hatchLinkOrderViewModel = this.$viewModel;
            C1BN<HatchLinkOrderFormState> c1bn = hatchLinkOrderViewModel.state;
            final AuraNavigator auraNavigator = this.$navigator;
            final HatchLinkOrderSheetKey hatchLinkOrderSheetKey = this.$orderKey;
            C20Z<? super HatchLinkOrderFormState> c20z = new C20Z() { // from class: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1.1
                public final Object emit(HatchLinkOrderFormState hatchLinkOrderFormState, HtJ<? super Unit> htJ) {
                    HatchLinkPostPurchaseState hatchLinkPostPurchaseState = hatchLinkOrderFormState.postPurchase;
                    if ((hatchLinkPostPurchaseState != null ? hatchLinkPostPurchaseState.activation : null) == HatchLinkSubscriptionActivation.TIMED_OUT && auraNavigator.isInBackStack(hatchLinkOrderSheetKey) && hatchLinkOrderViewModel.consumeActivationTimeout()) {
                        auraNavigator.popAll(Collections.singletonList(hatchLinkOrderSheetKey));
                        auraNavigator.navigate((AuraNavKey) HatchLinkActivationDelayedDialogKey.INSTANCE, false);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchLinkOrderFormState) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c1bn.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
