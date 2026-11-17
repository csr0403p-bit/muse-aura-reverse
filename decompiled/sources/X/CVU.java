package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel$Stub$Proxy;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CVU implements ServiceConnection, Handler.Callback {
    public final Context A01;
    public final Handler A02;
    public final HandlerThread A04;
    public final Map<ComponentName, CVW> A03 = BV4.A0u();
    public Set<String> A00 = C60O.A13();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", AnonymousClass007.A0a("Connected to service ", componentName));
        }
        BV6.A10(this.A02, new CVX(componentName, iBinder), 1);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", AnonymousClass007.A0a("Disconnected from service ", componentName));
        }
        BV6.A10(this.A02, componentName, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(X.CVW r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CVU.A00(X.CVW):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.support.v4.app.INotificationSideChannel] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        CVW cvw;
        INotificationSideChannel$Stub$Proxy iNotificationSideChannel$Stub$Proxy;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                CVX cvx = (CVX) message.obj;
                ComponentName componentName = cvx.A00;
                IBinder iBinder = cvx.A01;
                cvw = this.A03.get(componentName);
                if (cvw == null) {
                    return true;
                }
                if (iBinder == null) {
                    iNotificationSideChannel$Stub$Proxy = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.A00);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) {
                        INotificationSideChannel$Stub$Proxy iNotificationSideChannel$Stub$Proxy2 = new INotificationSideChannel$Stub$Proxy();
                        iNotificationSideChannel$Stub$Proxy2.A00 = iBinder;
                        iNotificationSideChannel$Stub$Proxy = iNotificationSideChannel$Stub$Proxy2;
                    } else {
                        iNotificationSideChannel$Stub$Proxy = (INotificationSideChannel) iInterfaceQueryLocalInterface;
                    }
                }
                cvw.A01 = iNotificationSideChannel$Stub$Proxy;
                cvw.A00 = 0;
            } else {
                if (i == 2) {
                    CVW cvw2 = this.A03.get(message.obj);
                    if (cvw2 == null) {
                        return true;
                    }
                    if (cvw2.A03) {
                        this.A01.unbindService(this);
                        cvw2.A03 = false;
                    }
                    cvw2.A01 = null;
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                cvw = this.A03.get(message.obj);
                if (cvw == null) {
                    return true;
                }
            }
            A00(cvw);
            return true;
        }
        Object obj = message.obj;
        Context context = this.A01;
        Set<String> setA00 = C7380Etd.A00(context);
        if (!setA00.equals(this.A00)) {
            this.A00 = setA00;
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSetA13 = C60O.A13();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setA00.contains(((PackageItemInfo) resolveInfo.serviceInfo).packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(((PackageItemInfo) serviceInfo).packageName, ((PackageItemInfo) serviceInfo).name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", AnonymousClass001.A0v(", not adding listener record.", C3cG.A0f(componentName2, "Permission present on component ")));
                    } else {
                        hashSetA13.add(componentName2);
                    }
                }
            }
            Iterator it = hashSetA13.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                Map<ComponentName, CVW> map = this.A03;
                if (!map.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", AnonymousClass007.A0a("Adding listener record for ", componentName3));
                    }
                    map.put(componentName3, new CVW(componentName3));
                }
            }
            Iterator itA0n = AnonymousClass002.A0n(this.A03);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (!hashSetA13.contains(entryA0l.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", C8j3.A14(entryA0l.getKey(), C60O.A0x("Removing listener record for ")));
                    }
                    CVW cvw3 = (CVW) entryA0l.getValue();
                    if (cvw3.A03) {
                        context.unbindService(this);
                        cvw3.A03 = false;
                    }
                    cvw3.A01 = null;
                    itA0n.remove();
                }
            }
        }
        Iterator itA10 = BV5.A10(this.A03);
        while (itA10.hasNext()) {
            CVW cvw4 = (CVW) itA10.next();
            cvw4.A02.add(obj);
            A00(cvw4);
        }
        return true;
    }

    public CVU(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.A04 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(handlerThread.getLooper(), this);
    }
}
