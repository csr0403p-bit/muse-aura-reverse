package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$4$1", f = "HatchCcvCardEntryHost.kt", l = {94}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnAgeVerified$delegate;
    public final /* synthetic */ HatchCcvViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$4$1(HatchCcvViewModel hatchCcvViewModel, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$4$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchCcvViewModel;
        this.$currentOnAgeVerified$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$4$1(this.$viewModel, this.$currentOnAgeVerified$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HatchCcvViewModel hatchCcvViewModel = this.$viewModel;
            C20Q<Unit> c20q = hatchCcvViewModel.verified;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnAgeVerified$delegate;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$4$1.1
                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    HatchCcvCardEntryHostKt.logCcvOutcome(HatchCcvFormOutcome.VERIFIED, hatchCcvViewModel.uiState.getValue().billingCountry, null);
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
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
        return ((HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
