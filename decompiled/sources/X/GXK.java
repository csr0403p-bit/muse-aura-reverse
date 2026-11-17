package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class GXK {
    public int A00;
    public GY0 A01;
    public boolean A02;
    public final Handler A03;
    public final GXT A04;
    public final GXF A05;
    public final C10538Hql A06;
    public final InterfaceC9648GXn A07;
    public final Handler.Callback A08;
    public volatile boolean A09;

    public GXK(GXF gxf, InterfaceC9648GXn interfaceC9648GXn) {
        this.A05 = gxf;
        this.A07 = interfaceC9648GXn;
        C10633I0d c10633I0d = new C10633I0d(this, 0);
        this.A08 = c10633I0d;
        this.A06 = new C10538Hql(null);
        this.A03 = new Handler(Looper.getMainLooper(), c10633I0d);
        this.A04 = new GXT(this);
    }

    public static final void A00(GXK gxk) {
        if (gxk.A02) {
            int i = gxk.A00;
            if (i <= 3) {
                Handler handler = gxk.A03;
                handler.removeMessages(1);
                handler.sendEmptyMessage(1);
            } else if (gxk.A05.A07.fallBackWhenBluetoothUnusable()) {
                InterfaceC9648GXn.A00(gxk.A07, FGI.A0I("restartScoAudio: giving up after ", i, " attempts"));
                gxk.A09 = true;
                A02(gxk, true);
            }
        }
    }

    public static final void A01(GXK gxk) {
        GXF gxf = gxk.A05;
        if (!gxf.A07.fixAudioRouteChange()) {
            gxf.A04(true);
            return;
        }
        gxk.A02 = true;
        Handler handler = gxk.A03;
        if (handler.hasMessages(1)) {
            return;
        }
        InterfaceC9648GXn.A00(gxk.A07, FGI.A0H("turnBluetoothOn: send MSG_START_SCO | attempts: ", gxk.A00));
        gxk.A00 = 0;
        handler.sendEmptyMessage(1);
    }

    public static final void A02(GXK gxk, boolean z) {
        GXF gxf = gxk.A05;
        if (gxf.A07.fixAudioRouteChange()) {
            InterfaceC9648GXn.A00(gxk.A07, "turnBluetoothOff: remove MSG_START_SCO messages");
            if (z) {
                gxk.A02 = false;
                gxk.A00 = 0;
            }
            Handler handler = gxk.A03;
            handler.removeMessages(1);
            handler.removeMessages(2);
        }
        gxf.A04(false);
    }

    public final boolean A03() {
        if (this.A09) {
            return false;
        }
        GXF gxf = this.A05;
        int i = gxf.A00;
        if (i == 1 || i == 2) {
            return true;
        }
        return gxf.A07.countScoRequestedAsBluetoothConnected() && this.A02;
    }
}
