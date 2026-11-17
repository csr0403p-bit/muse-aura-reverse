package X;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class Bj4 implements InterfaceC2610Bfb {
    public int A00;
    public int A01;
    public CameraDevice A02;
    public InterfaceC2732BjW A03;
    public C2602BfB A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public InterfaceC2562Bdq A08;
    public boolean A09;
    public final Bj5 A0A;
    public final C2742Bjj A0B;
    public final BkN A0C;
    public final C2734Bjb A0D;
    public final Bj8 A0E;
    public final C2532BdJ A0F;
    public final C2722Bis A0G;
    public final C2748Bjp A0H;
    public final C2538BdP A0I;
    public final C2503BcZ A0J;
    public final InterfaceC2794BlU A0K;
    public final BjD A0L;
    public final C2730BjE A0M;
    public final Object A0N;
    public final Map<InterfaceC2732BjW, ListenableFuture<Void>> A0O;
    public final Set<String> A0P;
    public final Executor A0Q;
    public final ScheduledExecutorService A0R;
    public final AtomicInteger A0S;
    public final C2738Bjf A0T;
    public final Bb2 A0U;
    public final C2479Bc6 A0V;
    public final C2476Bc3 A0W;
    public final Boq<EnumC2819Blw> A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public volatile Integer A0a = C79.A0C;

    public final void A0E() {
        C2643Bga c2643Bga;
        List<C2646Bgd> listUnmodifiableList;
        BeS.A07(AnonymousClass002.A1X(this.A03), null);
        A09(this, "Resetting Capture Session", null);
        InterfaceC2732BjW interfaceC2732BjW = this.A03;
        C2714Bik c2714Bik = (C2714Bik) interfaceC2732BjW;
        synchronized (c2714Bik.A0E) {
            c2643Bga = c2714Bik.A02;
        }
        C2714Bik c2714Bik2 = (C2714Bik) interfaceC2732BjW;
        synchronized (c2714Bik2.A0E) {
            listUnmodifiableList = Collections.unmodifiableList(c2714Bik2.A0F);
        }
        C2714Bik c2714BikA00 = A00(this);
        this.A03 = c2714BikA00;
        c2714BikA00.Aed(c2643Bga);
        this.A03.API(listUnmodifiableList);
        if (this.A0a.intValue() != 8) {
            String strA02 = A02(this);
            boolean zAOV = interfaceC2732BjW.AOV();
            StringBuilder sbA0g = C3cG.A0g("Skipping Capture Session state check due to current camera state: ");
            sbA0g.append(strA02);
            A09(this, C60P.A1P(" and previous session status: ", sbA0g, zAOV), null);
        } else if (this.A0Y && interfaceC2732BjW.AOV()) {
            A09(this, "Close camera before creating new session", null);
            A0G(null, C79.A0T);
        }
        if (this.A0Z && interfaceC2732BjW.AOV()) {
            A09(this, "ConfigAndClose is required when close the camera.", null);
            this.A06 = true;
        }
        interfaceC2732BjW.close();
        ListenableFuture<Void> listenableFutureAa7 = interfaceC2732BjW.Aa7(false);
        A09(this, FGI.A0M("Releasing session in state ", Bm0.A00(this.A0a)), null);
        this.A0O.put(interfaceC2732BjW, listenableFutureAa7);
        ExecutorC2446BbZ.A02(listenableFutureAa7, interfaceC2732BjW, this, 0);
    }

    public final void A0G(AbstractC2534BdL abstractC2534BdL, Integer num) {
        A0H(abstractC2534BdL, num, true);
    }

    public Bj4(Context context, Handler handler, C2532BdJ c2532BdJ, Bb2 bb2, C2538BdP c2538BdP, InterfaceC2794BlU interfaceC2794BlU, BjD bjD, String str, Executor executor, long j) throws CameraUnavailableException {
        Boq<EnumC2819Blw> boq = new Boq<>();
        this.A0X = boq;
        this.A00 = 0;
        this.A0S = BV4.A13(0);
        this.A0O = C3cG.A0j();
        this.A01 = 0;
        this.A06 = false;
        this.A07 = false;
        this.A09 = true;
        this.A0P = C60O.A13();
        this.A08 = AbstractC2591Ben.A00;
        this.A0N = C3cG.A0T();
        this.A05 = false;
        this.A0D = new C2734Bjb(this);
        this.A0I = c2538BdP;
        this.A0K = interfaceC2794BlU;
        this.A0L = bjD;
        ScheduledExecutorServiceC2936BpL scheduledExecutorServiceC2936BpL = new ScheduledExecutorServiceC2936BpL(handler);
        this.A0R = scheduledExecutorServiceC2936BpL;
        ExecutorC2949Bpk executorC2949Bpk = new ExecutorC2949Bpk(executor);
        this.A0Q = executorC2949Bpk;
        this.A0E = new Bj8(this, executorC2949Bpk, scheduledExecutorServiceC2936BpL, j);
        this.A0M = new C2730BjE(str);
        boq.A00.A09(new C2927Bot<>(EnumC2819Blw.CLOSED));
        C2738Bjf c2738Bjf = new C2738Bjf(bjD);
        this.A0T = c2738Bjf;
        C2722Bis c2722Bis = new C2722Bis(executorC2949Bpk);
        this.A0G = c2722Bis;
        this.A0U = bb2;
        try {
            C2476Bc3 c2476Bc3A00 = c2538BdP.A00(str);
            this.A0W = c2476Bc3A00;
            C2759BkH c2759BkH = new C2759BkH(this);
            C2511Bch c2511Bch = c2532BdJ.A06;
            Bj5 bj5 = new Bj5(c2476Bc3A00, c2759BkH, c2511Bch, executorC2949Bpk, scheduledExecutorServiceC2936BpL);
            this.A0A = bj5;
            this.A0F = c2532BdJ;
            synchronized (c2532BdJ.A07) {
                c2532BdJ.A00 = bj5;
                C2955Bpt<InterfaceC2779Bkw> c2955Bpt = c2532BdJ.A01;
                if (c2955Bpt != null) {
                    c2955Bpt.A0C(bj5.A0C.A05);
                }
                List<Pair<BeX, Executor>> list = c2532BdJ.A02;
                if (list != null) {
                    Iterator<Pair<BeX, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        Pair pairA0O = BV6.A0O(it);
                        Bj5 bj52 = c2532BdJ.A00;
                        bj52.A0I.execute(new RunnableC2554Bdf(bj52, (BeX) pairA0O.first, (Executor) pairA0O.second));
                    }
                    c2532BdJ.A02 = null;
                }
            }
            int iA0C = BV7.A0C(c2532BdJ.A04.A02(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
            String strA0M = FGI.A0M("Device Level: ", iA0C != 0 ? iA0C != 1 ? iA0C != 2 ? iA0C != 3 ? iA0C != 4 ? FGI.A0H("Unknown value: ", iA0C) : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED");
            if (AbstractC2875Bni.A08("Camera2CameraInfo", 4)) {
                Log.i("Camera2CameraInfo", strA0M);
            }
            c2532BdJ.A03.A0C(c2738Bjf.A01);
            this.A0J = C2503BcZ.A01(c2476Bc3A00);
            this.A03 = A00(this);
            this.A0H = new C2748Bjp(handler, c2722Bis, c2511Bch, AbstractC2398BaB.A00, executorC2949Bpk, scheduledExecutorServiceC2936BpL);
            this.A0Y = c2511Bch.A03(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.A0Z = c2511Bch.A03(LegacyCameraSurfaceCleanupQuirk.class);
            C2742Bjj c2742Bjj = new C2742Bjj(this, str);
            this.A0B = c2742Bjj;
            BkN bkN = new BkN(this);
            this.A0C = bkN;
            synchronized (bjD.A02) {
                Map<InterfaceC2783Bl3, BkA> map = bjD.A03;
                BeS.A07(!map.containsKey(this), AnonymousClass007.A0a("Camera is already registered: ", this));
                map.put(this, new BkA(bkN, c2742Bjj, executorC2949Bpk));
            }
            ((AbstractC2540BdR) c2538BdP.A00).A00.registerAvailabilityCallback(executorC2949Bpk, c2742Bjj);
            this.A0V = new C2479Bc6(context, new BkM(this), c2538BdP, str);
        } catch (CameraAccessExceptionCompat e) {
            throw AbstractC2494BcL.A00(e);
        }
    }

    public static C2714Bik A00(Bj4 bj4) {
        C2714Bik c2714Bik;
        synchronized (bj4.A0N) {
            c2714Bik = new C2714Bik(bj4.A0J, bj4.A0F.A06);
        }
        return c2714Bik;
    }

    public static String A01(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String A02(Bj4 bj4) {
        Integer num = bj4.A0a;
        return num != null ? Bm0.A00(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD;
    }

    public static void A05(Bj4 bj4) {
        C2730BjE c2730BjE = bj4.A0M;
        C2643Bga c2643BgaA00 = c2730BjE.A00().A00();
        List<BjC> list = c2643BgaA00.A02.A05;
        int size = Collections.unmodifiableList(list).size();
        int size2 = c2643BgaA00.A01().size();
        if (c2643BgaA00.A01().isEmpty()) {
            return;
        }
        if (Collections.unmodifiableList(list).isEmpty()) {
            if (bj4.A04 == null) {
                bj4.A04 = new C2602BfB(bj4.A0U, new C2665Bgy(bj4), bj4.A0F.A04);
            }
            if (!bj4.A0B()) {
                AbstractC2875Bni.A02("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
            C2602BfB c2602BfB = bj4.A04;
            if (c2602BfB != null) {
                String strA0H = FGI.A0H("MeteringRepeating", c2602BfB.hashCode());
                C2602BfB c2602BfB2 = bj4.A04;
                C2643Bga c2643Bga = c2602BfB2.A01;
                Ber ber = c2602BfB2.A04;
                EnumC2489BcG enumC2489BcG = EnumC2489BcG.METERING_REPEATING;
                c2730BjE.A03(c2643Bga, null, ber, strA0H, Collections.singletonList(enumC2489BcG));
                C2602BfB c2602BfB3 = bj4.A04;
                C2643Bga c2643Bga2 = c2602BfB3.A01;
                Ber ber2 = c2602BfB3.A04;
                List listSingletonList = Collections.singletonList(enumC2489BcG);
                Map<String, BjM> map = c2730BjE.A01;
                BjM bjM = map.get(strA0H);
                if (bjM == null) {
                    bjM = new BjM(c2643Bga2, null, ber2, listSingletonList);
                    map.put(strA0H, bjM);
                }
                bjM.A00 = true;
                return;
            }
            return;
        }
        if (!(size2 == 1 && size == 1) && size < 2 && (bj4.A04 == null || bj4.A0B())) {
            AbstractC2875Bni.A01("Camera2CameraImpl", FGI.A0T("No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: ", ", CaptureConfig Surfaces: ", size2, size));
            return;
        }
        C2602BfB c2602BfB4 = bj4.A04;
        if (c2602BfB4 != null) {
            String strA0H2 = FGI.A0H("MeteringRepeating", c2602BfB4.hashCode());
            Map<String, BjM> map2 = c2730BjE.A01;
            if (map2.containsKey(strA0H2)) {
                BjM bjM2 = map2.get(strA0H2);
                bjM2.A01 = false;
                if (!bjM2.A00) {
                    map2.remove(strA0H2);
                }
            }
            String strA0H3 = FGI.A0H("MeteringRepeating", bj4.A04.hashCode());
            if (map2.containsKey(strA0H3)) {
                BjM bjM3 = map2.get(strA0H3);
                bjM3.A00 = false;
                if (!bjM3.A01) {
                    map2.remove(strA0H3);
                }
            }
            C2602BfB c2602BfB5 = bj4.A04;
            AbstractC2875Bni.A01("MeteringRepeating", "MeteringRepeating clear!");
            BjC bjC = c2602BfB5.A00;
            if (bjC != null) {
                bjC.A02();
            }
            c2602BfB5.A00 = null;
            bj4.A04 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(final X.Bj4 r5) {
        /*
            java.lang.Integer r1 = r5.A0a
            java.lang.Integer r0 = X.C79.A01
            r4 = 0
            r3 = 1
            if (r1 == r0) goto Lf
            java.lang.Integer r2 = r5.A0a
            java.lang.Integer r1 = X.C79.A0P
            r0 = 0
            if (r2 != r1) goto L10
        Lf:
            r0 = 1
        L10:
            r1 = 0
            X.BeS.A07(r0, r1)
            X.BeS.A02(r5)
            boolean r0 = r5.A06
            if (r0 != 0) goto L1f
            A08(r5)
            return
        L1f:
            boolean r0 = r5.A07
            if (r0 == 0) goto L29
            java.lang.String r0 = "Ignored since configAndClose is processing"
        L25:
            A09(r5, r0, r1)
            return
        L29:
            X.Bjj r0 = r5.A0B
            boolean r0 = r0.A00
            if (r0 != 0) goto L37
            r5.A06 = r4
            A08(r5)
            java.lang.String r0 = "Ignore configAndClose and finish the close flow directly since camera is unavailable."
            goto L25
        L37:
            java.lang.String r0 = "Open camera to configAndClose"
            A09(r5, r0, r1)
            X.Brr r2 = X.AbstractC2947Bpi.A01(r5, r3)
            r5.A07 = r3
            X.BjL r1 = new X.BjL
            r1.<init>()
            java.util.concurrent.Executor r0 = r5.A0Q
            r2.addListener(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bj4.A06(X.Bj4):void");
    }

    public static void A07(Bj4 bj4) {
        Iterator<BfN<?>> it = bj4.A0M.A02().iterator();
        boolean zA1X = false;
        while (it.hasNext()) {
            zA1X |= AnonymousClass001.A1X(it.next().Abl(BfN.A0A, false));
        }
        ((BjK) bj4.A0A.A02).A06 = zA1X;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.Bj4 r3) {
        /*
            java.lang.Integer r1 = r3.A0a
            java.lang.Integer r0 = X.C79.A01
            if (r1 == r0) goto Ld
            java.lang.Integer r2 = r3.A0a
            java.lang.Integer r1 = X.C79.A0P
            r0 = 0
            if (r2 != r1) goto Le
        Ld:
            r0 = 1
        Le:
            r2 = 0
            X.BeS.A07(r0, r2)
            X.BeS.A02(r3)
            r3.A02 = r2
            java.lang.Integer r1 = r3.A0a
            java.lang.Integer r0 = X.C79.A0P
            if (r1 != r0) goto L23
            java.lang.Integer r0 = X.C79.A0C
            r3.A0G(r2, r0)
            return
        L23:
            X.BdP r0 = r3.A0I
            X.Bjj r1 = r3.A0B
            X.BdN r0 = r0.A00
            X.BdR r0 = (X.AbstractC2540BdR) r0
            android.hardware.camera2.CameraManager r0 = r0.A00
            r0.unregisterAvailabilityCallback(r1)
            java.lang.Integer r0 = X.C79.A00
            r3.A0G(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bj4.A08(X.Bj4):void");
    }

    private void A0A(boolean z) throws CameraAccessException {
        if (!z) {
            this.A0E.A02.A00 = -1L;
        }
        Bj8 bj8 = this.A0E;
        bj8.A01();
        C2734Bjb c2734Bjb = this.A0D;
        c2734Bjb.A00();
        A09(this, "Opening camera.", null);
        Integer num = C79.A0Y;
        A0G(null, num);
        try {
            C2538BdP c2538BdP = this.A0I;
            String str = this.A0F.A08;
            Executor executor = this.A0Q;
            ArrayList arrayListA0t = BV4.A0t(this.A0M.A00().A00().A05);
            arrayListA0t.add(this.A0G.A00);
            arrayListA0t.add(bj8);
            c2538BdP.A01(str, executor, arrayListA0t.isEmpty() ? new C2659Bgr() : arrayListA0t.size() == 1 ? (CameraDevice.StateCallback) BV6.A0m(arrayListA0t) : new Bgs(arrayListA0t));
        } catch (CameraAccessExceptionCompat e) {
            A09(this, BV5.A0n("Unable to open camera due to ", e), null);
            if (e.mReason == 10001) {
                A0G(new C2579BeD(7, e), C79.A0C);
                return;
            }
            Bj4 bj4 = c2734Bjb.A01;
            if (bj4.A0a != num) {
                A09(bj4, "Don't need the onError timeout handler.", null);
                return;
            }
            A09(bj4, "Camera waiting for onError.", null);
            c2734Bjb.A00();
            c2734Bjb.A00 = new BjV(c2734Bjb);
        } catch (SecurityException e2) {
            A09(this, BV5.A0n("Unable to open camera due to ", e2), null);
            A0G(null, C79.A0W);
            bj8.A00();
        }
    }

    public final void A0C() {
        ArrayList arrayListA0t;
        BeS.A07(this.A0a == C79.A0P || this.A0a == C79.A01 || (this.A0a == C79.A0W && this.A00 != 0), FGI.A0h("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: ", A02(this), " (error: ", A01(this.A00), ")"));
        A0E();
        C2714Bik c2714Bik = (C2714Bik) this.A03;
        synchronized (c2714Bik.A0E) {
            List<C2646Bgd> list = c2714Bik.A0F;
            if (list.isEmpty()) {
                arrayListA0t = null;
            } else {
                arrayListA0t = BV4.A0t(list);
                list.clear();
            }
        }
        if (arrayListA0t != null) {
            Iterator it = arrayListA0t.iterator();
            while (it.hasNext()) {
                C2646Bgd c2646Bgd = (C2646Bgd) it.next();
                for (BeX beX : c2646Bgd.A04) {
                    Object obj = c2646Bgd.A03.A00.get("CAPTURE_CONFIG_ID_KEY");
                    beX.A00(obj == null ? -1 : AnonymousClass001.A0F(obj));
                }
            }
        }
    }

    public final void A0D() {
        BjC bjC;
        Object objAbk;
        BeS.A07(AnonymousClass002.A1Z(this.A0a, C79.A0Z), null);
        C2730BjE c2730BjE = this.A0M;
        C2644Bgb c2644BgbA00 = c2730BjE.A00();
        if (!c2644BgbA00.A01 || !c2644BgbA00.A02) {
            A09(this, "Unable to create capture session due to conflicting configurations", null);
            return;
        }
        BjD bjD = this.A0L;
        this.A02.getId();
        this.A0K.AIS(this.A02.getId());
        synchronized (bjD.A02) {
        }
        HashMap mapA0u = BV4.A0u();
        Collection<C2643Bga> collectionA01 = c2730BjE.A01();
        ArrayList arrayListA0t = BV4.A0t(c2730BjE.A02());
        Iterator<C2643Bga> it = collectionA01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2643Bga next = it.next();
            InterfaceC2585Beh interfaceC2585Beh = next.A02.A02;
            AbstractC2531BdI<Long> abstractC2531BdI = AbstractC2488BcF.A00;
            if (interfaceC2585Beh.A74(abstractC2531BdI) && next.A01().size() != 1) {
                AbstractC2875Bni.A02("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", BV5.A1Y(next.A01().size())));
                break;
            }
            if (interfaceC2585Beh.A74(abstractC2531BdI)) {
                int i = 0;
                for (C2643Bga c2643Bga : collectionA01) {
                    if (((BfN) arrayListA0t.get(i)).ADT() == EnumC2489BcG.METERING_REPEATING) {
                        BeS.A07(BV6.A1b(c2643Bga.A01()), "MeteringRepeating should contain a surface");
                        bjC = c2643Bga.A01().get(0);
                        objAbk = 1L;
                    } else {
                        InterfaceC2585Beh interfaceC2585Beh2 = c2643Bga.A02.A02;
                        if (!interfaceC2585Beh2.A74(abstractC2531BdI) || c2643Bga.A01().isEmpty()) {
                            i++;
                        } else {
                            bjC = c2643Bga.A01().get(0);
                            objAbk = interfaceC2585Beh2.Abk(abstractC2531BdI);
                        }
                    }
                    mapA0u.put(bjC, objAbk);
                    i++;
                }
            }
        }
        C2714Bik c2714Bik = (C2714Bik) this.A03;
        synchronized (c2714Bik.A0E) {
            c2714Bik.A07 = mapA0u;
        }
        InterfaceC2732BjW interfaceC2732BjW = this.A03;
        C2643Bga c2643BgaA00 = c2644BgbA00.A00();
        CameraDevice cameraDevice = this.A02;
        cameraDevice.getClass();
        C2748Bjp c2748Bjp = this.A0H;
        C2511Bch c2511Bch = c2748Bjp.A02;
        C2511Bch c2511Bch2 = c2748Bjp.A03;
        AbstractC2942BpW.A03(new F58(1, interfaceC2732BjW, this), interfaceC2732BjW.AXV(cameraDevice, new C2715Bil(c2748Bjp.A00, c2748Bjp.A01, c2511Bch, c2511Bch2, c2748Bjp.A04, c2748Bjp.A05), c2643BgaA00), this.A0Q);
    }

    public final void A0F() {
        C2730BjE c2730BjE = this.A0M;
        C2644Bgb c2644Bgb = new C2644Bgb();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(c2730BjE.A01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            BjM bjM = (BjM) entryA0l.getValue();
            if (bjM.A00 && bjM.A01) {
                Object key = entryA0l.getKey();
                c2644Bgb.A01(bjM.A02);
                arrayListA0h.add(key);
            }
        }
        StringBuilder sbA0f = C3cG.A0f(arrayListA0h, "Active and attached use case: ");
        sbA0f.append(" for camera: ");
        AbstractC2875Bni.A01("UseCaseAttachState", AnonymousClass001.A0v(c2730BjE.A00, sbA0f));
        if (!c2644Bgb.A01 || !c2644Bgb.A02) {
            Bj5 bj5 = this.A0A;
            bj5.A00 = 1;
            bj5.A09.A00 = 1;
            bj5.A07.A00 = 1;
            this.A03.Aed(bj5.A05());
            return;
        }
        C2643Bga c2643BgaA00 = c2644Bgb.A00();
        Bj5 bj52 = this.A0A;
        int i = c2643BgaA00.A02.A00;
        bj52.A00 = i;
        bj52.A09.A00 = i;
        bj52.A07.A00 = i;
        c2644Bgb.A01(bj52.A05());
        this.A03.Aed(c2644Bgb.A00());
    }

    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd A[Catch: all -> 0x01c4, TryCatch #1 {, blocks: (B:25:0x006f, B:27:0x0075, B:29:0x007f, B:44:0x00c5, B:48:0x00cb, B:50:0x00cf, B:51:0x00d7, B:53:0x00dd, B:55:0x00ed, B:62:0x0114, B:63:0x0117, B:56:0x00fd, B:58:0x0101, B:60:0x0105, B:30:0x0085, B:32:0x009a, B:37:0x00a2, B:39:0x00a9, B:41:0x00af, B:42:0x00c0), top: B:105:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114 A[Catch: all -> 0x01c4, TryCatch #1 {, blocks: (B:25:0x006f, B:27:0x0075, B:29:0x007f, B:44:0x00c5, B:48:0x00cb, B:50:0x00cf, B:51:0x00d7, B:53:0x00dd, B:55:0x00ed, B:62:0x0114, B:63:0x0117, B:56:0x00fd, B:58:0x0101, B:60:0x0105, B:30:0x0085, B:32:0x009a, B:37:0x00a2, B:39:0x00a9, B:41:0x00af, B:42:0x00c0), top: B:105:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(X.AbstractC2534BdL r11, java.lang.Integer r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bj4.A0H(X.BdL, java.lang.Integer, boolean):void");
    }

    public final void A0I(boolean z) throws CameraAccessException {
        A09(this, "Attempting to force open the camera.", null);
        if (this.A0L.A01(this)) {
            A0A(z);
        } else {
            A09(this, "No cameras available. Waiting for available camera before opening camera.", null);
            A0G(null, C79.A0K);
        }
    }

    public final void A0J(boolean z) throws CameraAccessException {
        A09(this, "Attempting to open the camera.", null);
        if (this.A0B.A00 && this.A0L.A01(this)) {
            A0A(z);
        } else {
            A09(this, "No cameras available. Waiting for available camera before opening camera.", null);
            A0G(null, C79.A0K);
        }
    }

    @Override // X.InterfaceC2783Bl3
    public final /* synthetic */ InterfaceC2622Bfo ADF() {
        return this.A0A;
    }

    @Override // X.InterfaceC2610Bfb
    public final BfV ADG() {
        return this.A0A;
    }

    @Override // X.InterfaceC2783Bl3
    public final /* synthetic */ InterfaceC2546BdX ADI() {
        return this.A0F;
    }

    @Override // X.InterfaceC2610Bfb
    public final InterfaceC2544BdV ADJ() {
        return this.A0F;
    }

    @Override // X.InterfaceC2610Bfb
    public final InterfaceC2620Bfm<EnumC2819Blw> ADL() {
        return this.A0X;
    }

    @Override // X.InterfaceC2610Bfb
    public final InterfaceC2562Bdq AFS() {
        return this.A08;
    }

    @Override // X.InterfaceC2610Bfb
    public final /* synthetic */ boolean AG8() {
        return true;
    }

    @Override // X.InterfaceC2610Bfb
    public final void Ach(final boolean z) {
        this.A0Q.execute(new Runnable() { // from class: X.Bk3
            public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda17";

            @Override // java.lang.Runnable
            public final void run() throws CameraAccessException {
                Bj4 bj4 = this.A00;
                boolean z2 = z;
                bj4.A05 = z2;
                if (z2 && bj4.A0a == C79.A0K) {
                    bj4.A0I(false);
                }
            }
        });
    }

    @Override // X.InterfaceC2610Bfb
    public final void AdP(InterfaceC2562Bdq interfaceC2562Bdq) {
        if (interfaceC2562Bdq == null) {
            interfaceC2562Bdq = AbstractC2591Ben.A00;
        }
        interfaceC2562Bdq.Abl(InterfaceC2562Bdq.A03, null);
        this.A08 = interfaceC2562Bdq;
        synchronized (this.A0N) {
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", BV5.A0X(this), this.A0F.A08);
    }

    public static String A03(BfD bfD) {
        return FGI.A0H(bfD.A0I(), bfD.hashCode());
    }

    private Collection<BeJ> A04(Collection<BfD> collection) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<BfD> it = collection.iterator();
        while (it.hasNext()) {
            BfD bfDA0S = BV6.A0S(it);
            boolean z = this.A09;
            String strA03 = A03(bfDA0S);
            Class<?> cls = bfDA0S.getClass();
            C2643Bga c2643Bga = z ? bfDA0S.A03 : bfDA0S.A02;
            BfN<?> bfN = bfDA0S.A05;
            AbstractC2481Bc8 abstractC2481Bc8 = bfDA0S.A04;
            arrayListA0h.add(new BeI(abstractC2481Bc8 != null ? ((C2492BcJ) abstractC2481Bc8).A01 : null, c2643Bga, abstractC2481Bc8, bfN, cls, strA03, bfDA0S.A0B() == null ? null : BfE.A02(bfDA0S)));
        }
        return arrayListA0h;
    }

    public static void A09(Bj4 bj4, String str, Throwable th) {
        String str2 = String.format("{%s} %s", bj4.toString(), str);
        if (AbstractC2875Bni.A08("Camera2CameraImpl", 3)) {
            Log.d("Camera2CameraImpl", str2, th);
        }
    }

    private boolean A0B() {
        ArrayList arrayListA0h = C3cG.A0h();
        synchronized (this.A0N) {
        }
        C2730BjE c2730BjE = this.A0M;
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(c2730BjE.A01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (((BjM) entryA0l.getValue()).A01) {
                arrayListA0h2.add(entryA0l.getValue());
            }
        }
        for (BjM bjM : Collections.unmodifiableCollection(arrayListA0h2)) {
            List<EnumC2489BcG> list = bjM.A05;
            if (list == null || list.get(0) != EnumC2489BcG.METERING_REPEATING) {
                AbstractC2481Bc8 abstractC2481Bc8 = bjM.A03;
                if (abstractC2481Bc8 == null || list == null) {
                    AbstractC2875Bni.A03("Camera2CameraImpl", AnonymousClass007.A0a("Invalid stream spec or capture types in ", bjM));
                    return false;
                }
                C2643Bga c2643Bga = bjM.A02;
                BfN<?> bfN = bjM.A04;
                for (BjC bjC : c2643Bga.A01()) {
                    C2479Bc6 c2479Bc6 = this.A0V;
                    int iAGW = bfN.AGW();
                    Size size = bjC.A06;
                    C2410BaQ c2410BaQA01 = Bb3.A01(size, C2479Bc6.A04(c2479Bc6, iAGW), iAGW);
                    int iAGW2 = bfN.AGW();
                    C2492BcJ c2492BcJ = (C2492BcJ) abstractC2481Bc8;
                    arrayListA0h.add(new C2487BcE((Range) bfN.Abl(BfN.A08, null), size, c2492BcJ.A02, c2492BcJ.A03, c2410BaQA01, list, iAGW2));
                }
            }
        }
        this.A04.getClass();
        HashMap mapA0u = BV4.A0u();
        C2602BfB c2602BfB = this.A04;
        mapA0u.put(c2602BfB.A04, Collections.singletonList(c2602BfB.A03));
        try {
            this.A0V.A0A(arrayListA0h, mapA0u, false, false);
            A09(this, "Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e) {
            A09(this, "Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }

    @Override // X.InterfaceC2610Bfb
    public final void A4u(Collection<BfD> collection) throws ExecutionException, InterruptedException {
        ArrayList arrayListA0t = BV4.A0t(collection);
        if (arrayListA0t.isEmpty()) {
            return;
        }
        Bj5 bj5 = this.A0A;
        synchronized (bj5.A0H) {
            bj5.A01++;
        }
        Iterator itA0z = BV5.A0z(arrayListA0t);
        while (itA0z.hasNext()) {
            BfD bfDA0S = BV6.A0S(itA0z);
            String strA03 = A03(bfDA0S);
            Set<String> set = this.A0P;
            if (!set.contains(strA03)) {
                set.add(strA03);
                bfDA0S.A0K();
                if (bfDA0S instanceof C2605BfM) {
                    C2605BfM c2605BfM = (C2605BfM) bfDA0S;
                    AbstractC2875Bni.A01("ImageCapture", "onCameraControlReady");
                    C2605BfM.A02(c2605BfM);
                    c2605BfM.A0A().AeZ(c2605BfM.A05);
                }
            }
        }
        final ArrayList arrayListA0t2 = BV4.A0t(A04(arrayListA0t));
        try {
            this.A0Q.execute(new Runnable() { // from class: X.Bj7
                public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda5";

                /* JADX WARN: Removed duplicated region for block: B:49:0x00e1 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #1 {all -> 0x00ed, blocks: (B:3:0x0004, B:4:0x0017, B:6:0x001d, B:8:0x002f, B:10:0x0039, B:12:0x004d, B:14:0x0051, B:15:0x0056, B:17:0x005c, B:19:0x0070, B:20:0x0078, B:26:0x0083, B:27:0x0084, B:29:0x0097, B:35:0x00a7, B:49:0x00e1, B:36:0x00b5, B:38:0x00c2, B:40:0x00c6, B:42:0x00ca, B:46:0x00d4, B:45:0x00d0, B:47:0x00dc, B:21:0x0079, B:22:0x007f), top: B:57:0x0004 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.Bj7.run():void");
                }
            });
        } catch (RejectedExecutionException e) {
            A09(this, "Unable to attach use cases.", e);
            bj5.A06();
        }
    }

    @Override // X.InterfaceC2610Bfb
    public final void A8x(Collection<BfD> collection) {
        ArrayList arrayListA0t = BV4.A0t(collection);
        if (arrayListA0t.isEmpty()) {
            return;
        }
        final ArrayList arrayListA0t2 = BV4.A0t(A04(arrayListA0t));
        Iterator itA0z = BV5.A0z(arrayListA0t);
        while (itA0z.hasNext()) {
            BfD bfDA0S = BV6.A0S(itA0z);
            String strA03 = A03(bfDA0S);
            Set<String> set = this.A0P;
            if (set.contains(strA03)) {
                bfDA0S.A0L();
                set.remove(strA03);
            }
        }
        this.A0Q.execute(new Runnable() { // from class: X.Bj6
            public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda15";

            @Override // java.lang.Runnable
            public final void run() {
                BjV bjV;
                Bj4 bj4 = this.A00;
                List<BeJ> list = arrayListA0t2;
                ArrayList arrayListA0h = C3cG.A0h();
                boolean z = false;
                for (BeJ beJ : list) {
                    C2730BjE c2730BjE = bj4.A0M;
                    BeI beI = (BeI) beJ;
                    String str = beI.A05;
                    Map<String, BjM> map = c2730BjE.A01;
                    if (map.containsKey(str) && map.get(str).A01) {
                        map.remove(str);
                        arrayListA0h.add(str);
                        if (beI.A04 == BfA.class) {
                            z = true;
                        }
                    }
                }
                if (arrayListA0h.isEmpty()) {
                    return;
                }
                Bj4.A09(bj4, FGI.A0U("Use cases [", TextUtils.join(", ", arrayListA0h), "] now DETACHED for camera"), null);
                if (z) {
                    bj4.A0A.A09.A0I = null;
                }
                Bj4.A05(bj4);
                C2730BjE c2730BjE2 = bj4.A0M;
                if (c2730BjE2.A02().isEmpty()) {
                    ((BjK) bj4.A0A.A02).A06 = false;
                } else {
                    Bj4.A07(bj4);
                }
                if (!c2730BjE2.A01().isEmpty()) {
                    bj4.A0F();
                    bj4.A0E();
                    if (bj4.A0a == C79.A0Z) {
                        bj4.A0D();
                        return;
                    }
                    return;
                }
                Bj5 bj5 = bj4.A0A;
                bj5.A06();
                bj4.A0E();
                bj5.A09(false);
                bj4.A03 = Bj4.A00(bj4);
                Bj4.A09(bj4, "Closing camera.", null);
                switch (bj4.A0a.intValue()) {
                    case 3:
                        BeS.A07(bj4.A02 == null, null);
                        bj4.A0G(null, C79.A0C);
                        break;
                    case 4:
                    default:
                        Bj4.A09(bj4, FGI.A0M("close() ignored due to being in state: ", Bj4.A02(bj4)), null);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        if (!bj4.A0E.A01() && ((bjV = bj4.A0D.A00) == null || bjV.A01.get())) {
                            z = false;
                        }
                        bj4.A0D.A00();
                        bj4.A0G(null, C79.A0P);
                        if (z) {
                            BeS.A02(bj4);
                            Bj4.A06(bj4);
                            break;
                        }
                        break;
                    case 8:
                    case 9:
                        bj4.A0G(null, C79.A0P);
                        bj4.A0C();
                        break;
                }
            }
        });
    }

    @Override // X.InterfaceC2630Bfx
    public final void AWy(BfD bfD) {
        bfD.getClass();
        final String strA03 = A03(bfD);
        final C2643Bga c2643Bga = this.A09 ? bfD.A03 : bfD.A02;
        final BfN<?> bfN = bfD.A05;
        final AbstractC2481Bc8 abstractC2481Bc8 = bfD.A04;
        final List<EnumC2489BcG> listA02 = bfD.A0B() == null ? null : BfE.A02(bfD);
        this.A0Q.execute(new Runnable() { // from class: X.BjP
            public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda9";

            @Override // java.lang.Runnable
            public final void run() {
                Bj4 bj4 = this.A00;
                String str = strA03;
                C2643Bga c2643Bga2 = c2643Bga;
                BfN bfN2 = bfN;
                AbstractC2481Bc8 abstractC2481Bc82 = abstractC2481Bc8;
                List list = listA02;
                Bj4.A09(bj4, FGI.A0U("Use case ", str, " ACTIVE"), null);
                C2730BjE c2730BjE = bj4.A0M;
                Map<String, BjM> map = c2730BjE.A01;
                BjM bjM = map.get(str);
                if (bjM == null) {
                    bjM = new BjM(c2643Bga2, abstractC2481Bc82, bfN2, list);
                    map.put(str, bjM);
                }
                bjM.A00 = true;
                c2730BjE.A04(c2643Bga2, abstractC2481Bc82, bfN2, str, list);
                bj4.A0F();
            }
        });
    }

    @Override // X.InterfaceC2630Bfx
    public final void AWz(BfD bfD) {
        bfD.getClass();
        final String strA03 = A03(bfD);
        this.A0Q.execute(new Runnable() { // from class: X.BjZ
            public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda8";

            @Override // java.lang.Runnable
            public final void run() {
                Bj4 bj4 = this.A00;
                String str = strA03;
                Bj4.A09(bj4, FGI.A0U("Use case ", str, " INACTIVE"), null);
                Map<String, BjM> map = bj4.A0M.A01;
                if (map.containsKey(str)) {
                    BjM bjM = map.get(str);
                    bjM.A00 = false;
                    if (!bjM.A01) {
                        map.remove(str);
                    }
                }
                bj4.A0F();
            }
        });
    }

    @Override // X.InterfaceC2630Bfx
    public final void AX0(BfD bfD) {
        bfD.getClass();
        C2643Bga c2643Bga = this.A09 ? bfD.A03 : bfD.A02;
        BfN<?> bfN = bfD.A05;
        this.A0Q.execute(new BjO(this, c2643Bga, bfD.A04, bfN, A03(bfD), bfD.A0B() == null ? null : BfE.A02(bfD)));
    }

    @Override // X.InterfaceC2630Bfx
    public final void AX1(BfD bfD) {
        bfD.getClass();
        final String strA03 = A03(bfD);
        final C2643Bga c2643Bga = this.A09 ? bfD.A03 : bfD.A02;
        final BfN<?> bfN = bfD.A05;
        final AbstractC2481Bc8 abstractC2481Bc8 = bfD.A04;
        final List<EnumC2489BcG> listA02 = bfD.A0B() == null ? null : BfE.A02(bfD);
        this.A0Q.execute(new Runnable() { // from class: X.Bja
            public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda7";

            @Override // java.lang.Runnable
            public final void run() {
                Bj4 bj4 = this.A00;
                String str = strA03;
                C2643Bga c2643Bga2 = c2643Bga;
                BfN bfN2 = bfN;
                AbstractC2481Bc8 abstractC2481Bc82 = abstractC2481Bc8;
                List list = listA02;
                Bj4.A09(bj4, FGI.A0U("Use case ", str, " UPDATED"), null);
                bj4.A0M.A04(c2643Bga2, abstractC2481Bc82, bfN2, str, list);
                bj4.A0F();
            }
        });
    }

    @Override // X.InterfaceC2610Bfb
    public final void AeF(boolean z) {
        this.A09 = z;
    }
}
