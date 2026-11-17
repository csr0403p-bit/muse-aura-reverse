package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class CXU {
    public final synchronized CXV A00() {
        CXV cxv;
        if (!CXV.A03) {
            throw BV4.A0c("GrootSessionManager has not been configured yet");
        }
        cxv = CXV.A02;
        if (cxv == null) {
            C7384Etj.A0b("grootSessionManager");
            throw F60.createAndThrow();
        }
        return cxv;
    }

    public final synchronized void A01(Context context, CXW cxw) {
        if (!CXV.A03) {
            CXV.A02 = new CXV(cxw, BV4.A0q(context));
            CXV.A03 = true;
        }
    }
}
