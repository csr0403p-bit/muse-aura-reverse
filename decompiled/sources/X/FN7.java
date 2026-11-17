package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes6.dex */
public final class FN7 implements Handler.Callback {
    public final /* synthetic */ FN2 A00;

    public FN7(FN2 fn2) {
        this.A00 = fn2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!AbstractC8162FXe.A03()) {
            FNM fnm = this.A00.A04;
            Message messageObtainMessage = fnm.obtainMessage(message.what, message.obj);
            C7384Etj.A0Y(messageObtainMessage, 0);
            if (C7384Etj.areEqual(Looper.myLooper(), fnm.getLooper())) {
                fnm.A00.handleMessage(messageObtainMessage);
                return true;
            }
            fnm.sendMessageAtFrontOfQueue(messageObtainMessage);
            return true;
        }
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Object obj = null;
            obj.getClass();
            throw F60.createAndThrow();
        }
        FN2 fn2 = this.A00;
        Object obj2 = message.obj;
        obj2.getClass();
        FNV fnv = (FNV) obj2;
        try {
            C7729FCg c7729FCg = fn2.A00;
            if (c7729FCg != null) {
                c7729FCg.A04();
            }
            FGJ fgj = fn2.A01;
            if (fgj == null) {
                FN2.A00(fn2, 8);
            } else {
                fnv.A01.A05(fgj);
            }
            return true;
        } finally {
            fn2.A00 = fnv.A01;
            FN2.A00(fn2, fnv.A00);
        }
    }
}
