package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.Df1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ServiceConnectionC5286Df1 implements ServiceConnection {
    public int A00;
    public IBinder A01;
    public final IBinder.DeathRecipient A02;
    public final C5281Dew A03;
    public final InterfaceC5284Dez A04;
    public final Context A07;
    public final InterfaceC5289Df4 A08;
    public volatile boolean A09;
    public final Queue<InterfaceC5288Df3> A06 = new ConcurrentLinkedQueue();
    public final Map A05 = BV4.A0u();

    public static final void A00(InterfaceC5288Df3 interfaceC5288Df3, ServiceConnectionC5286Df1 serviceConnectionC5286Df1) {
        try {
            interfaceC5288Df3.AhE(serviceConnectionC5286Df1.A04);
            IBinder iBinder = serviceConnectionC5286Df1.A01;
            iBinder.getClass();
            interfaceC5288Df3.AAy(iBinder);
        } catch (DeadObjectException e) {
            A03(serviceConnectionC5286Df1, e);
        } catch (RemoteException | RuntimeException e2) {
            interfaceC5288Df3.AdO(e2);
        }
    }

    public static void A01(ServiceConnectionC5286Df1 serviceConnectionC5286Df1) {
        if (serviceConnectionC5286Df1.A09) {
            try {
                serviceConnectionC5286Df1.A07.unbindService(serviceConnectionC5286Df1);
            } catch (IllegalArgumentException e) {
                if (Log.isLoggable("ServiceConnection", 6)) {
                    Log.e("ServiceConnection", "Failed to unbind the service. Ignoring and continuing", e);
                }
            }
            serviceConnectionC5286Df1.A09 = false;
        }
        IBinder iBinder = serviceConnectionC5286Df1.A01;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(serviceConnectionC5286Df1.A02, 0);
            } catch (NoSuchElementException e2) {
                if (Log.isLoggable("ServiceConnection", 6)) {
                    Log.e("ServiceConnection", "mDeathRecipient not linked", e2);
                }
            }
            serviceConnectionC5286Df1.A01 = null;
        }
        AbstractC7529Ezo.A00("ServiceConnection", "unbindService called");
    }

    public static final void A02(ServiceConnectionC5286Df1 serviceConnectionC5286Df1) {
        if (serviceConnectionC5286Df1.A09) {
            return;
        }
        try {
            serviceConnectionC5286Df1.A09 = serviceConnectionC5286Df1.A07.bindService(new Intent().setPackage(HealthConnectPermissionUtils.PROVIDER_PACKAGE).setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE"), serviceConnectionC5286Df1, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS);
            if (serviceConnectionC5286Df1.A09) {
                return;
            }
            String strA0h = FGI.A0h("Connection to service is not available for package '", HealthConnectPermissionUtils.PROVIDER_PACKAGE, "' and action '", "androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE", "'.");
            if (Log.isLoggable("ServiceConnection", 6)) {
                Log.e("ServiceConnection", strA0h);
            }
            RemoteException remoteException = new RemoteException("Binding to service failed");
            serviceConnectionC5286Df1.A00 = 10;
            A03(serviceConnectionC5286Df1, remoteException);
        } catch (SecurityException e) {
            String strA0U = FGI.A0U("Failed to bind connection '", String.format("%s#%s#%s", "HealthData", HealthConnectPermissionUtils.PROVIDER_PACKAGE, "androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE"), "', no permission or service not found.");
            if (Log.isLoggable("ServiceConnection", 5)) {
                Log.w("ServiceConnection", strA0U, e);
            }
            serviceConnectionC5286Df1.A09 = false;
            serviceConnectionC5286Df1.A01 = null;
            throw e;
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r5v0 X.Df1) */
    public static synchronized void A03(ServiceConnectionC5286Df1 serviceConnectionC5286Df1, Throwable th) {
        HashSet hashSetA0x;
        synchronized (serviceConnectionC5286Df1) {
            IBinder iBinder = serviceConnectionC5286Df1.A01;
            if (iBinder == null || !iBinder.isBinderAlive()) {
                A01(serviceConnectionC5286Df1);
                Set<SettableFuture<?>> set = ((C5277Der) serviceConnectionC5286Df1.A04).A00;
                synchronized (set) {
                    hashSetA0x = BV4.A0x(set);
                    set.clear();
                }
                Iterator it = hashSetA0x.iterator();
                while (it.hasNext()) {
                    ((SettableFuture) it.next()).setException(th);
                }
                Queue<InterfaceC5288Df3> queue = serviceConnectionC5286Df1.A06;
                Iterator itA0z = BV5.A0z(queue);
                while (itA0z.hasNext()) {
                    InterfaceC5288Df3 interfaceC5288Df3 = (InterfaceC5288Df3) itA0z.next();
                    if (queue.remove(interfaceC5288Df3)) {
                        interfaceC5288Df3.AdO(th);
                    }
                }
                int i = serviceConnectionC5286Df1.A00;
                if (i < 10) {
                    String strA0V = FGI.A0V("WCS SDK Client '", "HealthData", "' disconnected, retrying connection. Retry attempt: ", i);
                    if (Log.isLoggable("ServiceConnection", 5)) {
                        Log.w("ServiceConnection", strA0V, th);
                    }
                    InterfaceC5289Df4 interfaceC5289Df4 = serviceConnectionC5286Df1.A08;
                    long j = 200 << serviceConnectionC5286Df1.A00;
                    Handler handler = ((C5285Df0) interfaceC5289Df4).A01;
                    handler.sendMessageDelayed(handler.obtainMessage(2, serviceConnectionC5286Df1), j);
                } else if (Log.isLoggable("ServiceConnection", 6)) {
                    Log.e("ServiceConnection", "Connection disconnected and maximum number of retries reached.", th);
                }
            } else {
                BV5.A1J("ServiceConnection", "Connection is already re-established. No need to reconnect again");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        String strA0U = FGI.A0U("Binding died for client '", "HealthData", "'.");
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", strA0U);
        }
        A03(this, new RemoteException("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        String strA0U = FGI.A0U("Cannot bind client '", "HealthData", "', binder is null");
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", strA0U);
        }
        A03(this, new RemoteException("Null binding"));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        AbstractC7529Ezo.A00("ServiceConnection", AnonymousClass007.A0a("onServiceConnected(), componentName = ", componentName));
        if (iBinder == null) {
            if (Log.isLoggable("ServiceConnection", 6)) {
                Log.e("ServiceConnection", "Service connected but binder is null.");
                return;
            }
            return;
        }
        this.A00 = 0;
        try {
            iBinder.linkToDeath(this.A02, 0);
        } catch (RemoteException e) {
            if (Log.isLoggable("ServiceConnection", 5)) {
                Log.w("ServiceConnection", "Cannot link to death, binder already died. Cleaning operations.", e);
            }
            A03(this, e);
        }
        this.A01 = iBinder;
        BV4.A1D(((C5285Df0) this.A08).A01, this, 1);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC7529Ezo.A00("ServiceConnection", AnonymousClass007.A0a("onServiceDisconnected(), componentName = ", componentName));
    }

    public ServiceConnectionC5286Df1(Context context, C5281Dew c5281Dew, InterfaceC5284Dez interfaceC5284Dez, InterfaceC5289Df4 interfaceC5289Df4) {
        context.getClass();
        this.A07 = context;
        this.A03 = c5281Dew;
        this.A04 = interfaceC5284Dez;
        this.A08 = interfaceC5289Df4;
        this.A02 = new IBinder.DeathRecipient() { // from class: X.Df2
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                ServiceConnectionC5286Df1 serviceConnectionC5286Df1 = this.A00;
                BV5.A1J("ServiceConnection", FGI.A0M("Binder died for client:", "HealthData"));
                ServiceConnectionC5286Df1.A03(serviceConnectionC5286Df1, new RemoteException("Binder died"));
            }
        };
    }
}
