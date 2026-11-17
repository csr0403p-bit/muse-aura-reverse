package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.ageverification.SelfieStep;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCameraContentKt$SelfieCameraContent$3$1", f = "SelfieCameraContent.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SelfieCameraContentKt$SelfieCameraContent$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ SelfieCamera $camera;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ SelfieStep $step;
    public final /* synthetic */ SelfieCaptureViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCameraContentKt$SelfieCameraContent$3$1(SelfieStep selfieStep, C0dx c0dx, SelfieCamera selfieCamera, SelfieCaptureViewModel selfieCaptureViewModel, HtJ<? super SelfieCameraContentKt$SelfieCameraContent$3$1> htJ) {
        super(2, htJ);
        this.$step = selfieStep;
        this.$haptics = c0dx;
        this.$camera = selfieCamera;
        this.$viewModel = selfieCaptureViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieCameraContentKt$SelfieCameraContent$3$1(this.$step, this.$haptics, this.$camera, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SelfieStep selfieStep = this.$step;
            if (selfieStep instanceof SelfieStep.Recording) {
                this.$haptics.AXr(AuraHaptics.SEGMENT_SWITCH);
                SelfieCamera selfieCamera = this.$camera;
                SelfieStep.Recording recording = (SelfieStep.Recording) this.$step;
                SelfieCaptureViewModel selfieCaptureViewModel = this.$viewModel;
                this.label = 1;
                if (SelfieCameraContentKt.recordSelfie(selfieCamera, recording, selfieCaptureViewModel, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else if (C7384Etj.areEqual(selfieStep, SelfieStep.Finishing.INSTANCE)) {
                this.$haptics.AXr(AuraHaptics.SUCCESS);
            } else if (!C7384Etj.areEqual(selfieStep, SelfieStep.Positioning.INSTANCE) && !(selfieStep instanceof SelfieStep.Complete)) {
                throw C3cG.A0q();
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
        return ((SelfieCameraContentKt$SelfieCameraContent$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
