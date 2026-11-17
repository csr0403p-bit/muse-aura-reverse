package X;

import androidx.room.util.DBUtil__DBUtil_androidKt;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.EJh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6605EJh implements EL5 {
    public final EJY<EKE> A00 = new F45(5);
    public final EIN A01;

    @Override // X.EL5
    public final EnumC6619EKm AL1(String str) {
        C7384Etj.A0Y(str, 0);
        return (EnumC6619EKm) C7596F5j.A00(this.A01, str, 18);
    }

    @Override // X.EL5
    public final void AQB(String str, long j) {
        C7384Etj.A0Y(str, 0);
        BV5.A1E(this.A01, new C7597F5k(j, str, 0));
    }

    @Override // X.EL5
    public final void AbT(String str, int i) {
        C7384Etj.A0Y(str, 0);
        DBUtil__DBUtil_androidKt.A01(this.A01, new C7598F5l(i, str, 2), false, true);
    }

    @Override // X.EL5
    public final void Ada(String str, long j) {
        C7384Etj.A0Y(str, 0);
        DBUtil__DBUtil_androidKt.A01(this.A01, new C7597F5k(j, str, 1), false, true);
    }

    @Override // X.EL5
    public final void Aek(EnumC6619EKm enumC6619EKm, String str) {
        C7384Etj.A0Y(str, 1);
        BV5.A1E(this.A01, new C7599F5m(str, enumC6619EKm, 2));
    }

    @Override // X.EL5
    public final void Ael(String str, int i) {
        C7384Etj.A0Y(str, 0);
        DBUtil__DBUtil_androidKt.A01(this.A01, new C7598F5l(i, str, 1), false, true);
    }

    public C6605EJh(EIN ein) {
        this.A01 = ein;
    }

    public static final void A00(DQd dQd, EJV ejv, C6605EJh c6605EJh) {
        Set setKeySet = dQd.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (dQd.size() > 999) {
            DQh.A00(dQd, new C7592F5f(13, c6605EJh, ejv));
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

    public static final void A01(DQd dQd, EJV ejv, C6605EJh c6605EJh) {
        Set setKeySet = dQd.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (dQd.size() > 999) {
            DQh.A00(dQd, new C7592F5f(14, c6605EJh, ejv));
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
