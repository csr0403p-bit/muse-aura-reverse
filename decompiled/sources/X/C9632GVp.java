package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.GVp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9632GVp extends ContentObserver {
    public int A00;
    public final GVu A01;
    public final /* synthetic */ GVo A02;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9632GVp(Handler handler, GVu gVu, GVo gVo) {
        super(handler);
        this.A02 = gVo;
        this.A01 = gVu;
        this.A00 = -1;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        GVo gVo = this.A02;
        AbstractC3136BzG.A00("VolumeChangeAnnouncer::onChange");
        try {
            RunnableC9633GVq runnableC9633GVq = new RunnableC9633GVq(this, gVo);
            ExecutorService executorService = gVo.A06;
            if (executorService != null && gVo.A01.enableOnVolumeChangeOnBackgroundThread()) {
                Future<?> future = gVo.A02;
                if (future == null || future.isDone()) {
                    gVo.A02 = executorService.submit(runnableC9633GVq);
                }
            } else {
                runnableC9633GVq.run();
            }
        } finally {
            Trace.endSection();
        }
    }
}
