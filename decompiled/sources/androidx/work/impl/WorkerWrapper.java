package androidx.work.impl;

import X.AbstractC06907md;
import X.AbstractC0885AGm;
import X.AbstractC6621EKq;
import X.AnonymousClass005;
import X.BV5;
import X.BzB;
import X.C27a;
import X.C3cG;
import X.C6605EJh;
import X.C7384Etj;
import X.C7596F5j;
import X.C7599F5m;
import X.C77S;
import X.C77j;
import X.C9250GBd;
import X.ED6;
import X.EIN;
import X.EKE;
import X.EKi;
import X.EL5;
import X.ELW;
import X.ENK;
import X.ENP;
import X.EnumC6619EKm;
import X.FGI;
import X.InterfaceC6658EMq;
import android.content.Context;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class WorkerWrapper {
    public final Context A02;
    public final WorkDatabase A03;
    public final InterfaceC6658EMq A04;
    public final EKE A05;
    public final EL5 A06;
    public final ENP A07;
    public final String A08;
    public final String A09;
    public final ED6 A0B;
    public final EKi A0C;
    public final ELW A0D;
    public final ENK A0E;
    public final List<String> A0F;
    public final C27a A0A = new C9250GBd(null);
    public List<String> A01 = C3cG.A0h();
    public List<String> A00 = C3cG.A0h();

    public static final boolean A01(C77S c77s, WorkerWrapper workerWrapper) {
        String str = workerWrapper.A09;
        ArrayList arrayListA0y = AbstractC0885AGm.A0y(str);
        arrayListA0y.addAll(AbstractC6621EKq.A00(workerWrapper.A04, str));
        Iterator it = arrayListA0y.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            EL5 el5 = workerWrapper.A06;
            if (el5.AL1(strA0j) != EnumC6619EKm.A03) {
                el5.Aek(EnumC6619EKm.A05, strA0j);
                if (!C7384Etj.areEqual(strA0j, str)) {
                    workerWrapper.A00.add(strA0j);
                }
            }
        }
        BzB bzB = ((C77j) c77s).A00;
        C7384Etj.A0U(bzB);
        EL5 el52 = workerWrapper.A06;
        el52.AbT(str, workerWrapper.A05.A00);
        DBUtil__DBUtil_androidKt.A01(((C6605EJh) el52).A01, new C7599F5m(str, bzB, 0), false, true);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(final androidx.work.impl.WorkerWrapper r20, X.HtJ r21) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.A00(androidx.work.impl.WorkerWrapper, X.HtJ):java.lang.Object");
    }

    public static final boolean A02(WorkerWrapper workerWrapper) {
        EL5 el5 = workerWrapper.A06;
        String str = workerWrapper.A09;
        el5.Ada(str, System.currentTimeMillis());
        el5.Aek(EnumC6619EKm.A04, str);
        EIN ein = ((C6605EJh) el5).A01;
        BV5.A1E(ein, new C7596F5j(str, 10));
        el5.AbT(str, workerWrapper.A05.A00);
        DBUtil__DBUtil_androidKt.A01(ein, new C7596F5j(str, 11), false, true);
        el5.AQB(str, -1L);
        return false;
    }

    public static final boolean A03(WorkerWrapper workerWrapper, int i) {
        EL5 el5 = workerWrapper.A06;
        EnumC6619EKm enumC6619EKm = EnumC6619EKm.A04;
        String str = workerWrapper.A09;
        el5.Aek(enumC6619EKm, str);
        el5.Ada(str, System.currentTimeMillis());
        el5.AbT(str, workerWrapper.A05.A00);
        el5.AQB(str, -1L);
        el5.Ael(str, i);
        return true;
    }

    public WorkerWrapper(Context context, EKi eKi, ELW elw, WorkDatabase workDatabase, ENK enk, EKE eke, ENP enp, List list) {
        this.A05 = eke;
        this.A02 = context;
        this.A09 = eke.A0O;
        this.A0D = elw;
        this.A07 = enp;
        this.A0C = eKi;
        this.A0B = eKi.A01;
        this.A0E = enk;
        this.A03 = workDatabase;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) workDatabase;
        this.A06 = workDatabase_Impl.A06.getValue();
        this.A04 = workDatabase_Impl.A00.getValue();
        this.A0F = list;
        this.A08 = FGI.A0k("Work [ id=", this.A09, ", class=", this.A05.A0K, ", tags={ ", AbstractC06907md.A01(",", list, null), " } ]");
    }
}
