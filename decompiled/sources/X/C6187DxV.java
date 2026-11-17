package X;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.DxV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6187DxV implements Handler.Callback, InterfaceC2984Bqt {
    public final Handler A00;
    public final /* synthetic */ C6149Dwr A01;

    public C6187DxV(InterfaceC6185DxT interfaceC6185DxT, C6149Dwr c6149Dwr) {
        this.A01 = c6149Dwr;
        Handler handlerA02 = C1G.A02(this);
        this.A00 = handlerA02;
        interfaceC6185DxT.Adv(handlerA02, this);
    }

    private void A00(long j) {
        C6149Dwr c6149Dwr = this.A01;
        if (this != c6149Dwr.A0M || ((AbstractC6148Dwq) c6149Dwr).A0L == null) {
            return;
        }
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            ((AbstractC6148Dwq) c6149Dwr).A0c = true;
            return;
        }
        try {
            c6149Dwr.A0j(j);
            C6232Dya c6232Dya = c6149Dwr.A0H;
            if (!c6232Dya.equals(C6232Dya.A03) && !c6232Dya.equals(c6149Dwr.A0I)) {
                c6149Dwr.A0I = c6232Dya;
                c6149Dwr.A0m.A00(c6232Dya);
            }
            ((AbstractC6148Dwq) c6149Dwr).A0E.A0C++;
            C6149Dwr.A0F(c6149Dwr);
            c6149Dwr.A0i(j);
        } catch (ExoPlaybackException e) {
            ((AbstractC6148Dwq) c6149Dwr).A0F = e;
        }
    }

    @Override // X.InterfaceC2984Bqt
    public final void ATV(long j) {
        if (Util.A00 >= 30) {
            A00(j);
        } else {
            Handler handler = this.A00;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        A00((message.arg2 & 4294967295L) | ((message.arg1 & 4294967295L) << 32));
        return true;
    }
}
