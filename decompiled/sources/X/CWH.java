package X;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes5.dex */
public final /* synthetic */ class CWH implements CUY {
    @Override // X.CUY
    public final Object A7X(CUL cul) {
        CWJ cwj = new CWJ();
        C07 c07 = new C07();
        final ReferenceQueue referenceQueue = cwj.A00;
        final Set set = cwj.A01;
        set.add(new CWK(cwj, c07, referenceQueue, set));
        Thread thread = new Thread(new Runnable() { // from class: X.CWI
            public static final String __redex_internal_original_name = "zzb";

            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        CWK cwk = (CWK) referenceQueue2.remove();
                        if (cwk.A01.remove(cwk)) {
                            cwk.clear();
                            cwk.A00.run();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return cwj;
    }
}
