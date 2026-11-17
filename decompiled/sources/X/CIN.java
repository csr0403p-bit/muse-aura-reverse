package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.perf.background.BackgroundStartupDetector;

/* loaded from: classes5.dex */
public final class CIN extends Handler {
    public final /* synthetic */ BackgroundStartupDetector A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIN(Looper looper, BackgroundStartupDetector backgroundStartupDetector) {
        super(looper);
        this.A00 = backgroundStartupDetector;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (C7384Etj.A02(message)) {
            case BackgroundStartupDetector.COLDSTART_QUEUE_DRAINED /* 49181 */:
                this.A00.handleColdStartQueueDrained();
                break;
            case BackgroundStartupDetector.ACTIVITY_CREATE_QUEUE_DRAINED /* 49182 */:
                this.A00.handleActivityCreateQueueDrained();
                break;
        }
    }
}
