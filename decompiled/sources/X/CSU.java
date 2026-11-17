package X;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* loaded from: classes5.dex */
public final class CSU implements Runnable {
    public static final String __redex_internal_original_name = "zzc";
    public final /* synthetic */ CSA A00;
    public final /* synthetic */ CSV A01;

    public CSU(CSA csa, CSV csv) {
        this.A01 = csv;
        this.A00 = csa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CSA csa = this.A00;
        boolean z = ((CSC) csa).A05;
        CSV csv = this.A01;
        if (z) {
            csv.A01.A0D();
            return;
        }
        try {
            csv.A01.A0G(csv.A00.then(csa));
        } catch (RuntimeExecutionException e) {
            e = e;
            boolean z2 = e.getCause() instanceof Exception;
            CSC csc = csv.A01;
            if (z2) {
                e = (Exception) e.getCause();
            }
            csc.A0F(e);
        } catch (Exception e2) {
            csv.A01.A0F(e2);
        }
    }
}
