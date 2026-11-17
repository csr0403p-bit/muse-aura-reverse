package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

@Deprecated
/* renamed from: X.Fqz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8843Fqz {
    public InterfaceC8862Fra A00;
    public C8839Fqv A01;
    public final Context A02;
    public final Intent A03;
    public final MediaBrowser.ConnectionCallback A04;
    public final BroadcastReceiver.PendingResult A05;

    public static void A00(C8843Fqz c8843Fqz) throws RemoteException {
        Messenger messenger;
        AbstractC8842Fqy abstractC8842Fqy = (AbstractC8842Fqy) c8843Fqz.A01.A00;
        C8847Fr4 c8847Fr4 = abstractC8842Fqy.A01;
        if (c8847Fr4 != null && (messenger = abstractC8842Fqy.A00) != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.arg1 = 1;
                messageObtain.setData(null);
                messageObtain.replyTo = messenger;
                c8847Fr4.A01.send(messageObtain);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        abstractC8842Fqy.A04.disconnect();
        c8843Fqz.A05.finish();
    }

    public C8843Fqz() {
        this.A04 = new C8844Fr0(this);
    }

    public C8843Fqz(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
        this();
        this.A02 = context;
        this.A03 = intent;
        this.A05 = pendingResult;
    }
}
