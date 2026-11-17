package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.BkQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2762BkQ {
    public int A00 = 1;
    public final BaR A01;
    public final Executor A02;
    public final Bj5 A03;
    public final C2511Bch A04;
    public final ScheduledExecutorService A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BkR A00(X.C2762BkQ r13, int r14, int r15, int r16) {
        /*
            X.Bch r5 = r13.A04
            X.BkP r8 = new X.BkP
            r8.<init>(r5)
            int r11 = r13.A00
            java.util.concurrent.Executor r9 = r13.A02
            java.util.concurrent.ScheduledExecutorService r10 = r13.A05
            X.Bj5 r7 = r13.A03
            boolean r12 = r13.A07
            X.BkR r6 = new X.BkR
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3 = r14
            if (r14 != 0) goto L23
            X.BkV r1 = new X.BkV
            r1.<init>(r7)
            java.util.List<X.Bke> r0 = r6.A05
            r0.add(r1)
        L23:
            r4 = 3
            r2 = r16
            if (r15 != r4) goto L5e
            X.Bbl r0 = new X.Bbl
            r0.<init>(r5)
            X.Bka r1 = new X.Bka
            r1.<init>(r7, r0, r9, r10)
            java.util.List<X.Bke> r0 = r6.A05
            r0.add(r1)
        L37:
            java.lang.String r0 = "createPipeline: captureMode = "
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r3)
            java.lang.String r0 = ", flashMode = "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", flashType = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", pipeline tasks = "
            r1.append(r0)
            java.util.List<X.Bke> r0 = r6.A05
            java.lang.String r1 = X.C8j3.A14(r0, r1)
            java.lang.String r0 = "Camera2CapturePipeline"
            X.AbstractC2875Bni.A01(r0, r1)
            return r6
        L5e:
            boolean r0 = r13.A06
            if (r0 == 0) goto L37
            X.BaR r0 = r13.A01
            boolean r0 = r0.A00
            r1 = 1
            if (r0 != 0) goto L91
            int r0 = r13.A00
            if (r0 == r4) goto L7a
            if (r2 == r1) goto L7a
            X.BkS r11 = new X.BkS
            r11.<init>(r7, r8, r15)
        L74:
            java.util.List<X.Bke> r0 = r6.A05
            r0.add(r11)
            goto L37
        L7a:
            X.BkO r0 = r7.A0B
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r4 = r0.get()
            java.lang.String r0 = "isInVideoUsage: mVideoUsageControl value = "
            java.lang.String r1 = X.FGI.A0H(r0, r4)
            java.lang.String r0 = "Camera2CameraControlImp"
            X.AbstractC2875Bni.A01(r0, r1)
            r16 = 1
            if (r4 <= 0) goto L93
        L91:
            r16 = 0
        L93:
            X.BkU r11 = new X.BkU
            r12 = r7
            r13 = r9
            r14 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2762BkQ.A00(X.BkQ, int, int, int):X.BkR");
    }

    public static boolean A02(TotalCaptureResult totalCaptureResult, int i) {
        AbstractC2875Bni.A01("Camera2CapturePipeline", FGI.A0H("isFlashRequired: flashMode = ", i));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new AssertionError(i);
                    }
                }
            }
            return true;
        }
        Number numberA0i = totalCaptureResult != null ? BV6.A0i(CaptureResult.CONTROL_AE_STATE, totalCaptureResult) : null;
        AbstractC2875Bni.A00(numberA0i, "isFlashRequired: aeState = ", "Camera2CapturePipeline");
        if (numberA0i != null && numberA0i.intValue() == 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(android.hardware.camera2.TotalCaptureResult r5, boolean r6) {
        /*
            if (r5 == 0) goto L9a
            X.BhZ r0 = X.BhZ.A01
            X.BnD r3 = new X.BnD
            r3.<init>(r5, r0)
            java.util.Set<X.BnG> r0 = X.BnC.A00
            java.lang.Integer r1 = r3.A00()
            java.lang.Integer r0 = X.C79.A01
            if (r1 == r0) goto L28
            java.lang.Integer r1 = r3.A00()
            java.lang.Integer r0 = X.C79.A00
            if (r1 == r0) goto L28
            java.util.Set<X.BnF> r1 = X.BnC.A02
            X.BnF r0 = r3.ACH()
            boolean r0 = r1.contains(r0)
            r5 = 0
            if (r0 == 0) goto L29
        L28:
            r5 = 1
        L29:
            android.hardware.camera2.CaptureResult r2 = r3.A00
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_MODE
            java.lang.Number r0 = X.BV6.A0i(r0, r2)
            if (r0 == 0) goto La1
            int r0 = r0.intValue()
            if (r0 != 0) goto La1
            r0 = 1
        L3a:
            if (r6 == 0) goto L9c
            if (r0 != 0) goto L4b
            java.util.Set<X.BnG> r1 = X.BnC.A01
        L40:
            X.BnG r0 = r3.ACG()
            boolean r0 = r1.contains(r0)
            r4 = 0
            if (r0 == 0) goto L4c
        L4b:
            r4 = 1
        L4c:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE
            java.lang.Number r0 = X.BV6.A0i(r0, r2)
            if (r0 == 0) goto L5a
            int r0 = r0.intValue()
            if (r0 == 0) goto L67
        L5a:
            java.util.Set<X.BnH> r1 = X.BnC.A03
            X.BnH r0 = r3.ACg()
            boolean r0 = r1.contains(r0)
            r2 = 0
            if (r0 == 0) goto L68
        L67:
            r2 = 1
        L68:
            java.lang.String r0 = "checkCaptureResult, AE="
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            X.BnG r0 = r3.ACG()
            r1.append(r0)
            java.lang.String r0 = " AF ="
            r1.append(r0)
            X.BnF r0 = r3.ACH()
            r1.append(r0)
            java.lang.String r0 = " AWB="
            r1.append(r0)
            X.BnH r0 = r3.ACg()
            java.lang.String r1 = X.C8j3.A14(r0, r1)
            java.lang.String r0 = "ConvergenceUtils"
            X.AbstractC2875Bni.A01(r0, r1)
            if (r5 == 0) goto L9a
            if (r4 == 0) goto L9a
            r0 = 1
            if (r2 != 0) goto L9b
        L9a:
            r0 = 0
        L9b:
            return r0
        L9c:
            if (r0 != 0) goto L4b
            java.util.Set<X.BnG> r1 = X.BnC.A00
            goto L40
        La1:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2762BkQ.A03(android.hardware.camera2.TotalCaptureResult, boolean):boolean");
    }

    public C2762BkQ(Bj5 bj5, C2476Bc3 c2476Bc3, C2511Bch c2511Bch, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = bj5;
        Number number = (Number) c2476Bc3.A02(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.A07 = number != null && number.intValue() == 2;
        this.A02 = executor;
        this.A05 = scheduledExecutorService;
        this.A04 = c2511Bch;
        this.A01 = new BaR(c2511Bch);
        this.A06 = AbstractC2415Bap.A00(new C2416Baq(c2476Bc3));
    }

    /* JADX WARN: Incorrect types in method signature: (JLjava/util/concurrent/ScheduledExecutorService;LX/Bj5;LX/BlI;)Lcom/google/common/util/concurrent/ListenableFuture<Landroid/hardware/camera2/TotalCaptureResult;>; */
    public static C3009Brr A01(Bj5 bj5, InterfaceC2790BlI interfaceC2790BlI, ScheduledExecutorService scheduledExecutorService, long j) {
        long jA05 = BV4.A05(j);
        BkX bkX = new BkX(interfaceC2790BlI);
        bj5.A06.A00.add(bkX);
        ListenableFuture<TotalCaptureResult> listenableFuture = bkX.A01;
        listenableFuture.addListener(new BkZ(bj5, bkX), bj5.A0I);
        return AbstractC2947Bpi.A00(new EE2(listenableFuture, scheduledExecutorService, 1, jA05));
    }
}
