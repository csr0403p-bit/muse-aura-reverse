package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CcY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3674CcY implements InterfaceC3730CdT {
    public final List A00;

    @Override // X.InterfaceC3730CdT
    public final void AjH(InterfaceC3671CcV interfaceC3671CcV) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC3730CdT) it.next()).AjH(interfaceC3671CcV);
        }
    }

    public C3674CcY(Context context, AbstractC3747Cdk abstractC3747Cdk) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A00 = arrayListA0h;
        if (((C3675CcZ) abstractC3747Cdk).A02) {
            arrayListA0h.add(new C3692Ccq(context, abstractC3747Cdk));
        }
    }
}
