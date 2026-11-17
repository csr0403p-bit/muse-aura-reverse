package X;

import com.google.android.gms.internal.fido.zzag;

/* loaded from: classes5.dex */
public final class DWt implements InterfaceC4440Cw4 {
    public final DWu A00;
    public final Object A01;

    @Override // X.InterfaceC4440Cw4
    public final void AjM() {
        if (DWv.A01 == null) {
            DWv.A01 = new zzag();
        }
        synchronized (DWv.A00) {
        }
        throw C3cG.A0Q("Must call PhenotypeContext.setContext() first");
    }

    public DWt(DWu dWu, Object obj) {
        this.A01 = obj;
        this.A00 = dWu;
    }
}
