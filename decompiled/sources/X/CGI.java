package X;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CGI {
    public final AbstractC6610EKa A00(Context context, WorkerParameters workerParameters, String str) {
        if (!(this instanceof CGH)) {
            return null;
        }
        AnonymousClass003.A0u(context, str);
        Iterator<CGI> it = ((CGH) this).A00.iterator();
        while (it.hasNext()) {
            try {
                AbstractC6610EKa abstractC6610EKaA00 = it.next().A00(context, workerParameters, str);
                if (abstractC6610EKaA00 != null) {
                    return abstractC6610EKaA00;
                }
            } catch (Throwable th) {
                String strA0r = C60O.A0r("Unable to instantiate a ListenableWorker (", str);
                EK9.A00();
                Log.e(CGJ.A00, strA0r, th);
                throw th;
            }
        }
        return null;
    }
}
