package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.G0U;
import java.util.zip.ZipEntry;

/* loaded from: classes5.dex */
public final class FaceDetectionModelAssets$modelNames$1$1 extends AbstractC7559F3s implements G0U<ZipEntry, String> {
    public static final FaceDetectionModelAssets$modelNames$1$1 INSTANCE = new FaceDetectionModelAssets$modelNames$1$1();

    public FaceDetectionModelAssets$modelNames$1$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ String invoke(ZipEntry zipEntry) {
        return zipEntry.getName();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(ZipEntry zipEntry) {
        return zipEntry.getName();
    }
}
