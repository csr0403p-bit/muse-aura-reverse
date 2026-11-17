package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.BhG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RejectedExecutionHandlerC2671BhG implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AbstractC2875Bni.A02("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
