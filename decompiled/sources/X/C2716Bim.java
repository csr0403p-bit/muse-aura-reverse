package X;

import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.Bim, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2716Bim {
    public final List<ListenableFuture<Void>> A00 = Collections.synchronizedList(C3cG.A0h());
    public final boolean A01;

    public final CameraCaptureSession.CaptureCallback A00(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.A01) {
            return captureCallback;
        }
        final Bj0 bj0 = new Bj0();
        final ListenableFuture<Void> listenableFuture = bj0.A01;
        this.A00.add(listenableFuture);
        Log.d("RequestMonitor", AnonymousClass006.A0y(this, " monitoring ", C3cG.A0f(bj0, "RequestListener ")));
        ExecutorC2446BbZ.A03(listenableFuture, new Runnable() { // from class: X.Bj1
            public static final String __redex_internal_original_name = "RequestMonitor$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C2716Bim c2716Bim = this;
                Bj0 bj02 = bj0;
                ListenableFuture listenableFuture2 = listenableFuture;
                Log.d("RequestMonitor", AnonymousClass006.A0y(c2716Bim, " done ", C3cG.A0f(bj02, "RequestListener ")));
                c2716Bim.A00.remove(listenableFuture2);
            }
        });
        return new C2707Bid(Arrays.asList(bj0, captureCallback));
    }

    public final ListenableFuture<Void> A01() {
        List<ListenableFuture<Void>> list = this.A00;
        return list.isEmpty() ? BpQ.A01 : AbstractC2942BpW.A01(ExecutorC2446BbZ.A01(new Bpa(BV4.A0t(BV4.A0t(list)), ExecutorC2446BbZ.A00(), false), 5));
    }

    public final void A02() {
        LinkedList linkedList = new LinkedList(this.A00);
        while (!linkedList.isEmpty()) {
            Future future = (Future) linkedList.poll();
            future.getClass();
            future.cancel(true);
        }
    }

    public C2716Bim(boolean z) {
        this.A01 = z;
    }
}
