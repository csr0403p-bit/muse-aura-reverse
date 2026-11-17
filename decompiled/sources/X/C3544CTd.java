package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzm;

/* renamed from: X.CTd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3544CTd {
    public final Messenger A00;
    public final zzm A01;

    public C3544CTd(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.A00 = new Messenger(iBinder);
            return;
        }
        if (!"com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", BV5.A0l(strValueOf.length(), "Invalid interface descriptor: ", strValueOf));
            throw new RemoteException();
        }
        zzm zzmVar = new zzm();
        zzmVar.A00 = new Messenger(iBinder);
        this.A01 = zzmVar;
    }
}
