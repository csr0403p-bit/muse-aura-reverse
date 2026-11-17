package X;

import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Cok, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4176Cok {
    public final int A00;

    public final void A00(Status status) {
        if (!(this instanceof C4180Coq)) {
            if (this instanceof C4177Col) {
                ((C4177Col) this).A01.A01(AbstractC4118CnB.A00(status));
                return;
            } else {
                ((AbstractC4194CpS) this).A00.A01(new ApiException(status));
                return;
            }
        }
        try {
            AbstractC4185Cov abstractC4185Cov = ((C4180Coq) this).A00;
            CRy.A08(!BV7.A1R(status.A00), "Failed result must not be success");
            abstractC4185Cov.A02(abstractC4185Cov.A01(status));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void A01(Exception exc) {
        if (!(this instanceof C4180Coq)) {
            (this instanceof C4177Col ? ((C4177Col) this).A01 : ((AbstractC4194CpS) this).A00).A01(exc);
            return;
        }
        C4180Coq c4180Coq = (C4180Coq) this;
        Status status = new Status(10, FGI.A0U(C3cI.A0Y(exc), ": ", exc.getLocalizedMessage()));
        try {
            AbstractC4185Cov abstractC4185Cov = c4180Coq.A00;
            abstractC4185Cov.A02(abstractC4185Cov.A01(status));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public AbstractC4176Cok(int i) {
        this.A00 = i;
    }
}
