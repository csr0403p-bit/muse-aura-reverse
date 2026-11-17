package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes5.dex */
public final class FaceDetectionModelAssets$modelNames$1$2 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public final /* synthetic */ String $prefix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetectionModelAssets$modelNames$1$2(String str) {
        super(1);
        this.$prefix = str;
    }

    @Override // X.G0U
    public final Boolean invoke(String str) {
        C7384Etj.A0X(str);
        String str2 = this.$prefix;
        C7384Etj.A0Y(str2, 1);
        return Boolean.valueOf(str.startsWith(str2));
    }
}
