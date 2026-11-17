package X;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CSS implements Runnable {
    public static final String __redex_internal_original_name = "zze";
    public final /* synthetic */ CSA A00;
    public final /* synthetic */ CSR A01;

    public CSS(CSA csa, CSR csr) {
        this.A01 = csr;
        this.A00 = csa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CSR csr = this.A01;
            CSA csa = (CSA) csr.A00.then(this.A00);
            if (csa == null) {
                csr.onFailure(BV4.A0a("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC3097ByB.A01;
            csa.A06(csr, executor);
            csa.A0A(csr, executor);
            CSA.A00(new CSN(csr, executor), (CSC) csa);
        } catch (RuntimeExecutionException e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            CSC csc = this.A01.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            csc.A0F(e);
        } catch (Exception e2) {
            this.A01.A01.A0F(e2);
        }
    }
}
