package com.google.android.play.core.appupdate;

import X.C3399CJq;
import X.CJT;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;

/* loaded from: classes5.dex */
public final class zzp extends zzo {
    @Override // com.google.android.play.core.appupdate.zzo, com.google.android.play.core.appupdate.internal.zzh
    public final void AjT(Bundle bundle) {
        super.AjT(bundle);
        CJT cjt = C3399CJq.A03;
        if (bundle.getInt("error.code", -2) != 0) {
            this.A00.A01(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.A00.A00.A0H(null);
        }
    }
}
