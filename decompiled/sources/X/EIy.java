package X;

import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class EIy {
    public static final C6594EIt A00(EJV ejv, String str) {
        Map mapA0K;
        EIK eikAYO = ejv.AYO(FGI.A0U("PRAGMA table_info(`", str, "`)"));
        try {
            if (eikAYO.AgN()) {
                int iA00 = EJ0.A00(eikAYO, "name");
                int iA002 = EJ0.A00(eikAYO, "type");
                int iA003 = EJ0.A00(eikAYO, "notnull");
                int iA004 = EJ0.A00(eikAYO, "pk");
                int iA005 = EJ0.A00(eikAYO, "dflt_value");
                C0924AIa c0924AIa = new C0924AIa();
                do {
                    String strALa = eikAYO.ALa(iA00);
                    String strALa2 = eikAYO.ALa(iA002);
                    boolean zA1L = AnonymousClass002.A1L((eikAYO.getLong(iA003) > 0L ? 1 : (eikAYO.getLong(iA003) == 0L ? 0 : -1)));
                    c0924AIa.put(strALa, new EIs(strALa, strALa2, eikAYO.isNull(iA005) ? null : eikAYO.ALa(iA005), EIK.A00(eikAYO, iA004), 2, zA1L));
                } while (eikAYO.AgN());
                mapA0K = AIW.A0K(c0924AIa);
            } else {
                mapA0K = AGH.A0E();
            }
            eikAYO.close();
            eikAYO = ejv.AYO(FGI.A0U("PRAGMA foreign_key_list(`", str, "`)"));
            int iA006 = EJ0.A00(eikAYO, "id");
            int iA007 = EJ0.A00(eikAYO, AgeCheckFunnelLogging.KEY_SEQ);
            int iA008 = EJ0.A00(eikAYO, "table");
            int iA009 = EJ0.A00(eikAYO, "on_delete");
            int iA0010 = EJ0.A00(eikAYO, "on_update");
            int iA0011 = EJ0.A00(eikAYO, "id");
            int iA0012 = EJ0.A00(eikAYO, AgeCheckFunnelLogging.KEY_SEQ);
            int iA0013 = EJ0.A00(eikAYO, "from");
            int iA0014 = EJ0.A00(eikAYO, "to");
            AII aiiA17 = AIM.A17();
            while (eikAYO.AgN()) {
                aiiA17.add(new EJ2(EIK.A00(eikAYO, iA0011), EIK.A00(eikAYO, iA0012), eikAYO.ALa(iA0013), eikAYO.ALa(iA0014)));
            }
            List listA0W = AbstractC0878AGe.A0W(AIM.A18(aiiA17));
            eikAYO.reset();
            AIY aiy = new AIY();
            while (eikAYO.AgN()) {
                if (eikAYO.getLong(iA007) == 0) {
                    int iA0015 = EIK.A00(eikAYO, iA006);
                    ArrayList arrayListA0h = C3cG.A0h();
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    ArrayList<EJ2> arrayListA0h3 = C3cG.A0h();
                    for (Object obj : listA0W) {
                        if (((EJ2) obj).A00 == iA0015) {
                            arrayListA0h3.add(obj);
                        }
                    }
                    for (EJ2 ej2 : arrayListA0h3) {
                        arrayListA0h.add(ej2.A02);
                        arrayListA0h2.add(ej2.A03);
                    }
                    aiy.add(new C6596EIx(arrayListA0h, eikAYO.ALa(iA008), arrayListA0h2, eikAYO.ALa(iA009), eikAYO.ALa(iA0010)));
                }
            }
            AIY aiyA00 = AIX.A00(aiy);
            eikAYO.close();
            EIK eikAYO2 = ejv.AYO(FGI.A0U("PRAGMA index_list(`", str, "`)"));
            try {
                int iA0016 = EJ0.A00(eikAYO2, "name");
                int iA0017 = EJ0.A00(eikAYO2, "origin");
                int iA0018 = EJ0.A00(eikAYO2, "unique");
                AIY aiyA002 = null;
                if (iA0016 == -1 || iA0017 == -1 || iA0018 == -1) {
                    if (eikAYO2 != null) {
                    }
                    return new C6594EIt(str, mapA0K, aiyA00, aiyA002);
                }
                AIY aiy2 = new AIY();
                while (eikAYO2.AgN()) {
                    if ("c".equals(eikAYO2.ALa(iA0017))) {
                        String strALa3 = eikAYO2.ALa(iA0016);
                        boolean zA1M = AnonymousClass002.A1M((eikAYO2.getLong(iA0018) > 1L ? 1 : (eikAYO2.getLong(iA0018) == 1L ? 0 : -1)));
                        eikAYO2 = ejv.AYO(FGI.A0U("PRAGMA index_xinfo(`", strALa3, "`)"));
                        try {
                            int iA0019 = EJ0.A00(eikAYO2, "seqno");
                            int iA0020 = EJ0.A00(eikAYO2, "cid");
                            int iA0021 = EJ0.A00(eikAYO2, "name");
                            int iA0022 = EJ0.A00(eikAYO2, "desc");
                            if (iA0019 != -1 && iA0020 != -1 && iA0021 != -1 && iA0022 != -1) {
                                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                                LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
                                while (eikAYO2.AgN()) {
                                    if (EIK.A00(eikAYO2, iA0020) >= 0) {
                                        int iA0023 = EIK.A00(eikAYO2, iA0019);
                                        String strALa4 = eikAYO2.ALa(iA0021);
                                        String str2 = eikAYO2.getLong(iA0022) > 0 ? "DESC" : "ASC";
                                        Integer numValueOf = Integer.valueOf(iA0023);
                                        linkedHashMapA0j.put(numValueOf, strALa4);
                                        linkedHashMapA0j2.put(numValueOf, str2);
                                    }
                                }
                                List listA0c = AbstractC0878AGe.A0c(linkedHashMapA0j.entrySet(), new C3bI(0));
                                ArrayList arrayListA0m = AnonymousClass002.A0m(listA0c);
                                Iterator it = listA0c.iterator();
                                while (it.hasNext()) {
                                    arrayListA0m.add((String) BV7.A0s(it));
                                }
                                List listA0X = AbstractC0878AGe.A0X(arrayListA0m);
                                List listA0c2 = AbstractC0878AGe.A0c(linkedHashMapA0j2.entrySet(), new C3bI(1));
                                ArrayList arrayListA0m2 = AnonymousClass002.A0m(listA0c2);
                                Iterator it2 = listA0c2.iterator();
                                while (it2.hasNext()) {
                                    arrayListA0m2.add((String) BV7.A0s(it2));
                                }
                                C6595EIw c6595EIw = new C6595EIw(strALa3, zA1M, listA0X, AbstractC0878AGe.A0X(arrayListA0m2));
                                eikAYO2.close();
                                aiy2.add(c6595EIw);
                            } else if (eikAYO2 != null) {
                                eikAYO2.close();
                            }
                        } finally {
                        }
                    }
                }
                aiyA002 = AIX.A00(aiy2);
                eikAYO2.close();
                return new C6594EIt(str, mapA0K, aiyA00, aiyA002);
            } finally {
            }
        } finally {
        }
    }
}
