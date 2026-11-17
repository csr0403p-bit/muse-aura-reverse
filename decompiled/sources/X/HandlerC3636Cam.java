package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: X.Cam, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC3636Cam extends Handler {
    public boolean A00;
    public final Looper A01;
    public final ServiceConnectionC3637Can A02;
    public final /* synthetic */ Cao A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3636Cam(Looper looper, Cao cao) {
        super(looper);
        this.A03 = cao;
        this.A01 = Looper.getMainLooper();
        this.A02 = new ServiceConnectionC3637Can();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            if (!this.A00) {
                if (Log.isLoggable("WearableLS", 2)) {
                    Log.v("WearableLS", "bindService: ".concat(BV7.A0w(this.A03.zza)));
                }
                Cao cao = this.A03;
                cao.bindService(cao.zzd, this.A02, 1);
                this.A00 = true;
            }
        }
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                A00(this, "dispatch");
            }
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.Cam) */
    public static final synchronized void A00(HandlerC3636Cam handlerC3636Cam, String str) {
        synchronized (handlerC3636Cam) {
            if (handlerC3636Cam.A00) {
                if (Log.isLoggable("WearableLS", 2)) {
                    Log.v("WearableLS", FGI.A0d("unbindService: ", str, ", ", String.valueOf(handlerC3636Cam.A03.zza)));
                }
                try {
                    handlerC3636Cam.A03.unbindService(handlerC3636Cam.A02);
                } catch (RuntimeException e) {
                    Log.e("WearableLS", "Exception when unbinding from local service", e);
                }
                handlerC3636Cam.A00 = false;
            }
        }
    }
}
