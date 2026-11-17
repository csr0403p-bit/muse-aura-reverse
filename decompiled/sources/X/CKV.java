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
public final class CKV {
    public static final Map A0D = BV4.A0u();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final CJS A06;
    public final C3398CJp A0C;
    public final List A09 = C3cG.A0h();
    public final Set A0A = C60O.A13();
    public final Object A07 = C3cG.A0T();
    public final IBinder.DeathRecipient A05 = new IBinder.DeathRecipient() { // from class: X.CKX
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            CKV ckv = this.A00;
            CJS cjs = ckv.A06;
            cjs.A00("reportBinderDeath", BV4.A1W());
            ckv.A08.get();
            cjs.A00("%s : Binder has died.", "com.google.android.finsky.inappreviewservice.InAppReviewService");
            List<CKQ> list = ckv.A09;
            for (CKQ ckq : list) {
                RemoteException remoteExceptionA0W = BV8.A0W("com.google.android.finsky.inappreviewservice.InAppReviewService");
                CSE cse = ckq.A00;
                if (cse != null) {
                    cse.A01(remoteExceptionA0W);
                }
            }
            list.clear();
            CKV.A00(ckv);
        }
    };
    public final AtomicInteger A0B = BV5.A17();
    public final WeakReference A08 = BV4.A0q(null);

    public static final void A00(CKV ckv) {
        synchronized (ckv.A07) {
            Set set = ckv.A0A;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((CSE) it.next()).A01(BV8.A0W("com.google.android.finsky.inappreviewservice.InAppReviewService"));
            }
            set.clear();
        }
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("com.google.android.finsky.inappreviewservice.InAppReviewService")) {
                map.put("com.google.android.finsky.inappreviewservice.InAppReviewService", BV5.A0B(new HandlerThread("com.google.android.finsky.inappreviewservice.InAppReviewService", 10)));
            }
            handler = (Handler) map.get("com.google.android.finsky.inappreviewservice.InAppReviewService");
        }
        return handler;
    }

    public CKV(Context context, Intent intent, CJS cjs, C3398CJp c3398CJp) {
        this.A03 = context;
        this.A06 = cjs;
        this.A04 = intent;
        this.A0C = c3398CJp;
    }
}
