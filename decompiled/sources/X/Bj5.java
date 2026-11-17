package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.CameraControl$OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class Bj5 implements BfV {
    public int A00;
    public int A01;
    public InterfaceC2804Blh A02;
    public InterfaceC2787BlA A03;
    public long A04;
    public final BeT A05;
    public final C2739Bjg A06;
    public final C2762BkQ A07;
    public final BkF A08;
    public final BjA A09;
    public final BjH A0A;
    public final C2761BkO A0B;
    public final BjF A0C;
    public final C2476Bc3 A0D;
    public final C2412Bam A0E;
    public final C2405BaJ A0F;
    public final BjR A0G;
    public final Object A0H = C3cG.A0T();
    public final Executor A0I;
    public final InterfaceC2802Blf A0J;
    public final BgX A0K;
    public final AtomicLong A0L;
    public volatile int A0M;
    public volatile boolean A0N;
    public volatile ListenableFuture<Void> A0O;

    public Bj5(C2476Bc3 c2476Bc3, InterfaceC2802Blf interfaceC2802Blf, C2511Bch c2511Bch, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        BgX bgX = new BgX();
        this.A0K = bgX;
        this.A01 = 0;
        this.A0N = false;
        this.A0M = 2;
        this.A0L = BV4.A14(0L);
        this.A0O = BpQ.A01;
        this.A00 = 1;
        this.A04 = 0L;
        BeT beT = new BeT();
        this.A05 = beT;
        this.A0D = c2476Bc3;
        this.A0J = interfaceC2802Blf;
        this.A0I = executor;
        this.A0B = new C2761BkO(executor);
        C2739Bjg c2739Bjg = new C2739Bjg(executor);
        this.A06 = c2739Bjg;
        C2645Bgc c2645Bgc = bgX.A04;
        c2645Bgc.A00 = 1;
        BV7.A1E(new C2657Bgp(c2739Bjg), c2645Bgc.A04);
        BV7.A1E(beT, c2645Bgc.A04);
        this.A08 = new BkF(this, c2476Bc3, executor);
        this.A09 = new BjA(this, c2511Bch, executor, scheduledExecutorService);
        this.A0C = new BjF(this, c2476Bc3, executor);
        this.A0A = new BjH(this, c2476Bc3, executor);
        this.A02 = new BjK(c2476Bc3);
        this.A0E = new C2412Bam(c2511Bch);
        this.A0F = new C2405BaJ(c2511Bch);
        this.A0G = new BjR(this, executor);
        this.A07 = new C2762BkQ(this, c2476Bc3, c2511Bch, executor, scheduledExecutorService);
    }

    @Override // X.BfV
    public final ListenableFuture<List<Void>> Agb(final List<C2646Bgd> list, final int i, final int i2) {
        if (!A01()) {
            AbstractC2875Bni.A03("Camera2CameraControlImp", "Camera is not active.");
            return new C2938BpP(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int i3 = this.A0M;
        return Bpe.A01(new InterfaceC2939BpT() { // from class: X.BjX
            @Override // X.InterfaceC2939BpT
            public final ListenableFuture A4O(Object obj) {
                Bj5 bj5 = this.A03;
                final List list2 = list;
                int i4 = i;
                final int i5 = i3;
                final BkR bkRA00 = C2762BkQ.A00(bj5.A07, i4, i5, i2);
                C2945Bpd c2945BpdA00 = C2945Bpd.A00(bkRA00.A00(i5));
                InterfaceC2939BpT interfaceC2939BpT = new InterfaceC2939BpT() { // from class: X.Bj9
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
                    @Override // X.InterfaceC2939BpT
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture A4O(java.lang.Object r11) {
                        /*
                            r10 = this;
                            X.BkR r5 = r1
                            java.util.List r0 = r2
                            int r6 = r3
                            java.util.ArrayList r4 = X.C3cG.A0h()
                            java.util.ArrayList r3 = X.C3cG.A0h()
                            java.util.Iterator r11 = r0.iterator()
                        L12:
                            boolean r0 = r11.hasNext()
                            if (r0 == 0) goto Lb1
                            java.lang.Object r0 = r11.next()
                            X.Bgd r0 = (X.C2646Bgd) r0
                            X.Bgc r7 = new X.Bgc
                            r7.<init>(r0)
                            int r9 = r0.A00
                            r8 = 5
                            if (r9 != r8) goto L70
                            X.Bj5 r0 = r5.A02
                            X.Blh r10 = r0.A02
                            X.BjK r10 = (X.BjK) r10
                            boolean r0 = r10.A05
                            if (r0 != 0) goto L70
                            boolean r0 = r10.A06
                            if (r0 != 0) goto L70
                            X.BnB r0 = r10.A09     // Catch: java.util.NoSuchElementException -> L69
                            java.lang.Object r2 = r0.A8p()     // Catch: java.util.NoSuchElementException -> L69
                            X.Bng r2 = (X.InterfaceC2873Bng) r2     // Catch: java.util.NoSuchElementException -> L69
                            if (r2 == 0) goto L70
                            android.media.Image r1 = r2.AGI()
                            android.media.ImageWriter r0 = r10.A00
                            if (r0 == 0) goto L70
                            if (r1 == 0) goto L70
                            r0.queueInputImage(r1)     // Catch: java.lang.IllegalStateException -> L5c
                            X.Bnt r1 = r2.AGK()
                            boolean r0 = r1 instanceof X.BnL
                            if (r0 == 0) goto L70
                            X.BnL r1 = (X.BnL) r1
                            X.BnK r0 = r1.A00
                            r7.A01 = r0
                            goto L7d
                        L5c:
                            r1 = move-exception
                            java.lang.String r0 = "enqueueImageToImageWriter throws IllegalStateException = "
                            java.lang.String r1 = X.BV5.A0n(r0, r1)
                            java.lang.String r0 = "ZslControlImpl"
                            X.AbstractC2875Bni.A02(r0, r1)
                            goto L70
                        L69:
                            java.lang.String r1 = "ZslControlImpl"
                            java.lang.String r0 = "dequeueImageFromBuffer no such element"
                            X.AbstractC2875Bni.A02(r1, r0)
                        L70:
                            int r2 = r5.A01
                            r0 = 3
                            r1 = -1
                            if (r2 != r0) goto Lab
                            boolean r0 = r5.A08
                            if (r0 != 0) goto Lab
                            r0 = 4
                        L7b:
                            r7.A00 = r0
                        L7d:
                            X.BkP r1 = r5.A04
                            boolean r0 = r1.A00
                            if (r0 == 0) goto L9a
                            if (r6 != 0) goto L9a
                            boolean r0 = r1.A01
                            if (r0 == 0) goto L9a
                            X.BgU r2 = new X.BgU
                            r2.<init>()
                            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
                            java.lang.Integer r0 = X.BV4.A0Y()
                            r2.A01(r1, r0)
                            X.C2592Beo.A00(r2, r7)
                        L9a:
                            r0 = 0
                            X.Brr r0 = X.AbstractC2947Bpi.A02(r7, r5, r0)
                            r4.add(r0)
                            X.Bgd r0 = r7.A01()
                            r3.add(r0)
                            goto L12
                        Lab:
                            if (r9 == r1) goto Laf
                            if (r9 != r8) goto L7d
                        Laf:
                            r0 = 2
                            goto L7b
                        Lb1:
                            X.Bj5 r0 = r5.A02
                            r0.A07(r3)
                            X.Bpa r0 = X.AbstractC2942BpW.A00(r4)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.Bj9.A4O(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                };
                Executor executor = bkRA00.A06;
                Bpe bpeA01 = Bpe.A01(interfaceC2939BpT, c2945BpdA00, executor);
                bpeA01.addListener(new Runnable() { // from class: X.Bkf
                    public static final String __redex_internal_original_name = "Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda2";

                    @Override // java.lang.Runnable
                    public final void run() {
                        bkRA00.A03.AYF();
                    }
                }, executor);
                return AbstractC2942BpW.A01(bpeA01);
            }
        }, C2945Bpd.A00(AbstractC2942BpW.A01(this.A0O)), this.A0I);
    }

    public static int A00(C2476Bc3 c2476Bc3, int i) {
        int[] iArr = (int[]) c2476Bc3.A02(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr != null) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i = 1;
                    for (int i3 : iArr) {
                        if (1 != i3) {
                        }
                    }
                } else {
                    if (i == iArr[i2]) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        return 0;
    }

    private boolean A01() {
        int i;
        synchronized (this.A0H) {
            i = this.A01;
        }
        return AnonymousClass002.A1N(i);
    }

    public final int A03(int i) {
        int[] iArr = (int[]) this.A0D.A02(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i = 4;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i = 1;
                            for (int i4 : iArr) {
                                if (1 != i4) {
                                }
                            }
                        } else {
                            if (4 == iArr[i3]) {
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (i == iArr[i2]) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        return 0;
    }

    public final long A04() {
        this.A04 = this.A0L.getAndIncrement();
        ((C2759BkH) this.A0J).A00.A0F();
        return this.A04;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2643Bga A05() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bj5.A05():X.Bga");
    }

    public final void A06() {
        synchronized (this.A0H) {
            int i = this.A01;
            if (i == 0) {
                throw C3cG.A0Q("Decrementing use count occurs more times than incrementing");
            }
            this.A01 = i - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A07(List<C2646Bgd> list) {
        String str;
        int iA01;
        int iA00;
        InterfaceC2861BnK interfaceC2861BnK;
        Bj4 bj4 = ((C2759BkH) this.A0J).A00;
        list.getClass();
        ArrayList arrayListA0h = C3cG.A0h();
        for (C2646Bgd c2646Bgd : list) {
            C2645Bgc c2645Bgc = new C2645Bgc(c2646Bgd);
            if (c2646Bgd.A00 == 5 && (interfaceC2861BnK = c2646Bgd.A01) != null) {
                c2645Bgc.A01 = interfaceC2861BnK;
            }
            if (Collections.unmodifiableList(c2646Bgd.A05).isEmpty() && c2646Bgd.A07) {
                Set<BjC> set = c2645Bgc.A07;
                if (set.isEmpty()) {
                    C2730BjE c2730BjE = bj4.A0M;
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    Iterator itA0n = AnonymousClass002.A0n(c2730BjE.A01);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        BjM bjM = (BjM) entryA0l.getValue();
                        if (bjM.A00 && bjM.A01) {
                            arrayListA0h2.add(((BjM) entryA0l.getValue()).A02);
                        }
                    }
                    Iterator it = Collections.unmodifiableCollection(arrayListA0h2).iterator();
                    while (it.hasNext()) {
                        C2646Bgd c2646Bgd2 = ((C2643Bga) it.next()).A02;
                        List listUnmodifiableList = Collections.unmodifiableList(c2646Bgd2.A05);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (c2646Bgd2.A00() != 0 && (iA00 = c2646Bgd2.A00()) != 0) {
                                InterfaceC2583Bef.A00(c2645Bgc, BfN.A05, iA00);
                            }
                            if (c2646Bgd2.A01() != 0 && (iA01 = c2646Bgd2.A01()) != 0) {
                                InterfaceC2583Bef.A00(c2645Bgc, BfN.A09, iA01);
                            }
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                set.add(it2.next());
                            }
                        }
                    }
                    if (set.isEmpty()) {
                        str = "Unable to find a repeating surface to attach to CaptureConfig";
                    }
                } else {
                    str = "The capture config builder already has surface inside.";
                }
                AbstractC2875Bni.A03("Camera2CameraImpl", str);
            }
            arrayListA0h.add(c2645Bgc.A01());
        }
        Bj4.A09(bj4, "Issue capture request", null);
        bj4.A03.API(arrayListA0h);
    }

    public final void A08(boolean z) {
        this.A0N = z;
        if (!z) {
            C2645Bgc c2645Bgc = new C2645Bgc();
            c2645Bgc.A00 = this.A00;
            c2645Bgc.A06 = true;
            BgU bgU = new BgU();
            bgU.A01(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(A00(this.A0D, 1)));
            bgU.A01(CaptureRequest.FLASH_MODE, BV4.A0V());
            C2592Beo.A00(bgU, c2645Bgc);
            A07(Collections.singletonList(c2645Bgc.A01()));
        }
        A04();
    }

    public final void A09(final boolean z) {
        C2773Bkp c2773BkpA00;
        AbstractC2875Bni.A01("Camera2CameraControlImp", FGI.A0r("setActive: isActive = ", z));
        BjA bjA = this.A09;
        if (z != bjA.A0J) {
            bjA.A0J = z;
            if (!bjA.A0J) {
                BjA.A01(bjA);
            }
        }
        BjF bjF = this.A0C;
        if (bjF.A00 != z) {
            bjF.A00 = z;
            if (!z) {
                C2750Bjr c2750Bjr = bjF.A04;
                synchronized (c2750Bjr) {
                    c2750Bjr.A00(1.0f);
                    c2773BkpA00 = AbstractC2772Bko.A00(c2750Bjr);
                }
                BjF.A02(bjF, c2773BkpA00);
                bjF.A03.resetZoom();
                bjF.A02.A04();
            }
        }
        BjH bjH = this.A0A;
        if (bjH.A01 != z) {
            bjH.A01 = z;
            if (!z) {
                if (bjH.A02) {
                    bjH.A02 = false;
                    bjH.A03.A08(false);
                    C2934BpC<Integer> c2934BpC = bjH.A04;
                    if (AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread())) {
                        c2934BpC.A0A(0);
                    } else {
                        c2934BpC.A09(0);
                    }
                }
                C3010Brs<Void> c3010Brs = bjH.A00;
                if (c3010Brs != null) {
                    C3010Brs.A01(c3010Brs, "Camera is not active.");
                    bjH.A00 = null;
                }
            }
        }
        BkF bkF = this.A08;
        if (z != bkF.A00) {
            bkF.A00 = z;
            if (!z) {
                synchronized (bkF.A01.A00) {
                }
            }
        }
        final BjR bjR = this.A0G;
        bjR.A05.execute(new Runnable() { // from class: X.Bjl
            public static final String __redex_internal_original_name = "Camera2CameraControl$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                BjR bjR2 = bjR;
                boolean z2 = z;
                if (bjR2.A02 != z2) {
                    bjR2.A02 = z2;
                    if (z2) {
                        if (bjR2.A03) {
                            BjR.A00(bjR2);
                        }
                    } else {
                        CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                        C3010Brs<Void> c3010Brs2 = bjR2.A01;
                        if (c3010Brs2 != null) {
                            c3010Brs2.A04(cameraControl$OperationCanceledException);
                            bjR2.A01 = null;
                        }
                    }
                }
            }
        });
        if (z) {
            return;
        }
        this.A03 = null;
        this.A0B.A01.set(0);
        AbstractC2875Bni.A01("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    @Override // X.BfV
    public final void A3c(InterfaceC2585Beh interfaceC2585Beh) {
        BjR bjR = this.A0G;
        C2592Beo c2592Beo = new C2592Beo(InterfaceC2585Beh.A00(interfaceC2585Beh));
        synchronized (bjR.A04) {
            bjR.A00.A02(BY1.OPTIONAL, c2592Beo);
        }
        ExecutorC2446BbZ.A03(AbstractC2942BpW.A01(AbstractC2947Bpi.A01(bjR, 12)), new Runnable() { // from class: X.BlH
            public static final String __redex_internal_original_name = "Camera2CameraControlImpl$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // X.BfV
    public final void A43(BgX bgX) {
        HashMap mapA0u;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap2;
        BjK bjK = (BjK) this.A02;
        BnB bnB = bjK.A09;
        while (!bnB.isEmpty()) {
            bnB.A8p().close();
        }
        BjC bjC = bjK.A03;
        if (bjC != null) {
            final C2863BnN c2863BnN = bjK.A01;
            if (c2863BnN != null) {
                AbstractC2942BpW.A01(bjC.A08).addListener(new Runnable() { // from class: X.Bl5
                    public static final String __redex_internal_original_name = "ZslControlImpl$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        c2863BnN.A01();
                    }
                }, BoS.A00());
                bjK.A01 = null;
            }
            bjC.A02();
            bjK.A03 = null;
        }
        ImageWriter imageWriter = bjK.A00;
        if (imageWriter != null) {
            imageWriter.close();
            bjK.A00 = null;
        }
        if (!bjK.A06 && !bjK.A07) {
            C2476Bc3 c2476Bc3 = bjK.A08;
            try {
                streamConfigurationMap2 = (StreamConfigurationMap) c2476Bc3.A02(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            } catch (AssertionError e) {
                AbstractC2875Bni.A02("ZslControlImpl", BV5.A0n("Failed to retrieve StreamConfigurationMap, error = ", e));
            }
            if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
                mapA0u = BV4.A0u();
            } else {
                mapA0u = BV4.A0u();
                for (int i : streamConfigurationMap2.getInputFormats()) {
                    Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                    if (inputSizes != null) {
                        C2482Bc9 c2482Bc9 = new C2482Bc9();
                        c2482Bc9.A00 = true;
                        Arrays.sort(inputSizes, c2482Bc9);
                        mapA0u.put(Integer.valueOf(i), inputSizes[0]);
                    }
                }
            }
            if (bjK.A04 && !mapA0u.isEmpty() && mapA0u.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) c2476Bc3.A02(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                for (int i2 : validOutputFormatsForInput) {
                    if (i2 == 256) {
                        Size size = (Size) mapA0u.get(34);
                        BnQ bnQ = new BnQ(size.getWidth(), size.getHeight(), 34, 9);
                        bjK.A02 = bnQ.A02;
                        bjK.A01 = new C2863BnN(bnQ);
                        bnQ.Adw(new F4O(bjK, 0), BpJ.A00());
                        boolean z = BjC.A0D;
                        BhY bhY = new BhY(BV6.A0P(bjK.A01.getWidth(), bjK.A01.getHeight()), bjK.A01.getSurface(), 34);
                        bjK.A03 = bhY;
                        final C2863BnN c2863BnN2 = bjK.A01;
                        ListenableFuture listenableFutureA01 = AbstractC2942BpW.A01(bhY.A08);
                        c2863BnN2.getClass();
                        listenableFutureA01.addListener(new Runnable() { // from class: X.Bl5
                            public static final String __redex_internal_original_name = "ZslControlImpl$$ExternalSyntheticLambda0";

                            @Override // java.lang.Runnable
                            public final void run() {
                                c2863BnN2.A01();
                            }
                        }, BoS.A00());
                        bgX.A03(C2507Bcd.A07, bjK.A03, -1);
                        BeX beX = bjK.A02;
                        BV7.A1E(beX, bgX.A04.A04);
                        List<BeX> list = bgX.A07;
                        if (!list.contains(beX)) {
                            list.add(beX);
                        }
                        BV7.A1E(new C2752Bjt(bjK), bgX.A06);
                        bgX.A01 = new InputConfiguration(bjK.A01.getWidth(), bjK.A01.getHeight(), bjK.A01.AGJ());
                        return;
                    }
                }
            }
        }
        bgX.A04.A00 = 1;
    }

    @Override // X.BfV
    public final void A6J() {
        BjR bjR = this.A0G;
        synchronized (bjR.A04) {
            bjR.A00 = new BgU();
        }
        ExecutorC2446BbZ.A03(AbstractC2942BpW.A01(AbstractC2947Bpi.A01(bjR, 13)), new Runnable() { // from class: X.BlG
            public static final String __redex_internal_original_name = "Camera2CameraControlImpl$$ExternalSyntheticLambda10";

            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // X.BfV
    public final void A8h() {
        final C2761BkO c2761BkO = this.A0B;
        c2761BkO.A00.execute(new Runnable() { // from class: X.Bjk
            public static final String __redex_internal_original_name = "VideoUsageControl$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                int iDecrementAndGet = c2761BkO.A01.decrementAndGet();
                if (iDecrementAndGet < 0) {
                    AbstractC2875Bni.A03("VideoUsageControl", FGI.A0I("decrementUsage: mVideoUsage = ", iDecrementAndGet, ", which is less than 0!"));
                } else {
                    AbstractC2875Bni.A01("VideoUsageControl", FGI.A0H("decrementUsage: mVideoUsage = ", iDecrementAndGet));
                }
            }
        });
    }

    @Override // X.BfV
    public final InterfaceC2585Beh AGf() {
        BgY bgY;
        BjR bjR = this.A0G;
        synchronized (bjR.A04) {
            bgY = new BgY(C2584Beg.A02(bjR.A00.A00));
        }
        return bgY;
    }

    @Override // X.BfV
    public final Rect AKM() {
        Object objA02 = this.A0D.A02(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && objA02 == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        objA02.getClass();
        return (Rect) objA02;
    }

    @Override // X.BfV
    public final void ANU() {
        final C2761BkO c2761BkO = this.A0B;
        c2761BkO.A00.execute(new Runnable() { // from class: X.Bjs
            public static final String __redex_internal_original_name = "VideoUsageControl$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2875Bni.A01("VideoUsageControl", FGI.A0H("incrementUsage: mVideoUsage = ", c2761BkO.A01.incrementAndGet()));
            }
        });
    }

    public static boolean A02(TotalCaptureResult totalCaptureResult, long j) {
        Number number;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof BhZ) && (number = (Number) ((BhZ) tag).A00.get("CameraControlSessionUpdateId")) != null && number.longValue() >= j;
    }

    @Override // X.BfV
    public final ListenableFuture<Bg2> ADE(final int i, final int i2) {
        if (!A01()) {
            AbstractC2875Bni.A03("Camera2CameraControlImp", "Camera is not active.");
            return new C2938BpP(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int i3 = this.A0M;
        return Bpe.A01(new InterfaceC2939BpT() { // from class: X.Bjq
            @Override // X.InterfaceC2939BpT
            public final ListenableFuture A4O(Object obj) {
                Bj5 bj5 = this.A03;
                int i4 = i;
                int i5 = i3;
                int i6 = i2;
                C2762BkQ c2762BkQ = bj5.A07;
                return new BpQ(new BkW(C2762BkQ.A00(c2762BkQ, i4, i5, i6), c2762BkQ.A02, i5));
            }
        }, C2945Bpd.A00(AbstractC2942BpW.A01(this.A0O)), this.A0I);
    }

    @Override // X.BfV
    public final void AdR(int i) {
        if (!A01()) {
            AbstractC2875Bni.A03("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.A0M = i;
        AbstractC2875Bni.A01("Camera2CameraControlImp", FGI.A0H("setFlashMode: mFlashMode = ", this.A0M));
        InterfaceC2804Blh interfaceC2804Blh = this.A02;
        boolean z = true;
        if (this.A0M != 1 && this.A0M != 0) {
            z = false;
        }
        ((BjK) interfaceC2804Blh).A05 = z;
        this.A0O = AbstractC2942BpW.A01(AbstractC2947Bpi.A01(this, 0));
    }

    @Override // X.BfV
    public final void AeZ(InterfaceC2787BlA interfaceC2787BlA) {
        this.A03 = interfaceC2787BlA;
    }

    @Override // X.InterfaceC2622Bfo
    public final ListenableFuture<Void> AfI(float f) {
        ListenableFuture c2938BpP;
        C2773Bkp c2773BkpA00;
        if (!A01()) {
            return new C2938BpP(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        BjF bjF = this.A0C;
        C2750Bjr c2750Bjr = bjF.A04;
        synchronized (c2750Bjr) {
            try {
                c2750Bjr.A00(f);
                c2773BkpA00 = AbstractC2772Bko.A00(c2750Bjr);
            } catch (IllegalArgumentException e) {
                c2938BpP = new C2938BpP(e);
            }
        }
        BjF.A02(bjF, c2773BkpA00);
        c2938BpP = AbstractC2947Bpi.A02(c2773BkpA00, bjF, 3);
        return AbstractC2942BpW.A01(c2938BpP);
    }

    @Override // X.InterfaceC2622Bfo
    public final ListenableFuture<C2675BhP> Ag2(BkB bkB) {
        return !A01() ? new C2938BpP(new CameraControl$OperationCanceledException("Camera is not active.")) : AbstractC2942BpW.A01(AbstractC2947Bpi.A02(bkB, this.A09, 2));
    }
}
