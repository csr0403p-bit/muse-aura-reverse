package X;

import androidx.room.util.DBUtil__DBUtil_androidKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EKO {
    public static final String A00 = C7384Etj.A0I("DiagnosticsWrkr");

    /* JADX WARN: Incorrect types in method signature: (LX/ENO;LX/EN0;LX/EMw;Ljava/util/List<LX/EKE;>;)Ljava/lang/String; */
    public static final String A00(EMw eMw, ENO eno, EN0 en0, List list) {
        StringBuilder sbA0x = C60O.A0x("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EKE eke = (EKE) it.next();
            C6630ELa c6630ELaA00 = AbstractC6646ELq.A00(eke);
            ELO elo = (ELO) DBUtil__DBUtil_androidKt.A01(((ELJ) eMw).A01, new C7598F5l(c6630ELaA00.A00, c6630ELaA00.A01, 0), true, false);
            Integer numValueOf = elo != null ? Integer.valueOf(elo.A01) : null;
            String str = eke.A0O;
            String strA0L = AbstractC0878AGe.A0L(",", "", "", (Iterable) DBUtil__DBUtil_androidKt.A01(((ELs) eno).A01, new C7596F5j(str, 5), true, false), null);
            String strA0L2 = AbstractC0878AGe.A0L(",", "", "", (Iterable) DBUtil__DBUtil_androidKt.A01(((EMQ) en0).A01, new C7596F5j(str, 19), true, false), null);
            String str2 = eke.A0K;
            String strName = eke.A0E.name();
            StringBuilder sbA0x2 = C3cI.A0x(PairsDiscretionDocument.TERMINATOR, str);
            C60O.A1R("\t ", str2, sbA0x2);
            sbA0x2.append(numValueOf);
            C60O.A1R("\t ", strName, sbA0x2);
            sbA0x2.append(strA0L);
            sbA0x2.append("\t ");
            sbA0x2.append(strA0L2);
            sbA0x2.append("\t");
            BV4.A1O(sbA0x, sbA0x2);
        }
        return sbA0x.toString();
    }
}
