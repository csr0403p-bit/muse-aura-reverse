package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzad;

/* renamed from: X.Coa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ServiceConnectionC4171Coa implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ AbstractC4160CoH A01;

    public ServiceConnectionC4171Coa(AbstractC4160CoH abstractC4160CoH, int i) {
        this.A01 = abstractC4160CoH;
        this.A00 = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        Message messageObtainMessage;
        int i;
        int i2;
        AbstractC4160CoH abstractC4160CoH = this.A01;
        if (iBinder == null) {
            synchronized (abstractC4160CoH.A0E) {
                i = abstractC4160CoH.A00;
            }
            if (i == 3) {
                abstractC4160CoH.A06 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            handler = abstractC4160CoH.A0B;
            messageObtainMessage = handler.obtainMessage(i2, abstractC4160CoH.A05.get(), 16);
        } else {
            synchronized (abstractC4160CoH.A0F) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC4160CoH.A03 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new zzad(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
            }
            int i3 = this.A00;
            C4238Cr2 c4238Cr2 = new C4238Cr2(null, abstractC4160CoH, 0);
            handler = abstractC4160CoH.A0B;
            messageObtainMessage = handler.obtainMessage(7, i3, -1, c4238Cr2);
        }
        handler.sendMessage(messageObtainMessage);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4160CoH abstractC4160CoH = this.A01;
        synchronized (abstractC4160CoH.A0F) {
            abstractC4160CoH.A03 = null;
        }
        int i = this.A00;
        Handler handler = abstractC4160CoH.A0B;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
