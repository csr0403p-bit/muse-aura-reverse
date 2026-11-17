package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class CUD {
    public static final Object A01 = C3cG.A0T();
    public static volatile CUD A02;
    public final ConcurrentHashMap A00 = C60O.A1C();

    public static CUD A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new CUD();
                }
            }
        }
        CUD cud = A02;
        CRy.A03(cud);
        return cud;
    }

    public final void A02(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof CUE)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, CUD cud, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((CUF.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof CUE) {
            return context.bindService(intent, serviceConnection, i);
        }
        ConcurrentHashMap concurrentHashMap = cud.A00;
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (objPutIfAbsent != null && serviceConnection != objPutIfAbsent) {
            BV6.A1L("Duplicate binding with the same ServiceConnection: %s, %s, %s.", "ConnectionTracker", new Object[]{serviceConnection, str, intent.getAction()});
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
