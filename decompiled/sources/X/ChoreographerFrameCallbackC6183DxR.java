package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: X.DxR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ChoreographerFrameCallbackC6183DxR implements Handler.Callback, Choreographer.FrameCallback {
    public static final ChoreographerFrameCallbackC6183DxR A05 = new ChoreographerFrameCallbackC6183DxR();
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public final HandlerThread A03;
    public volatile long A04 = -9223372036854775807L;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A04 = j;
        Choreographer choreographer = this.A01;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.A01 = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e) {
                CNC.A06("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                return true;
            }
        }
        if (i == 2) {
            Choreographer choreographer = this.A01;
            if (choreographer == null) {
                return true;
            }
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 != 1) {
                return true;
            }
            choreographer.postFrameCallback(this);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.A01;
        if (choreographer2 == null) {
            return true;
        }
        int i3 = this.A00 - 1;
        this.A00 = i3;
        if (i3 != 0) {
            return true;
        }
        choreographer2.removeFrameCallback(this);
        this.A04 = -9223372036854775807L;
        return true;
    }

    public ChoreographerFrameCallbackC6183DxR() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.A03 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.A02 = handler;
        handler.sendEmptyMessage(1);
    }
}
