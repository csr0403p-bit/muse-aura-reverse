package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dkr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5573Dkr extends Dl4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.DkW] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.Dgz, X.Dl1] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.Dl7] */
    @Override // X.DlN
    public final C5585DlC ABN(C5585DlC c5585DlC) {
        ?? A02;
        if (c5585DlC == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Dl9> it = c5585DlC.A03.iterator();
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            if (dl9A0b == null || dl9A0b.A06 != 2) {
                arrayListA0h.add(dl9A0b);
            } else {
                ArrayList arrayListA0h2 = C3cG.A0h();
                Iterator itA02 = Dl9.A02(dl9A0b);
                while (itA02.hasNext()) {
                    AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                    long j = abstractC5553DkWA0d.A02;
                    C6154Dwx c6154Dwx = abstractC5553DkWA0d.A03;
                    C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
                    C5583Dl6 c5583Dl6 = new C5583Dl6(Dl5.A00(c6154Dwx));
                    c5583Dl6.A0E = false;
                    c5583Dl6.A0D = false;
                    c6162Dx5A01.A0T = new Dl5(c5583Dl6);
                    C6154Dwx c6154DwxA0U = BV6.A0U(c6162Dx5A01);
                    List<C5376DhT> list = abstractC5553DkWA0d.A05;
                    boolean z = abstractC5553DkWA0d instanceof C5555DkY;
                    AbstractC5554DkX abstractC5554DkX = z ? ((C5555DkY) abstractC5553DkWA0d).A03 : abstractC5553DkWA0d instanceof C5582Dl1 ? ((C5582Dl1) abstractC5553DkWA0d).A00 : null;
                    List<C5493DjV> list2 = abstractC5553DkWA0d.A07;
                    List<C5493DjV> list3 = abstractC5553DkWA0d.A06;
                    List<C5493DjV> list4 = abstractC5553DkWA0d.A08;
                    String str = z ? ((C5555DkY) abstractC5553DkWA0d).A06 : null;
                    if (abstractC5554DkX instanceof C5584DlB) {
                        A02 = new Dl7(c6154DwxA0U, (C5584DlB) abstractC5554DkX, str, list, list2, list3, list4, j);
                    } else if (abstractC5554DkX instanceof Dl3) {
                        A02 = new C5355Dgz(c6154DwxA0U, (Dl3) abstractC5554DkX, list, list2, list3, list4, j);
                        String str2 = c6154DwxA0U.A0Z;
                        String str3 = c6154DwxA0U.A0Y;
                        StringBuilder sbA0g = C3cG.A0g(str2);
                        C60O.A1R(".", str3, sbA0g);
                        A02.A00 = BV4.A0m(sbA0g, j);
                        A02.A01 = str;
                    } else {
                        String str4 = c6154DwxA0U.A0Z;
                        String str5 = c6154DwxA0U.A0Y;
                        StringBuilder sbA0g2 = C3cG.A0g(str4);
                        C60O.A1R(".", str5, sbA0g2);
                        A02 = AbstractC5553DkW.A02(c6154DwxA0U, abstractC5554DkX, BV4.A0m(sbA0g2, j), list, list2, list3, list4, j);
                    }
                    arrayListA0h2.add(A02);
                }
                Dl4.A02(dl9A0b, arrayListA0h, arrayListA0h2, arrayListA0h2.isEmpty() ? 1 : 0);
            }
        }
        return Dl4.A00(c5585DlC, arrayListA0h);
    }
}
