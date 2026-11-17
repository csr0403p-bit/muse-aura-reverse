package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Log;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes5.dex */
public final class BjA {
    public static final MeteringRectangle[] A0K = new MeteringRectangle[0];
    public BlF A02;
    public C3010Brs<C2675BhP> A04;
    public ScheduledFuture<?> A06;
    public ScheduledFuture<?> A07;
    public boolean A09;
    public MeteringRectangle[] A0B;
    public MeteringRectangle[] A0C;
    public MeteringRectangle[] A0D;
    public final Bj5 A0E;
    public final Executor A0F;
    public final ScheduledExecutorService A0G;
    public final C2788BlC A0H;
    public volatile boolean A0J = false;
    public volatile Rational A0I = null;
    public boolean A0A = false;
    public Integer A05 = 0;
    public long A01 = 0;
    public boolean A08 = false;
    public int A00 = 1;
    public BlF A03 = null;

    /* JADX WARN: Incorrect types in method signature: (LX/Brs<Ljava/lang/Void;>;)V */
    public static final void A01(BjA bjA) {
        Bj5 bj5 = bjA.A0E;
        Set<BlF> set = bj5.A06.A00;
        set.remove(null);
        set.remove(bjA.A03);
        C3010Brs<C2675BhP> c3010Brs = bjA.A04;
        if (c3010Brs != null) {
            C3010Brs.A01(c3010Brs, "Cancelled by cancelFocusAndMetering()");
            bjA.A04 = null;
        }
        ScheduledFuture<?> scheduledFuture = bjA.A06;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            bjA.A06 = null;
        }
        ScheduledFuture<?> scheduledFuture2 = bjA.A07;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            bjA.A07 = null;
        }
        if (AnonymousClass002.A1N(bjA.A0C.length)) {
            bjA.A05(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = A0K;
        bjA.A0C = meteringRectangleArr;
        bjA.A0B = meteringRectangleArr;
        bjA.A0D = meteringRectangleArr;
        bjA.A0A = false;
        bj5.A04();
    }

    public final ListenableFuture<Void> A02(final boolean z) {
        if (Bj5.A00(this.A0E.A0D, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return BpQ.A01;
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return AbstractC2947Bpi.A00(new InterfaceC2940BpU() { // from class: X.Bjz
            @Override // X.InterfaceC2940BpU
            public final Object A4r(final C3010Brs c3010Brs) {
                final BjA bjA = this.A00;
                final boolean z2 = z;
                bjA.A0F.execute(new Runnable() { // from class: X.BjU
                    public static final String __redex_internal_original_name = "FocusMeteringControl$$ExternalSyntheticLambda12";

                    @Override // java.lang.Runnable
                    public final void run() {
                        final BjA bjA2 = bjA;
                        boolean z3 = z2;
                        final C3010Brs c3010Brs2 = c3010Brs;
                        Bj5 bj5 = bjA2.A0E;
                        BlF blF = bjA2.A02;
                        Set<BlF> set = bj5.A06.A00;
                        set.remove(blF);
                        bjA2.A09 = z3;
                        if (!bjA2.A0J) {
                            if (c3010Brs2 != null) {
                                C3010Brs.A01(c3010Brs2, "Camera is not active.");
                            }
                        } else {
                            final long jA04 = bj5.A04();
                            BlF blF2 = new BlF() { // from class: X.BjY
                                @Override // X.BlF
                                public final boolean ASA(TotalCaptureResult totalCaptureResult) {
                                    BjA bjA3 = bjA2;
                                    long j = jA04;
                                    C3010Brs c3010Brs3 = c3010Brs2;
                                    boolean zA1Q = AnonymousClass002.A1Q(AnonymousClass001.A0F(totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)), 5);
                                    AbstractC2875Bni.A01("FocusMeteringControl", FGI.A0r("enableExternalFlashAeMode: isAeModeExternalFlash = ", zA1Q));
                                    if (zA1Q != bjA3.A09 || !Bj5.A02(totalCaptureResult, j)) {
                                        return false;
                                    }
                                    AbstractC2875Bni.A01("FocusMeteringControl", FGI.A0r("enableExternalFlashAeMode: session updated with isAeModeExternalFlash = ", zA1Q));
                                    if (c3010Brs3 == null) {
                                        return true;
                                    }
                                    c3010Brs3.A03(null);
                                    return true;
                                }
                            };
                            bjA2.A02 = blF2;
                            set.add(blF2);
                        }
                    }
                });
                return "enableExternalFlashAeMode";
            }
        });
    }

    public final void A03(C3010Brs<Void> c3010Brs) {
        AbstractC2875Bni.A01("FocusMeteringControl", "triggerAePrecapture");
        if (!this.A0J) {
            if (c3010Brs != null) {
                C3010Brs.A01(c3010Brs, "Camera is not active.");
                return;
            }
            return;
        }
        C2645Bgc c2645Bgc = new C2645Bgc();
        c2645Bgc.A00 = this.A00;
        c2645Bgc.A06 = true;
        BgU bgU = new BgU();
        bgU.A01(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        C2592Beo.A00(bgU, c2645Bgc);
        BV7.A1E(new F44(1, this, c3010Brs), c2645Bgc.A04);
        this.A0E.A07(Collections.singletonList(c2645Bgc.A01()));
    }

    public final void A04(boolean z) {
        if (this.A0J) {
            C2645Bgc c2645Bgc = new C2645Bgc();
            c2645Bgc.A00 = this.A00;
            c2645Bgc.A06 = true;
            BgU bgU = new BgU();
            bgU.A01(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                bgU.A00(CaptureRequest.CONTROL_AE_MODE, BY1.HIGH_PRIORITY_REQUIRED, Integer.valueOf(Bj5.A00(this.A0E.A0D, 1)));
            }
            C2592Beo.A00(bgU, c2645Bgc);
            BV7.A1E(new F43(this, 0), c2645Bgc.A04);
            this.A0E.A07(Collections.singletonList(c2645Bgc.A01()));
        }
    }

    public final void A05(boolean z, boolean z2) {
        if (this.A0J) {
            C2645Bgc c2645Bgc = new C2645Bgc();
            c2645Bgc.A06 = true;
            c2645Bgc.A00 = this.A00;
            BgU bgU = new BgU();
            if (z) {
                bgU.A01(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                bgU.A01(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            C2592Beo.A00(bgU, c2645Bgc);
            this.A0E.A07(Collections.singletonList(c2645Bgc.A01()));
        }
    }

    public BjA(Bj5 bj5, C2511Bch c2511Bch, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        MeteringRectangle[] meteringRectangleArr = A0K;
        this.A0C = meteringRectangleArr;
        this.A0B = meteringRectangleArr;
        this.A0D = meteringRectangleArr;
        this.A04 = null;
        this.A09 = false;
        this.A02 = null;
        this.A0E = bj5;
        this.A0F = executor;
        this.A0G = scheduledExecutorService;
        this.A0H = new C2788BlC(c2511Bch);
    }

    public static List A00(Rect rect, Rational rational, BjA bjA, List list, int i, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2770Bkg c2770Bkg = (C2770Bkg) it.next();
            if (arrayListA0h.size() == i) {
                break;
            }
            float f = c2770Bkg.A00;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = c2770Bkg.A01;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    C2788BlC c2788BlC = bjA.A0H;
                    Rational rational3 = rational;
                    Rational rational4 = c2770Bkg.A03;
                    if (rational4 != null) {
                        rational3 = rational4;
                    }
                    PointF pointF = new PointF((i2 == 1 && c2788BlC.A00.A03(AfRegionFlipHorizontallyQuirk.class)) ? 1.0f - c2770Bkg.A00 : c2770Bkg.A00, c2770Bkg.A01);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y) * (1.0f / fDoubleValue);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF.x) * (1.0f / fDoubleValue2);
                        }
                    }
                    int iWidth = (int) (rect.left + (pointF.x * rect.width()));
                    int iHeight = (int) (rect.top + (pointF.y * rect.height()));
                    float f3 = c2770Bkg.A02;
                    int iWidth2 = ((int) (rect.width() * f3)) / 2;
                    int iHeight2 = ((int) (f3 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    int i3 = rect2.left;
                    int i4 = rect.right;
                    rect2.left = BV7.A06(i3, rect.left, i4);
                    rect2.right = BV7.A06(rect2.right, rect.left, i4);
                    int i5 = rect2.top;
                    int i6 = rect.bottom;
                    rect2.top = BV7.A06(i5, rect.top, i6);
                    rect2.bottom = BV7.A06(rect2.bottom, rect.top, i6);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayListA0h.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayListA0h);
    }
}
