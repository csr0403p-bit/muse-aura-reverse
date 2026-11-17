package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewEffect;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$5$1", f = "HatchCcvCardEntryHost.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismissed$delegate;
    public final /* synthetic */ HatchCcvViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$5$1(HatchCcvViewModel hatchCcvViewModel, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$5$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchCcvViewModel;
        this.$currentOnDismissed$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$5$1(this.$viewModel, this.$currentOnDismissed$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HatchCcvViewModel hatchCcvViewModel = this.$viewModel;
            C22I<HatchCcvViewEffect> c22i = hatchCcvViewModel.viewEffect;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnDismissed$delegate;
            C20Z<? super HatchCcvViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$5$1.1
                public final Object emit(HatchCcvViewEffect hatchCcvViewEffect, HtJ<? super Unit> htJ) {
                    String str = hatchCcvViewModel.uiState.getValue().billingCountry;
                    if (C7384Etj.areEqual(hatchCcvViewEffect, HatchCcvViewEffect.Cancelled.INSTANCE)) {
                        HatchCcvCardEntryHostKt.logCcvOutcome(HatchCcvFormOutcome.DISMISSED, str, null);
                        C1BO.A0D(c1bo);
                    } else {
                        if (!(hatchCcvViewEffect instanceof HatchCcvViewEffect.CheckoutUnavailable)) {
                            throw C3cG.A0q();
                        }
                        HatchCcvCardEntryHostKt.logCcvOutcome(HatchCcvFormOutcome.CHECKOUT_UNAVAILABLE, str, ((HatchCcvViewEffect.CheckoutUnavailable) hatchCcvViewEffect).reason);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchCcvViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
