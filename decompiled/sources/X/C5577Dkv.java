package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dkv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5577Dkv extends Dl4 {
    public final boolean A00;

    @Override // X.DlN
    public final C5585DlC ABN(C5585DlC c5585DlC) {
        int i;
        if (c5585DlC == null) {
            return null;
        }
        List<Dl9> list = c5585DlC.A03;
        Iterator<Dl9> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            if (dl9A0b != null && dl9A0b.A06 == 2) {
                i2 = dl9A0b.A05;
            }
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Dl9> it2 = list.iterator();
        while (it2.hasNext()) {
            Dl9 dl9A0b2 = BV6.A0b(it2);
            if (dl9A0b2 == null || (i = dl9A0b2.A06) != 2) {
                arrayListA0h.add(dl9A0b2);
            } else {
                ArrayList arrayListA0h2 = C3cG.A0h();
                Iterator itA02 = Dl9.A02(dl9A0b2);
                while (itA02.hasNext()) {
                    AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                    if ((i2 == dl9A0b2.A05 && !this.A00) || !Dl5.A00(abstractC5553DkWA0d.A03).A0E) {
                        arrayListA0h2.add(abstractC5553DkWA0d);
                    }
                }
                if (!arrayListA0h2.isEmpty()) {
                    int i3 = dl9A0b2.A05;
                    List<C5493DjV> list2 = dl9A0b2.A0C;
                    List<C5493DjV> list3 = dl9A0b2.A0D;
                    List<C5493DjV> list4 = dl9A0b2.A0F;
                    String str = dl9A0b2.A0A;
                    String str2 = dl9A0b2.A0B;
                    String str3 = dl9A0b2.A09;
                    double d = dl9A0b2.A00;
                    boolean z = dl9A0b2.A0G;
                    boolean z2 = dl9A0b2.A0H;
                    arrayListA0h.add(new Dl9(str, str2, str3, dl9A0b2.A08, dl9A0b2.A07, arrayListA0h2, list2, list3, list4, d, dl9A0b2.A02, dl9A0b2.A01, i3, i, dl9A0b2.A04, dl9A0b2.A03, z, z2));
                }
            }
        }
        return Dl4.A00(c5585DlC, arrayListA0h);
    }

    public C5577Dkv(boolean z) {
        this.A00 = z;
    }

    public C5577Dkv() {
        this(true);
    }
}
