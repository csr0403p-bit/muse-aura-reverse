package X;

import android.os.MessageQueue;
import com.facebook.perf.background.BackgroundStartupDetector;

/* loaded from: classes5.dex */
public final class CIO implements MessageQueue.IdleHandler {
    public final /* synthetic */ BackgroundStartupDetector A00;

    public CIO(BackgroundStartupDetector backgroundStartupDetector) {
        this.A00 = backgroundStartupDetector;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.A00.handleColdStartQueueDrained();
        return false;
    }
}
