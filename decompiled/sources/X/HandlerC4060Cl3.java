package X;

import android.os.Handler;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Cl3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC4060Cl3 extends Handler {
    public final C4067ClE A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<Handler> listSynchronizedList;
        this.A00.A00.release();
        synchronized (C4054Ckx.class) {
            listSynchronizedList = C4054Ckx.A09;
            if (listSynchronizedList == null) {
                listSynchronizedList = Collections.synchronizedList(C60O.A11(1));
                C4054Ckx.A09 = listSynchronizedList;
            }
        }
        listSynchronizedList.remove(this);
    }

    public HandlerC4060Cl3(C4067ClE c4067ClE) {
        this.A00 = c4067ClE;
    }
}
