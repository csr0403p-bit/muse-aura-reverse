package X;

import android.os.Handler;
import android.os.Message;
import com.sun.jna.Callback;

/* renamed from: X.I0d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10633I0d implements Handler.Callback {
    public final int $t;
    public final Object A00;

    public C10633I0d(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.$t != 0) {
            if (message.what != 0) {
                return false;
            }
            FW5 fw5 = (FW5) this.A00;
            FW8 fw8 = (FW8) message.obj;
            synchronized (fw5.A03) {
                if (fw5.A00 == fw8 || fw5.A01 == fw8) {
                    FW5.A04(fw8, fw5, 2);
                }
            }
            return true;
        }
        C7384Etj.A0Y(message, 0);
        int i = message.what;
        if (i == 1) {
            GXK gxk = (GXK) this.A00;
            gxk.A05.A04(true);
            int i2 = gxk.A00 + 1;
            gxk.A00 = i2;
            InterfaceC9648GXn.A00(gxk.A07, FGI.A0H("startScoAudio attempt #", i2));
            Handler handler = gxk.A03;
            handler.removeMessages(2);
            handler.sendEmptyMessageDelayed(2, 4000L);
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            ((GXK) this.A00).A00 = 0;
            return false;
        }
        GXK gxk2 = (GXK) this.A00;
        InterfaceC9648GXn.A00(gxk2.A07, "onScoTimedOut");
        GXF gxf = gxk2.A05;
        int i3 = gxf.A00;
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            z = false;
        }
        gxk2.A03.removeCallbacksAndMessages(null);
        GXK.A02(gxk2, false);
        if (!gxf.A07.fallBackWhenBluetoothUnusable() || z) {
            return false;
        }
        GXK.A00(gxk2);
        GY0 gy0 = gxk2.A01;
        if (gy0 == null) {
            C7384Etj.A0b(Callback.METHOD_NAME);
            throw F60.createAndThrow();
        }
        gy0.A00.A0d();
        return false;
    }
}
