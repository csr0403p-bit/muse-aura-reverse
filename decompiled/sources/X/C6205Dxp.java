package X;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.Dxp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6205Dxp {
    public final Handler A00;
    public final InterfaceC6243Dym A01;

    public final void A01(final C6173DxG c6173DxG) {
        synchronized (c6173DxG) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new Runnable() { // from class: X.Dyj
                public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8";

                @Override // java.lang.Runnable
                public final void run() {
                    C6205Dxp c6205Dxp = this;
                    C6173DxG c6173DxG2 = c6173DxG;
                    synchronized (c6173DxG2) {
                    }
                    c6205Dxp.A01.onVideoDisabled(c6173DxG2);
                }
            });
        }
    }

    public final void A00(final C6232Dya c6232Dya) {
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new Runnable() { // from class: X.Dyn
                public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    C6205Dxp c6205Dxp = this;
                    c6205Dxp.A01.onVideoSizeChanged(c6232Dya);
                }
            });
        }
    }

    public final void A02(final Object obj) {
        Handler handler = this.A00;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: X.Dyq
                public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    C6205Dxp c6205Dxp = this.A01;
                    c6205Dxp.A01.onRenderedFirstFrame(obj, jElapsedRealtime);
                }
            });
        }
    }

    public C6205Dxp(Handler handler, InterfaceC6243Dym interfaceC6243Dym) {
        if (interfaceC6243Dym != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.A00 = handler;
        this.A01 = interfaceC6243Dym;
    }
}
