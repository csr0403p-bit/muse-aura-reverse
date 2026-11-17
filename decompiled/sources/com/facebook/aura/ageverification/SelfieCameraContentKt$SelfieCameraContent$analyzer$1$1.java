package com.facebook.aura.ageverification;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelfieCameraContentKt$SelfieCameraContent$analyzer$1$1 extends C7438Evz implements G0U<FaceFrame, Unit> {
    public SelfieCameraContentKt$SelfieCameraContent$analyzer$1$1(Object obj) {
        super(1, obj, SelfieCaptureViewModel.class, "onFaceFrame", "onFaceFrame(Lcom/facebook/aura/ageverification/FaceFrame;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FaceFrame faceFrame) {
        ((SelfieCaptureViewModel) AnonymousClass006.A0o(faceFrame, this)).onFaceFrame(faceFrame);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(FaceFrame faceFrame) {
        invoke2(faceFrame);
        return Unit.INSTANCE;
    }
}
