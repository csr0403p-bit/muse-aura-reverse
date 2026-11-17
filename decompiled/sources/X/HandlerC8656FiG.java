package X;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.FiG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC8656FiG extends Handler {
    public WeakReference<Messenger> A00;
    public final WeakReference<InterfaceC8657FiH> A01;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference<Messenger> weakReference = this.A00;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference<InterfaceC8657FiH> weakReference2 = this.A01;
        if (weakReference2.get() != null) {
            Bundle data = message.getData();
            C8852FrD.A00(data);
            InterfaceC8657FiH interfaceC8657FiH = weakReference2.get();
            Messenger messenger = this.A00.get();
            try {
                int i = message.what;
                if (i == 1) {
                    C8852FrD.A00(data.getBundle("data_root_hints"));
                    data.getString("data_media_item_id");
                    data.getParcelable("data_media_session_token");
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        StringBuilder sbA0f = C3cG.A0f(message, "Unhandled message: ");
                        sbA0f.append("\n  Client version: 1\n  Service version: ");
                        Log.w("MediaBrowserCompat", BV4.A0l(sbA0f, message.arg1));
                        return;
                    }
                    C8852FrD.A00(data.getBundle("data_options"));
                    C8852FrD.A00(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    data.getParcelableArrayList("data_media_item_list");
                    AbstractC8842Fqy abstractC8842Fqy = (AbstractC8842Fqy) interfaceC8657FiH;
                    if (abstractC8842Fqy.A00 == messenger) {
                        abstractC8842Fqy.A07.get(string);
                        if (C8839Fqv.A01) {
                            Log.d("MediaBrowserCompat", FGI.A0M("onLoadChildren for id that isn't subscribed id=", string));
                        }
                    }
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            }
        }
    }

    public HandlerC8656FiG(InterfaceC8657FiH interfaceC8657FiH) {
        this.A01 = BV4.A0q(interfaceC8657FiH);
    }
}
