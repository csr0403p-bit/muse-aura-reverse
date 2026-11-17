package X;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.F5n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7600F5n implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final String A01;

    public C7600F5n(EK5 ek5, String str, int i) {
        this.$t = i;
        if (2 - i != 0) {
            this.A01 = str;
            this.A00 = ek5;
        } else {
            this.A00 = ek5;
            this.A01 = str;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        final EK5 ek5;
        final WorkDatabase workDatabase;
        Runnable runnableC6608EJw;
        switch (this.$t) {
            case 0:
                EJV ejvAXS = ((InterfaceC6586EIe) this.A00).AXS(this.A01);
                EIW.A00(ejvAXS, "PRAGMA query_only = 1");
                return ejvAXS;
            case 1:
                return ((InterfaceC6586EIe) this.A00).AXS(this.A01);
            case 2:
                ek5 = (EK5) this.A00;
                final String str = this.A01;
                workDatabase = ek5.A04;
                C7384Etj.A0U(workDatabase);
                runnableC6608EJw = new Runnable() { // from class: X.EJv
                    public static final String __redex_internal_original_name = "CancelWorkRunnable$$ExternalSyntheticLambda2";

                    @Override // java.lang.Runnable
                    public final void run() {
                        WorkDatabase workDatabase2 = workDatabase;
                        String str2 = str;
                        EK5 ek52 = ek5;
                        C6605EJh c6605EJh = (C6605EJh) F0C.A01(workDatabase2);
                        C7384Etj.A0Y(str2, 0);
                        Iterator it = ((List) C7596F5j.A00(c6605EJh.A01, str2, 16)).iterator();
                        while (it.hasNext()) {
                            EKJ.A00(ek52, AnonymousClass005.A0j(it));
                        }
                    }
                };
                break;
            default:
                String str2 = this.A01;
                ek5 = (EK5) this.A00;
                C7384Etj.A0Y(str2, 0);
                workDatabase = ek5.A04;
                C7384Etj.A0U(workDatabase);
                runnableC6608EJw = new RunnableC6608EJw(workDatabase, ek5, str2);
                break;
        }
        workDatabase.runInTransaction(runnableC6608EJw);
        EKK.A00(workDatabase, ek5.A07);
        return Unit.INSTANCE;
    }

    public C7600F5n(InterfaceC6586EIe interfaceC6586EIe, String str, int i) {
        this.$t = i;
        this.A00 = interfaceC6586EIe;
        this.A01 = str;
    }
}
