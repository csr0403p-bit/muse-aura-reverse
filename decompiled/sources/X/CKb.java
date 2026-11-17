package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CKb {
    public static final Map A0D = BV4.A0u();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final CJQ A06;
    public final C3394CJi A0C;
    public final List A09 = C3cG.A0h();
    public final Set A0A = C60O.A13();
    public final Object A07 = C3cG.A0T();
    public final IBinder.DeathRecipient A05 = new IBinder.DeathRecipient() { // from class: X.CKd
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            CKb cKb = this.A00;
            CJQ cjq = cKb.A06;
            cjq.A03("reportBinderDeath", BV4.A1W());
            cKb.A08.get();
            cjq.A03("%s : Binder has died.", "SplitInstallService");
            List<AbstractRunnableC3407CKq> list = cKb.A09;
            for (AbstractRunnableC3407CKq abstractRunnableC3407CKq : list) {
                RemoteException remoteExceptionA0W = BV8.A0W("SplitInstallService");
                CSE cse = abstractRunnableC3407CKq.A00;
                if (cse != null) {
                    cse.A01(remoteExceptionA0W);
                }
            }
            list.clear();
            synchronized (cKb.A07) {
                CKb.A00(cKb);
            }
        }
    };
    public final AtomicInteger A0B = BV5.A17();
    public final WeakReference A08 = BV4.A0q(null);

    public static final void A00(CKb cKb) {
        Set set = cKb.A0A;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((CSE) it.next()).A01(BV8.A0W("SplitInstallService"));
        }
        set.clear();
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("SplitInstallService")) {
                map.put("SplitInstallService", BV5.A0B(new HandlerThread("SplitInstallService", 10)));
            }
            handler = (Handler) map.get("SplitInstallService");
        }
        return handler;
    }

    public final void A02(CSE cse) {
        synchronized (this.A07) {
            this.A0A.remove(cse);
        }
        A01().post(new C3403CKe(this));
    }

    public final void A03(CSE cse, AbstractRunnableC3407CKq abstractRunnableC3407CKq) {
        A01().post(new CKc(abstractRunnableC3407CKq.A00, cse, this, abstractRunnableC3407CKq));
    }

    public CKb(Context context, Intent intent, CJQ cjq, C3394CJi c3394CJi) {
        this.A03 = context;
        this.A06 = cjq;
        this.A04 = intent;
        this.A0C = c3394CJi;
    }
}
