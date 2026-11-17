package X;

import java.util.Iterator;

/* renamed from: X.EIj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC6591EIj {
    public static final void A00(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        AII aiiA17 = AIM.A17();
        EIK eikAYO = ejv.AYO("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (eikAYO.AgN()) {
            try {
                aiiA17.add(eikAYO.ALa(0));
            } finally {
            }
        }
        eikAYO.close();
        Iterator<E> it = AIM.A18(aiiA17).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (AnonymousClass005.A1a(strA0j, "room_fts_content_sync_")) {
                EIW.A00(ejv, FGI.A0M("DROP TRIGGER IF EXISTS ", strA0j));
            }
        }
    }
}
