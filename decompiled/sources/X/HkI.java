package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class HkI extends Handler {
    public WeakReference<DialogInterface> A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick(this.A00.get(), i);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
