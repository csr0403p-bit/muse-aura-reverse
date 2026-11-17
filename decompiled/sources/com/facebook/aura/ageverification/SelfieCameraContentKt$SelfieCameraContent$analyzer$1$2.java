package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SelfieCameraContentKt$SelfieCameraContent$analyzer$1$2 extends AbstractC7559F3s implements G0U<Exception, Unit> {
    public final /* synthetic */ SelfieCaptureViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) {
        C7384Etj.A0Y(exc, 0);
        CFK.A0A(SelfieCameraContentKt.TAG, "Face detection is unavailable", exc);
        this.$viewModel.onFaceTrackingUnavailable();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCameraContentKt$SelfieCameraContent$analyzer$1$2(SelfieCaptureViewModel selfieCaptureViewModel) {
        super(1);
        this.$viewModel = selfieCaptureViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.INSTANCE;
    }
}
