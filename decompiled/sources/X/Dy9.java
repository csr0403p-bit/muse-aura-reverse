package X;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class Dy9 {
    public final Handler A00;
    public final InterfaceC6239Dyh A01;

    public final void A00(final C6173DxG c6173DxG) {
        synchronized (c6173DxG) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new Runnable() { // from class: X.Dyf
                public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda11";

                @Override // java.lang.Runnable
                public final void run() {
                    Dy9 dy9 = this;
                    C6173DxG c6173DxG2 = c6173DxG;
                    synchronized (c6173DxG2) {
                    }
                    dy9.A01.onAudioDisabled(c6173DxG2);
                }
            });
        }
    }

    public Dy9(Handler handler, InterfaceC6239Dyh interfaceC6239Dyh) {
        if (interfaceC6239Dyh != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.A00 = handler;
        this.A01 = interfaceC6239Dyh;
    }
}
