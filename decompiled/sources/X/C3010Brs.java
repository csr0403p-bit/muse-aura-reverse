package X;

import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.concurrent.Executor;

/* renamed from: X.Brs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3010Brs<T> {
    public C3009Brr<T> A00;
    public C3011Brt<Void> A01 = new C3011Brt<>();
    public Object A02;
    public boolean A03;

    public final void A02() {
        this.A03 = true;
        C3009Brr<T> c3009Brr = this.A00;
        if (c3009Brr == null || !c3009Brr.A00.cancel(true)) {
            return;
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final boolean A03(T t) {
        this.A03 = true;
        C3009Brr<T> c3009Brr = this.A00;
        if (c3009Brr == null || !c3009Brr.A00.A05(t)) {
            return false;
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        return true;
    }

    public final boolean A04(Throwable th) {
        this.A03 = true;
        C3009Brr<T> c3009Brr = this.A00;
        if (c3009Brr == null || !c3009Brr.A00(th)) {
            return false;
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        return true;
    }

    public static void A00(C3010Brs c3010Brs, Runnable runnable, Executor executor) {
        C3011Brt<Void> c3011Brt = c3010Brs.A01;
        if (c3011Brt != null) {
            c3011Brt.addListener(runnable, executor);
        }
    }

    public static void A01(C3010Brs c3010Brs, String str) {
        c3010Brs.A04(new CameraControl$OperationCanceledException(str));
    }

    public final void finalize() {
        C3011Brt<Void> c3011Brt;
        C3009Brr<T> c3009Brr = this.A00;
        if (c3009Brr != null && !c3009Brr.isDone()) {
            c3009Brr.A00(new Brw(C8j3.A14(this.A02, C60O.A0x("The completer object was garbage collected - this future would otherwise never complete. The tag was: "))));
        }
        if (this.A03 || (c3011Brt = this.A01) == null) {
            return;
        }
        c3011Brt.A05(null);
    }
}
