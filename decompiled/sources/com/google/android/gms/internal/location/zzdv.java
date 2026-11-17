package com.google.android.gms.internal.location;

import X.C4200Cpj;
import X.C4352Ctu;
import X.InterfaceC4362Cu6;
import X.RunnableC4282CsH;
import com.google.android.gms.location.zzw;

/* loaded from: classes5.dex */
public final class zzdv extends zzb implements zzw {
    public final InterfaceC4362Cu6 A00;

    @Override // com.google.android.gms.location.zzw
    public final void Ajg() {
        C4200Cpj c4200CpjAjE = this.A00.AjE();
        c4200CpjAjE.A00.execute(new RunnableC4282CsH(new C4352Ctu(this), c4200CpjAjE));
    }

    public zzdv(InterfaceC4362Cu6 interfaceC4362Cu6) {
        this();
        this.A00 = interfaceC4362Cu6;
    }

    public zzdv() {
        attachInterface(this, "com.google.android.gms.location.ILocationCallback");
    }
}
