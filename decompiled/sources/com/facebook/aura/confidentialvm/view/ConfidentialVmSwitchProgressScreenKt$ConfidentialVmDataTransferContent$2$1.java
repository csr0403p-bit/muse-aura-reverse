package com.facebook.aura.confidentialvm.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferViewEffect;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$2$1", f = "ConfidentialVmSwitchProgressScreen.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onLeft;
    public final /* synthetic */ ConfidentialVmDataTransferProgressViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$2$1(ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel, Function0<Unit> function0, HtJ<? super ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = confidentialVmDataTransferProgressViewModel;
        this.$onLeft = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$2$1(this.$viewModel, this.$onLeft, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConfidentialVmDataTransferViewEffect> c22i = this.$viewModel.viewEffects;
            final Function0<Unit> function0 = this.$onLeft;
            C20Z<? super ConfidentialVmDataTransferViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConfidentialVmDataTransferViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConfidentialVmDataTransferViewEffect confidentialVmDataTransferViewEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(confidentialVmDataTransferViewEffect, ConfidentialVmDataTransferViewEffect.Left.INSTANCE)) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                    throw C3cG.A0q();
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
        return ((ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
