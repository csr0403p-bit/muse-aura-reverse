package X;

import androidx.room.util.DBUtil__DBUtil_androidKt;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EKK {
    public static final String A00 = EK9.A01("Schedulers");

    public static void A00(WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        EL5 el5A01 = F0C.A01(workDatabase);
        workDatabase.beginTransaction();
        try {
            EIN ein = ((C6605EJh) el5A01).A01;
            List list2 = (List) DBUtil__DBUtil_androidKt.A01(ein, new C7588F5b(12), true, false);
            A01(el5A01, list2);
            List list3 = (List) DBUtil__DBUtil_androidKt.A01(ein, new C7588F5b(8), true, false);
            List list4 = (List) DBUtil__DBUtil_androidKt.A01(ein, new C7588F5b(10), true, false);
            A01(el5A01, list4);
            if (list2 != null) {
                list4.addAll(list2);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            A02(list4, list, true);
            A02(list3, list, false);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    public static void A01(EL5 el5, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                el5.AQB(((EKE) it.next()).A0O, jCurrentTimeMillis);
            }
        }
    }

    public static void A02(List<EKE> workSpecs, List<ELY> schedulers, boolean forLimitedSlots) {
        if (workSpecs.isEmpty()) {
            return;
        }
        EKE[] ekeArr = (EKE[]) workSpecs.toArray(new EKE[workSpecs.size()]);
        for (ELY ely : schedulers) {
            if (ely.ANB() == forLimitedSlots) {
                ely.Ac8(ekeArr);
            }
        }
    }
}
