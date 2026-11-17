package com.google.android.play.core.appupdate;

import X.BV4;
import X.C3399CJq;
import X.CJT;
import X.CSE;
import android.os.Bundle;
import com.google.android.play.core.appupdate.internal.zzg;

/* loaded from: classes5.dex */
public abstract class zzo extends zzg {
    public final CSE A00;
    public final CJT A01;
    public final /* synthetic */ C3399CJq A02;

    public zzo(CSE cse, CJT cjt, C3399CJq c3399CJq) {
        this.A02 = c3399CJq;
        this.A01 = cjt;
        this.A00 = cse;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzh
    public void AjT(Bundle bundle) {
        this.A02.A00.A02(this.A00);
        this.A01.A02("onCompleteUpdate", BV4.A1W());
    }

    @Override // com.google.android.play.core.appupdate.internal.zzh
    public void AjW(Bundle bundle) {
        this.A02.A00.A02(this.A00);
        this.A01.A02("onRequestInfo", BV4.A1W());
    }
}
