package X;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest$RequestCancelledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class BmN implements BpZ<Surface> {
    public final /* synthetic */ BmM A00;
    public final /* synthetic */ C3010Brs A01;
    public final /* synthetic */ ListenableFuture A02;
    public final /* synthetic */ String A03;

    public BmN(BmM bmM, C3010Brs c3010Brs, ListenableFuture listenableFuture, String str) {
        this.A00 = bmM;
        this.A02 = listenableFuture;
        this.A01 = c3010Brs;
        this.A03 = str;
    }

    @Override // X.BpZ
    public final void onFailure(Throwable th) {
        boolean z = th instanceof CancellationException;
        C3010Brs c3010Brs = this.A01;
        if (z) {
            BeS.A07(c3010Brs.A04(new SurfaceRequest$RequestCancelledException(FGI.A0M(this.A03, " cancelled."), th)), null);
        } else {
            c3010Brs.A03(null);
        }
    }

    @Override // X.BpZ
    public final /* bridge */ /* synthetic */ void onSuccess(Surface surface) {
        AbstractC2942BpW.A04(this.A01, this.A02);
    }
}
