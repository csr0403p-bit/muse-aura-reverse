package X;

import android.os.ConditionVariable;
import android.os.Trace;

/* loaded from: classes5.dex */
public abstract class CIT {
    public static final ConditionVariable A00 = new ConditionVariable(true);

    public static final void A00() {
        ConditionVariable conditionVariable = A00;
        boolean zBlock = conditionVariable.block(-1L);
        int iHashCode = conditionVariable.hashCode();
        if (zBlock) {
            CFK.A05("InitStatus", FGI.A0I("Not blocking Service (", iHashCode, ")"));
            return;
        }
        CFK.A06("InitStatus", FGI.A0I("Blocking Service (", iHashCode, ")"));
        AbstractC3191C2p.A00("ServiceWaitForInit");
        try {
            conditionVariable.block();
        } finally {
            Trace.endSection();
            CFK.A06("InitStatus", FGI.A0I("Unblocked Service (", conditionVariable.hashCode(), ")"));
        }
    }
}
