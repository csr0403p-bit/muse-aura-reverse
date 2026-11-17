package X;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bka, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2764Bka implements InterfaceC2768Bke {
    public final Bj5 A00;
    public final C2458Bbl A01;
    public final InterfaceC2787BlA A02;
    public final ScheduledExecutorService A03;
    public final Executor A04;

    @Override // X.InterfaceC2768Bke
    public final boolean AOE() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // X.InterfaceC2768Bke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AYF() {
        /*
            r5 = this;
            java.lang.String r1 = "Camera2CapturePipeline"
            java.lang.String r0 = "ScreenFlashTask#postCapture"
            X.AbstractC2875Bni.A01(r1, r0)
            X.Bbl r0 = r5.A01
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r0 = r0.A00
            if (r0 == 0) goto L17
            X.Bc3 r0 = r0.A00
            r1 = 5
            int r0 = X.Bj5.A00(r0, r1)
            r2 = 1
            if (r0 != r1) goto L18
        L17:
            r2 = 0
        L18:
            java.lang.String r0 = "shouldUseFlashModeTorch: "
            java.lang.String r1 = X.FGI.A0r(r0, r2)
            java.lang.String r0 = "UseFlashModeTorchFor3aUpdate"
            X.AbstractC2875Bni.A01(r0, r1)
            r4 = 0
            if (r2 == 0) goto L2c
            X.Bj5 r0 = r5.A00
            r0.A08(r4)
        L2c:
            X.Bj5 r0 = r5.A00
            X.BjA r3 = r0.A09
            com.google.common.util.concurrent.ListenableFuture r2 = r3.A02(r4)
            X.Bky r1 = new X.Bky
            r1.<init>()
            java.util.concurrent.Executor r0 = r5.A04
            r2.addListener(r1, r0)
            r0 = 1
            r3.A05(r4, r0)
            java.util.concurrent.ScheduledExecutorService r2 = X.BoS.A00()
            X.BlA r1 = r5.A02
            X.Bl4 r0 = new X.Bl4
            r0.<init>()
            r2.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2764Bka.AYF():void");
    }

    @Override // X.InterfaceC2768Bke
    public final ListenableFuture<Boolean> AYH(TotalCaptureResult totalCaptureResult) {
        AbstractC2875Bni.A01("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
        AtomicReference atomicReferenceA15 = BV4.A15();
        C3009Brr c3009BrrA01 = AbstractC2947Bpi.A01(atomicReferenceA15, 7);
        C2945Bpd c2945BpdA00 = C2945Bpd.A00(AbstractC2947Bpi.A02(atomicReferenceA15, this, 1));
        F4M f4m = new F4M(this, 2);
        Executor executor = this.A04;
        return ExecutorC2446BbZ.A01(Bpe.A01(new F4M(this, 1), Bpe.A01(new F4M(this, 4), Bpe.A01(new F4N(1, this, c3009BrrA01), Bpe.A01(new F4M(this, 3), Bpe.A01(f4m, c2945BpdA00, executor), executor), executor), executor), executor), 3);
    }

    public C2764Bka(Bj5 bj5, C2458Bbl c2458Bbl, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.A00 = bj5;
        this.A04 = executor;
        this.A03 = scheduledExecutorService;
        this.A01 = c2458Bbl;
        InterfaceC2787BlA interfaceC2787BlA = bj5.A03;
        interfaceC2787BlA.getClass();
        this.A02 = interfaceC2787BlA;
    }
}
