package androidx.work;

import X.Bx4;
import X.C7384Etj;
import X.EK5;
import X.EK9;
import X.EKi;
import X.F3R;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class WorkManagerInitializer implements Bx4<F3R> {
    public static final String A00 = EK9.A01("WrkMgrInitializer");

    @Override // X.Bx4
    public final List<Class<? extends Bx4<?>>> A8o() {
        return Collections.EMPTY_LIST;
    }

    @Override // X.Bx4
    public final /* bridge */ /* synthetic */ F3R A7V(Context context) {
        EK9.A00().A02(A00, "Initializing WorkManager with default configuration.");
        EKi eKi = new EKi(null, null, null);
        C7384Etj.A0Y(context, 0);
        EK5.A01(context, eKi);
        EK5 ek5A00 = EK5.A00(context);
        C7384Etj.A0U(ek5A00);
        return ek5A00;
    }
}
