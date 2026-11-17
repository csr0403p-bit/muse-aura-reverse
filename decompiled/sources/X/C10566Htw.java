package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Htw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10566Htw extends F13 {
    public final DK9 A00 = RealtimeSinceBootClock.A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ HsM A03;

    public C10566Htw(FBB fbb, FDW fdw, HsM hsM) {
        this.A02 = fdw;
        this.A01 = fbb;
        this.A03 = hsM;
    }

    @Override // X.F13, X.Ej6
    public final void onFailure(long j, Drawable drawable, Throwable th) {
        AtomicBoolean atomicBoolean = AbstractC7859FHv.A02;
        FDW fdw = this.A02;
        FBB fbb = this.A01;
        HsM hsM = this.A03;
        long jNow = this.A00.now();
        C9115Fyg c9115FygA01 = C9115Fyg.A01("ImageFailed");
        c9115FygA01.A06(Long.valueOf(jNow), 1);
        F9J.A03(fbb, fdw, c9115FygA01, hsM, 2);
    }

    @Override // X.F13, X.Ej6
    public final void onFinalImageSet(long j, int i, C2eL c2eL, Drawable drawable) {
        AtomicBoolean atomicBoolean = AbstractC7859FHv.A02;
        FDW fdw = this.A02;
        FBB fbb = this.A01;
        HsM hsM = this.A03;
        long jNow = this.A00.now();
        C9115Fyg c9115FygA01 = C9115Fyg.A01("ImageFinalRendered");
        c9115FygA01.A06(Long.valueOf(jNow), 1);
        F9J.A03(fbb, fdw, c9115FygA01, hsM, 2);
    }

    @Override // X.F13, X.Ej6
    public final void onSubmit(long j, Object obj) {
        AtomicBoolean atomicBoolean = AbstractC7859FHv.A02;
        FDW fdw = this.A02;
        FBB fbb = this.A01;
        HsM hsM = this.A03;
        long jNow = this.A00.now();
        C9115Fyg c9115FygA01 = C9115Fyg.A01("ImageRequested");
        c9115FygA01.A06(Long.valueOf(jNow), 1);
        F9J.A03(fbb, fdw, c9115FygA01, hsM, 2);
    }
}
