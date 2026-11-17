package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GeF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9701GeF implements Hwq {
    public final /* synthetic */ C9703GeH A00;

    public C9701GeF(C9703GeH c9703GeH) {
        this.A00 = c9703GeH;
    }

    @Override // X.Hwq
    public final void AVA(InterfaceC10512HoG interfaceC10512HoG, List<? extends AbstractC10579HwA> list) {
        ArrayList arrayListA0h;
        AbstractC10579HwA abstractC10579HwA;
        C9736Gep c9736Gep;
        Object c9734Gen;
        Object next;
        String str;
        String strA03;
        List<? extends AbstractC10579HwA> list2 = list;
        C7384Etj.A0Y(interfaceC10512HoG, 0);
        if (list == null) {
            list2 = C0881AGi.A00;
        }
        C9703GeH c9703GeH = this.A00;
        EnumC9706GeK enumC9706GeKAJk = interfaceC10512HoG.AJk();
        int iOrdinal = enumC9706GeKAJk.ordinal();
        if (iOrdinal == 8 ? !list2.isEmpty() : !(iOrdinal != 4 && iOrdinal != 1)) {
            c9703GeH.A04.A04.A06();
        }
        C9716GeU c9716GeU = c9703GeH.A06;
        C9717GeV c9717GeVA01 = c9716GeU.A01();
        if (enumC9706GeKAJk == EnumC9706GeK.A0M) {
            c9734Gen = new C9740Get(c9717GeVA01 != null ? c9716GeU.A02(c9717GeVA01) : null);
        } else if (enumC9706GeKAJk != EnumC9706GeK.A0H) {
            c9734Gen = new C9741Geu(c9717GeVA01 != null ? c9716GeU.A02(c9717GeVA01) : null);
        } else if (list2.isEmpty()) {
            c9734Gen = new C9738Ger(c9717GeVA01);
        } else {
            G3j g3j = c9703GeH.A03;
            synchronized (g3j) {
                arrayListA0h = C3cG.A0h();
                for (AbstractC10579HwA abstractC10579HwA2 : list2) {
                    if (abstractC10579HwA2.A02() != C79.A01 || ((strA03 = abstractC10579HwA2.A03()) != null && g3j.A00.add(strA03))) {
                        arrayListA0h.add(abstractC10579HwA2);
                    }
                }
            }
            List listA0z = AbstractC0885AGm.A0z(c9717GeVA01);
            C7384Etj.A0Y(listA0z, 1);
            Iterator it = arrayListA0h.iterator();
            while (true) {
                abstractC10579HwA = null;
                if (!it.hasNext()) {
                    c9736Gep = null;
                    break;
                }
                AbstractC10579HwA abstractC10579HwA3 = (AbstractC10579HwA) it.next();
                Iterator it2 = listA0z.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    C9717GeV c9717GeV = (C9717GeV) next;
                    C7384Etj.A0Y(abstractC10579HwA3, 0);
                    C9661Gd3 c9661Gd3 = c9717GeV.A02;
                    String strA05 = abstractC10579HwA3.A05();
                    if (c9661Gd3 == null) {
                        str = c9717GeV.A01.A07;
                    } else if (c9661Gd3.A01 != C79.A0P || (str = c9661Gd3.A04) == null) {
                        str = c9661Gd3.A05;
                    }
                    if (C7384Etj.areEqual(strA05, str)) {
                        break;
                    }
                }
                C9717GeV c9717GeV2 = (C9717GeV) next;
                if (c9717GeV2 != null) {
                    c9736Gep = new C9736Gep(abstractC10579HwA3, c9717GeV2);
                    abstractC10579HwA = c9736Gep.A00;
                    break;
                }
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it3 = arrayListA0h.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (next2 != abstractC10579HwA) {
                    arrayListA0h2.add(next2);
                }
            }
            C9731Gek c9731Gek = new C9731Gek(c9736Gep, arrayListA0h2);
            C9736Gep c9736Gep2 = c9731Gek.A00;
            if (c9736Gep2 == null || c9716GeU.A02(c9736Gep2.A01) == null) {
                c9731Gek = new C9731Gek(null, arrayListA0h);
            }
            C9736Gep c9736Gep3 = c9731Gek.A00;
            c9734Gen = new C9734Gen(c9736Gep3 != null ? c9736Gep3.A01.A0C : null, c9731Gek);
        }
        c9703GeH.A05.A02(new C8896FtD(interfaceC10512HoG, c9703GeH, c9734Gen, list2, null, 4));
    }
}
