package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes3.dex */
public final class SelfieCaptureKt$SelfieCapture$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ int $captureKey;
    public final /* synthetic */ boolean $recapture;
    public final /* synthetic */ SelfieCaptureViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCaptureKt$SelfieCapture$1$1(SelfieCaptureViewModel selfieCaptureViewModel, int i, boolean z) {
        super(1);
        this.$viewModel = selfieCaptureViewModel;
        this.$captureKey = i;
        this.$recapture = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.beginTake(this.$captureKey, this.$recapture);
        return new C78g() { // from class: com.facebook.aura.ageverification.SelfieCaptureKt$SelfieCapture$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
