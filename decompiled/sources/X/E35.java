package X;

import android.util.SparseArray;

/* loaded from: classes5.dex */
public final class E35 implements InterfaceC6408E4k {
    public final C6340E1q A00 = new C6340E1q(new byte[4]);
    public final /* synthetic */ E36 A01;

    public E35(E36 e36) {
        this.A01 = e36;
    }

    @Override // X.InterfaceC6408E4k
    public final void A6w(E1P e1p) {
        if (e1p.A0A() != 0 || (e1p.A0A() & 128) == 0) {
            return;
        }
        e1p.A0S(6);
        int iA04 = e1p.A04() / 4;
        for (int i = 0; i < iA04; i++) {
            C6340E1q c6340E1q = this.A00;
            e1p.A0U(c6340E1q.A03, 0, 4);
            c6340E1q.A0B(0);
            int iA08 = c6340E1q.A08(16);
            c6340E1q.A0C(3);
            if (iA08 == 0) {
                c6340E1q.A0C(13);
            } else {
                int iA082 = c6340E1q.A08(13);
                E36 e36 = this.A01;
                SparseArray<InterfaceC6406E4i> sparseArray = e36.A08;
                if (sparseArray.get(iA082) == null) {
                    sparseArray.put(iA082, new E3I(new E30(e36, iA082)));
                    e36.A02++;
                }
            }
        }
        this.A01.A08.remove(0);
    }

    @Override // X.InterfaceC6408E4k
    public final void ANZ(E3J e3j, InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
    }
}
