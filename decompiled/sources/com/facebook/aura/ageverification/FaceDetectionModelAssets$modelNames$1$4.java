package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C7BY;
import X.C8j3;
import X.G0U;

/* loaded from: classes5.dex */
public final class FaceDetectionModelAssets$modelNames$1$4 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public static final FaceDetectionModelAssets$modelNames$1$4 INSTANCE = new FaceDetectionModelAssets$modelNames$1$4();

    public FaceDetectionModelAssets$modelNames$1$4() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(String str) {
        boolean z = false;
        if (C8j3.A0J(str, 0) > 0 && !C7BY.A0k(str, '/')) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
