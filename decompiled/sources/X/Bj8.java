package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes5.dex */
public final class Bj8 extends CameraDevice.StateCallback {
    public ScheduledFuture<?> A00;
    public RunnableC2747Bjo A01;
    public final C2735Bjc A02;
    public final Executor A03;
    public final ScheduledExecutorService A04;
    public final /* synthetic */ Bj4 A05;

    public Bj8(Bj4 bj4, Executor executor, ScheduledExecutorService scheduledExecutorService, long j) {
        this.A05 = bj4;
        this.A03 = executor;
        this.A04 = scheduledExecutorService;
        this.A02 = new C2735Bjc(this, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r13 = this;
            X.Bjo r0 = r13.A01
            r1 = 1
            r8 = 0
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            r4 = 0
            X.BeS.A07(r0, r4)
            java.util.concurrent.ScheduledFuture<?> r0 = r13.A00
            if (r0 == 0) goto L11
            r1 = 0
        L11:
            X.BeS.A07(r1, r4)
            X.Bjc r5 = r13.A02
            long r6 = android.os.SystemClock.uptimeMillis()
            long r0 = r5.A00
            r2 = -1
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L25
            r5.A00 = r6
            r0 = r6
        L25:
            long r6 = r6 - r0
            X.Bj8 r0 = r5.A02
            X.Bj4 r1 = r0.A05
            boolean r0 = r1.A05
            if (r0 == 0) goto L66
            int r1 = r1.A00
            r9 = 1
            if (r1 == r9) goto L36
            r0 = 2
            if (r1 != r0) goto L66
        L36:
            long r0 = r5.A01
            r11 = 0
            r10 = 1800000(0x1b7740, float:2.522337E-39)
            if (r9 != 0) goto L41
            r10 = 10000(0x2710, float:1.4013E-41)
        L41:
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L4a
            int r9 = (int) r0
            int r10 = java.lang.Math.min(r9, r10)
        L4a:
            long r0 = (long) r10
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 < 0) goto L68
            r5.A00 = r2
            java.lang.String r1 = "Camera reopening attempted for "
            java.lang.String r0 = "ms without success."
            java.lang.String r1 = X.FGI.A0I(r1, r10, r0)
            java.lang.String r0 = "Camera2CameraImpl"
            X.AbstractC2875Bni.A02(r0, r1)
            X.Bj4 r1 = r13.A05
            java.lang.Integer r0 = X.C79.A0K
            r1.A0H(r4, r0, r8)
            return
        L66:
            r9 = 0
            goto L36
        L68:
            java.util.concurrent.Executor r0 = r13.A03
            X.Bjo r3 = new X.Bjo
            r3.<init>(r13, r0)
            r13.A01 = r3
            X.Bj4 r2 = r13.A05
            java.lang.String r0 = "Attempting camera re-open in "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            int r0 = r5.A00()
            r1.append(r0)
            java.lang.String r0 = "ms: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " activeResuming = "
            r1.append(r0)
            boolean r0 = r2.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.Bj4.A09(r2, r0, r4)
            java.util.concurrent.ScheduledExecutorService r4 = r13.A04
            X.Bjo r3 = r13.A01
            int r0 = r5.A00()
            long r1 = (long) r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r4.schedule(r3, r1, r0)
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bj8.A00():void");
    }

    public final boolean A01() {
        if (this.A00 == null) {
            return false;
        }
        Bj4.A09(this.A05, C8j3.A14(this.A01, C60O.A0x("Cancelling scheduled re-open: ")), null);
        this.A01.A00 = true;
        this.A01 = null;
        this.A00.cancel(false);
        this.A00 = null;
        return true;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) throws CameraAccessException {
        Bj4 bj4 = this.A05;
        Bj4.A09(bj4, "CameraDevice.onClosed()", null);
        BeS.A07(AnonymousClass002.A1Y(bj4.A02), AnonymousClass007.A0a("Unexpected onClose callback on camera device: ", cameraDevice));
        int iIntValue = bj4.A0a.intValue();
        if (iIntValue == 1 || iIntValue == 4) {
            BeS.A02(bj4);
            Bj4.A06(bj4);
        } else {
            if (iIntValue != 5 && iIntValue != 6) {
                throw BV5.A0U("Camera closed while in state: ", Bj4.A02(bj4));
            }
            int i = bj4.A00;
            if (i == 0) {
                bj4.A0J(false);
            } else {
                Bj4.A09(bj4, FGI.A0M("Camera closed due to error: ", Bj4.A01(i)), null);
                A00();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Bj4.A09(this.A05, "CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(android.hardware.camera2.CameraDevice r10, int r11) {
        /*
            r9 = this;
            X.Bj4 r3 = r9.A05
            r3.A02 = r10
            r3.A00 = r11
            X.Bjb r2 = r3.A0D
            X.Bj4 r1 = r2.A01
            java.lang.String r0 = "Camera receive onErrorCallback"
            r5 = 0
            X.Bj4.A09(r1, r0, r5)
            r2.A00()
            java.lang.Integer r0 = r3.A0a
            int r0 = r0.intValue()
            r7 = 2
            r8 = 3
            java.lang.String r4 = "Camera2CameraImpl"
            r6 = 1
            if (r0 == r6) goto L2e
            switch(r0) {
                case 4: goto L2e;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L4a;
                case 8: goto L4a;
                case 9: goto L4a;
                default: goto L23;
            }
        L23:
            java.lang.String r1 = "onError() should not be possible from state: "
            java.lang.String r0 = X.Bj4.A02(r3)
            java.lang.IllegalStateException r0 = X.BV5.A0U(r1, r0)
            throw r0
        L2e:
            java.lang.String r2 = r10.getId()
            java.lang.String r1 = X.Bj4.A01(r11)
            java.lang.Integer r0 = r3.A0a
            java.lang.String r0 = X.Bm0.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.AbstractC2875Bni.A02(r4, r0)
            goto Lb4
        L4a:
            java.lang.String r1 = r10.getId()
            java.lang.String r9 = X.Bj4.A01(r11)
            java.lang.Integer r0 = r3.A0a
            java.lang.String r0 = X.Bm0.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r9, r0}
            java.lang.String r0 = "CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error."
            X.AbstractC2875Bni.A07(r0, r4, r1)
            java.lang.Integer r1 = r3.A0a
            java.lang.Integer r0 = X.C79.A0Y
            if (r1 == r0) goto L80
            java.lang.Integer r1 = r3.A0a
            java.lang.Integer r0 = X.C79.A0Z
            if (r1 == r0) goto L80
            java.lang.Integer r1 = r3.A0a
            java.lang.Integer r0 = X.C79.A0c
            if (r1 == r0) goto L80
            java.lang.Integer r1 = r3.A0a
            java.lang.Integer r0 = X.C79.A0W
            if (r1 == r0) goto L80
            java.lang.Integer r1 = r3.A0a
            java.lang.Integer r0 = X.C79.A0T
            r2 = 0
            if (r1 != r0) goto L81
        L80:
            r2 = 1
        L81:
            java.lang.String r1 = "Attempt to handle open error from non open state: "
            java.lang.String r0 = X.Bj4.A02(r3)
            java.lang.String r0 = X.FGI.A0M(r1, r0)
            X.BeS.A07(r2, r0)
            if (r11 == r6) goto Lb8
            if (r11 == r7) goto Lb8
            r0 = 4
            if (r11 == r0) goto Lb8
            java.lang.String r6 = "Error observed on open (or opening) camera device "
            java.lang.String r2 = r10.getId()
            java.lang.String r1 = ": "
            java.lang.String r0 = " closing camera."
            java.lang.String r0 = X.FGI.A0h(r6, r2, r1, r9, r0)
            X.AbstractC2875Bni.A02(r4, r0)
            r2 = 6
            if (r11 != r8) goto Laa
            r2 = 5
        Laa:
            java.lang.Integer r1 = X.C79.A0P
        Lac:
            X.BeD r0 = new X.BeD
            r0.<init>(r2, r5)
            r3.A0G(r0, r1)
        Lb4:
            r3.A0C()
            return
        Lb8:
            java.lang.String r0 = r10.getId()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r9}
            java.lang.String r0 = "Attempt to reopen camera[%s] after error[%s]"
            X.AbstractC2875Bni.A07(r0, r4, r1)
            int r0 = r3.A00
            r2 = 1
            boolean r1 = X.AnonymousClass002.A1L(r0)
            java.lang.String r0 = "Can only reopen camera device after error if the camera device is actually in an error state."
            X.BeS.A07(r1, r0)
            if (r11 == r6) goto Ld9
            if (r11 == r7) goto Ld6
            r2 = 3
        Ld6:
            java.lang.Integer r1 = X.C79.A0W
            goto Lac
        Ld9:
            r2 = 2
            goto Ld6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bj8.onError(android.hardware.camera2.CameraDevice, int):void");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Bj4 bj4 = this.A05;
        Bj4.A09(bj4, "CameraDevice.onOpened()", null);
        bj4.A02 = cameraDevice;
        bj4.A00 = 0;
        this.A02.A00 = -1L;
        int iIntValue = bj4.A0a.intValue();
        if (iIntValue == 1 || iIntValue == 4) {
            BeS.A02(bj4);
            bj4.A02.close();
            bj4.A02 = null;
        } else {
            if (iIntValue != 5 && iIntValue != 6 && iIntValue != 7) {
                throw BV5.A0U("onOpened() should not be possible from state: ", Bj4.A02(bj4));
            }
            bj4.A0G(null, C79.A0Z);
            BjD bjD = bj4.A0L;
            cameraDevice.getId();
            bj4.A0K.AIS(bj4.A02.getId());
            synchronized (bjD.A02) {
            }
            bj4.A0D();
        }
    }
}
