package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.IMultiInstanceInvalidationService$Stub$Proxy;

/* renamed from: X.Dfa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ServiceConnectionC5295Dfa implements ServiceConnection {
    public final /* synthetic */ C5297Dfd A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.room.IMultiInstanceInvalidationService] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IMultiInstanceInvalidationService$Stub$Proxy iMultiInstanceInvalidationService$Stub$Proxy;
        C7384Etj.A0Y(iBinder, 1);
        C5297Dfd c5297Dfd = this.A00;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationService.A00);
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) {
            IMultiInstanceInvalidationService$Stub$Proxy iMultiInstanceInvalidationService$Stub$Proxy2 = new IMultiInstanceInvalidationService$Stub$Proxy();
            iMultiInstanceInvalidationService$Stub$Proxy2.A00 = iBinder;
            iMultiInstanceInvalidationService$Stub$Proxy = iMultiInstanceInvalidationService$Stub$Proxy2;
        } else {
            iMultiInstanceInvalidationService$Stub$Proxy = (IMultiInstanceInvalidationService) iInterfaceQueryLocalInterface;
        }
        c5297Dfd.A01 = iMultiInstanceInvalidationService$Stub$Proxy;
        if (iMultiInstanceInvalidationService$Stub$Proxy != null) {
            try {
                c5297Dfd.A00 = iMultiInstanceInvalidationService$Stub$Proxy.AZz(c5297Dfd.A04, c5297Dfd.A07);
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    public ServiceConnectionC5295Dfa(C5297Dfd c5297Dfd) {
        this.A00 = c5297Dfd;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A01 = null;
    }
}
