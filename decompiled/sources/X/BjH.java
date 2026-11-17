package X;

import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BjH {
    public C3010Brs<Void> A00;
    public boolean A01;
    public boolean A02;
    public final Bj5 A03;
    public final C2934BpC<Integer> A04 = new C2934BpC<>(0);
    public final Executor A05;
    public final boolean A06;

    public final void A00(C3010Brs<Void> c3010Brs, boolean z) {
        Throwable cameraControl$OperationCanceledException;
        if (this.A06) {
            if (this.A01) {
                this.A02 = z;
                this.A03.A08(z);
                C2934BpC<Integer> c2934BpC = this.A04;
                Integer numValueOf = Integer.valueOf(z ? 1 : 0);
                if (AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread())) {
                    c2934BpC.A0A(numValueOf);
                } else {
                    c2934BpC.A09(numValueOf);
                }
                C3010Brs<Void> c3010Brs2 = this.A00;
                if (c3010Brs2 != null) {
                    C3010Brs.A01(c3010Brs2, "There is a new enableTorch being set");
                }
                this.A00 = c3010Brs;
                return;
            }
            C2934BpC<Integer> c2934BpC2 = this.A04;
            Integer numA0V = BV4.A0V();
            if (AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread())) {
                c2934BpC2.A0A(numA0V);
            } else {
                c2934BpC2.A09(numA0V);
            }
            if (c3010Brs == null) {
                return;
            } else {
                cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera is not active.");
            }
        } else if (c3010Brs == null) {
            return;
        } else {
            cameraControl$OperationCanceledException = C3cG.A0Q("No flash unit");
        }
        c3010Brs.A04(cameraControl$OperationCanceledException);
    }

    public BjH(Bj5 bj5, C2476Bc3 c2476Bc3, Executor executor) {
        this.A03 = bj5;
        this.A05 = executor;
        this.A06 = AbstractC2415Bap.A00(new C2416Baq(c2476Bc3));
        bj5.A06.A00.add(new C7605F5s(this, 0));
    }
}
