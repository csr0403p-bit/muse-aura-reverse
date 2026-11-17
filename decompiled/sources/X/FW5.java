package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes6.dex */
public final class FW5 {
    public static FW5 A04;
    public FW8 A00;
    public FW8 A01;
    public final Object A03 = C3cG.A0T();
    public final Handler A02 = new Handler(Looper.getMainLooper(), new C10633I0d(this, 1));

    public static FW5 A00() {
        FW5 fw5 = A04;
        if (fw5 != null) {
            return fw5;
        }
        FW5 fw52 = new FW5();
        A04 = fw52;
        return fw52;
    }

    public static void A01(FW8 fw8, FW5 fw5) {
        int i = fw8.A00;
        if (i != -2) {
            if (i <= 0) {
                i = 2750;
                if (i == -1) {
                    i = 1500;
                }
            }
            Handler handler = fw5.A02;
            handler.removeCallbacksAndMessages(fw8);
            handler.sendMessageDelayed(Message.obtain(handler, 0, fw8), i);
        }
    }

    public static void A02(FW5 fw5) {
        FW8 fw8 = fw5.A01;
        if (fw8 != null) {
            fw5.A00 = fw8;
            fw5.A01 = null;
            FVe fVe = fw8.A02.get();
            if (fVe == null) {
                fw5.A00 = null;
            } else {
                Handler handler = FW1.A0H;
                handler.sendMessage(handler.obtainMessage(0, ((FWC) fVe).A00));
            }
        }
    }

    public static boolean A03(FVe fVe, FW5 fw5) {
        FW8 fw8 = fw5.A00;
        return (fw8 == null || fVe == null || fw8.A02.get() != fVe) ? false : true;
    }

    public static boolean A04(FW8 fw8, FW5 fw5, int i) {
        FVe fVe = fw8.A02.get();
        if (fVe == null) {
            return false;
        }
        fw5.A02.removeCallbacksAndMessages(fw8);
        Handler handler = FW1.A0H;
        handler.sendMessage(handler.obtainMessage(1, i, 0, ((FWC) fVe).A00));
        return true;
    }

    public final void A05(FVe fVe) {
        synchronized (this.A03) {
            if (A03(fVe, this)) {
                FW8 fw8 = this.A00;
                if (!fw8.A01) {
                    fw8.A01 = true;
                    this.A02.removeCallbacksAndMessages(fw8);
                }
            }
        }
    }

    public final void A06(FVe fVe) {
        synchronized (this.A03) {
            if (A03(fVe, this)) {
                FW8 fw8 = this.A00;
                if (fw8.A01) {
                    fw8.A01 = false;
                    A01(fw8, this);
                }
            }
        }
    }
}
