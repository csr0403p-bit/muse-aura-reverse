package X;

import android.app.Application;
import android.content.Context;

/* loaded from: classes5.dex */
public abstract class CGO {
    static {
        C7384Etj.A0U(EK9.A01("ProcessUtils"));
    }

    public static final boolean A00(Context context, EKi eKi) {
        AnonymousClass003.A0u(context, eKi);
        String processName = Application.getProcessName();
        C7384Etj.A0U(processName);
        return processName.equals(context.getApplicationInfo().processName);
    }
}
