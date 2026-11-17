package X;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;

/* renamed from: X.CoU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4168CoU implements Runnable {
    public static final String __redex_internal_original_name = "zabt";
    public final /* synthetic */ ConnectionResult A00;
    public final /* synthetic */ C4172Cob A01;

    public RunnableC4168CoU(ConnectionResult connectionResult, C4172Cob c4172Cob) {
        this.A01 = c4172Cob;
        this.A00 = connectionResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        C4172Cob c4172Cob = this.A01;
        C4164CoO c4164CoO = (C4164CoO) c4172Cob.A05.A08.get(c4172Cob.A04);
        if (c4164CoO != null) {
            ConnectionResult connectionResult = this.A00;
            if (!AnonymousClass002.A1M(connectionResult.A01)) {
                c4164CoO.A0B(connectionResult, null);
                return;
            }
            c4172Cob.A02 = true;
            InterfaceC4191CpP interfaceC4191CpP = c4172Cob.A03;
            if (interfaceC4191CpP.AbJ()) {
                if (!c4172Cob.A02 || (iAccountAccessor = c4172Cob.A00) == null) {
                    return;
                }
                interfaceC4191CpP.AJV(iAccountAccessor, c4172Cob.A01);
                return;
            }
            try {
                AbstractC4162CoM abstractC4162CoM = (AbstractC4162CoM) interfaceC4191CpP;
                interfaceC4191CpP.AJV(null, abstractC4162CoM.AbJ() ? abstractC4162CoM.A01 : Collections.EMPTY_SET);
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) interfaceC4191CpP;
                abstractC4160CoH.A0N = "Failed to get service from broker.";
                abstractC4160CoH.A96();
                c4164CoO.A0B(new ConnectionResult(10), null);
            }
        }
    }
}
