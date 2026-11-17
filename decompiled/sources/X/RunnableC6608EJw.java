package X;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EJw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6608EJw implements Runnable {
    public static final String __redex_internal_original_name = "CancelWorkRunnable$$ExternalSyntheticLambda0";
    public final /* synthetic */ WorkDatabase A00;
    public final /* synthetic */ EK5 A01;
    public final /* synthetic */ String A02;

    @Override // java.lang.Runnable
    public final void run() {
        WorkDatabase workDatabase = this.A00;
        String str = this.A02;
        EK5 ek5 = this.A01;
        Iterator it = ((List) C7596F5j.A00(((C6605EJh) F0C.A01(workDatabase)).A01, str, 9)).iterator();
        while (it.hasNext()) {
            EKJ.A00(ek5, (String) it.next());
        }
    }

    public /* synthetic */ RunnableC6608EJw(WorkDatabase workDatabase, EK5 ek5, String str) {
        this.A00 = workDatabase;
        this.A02 = str;
        this.A01 = ek5;
    }
}
