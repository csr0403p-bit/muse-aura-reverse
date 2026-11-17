package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$2$stopper$1", f = "SelfieCameraContent.kt", l = {123}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SelfieCameraContentKt$recordSelfie$2$stopper$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ SelfieCamera $camera;
    public final /* synthetic */ SelfieCaptureViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCameraContentKt$recordSelfie$2$stopper$1(SelfieCaptureViewModel selfieCaptureViewModel, SelfieCamera selfieCamera, HtJ<? super SelfieCameraContentKt$recordSelfie$2$stopper$1> htJ) {
        super(2, htJ);
        this.$viewModel = selfieCaptureViewModel;
        this.$camera = selfieCamera;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieCameraContentKt$recordSelfie$2$stopper$1(this.$viewModel, this.$camera, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SelfieCaptureViewModel selfieCaptureViewModel = this.$viewModel;
            this.label = 1;
            if (selfieCaptureViewModel.awaitTakeEnd(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.$camera.stop();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SelfieCameraContentKt$recordSelfie$2$stopper$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
