package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.FBh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7709FBh<TSnapshot> {
    public final Object A00 = C3cG.A0T();
    public final List<C7714FBo<TSnapshot>> A01 = C60O.A11(1);

    public final Runnable A00(FC0<TSnapshot> fc0) {
        C7714FBo<TSnapshot> c7714FBo = new C7714FBo<>(fc0, FZS.A02(this, 46));
        synchronized (this.A00) {
            this.A01.add(c7714FBo);
        }
        return new RunnableC7713FBn(c7714FBo);
    }

    public final void A01(TSnapshot tsnapshot) {
        List listA0X;
        synchronized (this.A00) {
            listA0X = AbstractC0878AGe.A0X(this.A01);
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            FC0<TSnapshot> fc0 = ((C7714FBo) it.next()).A01;
            if (fc0 != null) {
                fc0.AVw(tsnapshot);
            }
        }
    }
}
