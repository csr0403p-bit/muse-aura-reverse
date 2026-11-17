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

/* renamed from: X.CKi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3404CKi {
    public static final Map A0D = BV4.A0u();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final CJT A06;
    public final C3402CJy A0C;
    public final List A09 = C3cG.A0h();
    public final Set A0A = C60O.A13();
    public final Object A07 = C3cG.A0T();
    public final IBinder.DeathRecipient A05 = new IBinder.DeathRecipient() { // from class: X.CKh
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C3404CKi c3404CKi = this.A00;
            CJT cjt = c3404CKi.A06;
            cjt.A02("reportBinderDeath", BV4.A1W());
            c3404CKi.A08.get();
            cjt.A02("%s : Binder has died.", "AppUpdateService");
            List<CKp> list = c3404CKi.A09;
            for (CKp cKp : list) {
                RemoteException remoteExceptionA0W = BV8.A0W("AppUpdateService");
                CSE cse = cKp.A00;
                if (cse != null) {
                    cse.A01(remoteExceptionA0W);
                }
            }
            list.clear();
            synchronized (c3404CKi.A07) {
                C3404CKi.A00(c3404CKi);
            }
        }
    };
    public final AtomicInteger A0B = BV5.A17();
    public final WeakReference A08 = BV4.A0q(null);

    public static final void A00(C3404CKi c3404CKi) {
        Set set = c3404CKi.A0A;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((CSE) it.next()).A01(BV8.A0W("AppUpdateService"));
        }
        set.clear();
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("AppUpdateService")) {
                map.put("AppUpdateService", BV5.A0B(new HandlerThread("AppUpdateService", 10)));
            }
            handler = (Handler) map.get("AppUpdateService");
        }
        return handler;
    }

    public final void A02(CSE cse) {
        synchronized (this.A07) {
            this.A0A.remove(cse);
        }
        A01().post(new C3405CKl(this));
    }

    public C3404CKi(Context context, Intent intent, CJT cjt, C3402CJy c3402CJy) {
        this.A03 = context;
        this.A06 = cjt;
        this.A04 = intent;
        this.A0C = c3402CJy;
    }
}
