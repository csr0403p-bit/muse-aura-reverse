package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes3.dex */
public final class SelfieCameraContentKt$SelfieCameraContent$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ FaceDetectionAnalyzer $analyzer;
    public final /* synthetic */ SelfieCamera $camera;
    public final /* synthetic */ SelfieCaptureViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCameraContentKt$SelfieCameraContent$2$1(SelfieCamera selfieCamera, FaceDetectionAnalyzer faceDetectionAnalyzer, SelfieCaptureViewModel selfieCaptureViewModel) {
        super(1);
        this.$camera = selfieCamera;
        this.$analyzer = faceDetectionAnalyzer;
        this.$viewModel = selfieCaptureViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final SelfieCamera selfieCamera = this.$camera;
        final FaceDetectionAnalyzer faceDetectionAnalyzer = this.$analyzer;
        final SelfieCaptureViewModel selfieCaptureViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.ageverification.SelfieCameraContentKt$SelfieCameraContent$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                selfieCamera.unbind();
                faceDetectionAnalyzer.close();
                selfieCaptureViewModel.cancelTake();
            }
        };
    }
}
