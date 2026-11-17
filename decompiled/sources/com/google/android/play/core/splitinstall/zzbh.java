package com.google.android.play.core.splitinstall;

import X.BV4;
import X.BV5;
import X.C3392CJg;
import X.CSE;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzbp;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class zzbh extends zzbp {
    public final CSE A00;
    public final /* synthetic */ C3392CJg A01;

    public zzbh(CSE cse, C3392CJg c3392CJg) {
        this.A01 = c3392CJg;
        this.A00 = cse;
    }

    public void AjS(int i, Bundle bundle) {
        this.A01.A00.A02(this.A00);
        C3392CJg.A02.A03("onCancelInstall(%d)", BV5.A1Y(i));
    }

    public void Ajf(Bundle bundle) {
        this.A01.A00.A02(this.A00);
        C3392CJg.A02.A03("onDeferredInstall", BV4.A1W());
    }

    public void Ajj(Bundle bundle) {
        this.A01.A00.A02(this.A00);
        C3392CJg.A02.A03("onDeferredUninstall", BV4.A1W());
    }

    public void Ajm(List list) {
        this.A01.A00.A02(this.A00);
        C3392CJg.A02.A03("onGetSessionStates", BV4.A1W());
    }

    public void Ajp(int i, Bundle bundle) {
        this.A01.A00.A02(this.A00);
        C3392CJg.A02.A03("onStartInstall(%d)", BV5.A1Y(i));
    }
}
