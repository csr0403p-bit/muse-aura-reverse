package X;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class CZh implements InterfaceC3633Cah {
    public final ComponentName A00;
    public final String A01;
    public final Messenger A02;

    @Override // X.InterfaceC3633Cah
    public final void APP(int i) throws RemoteException {
        Messenger messenger = this.A02;
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.arg1 = i;
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString("tag", this.A01);
        bundleA0N.putParcelable("component", this.A00);
        messageObtain.setData(bundleA0N);
        messenger.send(messageObtain);
    }

    public CZh(ComponentName componentName, Messenger messenger, String str) {
        this.A02 = messenger;
        this.A01 = str;
        this.A00 = componentName;
    }
}
