package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BoY;
import X.C1HY;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCameraContentKt$SelfieCameraContent$1$1", f = "SelfieCameraContent.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SelfieCameraContentKt$SelfieCameraContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ FaceDetectionAnalyzer $analyzer;
    public final /* synthetic */ SelfieCamera $camera;
    public final /* synthetic */ boolean $isResumed;
    public final /* synthetic */ C1HY $owner;
    public final /* synthetic */ BoY $view;
    public final /* synthetic */ SelfieCaptureViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCameraContentKt$SelfieCameraContent$1$1(boolean z, SelfieCamera selfieCamera, SelfieCaptureViewModel selfieCaptureViewModel, FaceDetectionAnalyzer faceDetectionAnalyzer, BoY boY, C1HY c1hy, HtJ<? super SelfieCameraContentKt$SelfieCameraContent$1$1> htJ) {
        super(2, htJ);
        this.$isResumed = z;
        this.$camera = selfieCamera;
        this.$viewModel = selfieCaptureViewModel;
        this.$analyzer = faceDetectionAnalyzer;
        this.$view = boY;
        this.$owner = c1hy;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieCameraContentKt$SelfieCameraContent$1$1(this.$isResumed, this.$camera, this.$viewModel, this.$analyzer, this.$view, this.$owner, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Exception {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            CFK.A08(SelfieCameraContentKt.TAG, "Could not start the camera", e);
            this.$viewModel.onCameraUnavailable();
        }
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isResumed) {
                FaceDetectionAnalyzer faceDetectionAnalyzer = this.$analyzer;
                RuntimeException runtimeException = faceDetectionAnalyzer.initError;
                if (runtimeException != null) {
                    SelfieCaptureViewModel selfieCaptureViewModel = this.$viewModel;
                    CFK.A0A(SelfieCameraContentKt.TAG, "Face detection is unavailable", runtimeException);
                    selfieCaptureViewModel.onFaceTrackingUnavailable();
                } else {
                    SelfieCamera selfieCamera = this.$camera;
                    BoY boY = this.$view;
                    C1HY c1hy = this.$owner;
                    this.label = 1;
                    obj = selfieCamera.bind(boY, c1hy, faceDetectionAnalyzer, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                this.$camera.unbind();
                this.$viewModel.cancelTake();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!AnonymousClass001.A1X(obj)) {
            this.$viewModel.onFaceTrackingUnavailable();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SelfieCameraContentKt$SelfieCameraContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
