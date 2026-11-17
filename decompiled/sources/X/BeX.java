package X;

import android.os.SystemClock;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraControlInternal$CameraControlException;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class BeX {
    public final void A00(final int i) {
        Throwable imageCaptureException;
        if (this instanceof F44) {
            F44 f44 = (F44) this;
            int i2 = f44.$t;
            C3010Brs c3010Brs = (C3010Brs) f44.A01;
            if (i2 == 0) {
                imageCaptureException = new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null);
            } else if (c3010Brs == null) {
                return;
            } else {
                imageCaptureException = new CameraControl$OperationCanceledException("Camera is closed");
            }
            c3010Brs.A04(imageCaptureException);
            return;
        }
        if (this instanceof F43) {
            return;
        }
        if (this instanceof BeY) {
            Iterator<BeX> it = ((BeY) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A00(i);
            }
        } else if (this instanceof BeT) {
            BeT beT = (BeT) this;
            for (final BeX beX : beT.A01) {
                try {
                    beT.A00.get(beX).execute(new Runnable() { // from class: X.BeW
                        public static final String __redex_internal_original_name = "Camera2CameraControlImpl$CameraCaptureCallbackSet$$ExternalSyntheticLambda2";

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A01.A00(i);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    AbstractC2875Bni.A05("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }
    }

    public final void A01(int i) {
        if (this instanceof F43) {
            final F43 f43 = (F43) this;
            if (2 - f43.$t == 0) {
                BoS.A00().execute(new Runnable() { // from class: X.BiO
                    public static final String __redex_internal_original_name = "CaptureNode$1$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Bi7 bi7 = ((Bi6) f43.A00).A04;
                        if (bi7 != null) {
                            bi7.A07.onCaptureStarted();
                        }
                    }
                });
                return;
            }
            return;
        }
        if (this instanceof BeY) {
            Iterator<BeX> it = ((BeY) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A01(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(final C2792BlO c2792BlO, final int i) {
        C3010Brs c3010Brs;
        ImageCaptureException imageCaptureException;
        if (this instanceof F44) {
            F44 f44 = (F44) this;
            if (f44.$t != 0) {
                C3010Brs c3010Brs2 = (C3010Brs) f44.A01;
                if (c3010Brs2 == null) {
                    return;
                }
                CameraControlInternal$CameraControlException cameraControlInternal$CameraControlException = new CameraControlInternal$CameraControlException();
                cameraControlInternal$CameraControlException.mCameraCaptureFailure = c2792BlO;
                imageCaptureException = cameraControlInternal$CameraControlException;
                c3010Brs = c3010Brs2;
            } else {
                String strA0M = FGI.A0M("Capture request failed with reason ", "ERROR");
                C3010Brs c3010Brs3 = (C3010Brs) f44.A01;
                imageCaptureException = new ImageCaptureException(2, strA0M, null);
                c3010Brs = c3010Brs3;
            }
            c3010Brs.A04(imageCaptureException);
            return;
        }
        if (this instanceof F43) {
            return;
        }
        if (this instanceof BeY) {
            Iterator<BeX> it = ((BeY) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A02(c2792BlO, i);
            }
        } else if (this instanceof BeT) {
            BeT beT = (BeT) this;
            for (final BeX beX : beT.A01) {
                try {
                    beT.A00.get(beX).execute(new Runnable() { // from class: X.BeU
                        public static final String __redex_internal_original_name = "Camera2CameraControlImpl$CameraCaptureCallbackSet$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A01.A02(c2792BlO, i);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    AbstractC2875Bni.A05("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    public final void A03(final InterfaceC2861BnK interfaceC2861BnK, final int i) {
        Object obj;
        if (this instanceof C2822Blz) {
            C2822Blz c2822Blz = (C2822Blz) this;
            c2822Blz.A02.A03(null);
            ((InterfaceC2544BdV) c2822Blz.A00).Aaw(c2822Blz);
            return;
        }
        if (this instanceof C2667Bh1) {
            final C2667Bh1 c2667Bh1 = (C2667Bh1) this;
            if (c2667Bh1.A00) {
                c2667Bh1.A00 = false;
                StringBuilder sbA0x = C60O.A0x("cameraCaptureResult timestampNs = ");
                sbA0x.append(interfaceC2861BnK.getTimestamp());
                sbA0x.append(", current system uptimeMs = ");
                sbA0x.append(SystemClock.uptimeMillis());
                sbA0x.append(", current system realtimeMs = ");
                AbstractC2875Bni.A01("VideoCapture", BV4.A0m(sbA0x, SystemClock.elapsedRealtime()));
            }
            AtomicBoolean atomicBoolean = c2667Bh1.A04;
            if (atomicBoolean.get() || (obj = interfaceC2861BnK.ALU().A00.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
                return;
            }
            int iA0F = AnonymousClass001.A0F(obj);
            C3010Brs c3010Brs = c2667Bh1.A03;
            if (iA0F == c3010Brs.hashCode() && c3010Brs.A03(null) && !atomicBoolean.getAndSet(true)) {
                ScheduledExecutorService scheduledExecutorServiceA00 = BoS.A00();
                final BgX bgX = c2667Bh1.A01;
                scheduledExecutorServiceA00.execute(new Runnable() { // from class: X.Bh0
                    public static final String __redex_internal_original_name = "VideoCapture$2$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2667Bh1 c2667Bh12 = c2667Bh1;
                        BgX bgX2 = bgX;
                        bgX2.A04.A04.remove(c2667Bh12);
                        bgX2.A07.remove(c2667Bh12);
                    }
                });
                return;
            }
            return;
        }
        if (this instanceof F44) {
            F44 f44 = (F44) this;
            int i2 = f44.$t;
            C3010Brs c3010Brs2 = (C3010Brs) f44.A01;
            if (i2 != 0) {
                if (c3010Brs2 == null) {
                    return;
                } else {
                    AbstractC2875Bni.A01("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                }
            }
            c3010Brs2.A03(null);
            return;
        }
        if (!(this instanceof F43)) {
            if (this instanceof BeY) {
                Iterator<BeX> it = ((BeY) this).A00.iterator();
                while (it.hasNext()) {
                    it.next().A03(interfaceC2861BnK, i);
                }
                return;
            } else {
                if (this instanceof BeT) {
                    BeT beT = (BeT) this;
                    for (final BeX beX : beT.A01) {
                        try {
                            beT.A00.get(beX).execute(new Runnable() { // from class: X.BeV
                                public static final String __redex_internal_original_name = "Camera2CameraControlImpl$CameraCaptureCallbackSet$$ExternalSyntheticLambda1";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.A01.A03(interfaceC2861BnK, i);
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            AbstractC2875Bni.A05("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                        }
                    }
                    return;
                }
                return;
            }
        }
        F43 f43 = (F43) this;
        switch (f43.$t) {
            case 1:
                BnQ bnQ = (BnQ) f43.A00;
                synchronized (bnQ.A0A) {
                    if (!bnQ.A06) {
                        bnQ.A07.put(interfaceC2861BnK.getTimestamp(), new BnL(interfaceC2861BnK));
                        BnQ.A00(bnQ);
                    }
                }
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                Iterator<BfD> it2 = ((BfG) f43.A00).A07.iterator();
                while (it2.hasNext()) {
                    C2646Bgd c2646Bgd = BV6.A0S(it2).A03.A02;
                    Iterator<BeX> it3 = c2646Bgd.A04.iterator();
                    while (it3.hasNext()) {
                        it3.next().A03(new BnE(interfaceC2861BnK, c2646Bgd.A03), i);
                    }
                }
                return;
        }
    }
}
