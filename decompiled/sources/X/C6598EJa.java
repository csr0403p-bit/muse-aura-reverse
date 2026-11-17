package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.EJa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6598EJa implements EII {
    public final EIN A00;

    public C6598EJa(EIN ein) {
        this.A00 = ein;
    }

    public static final void A00(DQd dQd, EJV ejv, C6598EJa c6598EJa) {
        Set setKeySet = dQd.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (dQd.size() > 999) {
            DQh.A00(dQd, new C7592F5f(8, c6598EJa, ejv));
            return;
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        AbstractC6599EJb.A00(sbA0w, setKeySet.size());
        EIK eikAYO = ejv.AYO(BV7.A10(sbA0w));
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            eikAYO.A5F(i, AnonymousClass005.A0j(it));
            i++;
        }
        try {
            C7384Etj.A0Y(eikAYO, 0);
            int iA00 = EJ0.A00(eikAYO, "work_spec_id");
            if (iA00 != -1) {
                while (eikAYO.AgN()) {
                    List list = (List) dQd.get(eikAYO.ALa(iA00));
                    if (list != null) {
                        list.add(EIK.A01(eikAYO, 0));
                    }
                }
            }
        } finally {
            eikAYO.close();
        }
    }

    public static final void A01(DQd dQd, EJV ejv, C6598EJa c6598EJa) {
        Set setKeySet = dQd.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (dQd.size() > 999) {
            DQh.A00(dQd, new C7592F5f(9, c6598EJa, ejv));
            return;
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        AbstractC6599EJb.A00(sbA0w, setKeySet.size());
        EIK eikAYO = ejv.AYO(BV7.A10(sbA0w));
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            eikAYO.A5F(i, AnonymousClass005.A0j(it));
            i++;
        }
        try {
            C7384Etj.A0Y(eikAYO, 0);
            int iA00 = EJ0.A00(eikAYO, "work_spec_id");
            if (iA00 != -1) {
                while (eikAYO.AgN()) {
                    List list = (List) dQd.get(eikAYO.ALa(iA00));
                    if (list != null) {
                        list.add(eikAYO.ALa(0));
                    }
                }
            }
        } finally {
            eikAYO.close();
        }
    }
}
