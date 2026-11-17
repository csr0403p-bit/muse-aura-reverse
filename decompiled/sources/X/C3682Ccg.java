package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ccg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3682Ccg implements InterfaceC3729CdS {
    public final List A00;

    @Override // X.InterfaceC3729CdS
    public final void AjK(InterfaceC3592CWb interfaceC3592CWb) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC3729CdS) it.next()).AjK(interfaceC3592CWb);
        }
    }

    public C3682Ccg(Context context, AbstractC3743Cdg abstractC3743Cdg) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A00 = arrayListA0h;
        if (((C3676Cca) abstractC3743Cdg).A02) {
            arrayListA0h.add(new C3694Ccs(context, abstractC3743Cdg));
        }
    }
}
