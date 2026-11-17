package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.R;
import com.facebook.aura.ageverification.SelfieEffect;
import com.facebook.aura.ageverification.SelfieStep;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureKt$SelfieCapture$2$1", f = "SelfieCapture.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SelfieCaptureKt$SelfieCapture$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<SelfieStep.Complete, Unit>> $currentOnCaptured$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnUnavailable$delegate;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ SelfieCaptureViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelfieCaptureKt$SelfieCapture$2$1(SelfieCaptureViewModel selfieCaptureViewModel, C0dx c0dx, C1BO<? extends Function0<Unit>> c1bo, C1BO<? extends G0U<? super SelfieStep.Complete, Unit>> c1bo2, HtJ<? super SelfieCaptureKt$SelfieCapture$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = selfieCaptureViewModel;
        this.$haptics = c0dx;
        this.$currentOnUnavailable$delegate = c1bo;
        this.$currentOnCaptured$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieCaptureKt$SelfieCapture$2$1(this.$viewModel, this.$haptics, this.$currentOnUnavailable$delegate, this.$currentOnCaptured$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<SelfieEffect> c20q = this.$viewModel.effects;
            final C0dx c0dx = this.$haptics;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnUnavailable$delegate;
            final C1BO<G0U<SelfieStep.Complete, Unit>> c1bo2 = this.$currentOnCaptured$delegate;
            C20Z<? super SelfieEffect> c20z = new C20Z() { // from class: com.facebook.aura.ageverification.SelfieCaptureKt$SelfieCapture$2$1.1
                public final Object emit(SelfieEffect selfieEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(selfieEffect, SelfieEffect.RecordingFailed.INSTANCE)) {
                        ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f12005e);
                    } else if (C7384Etj.areEqual(selfieEffect, SelfieEffect.FaceLost.INSTANCE)) {
                        c0dx.AXr(AuraHaptics.FAILURE);
                    } else if (C7384Etj.areEqual(selfieEffect, SelfieEffect.CameraUnavailable.INSTANCE) || C7384Etj.areEqual(selfieEffect, SelfieEffect.TrackingUnavailable.INSTANCE)) {
                        C1BO.A0D(c1bo);
                    } else {
                        if (!(selfieEffect instanceof SelfieEffect.Captured)) {
                            throw C3cG.A0q();
                        }
                        C1BO.A0B(c1bo2).invoke(((SelfieEffect.Captured) selfieEffect).capture);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SelfieEffect) obj2, (HtJ<? super Unit>) htJ);
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
        return ((SelfieCaptureKt$SelfieCapture$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
