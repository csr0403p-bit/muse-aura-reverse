package X;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public final class GRF extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C9621GSq A01;

    public GRF(C9621GSq c9621GSq, long j) {
        this.A01 = c9621GSq;
        this.A00 = j;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        super.onRecordingConfigChanged(list);
        C9621GSq c9621GSq = this.A01;
        ReentrantLock reentrantLock = c9621GSq.A0D;
        long j = this.A00;
        reentrantLock.lock();
        try {
            if (c9621GSq.A02 == j && c9621GSq.A03 == this) {
                c9621GSq.A01++;
                if (list == null) {
                    list = C0881AGi.A00;
                }
                c9621GSq.A04 = AbstractC0878AGe.A0X(list);
                if (!c9621GSq.A0B.isEmpty()) {
                    Handler handler = c9621GSq.A08;
                    Runnable runnable = c9621GSq.A0A;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, 500L);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
