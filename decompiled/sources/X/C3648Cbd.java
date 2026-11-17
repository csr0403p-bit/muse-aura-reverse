package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.Cbd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3648Cbd implements Handler.Callback {
    public final /* synthetic */ C3649Cbe A00;

    public /* synthetic */ C3648Cbd(C3649Cbe c3649Cbe) {
        this.A00 = c3649Cbe;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap map = this.A00.A02;
            synchronized (map) {
                Cbb cbb = (Cbb) message.obj;
                Cbc cbc = (Cbc) map.get(cbb);
                if (cbc != null && cbc.A05.isEmpty()) {
                    if (cbc.A03) {
                        Cbb cbb2 = cbc.A04;
                        C3649Cbe c3649Cbe = cbc.A06;
                        c3649Cbe.A04.removeMessages(1, cbb2);
                        c3649Cbe.A01.A02(c3649Cbe.A00, cbc);
                        cbc.A03 = false;
                        cbc.A00 = 2;
                    }
                    map.remove(cbb);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        HashMap map2 = this.A00.A02;
        synchronized (map2) {
            Cbb cbb3 = (Cbb) message.obj;
            Cbc cbc2 = (Cbc) map2.get(cbb3);
            if (cbc2 != null && cbc2.A00 == 3) {
                Log.e("GmsClientSupervisor", FGI.A0M("Timeout waiting for ServiceConnection callback ", String.valueOf(cbb3)), new Exception());
                ComponentName componentName = cbc2.A01;
                if (componentName == null) {
                    String str = cbb3.A01;
                    CRy.A03(str);
                    componentName = new ComponentName(str, "unknown");
                }
                cbc2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
