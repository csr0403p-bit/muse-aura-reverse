package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cce, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3680Cce implements InterfaceC3731CdU {
    public final List A00;

    @Override // X.InterfaceC3731CdU
    public final void AjI(Cbz cbz) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC3731CdU) it.next()).AjI(cbz);
        }
    }

    public C3680Cce(Context context, AbstractC3750Cdn abstractC3750Cdn) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A00 = arrayListA0h;
        if (((C3678Ccc) abstractC3750Cdn).A02) {
            arrayListA0h.add(new C3693Ccr(context, abstractC3750Cdn));
        }
    }
}
