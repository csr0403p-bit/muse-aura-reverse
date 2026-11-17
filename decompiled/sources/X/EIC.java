package X;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.SystemClock;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EIC implements InterfaceC2940BpU {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public EIC(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC2940BpU
    public final Object A4r(final C3010Brs c3010Brs) throws ExecutionException, InterruptedException {
        switch (this.$t) {
            case 0:
                BV7.A1E(new F44(0, this.A00, c3010Brs), ((C2645Bgc) this.A01).A04);
                return "submitStillCapture";
            case 1:
                final C2764Bka c2764Bka = (C2764Bka) this.A00;
                final AtomicReference atomicReference = (AtomicReference) this.A01;
                BoS.A00().execute(new Runnable() { // from class: X.Bkb
                    public static final String __redex_internal_original_name = "Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2764Bka c2764Bka2 = c2764Bka;
                        AtomicReference atomicReference2 = atomicReference;
                        C3010Brs c3010Brs2 = c3010Brs;
                        AbstractC2875Bni.A01("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                        c2764Bka2.A02.A4Q((BlP) atomicReference2.get(), System.currentTimeMillis() + 3000);
                        c3010Brs2.A03(null);
                    }
                });
                return "OnScreenFlashStart";
            case 2:
                final BjA bjA = (BjA) this.A00;
                final BkB bkB = (BkB) this.A01;
                bjA.A0F.execute(new Runnable() { // from class: X.BjB
                    public static final String __redex_internal_original_name = "FocusMeteringControl$$ExternalSyntheticLambda2";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Rational rational;
                        final long jA04;
                        Throwable thA0i;
                        final BjA bjA2 = bjA;
                        C3010Brs<C2675BhP> c3010Brs2 = c3010Brs;
                        BkB bkB2 = bkB;
                        if (bjA2.A0J) {
                            Bj5 bj5 = bjA2.A0E;
                            InterfaceC2741Bji interfaceC2741Bji = bj5.A0C.A03;
                            Rect rectAED = interfaceC2741Bji.AED();
                            if (bjA2.A0I != null) {
                                rational = bjA2.A0I;
                            } else {
                                Rect rectAED2 = interfaceC2741Bji.AED();
                                rational = new Rational(rectAED2.width(), rectAED2.height());
                            }
                            List<C2770Bkg> list = bkB2.A01;
                            C2476Bc3 c2476Bc3 = bj5.A0D;
                            Number number = (Number) c2476Bc3.A02(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                            List listA00 = BjA.A00(rectAED, rational, bjA2, list, number == null ? 0 : number.intValue(), 1);
                            List<C2770Bkg> list2 = bkB2.A00;
                            Number number2 = (Number) c2476Bc3.A02(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                            List listA002 = BjA.A00(rectAED, rational, bjA2, list2, number2 == null ? 0 : number2.intValue(), 2);
                            List<C2770Bkg> list3 = bkB2.A02;
                            Number number3 = (Number) c2476Bc3.A02(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                            List listA003 = BjA.A00(rectAED, rational, bjA2, list3, number3 == null ? 0 : number3.intValue(), 4);
                            if (!listA00.isEmpty() || !listA002.isEmpty() || !listA003.isEmpty()) {
                                BlF blF = bjA2.A03;
                                Set<BlF> set = bj5.A06.A00;
                                set.remove(blF);
                                C3010Brs<C2675BhP> c3010Brs3 = bjA2.A04;
                                if (c3010Brs3 != null) {
                                    C3010Brs.A01(c3010Brs3, "Cancelled by another startFocusAndMetering()");
                                    bjA2.A04 = null;
                                }
                                set.remove(null);
                                ScheduledFuture<?> scheduledFuture = bjA2.A06;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(true);
                                    bjA2.A06 = null;
                                }
                                bjA2.A04 = c3010Brs2;
                                MeteringRectangle[] meteringRectangleArr = BjA.A0K;
                                MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listA00.toArray(meteringRectangleArr);
                                MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listA002.toArray(meteringRectangleArr);
                                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listA003.toArray(meteringRectangleArr);
                                set.remove(bjA2.A03);
                                ScheduledFuture<?> scheduledFuture2 = bjA2.A06;
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(true);
                                    bjA2.A06 = null;
                                }
                                ScheduledFuture<?> scheduledFuture3 = bjA2.A07;
                                if (scheduledFuture3 != null) {
                                    scheduledFuture3.cancel(true);
                                    bjA2.A07 = null;
                                }
                                bjA2.A0C = meteringRectangleArr2;
                                bjA2.A0B = meteringRectangleArr3;
                                bjA2.A0D = meteringRectangleArr4;
                                if (AnonymousClass002.A1N(meteringRectangleArr2.length)) {
                                    bjA2.A0A = true;
                                    bjA2.A08 = false;
                                    jA04 = bj5.A04();
                                    bjA2.A04(true);
                                } else {
                                    bjA2.A0A = false;
                                    bjA2.A08 = true;
                                    jA04 = bj5.A04();
                                }
                                bjA2.A05 = 0;
                                final boolean z = bj5.A03(1) == 1;
                                BlF blF2 = new BlF() { // from class: X.BjQ
                                    @Override // X.BlF
                                    public final boolean ASA(TotalCaptureResult totalCaptureResult) {
                                        int iIntValue;
                                        BjA bjA3 = bjA2;
                                        boolean z2 = z;
                                        long j = jA04;
                                        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                        if (AnonymousClass002.A1N(bjA3.A0C.length) && (!z2 || num == null || (bjA3.A05.intValue() == 3 && ((iIntValue = num.intValue()) == 4 || iIntValue == 5)))) {
                                            bjA3.A08 = true;
                                        }
                                        if (!bjA3.A08 || !Bj5.A02(totalCaptureResult, j)) {
                                            if (bjA3.A05.equals(num) || num == null) {
                                                return false;
                                            }
                                            bjA3.A05 = num;
                                            return false;
                                        }
                                        ScheduledFuture<?> scheduledFuture4 = bjA3.A07;
                                        if (scheduledFuture4 != null) {
                                            scheduledFuture4.cancel(true);
                                            bjA3.A07 = null;
                                        }
                                        C3010Brs<C2675BhP> c3010Brs4 = bjA3.A04;
                                        if (c3010Brs4 == null) {
                                            return true;
                                        }
                                        c3010Brs4.A03(new C2675BhP());
                                        bjA3.A04 = null;
                                        return true;
                                    }
                                };
                                bjA2.A03 = blF2;
                                set.add(blF2);
                                final long j = bjA2.A01 + 1;
                                bjA2.A01 = j;
                                Runnable runnable = new Runnable() { // from class: X.Bk7
                                    public static final String __redex_internal_original_name = "FocusMeteringControl$$ExternalSyntheticLambda8";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final BjA bjA3 = bjA2;
                                        final long j2 = j;
                                        bjA3.A0F.execute(new Runnable() { // from class: X.Bk0
                                            public static final String __redex_internal_original_name = "FocusMeteringControl$$ExternalSyntheticLambda14";

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                BjA bjA4 = bjA3;
                                                if (j2 == bjA4.A01) {
                                                    ScheduledFuture<?> scheduledFuture4 = bjA4.A07;
                                                    if (scheduledFuture4 != null) {
                                                        scheduledFuture4.cancel(true);
                                                        bjA4.A07 = null;
                                                    }
                                                    C3010Brs<C2675BhP> c3010Brs4 = bjA4.A04;
                                                    if (c3010Brs4 != null) {
                                                        c3010Brs4.A03(new C2675BhP());
                                                        bjA4.A04 = null;
                                                    }
                                                }
                                            }
                                        });
                                    }
                                };
                                ScheduledExecutorService scheduledExecutorService = bjA2.A0G;
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                bjA2.A07 = scheduledExecutorService.schedule(runnable, 5000L, timeUnit);
                                bjA2.A06 = scheduledExecutorService.schedule(new Runnable() { // from class: X.BkK
                                    public static final String __redex_internal_original_name = "FocusMeteringControl$$ExternalSyntheticLambda9";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final BjA bjA3 = bjA2;
                                        final long j2 = j;
                                        bjA3.A0F.execute(new Runnable() { // from class: X.Bkz
                                            public static final String __redex_internal_original_name = "FocusMeteringControl$$ExternalSyntheticLambda0";

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                BjA bjA4 = bjA3;
                                                if (j2 == bjA4.A01) {
                                                    BjA.A01(bjA4);
                                                }
                                            }
                                        });
                                    }
                                }, 5000L, timeUnit);
                                return;
                            }
                            thA0i = C60O.A0i("None of the specified AF/AE/AWB MeteringPoints is supported on this camera.");
                        } else {
                            thA0i = new CameraControl$OperationCanceledException("Camera is not active.");
                        }
                        c3010Brs2.A04(thA0i);
                    }
                });
                return "startFocusAndMetering";
            case 3:
                final BjF bjF = (BjF) this.A00;
                final InterfaceC2779Bkw interfaceC2779Bkw = (InterfaceC2779Bkw) this.A01;
                bjF.A06.execute(new Runnable() { // from class: X.BjN
                    public static final String __redex_internal_original_name = "ZoomControl$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2773Bkp c2773BkpA00;
                        BjF bjF2 = bjF;
                        C3010Brs c3010Brs2 = c3010Brs;
                        InterfaceC2779Bkw interfaceC2779Bkw2 = interfaceC2779Bkw;
                        if (bjF2.A00) {
                            bjF2.A03.AfJ(c3010Brs2, interfaceC2779Bkw2.AMy());
                            bjF2.A02.A04();
                            return;
                        }
                        C2750Bjr c2750Bjr = bjF2.A04;
                        synchronized (c2750Bjr) {
                            c2750Bjr.A00(1.0f);
                            c2773BkpA00 = AbstractC2772Bko.A00(c2750Bjr);
                        }
                        BjF.A02(bjF2, c2773BkpA00);
                        C3010Brs.A01(c3010Brs2, "Camera is not active.");
                    }
                });
                return "setZoomRatio";
            case 4:
                C2679Bhc c2679Bhc = (C2679Bhc) this.A00;
                Context context = (Context) this.A01;
                Executor executor = c2679Bhc.A0C;
                executor.execute(new RunnableC2668Bh6(context, c2679Bhc, c3010Brs, executor, 1, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
            case 5:
                Object obj = this.A00;
                ((AtomicReference) this.A01).set(c3010Brs);
                return FGI.A0I("SurfaceRequest-surface-recreation(", obj.hashCode(), ")");
            case 6:
                C2678Bha c2678Bha = (C2678Bha) this.A00;
                Object obj2 = this.A01;
                C2678Bha c2678Bha2 = C2678Bha.A07;
                C7384Etj.A0Y(c3010Brs, 2);
                synchronized (c2678Bha.A05) {
                    ExecutorC2446BbZ.A02(Bpe.A01(new F4M(new EQe(obj2, 1), 10), C2945Bpd.A00(c2678Bha.A03), ExecutorC2446BbZ.A00()), c3010Brs, obj2, 10);
                }
                return "ProcessCameraProvider-initializeCameraX";
            case 7:
                C2823Bm4 c2823Bm4 = (C2823Bm4) this.A00;
                Bm5 bm5 = (Bm5) this.A01;
                InterfaceC2849Bms interfaceC2849Bms = c2823Bm4.A0R;
                C2824BmC c2824BmC = new C2824BmC(bm5, c2823Bm4, c3010Brs);
                Executor executor2 = c2823Bm4.A0j;
                Bo1 bo1 = (Bo1) interfaceC2849Bms;
                synchronized (bo1.A0K) {
                    bo1.A02 = c2824BmC;
                    bo1.A06 = executor2;
                }
                return "videoEncodingFuture";
            case 8:
                Bf9 bf9 = (Bf9) this.A00;
                final BgX bgX = (BgX) this.A01;
                Integer numA0X = BV5.A0X(c3010Brs);
                C2645Bgc c2645Bgc = bgX.A04;
                c2645Bgc.A03.A00.put("androidx.camera.video.VideoCapture.streamUpdate", numA0X);
                final AtomicBoolean atomicBooleanA1E = C60O.A1E();
                final C2667Bh1 c2667Bh1 = new C2667Bh1(bgX, bf9, c3010Brs, atomicBooleanA1E);
                C3010Brs.A00(c3010Brs, new Runnable() { // from class: X.Bgz
                    public static final String __redex_internal_original_name = "VideoCapture$$ExternalSyntheticLambda4";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AtomicBoolean atomicBoolean = atomicBooleanA1E;
                        BgX bgX2 = bgX;
                        BeX beX = c2667Bh1;
                        Bf9 bf92 = Bf9.$redex_init_class;
                        BeS.A07(AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread()), "Surface update cancellation should only occur on main thread.");
                        atomicBoolean.set(true);
                        bgX2.A04.A04.remove(beX);
                        bgX2.A07.remove(beX);
                    }
                }, ExecutorC2446BbZ.A00());
                BV7.A1E(c2667Bh1, c2645Bgc.A04);
                return String.format("%s[0x%x]", BV5.A1a("androidx.camera.video.VideoCapture.streamUpdate", c3010Brs.hashCode()));
            case 9:
                C2910Bob c2910Bob = (C2910Bob) this.A00;
                Surface surface = (Surface) this.A01;
                AbstractC2875Bni.A01("TextureViewImpl", "Surface set on Preview.");
                BmM bmM = c2910Bob.A03;
                ExecutorC2446BbZ executorC2446BbZA00 = ExecutorC2446BbZ.A00();
                c3010Brs.getClass();
                bmM.A01(surface, new C7576F4p(c3010Brs, 8), executorC2446BbZA00);
                StringBuilder sbA0x = C60O.A0x("provideSurface[request=");
                sbA0x.append(c2910Bob.A03);
                sbA0x.append(" surface=");
                return BV8.A0u(surface, sbA0x);
            default:
                Executor executor3 = (Executor) this.A00;
                final Function0 function0 = (Function0) this.A01;
                C7384Etj.A0Y(c3010Brs, 2);
                final AtomicBoolean atomicBooleanA1E2 = C60O.A1E();
                C3010Brs.A00(c3010Brs, new Runnable() { // from class: X.Bpx
                    public static final String __redex_internal_original_name = "WorkerKt$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBooleanA1E2.set(true);
                    }
                }, EnumC7478ExU.A02);
                executor3.execute(new Runnable() { // from class: X.Bpv
                    public static final String __redex_internal_original_name = "WorkerKt$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AtomicBoolean atomicBoolean = atomicBooleanA1E2;
                        C3010Brs c3010Brs2 = c3010Brs;
                        Function0 function02 = function0;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        try {
                            c3010Brs2.A03(function02.invoke());
                        } catch (Throwable th) {
                            c3010Brs2.A04(th);
                        }
                    }
                });
                return Unit.INSTANCE;
        }
    }
}
