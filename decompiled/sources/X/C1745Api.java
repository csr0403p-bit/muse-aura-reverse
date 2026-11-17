package X;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: X.Api, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1745Api extends C1747Apk implements InterfaceC1356Ahh {
    public C1743Apg A00;
    public G0U<? super C1743Apg, ? extends C1Ny> A01;

    @Override // X.AbstractC1748Apl, X.AbstractC1439Aj8
    public final void onAttach() {
        C1743Apg c1743Apg;
        View viewA00 = AbstractC1329AhG.A00(this);
        WeakHashMap<View, C1743Apg> weakHashMap = C1743Apg.A0O;
        synchronized (weakHashMap) {
            C1743Apg c1743Apg2 = weakHashMap.get(viewA00);
            if (c1743Apg2 == null) {
                c1743Apg2 = new C1743Apg(viewA00);
                weakHashMap.put(viewA00, c1743Apg2);
            }
            c1743Apg = c1743Apg2;
        }
        c1743Apg.A03(viewA00);
        C1Ny c1NyInvoke = this.A01.invoke(c1743Apg);
        if (!C7384Etj.areEqual(c1NyInvoke, ((C1747Apk) this).A00)) {
            ((C1747Apk) this).A00 = c1NyInvoke;
            A01();
        }
        this.A00 = c1743Apg;
        super.onAttach();
    }

    @Override // X.AbstractC1748Apl, X.AbstractC1439Aj8
    public final void onDetach() {
        View viewA00 = AbstractC1329AhG.A00(this);
        C1743Apg c1743Apg = this.A00;
        if (c1743Apg != null) {
            int i = c1743Apg.A00 - 1;
            c1743Apg.A00 = i;
            if (i == 0) {
                AbstractC8082FSn.A00(viewA00, null);
                C8490Fex.A01(viewA00, null);
                viewA00.removeOnAttachStateChangeListener(c1743Apg.A08);
            }
        }
        super.onDetach();
    }
}
