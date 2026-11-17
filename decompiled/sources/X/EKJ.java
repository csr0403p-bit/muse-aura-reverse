package X;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.WorkerWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class EKJ {
    public static final void A00(EK5 ek5, String str) {
        WorkerWrapper workerWrapperA00;
        WorkDatabase workDatabase = ek5.A04;
        C7384Etj.A0U(workDatabase);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) workDatabase;
        F0C<EL5> f0c = workDatabase_Impl.A06;
        EL5 value = f0c.getValue();
        InterfaceC6658EMq value2 = workDatabase_Impl.A00.getValue();
        ArrayList arrayListA0y = AbstractC0885AGm.A0y(str);
        arrayListA0y.addAll(AbstractC6621EKq.A00(value2, str));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0y.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            EnumC6619EKm enumC6619EKmAL1 = value.AL1((String) next);
            if (enumC6619EKmAL1 != null && enumC6619EKmAL1 != EnumC6619EKm.A07 && enumC6619EKmAL1 != EnumC6619EKm.A05 && enumC6619EKmAL1 != EnumC6619EKm.A03) {
                arrayListA0h.add(next);
            }
        }
        EL5 value3 = f0c.getValue();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it2);
            C7384Etj.A0Y(strA0j, 0);
            BV5.A1E(((C6605EJh) value3).A01, new C7596F5j(strA0j, 14));
        }
        EKU eku = ek5.A03;
        C7384Etj.A0U(eku);
        synchronized (eku.A09) {
            BV4.A1E(EK9.A00(), "Processor cancelling ", str, EKU.A0B);
            eku.A08.add(str);
            workerWrapperA00 = EKU.A00(eku, str);
        }
        EKU.A01(workerWrapperA00, str, 1);
        Iterator<ELY> it3 = ek5.A07.iterator();
        while (it3.hasNext()) {
            it3.next().cancel(str);
        }
    }
}
