package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes5.dex */
public abstract class ECM {
    public BroadcastReceiver A00;
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A01;

    public ECM(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        this.A01 = layoutInflaterFactory2C8250FaT;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ECM.A00():int");
    }

    public final void A01() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0k.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public final void A02() {
        IntentFilter intentFilter;
        String strA00;
        A01();
        if (this instanceof DBV) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            strA00 = "android.intent.action.TIME_TICK";
        } else {
            intentFilter = new IntentFilter();
            strA00 = C3cF.A00(23);
        }
        intentFilter.addAction(strA00);
        if (intentFilter.countActions() != 0) {
            BroadcastReceiver ecn = this.A00;
            if (ecn == null) {
                ecn = new ECN(this);
                this.A00 = ecn;
            }
            this.A01.A0k.registerReceiver(ecn, intentFilter);
        }
    }
}
