package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Bik, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2714Bik implements InterfaceC2732BjW {
    public BlQ A00;
    public BlJ A01;
    public C2643Bga A02;
    public C3010Brs<Void> A03;
    public ListenableFuture<Void> A04;
    public Integer A05;
    public final C2503BcZ A09;
    public final C2716Bim A0A;
    public final C2404BaI A0C;
    public final Object A0E = C3cG.A0T();
    public final List<C2646Bgd> A0F = C3cG.A0h();
    public final Map<BjC, Surface> A0G = BV4.A0u();
    public List<BjC> A06 = Collections.EMPTY_LIST;
    public Map<BjC, Long> A07 = BV4.A0u();
    public final C2402BaG A0B = new C2402BaG();
    public final C2403BaH A0D = new C2403BaH();
    public final C2719Bip A08 = new C2719Bip(this);

    public static void A00(C2714Bik c2714Bik, Integer num) {
        BeS.A03(c2714Bik.A00, FGI.A0M("The Opener shouldn't null in state:", AbstractC2818Blv.A00(num)));
        c2714Bik.A00.AgR();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0267 A[Catch: all -> 0x027c, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0009, B:12:0x001a, B:79:0x027a, B:13:0x002e, B:14:0x0036, B:16:0x003e, B:17:0x0052, B:18:0x009d, B:20:0x00a3, B:23:0x00c5, B:25:0x00d9, B:26:0x00dc, B:28:0x00e4, B:29:0x00f5, B:31:0x00fb, B:34:0x0118, B:36:0x011e, B:38:0x0126, B:40:0x012e, B:42:0x013a, B:43:0x013e, B:45:0x0149, B:46:0x0156, B:33:0x0114, B:47:0x015d, B:48:0x0169, B:50:0x016f, B:52:0x0189, B:53:0x019a, B:55:0x01b3, B:57:0x01b7, B:58:0x01ca, B:60:0x01d4, B:62:0x01f4, B:63:0x01fd, B:64:0x0205, B:74:0x0264, B:78:0x0275, B:77:0x0267, B:65:0x0206, B:66:0x0214, B:68:0x021a, B:69:0x023c, B:70:0x0260), top: B:86:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture A01(final android.hardware.camera2.CameraDevice r24, X.C2643Bga r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2714Bik.A01(android.hardware.camera2.CameraDevice, X.Bga, java.util.List):com.google.common.util.concurrent.ListenableFuture");
    }

    public final void A02() {
        Integer num = this.A05;
        Integer num2 = C79.A0Y;
        if (num == num2) {
            AbstractC2875Bni.A01("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.A05 = num2;
        this.A01 = null;
        C3010Brs<Void> c3010Brs = this.A03;
        if (c3010Brs != null) {
            c3010Brs.A03(null);
            this.A03 = null;
        }
    }

    public final void A03(C2643Bga c2643Bga) {
        CameraCaptureSession.CaptureCallback c2707Bid;
        synchronized (this.A0E) {
            if (c2643Bga == null) {
                AbstractC2875Bni.A01("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
            } else {
                if (this.A05 == C79.A0P) {
                    C2646Bgd c2646Bgd = c2643Bga.A02;
                    if (Collections.unmodifiableList(c2646Bgd.A05).isEmpty()) {
                        AbstractC2875Bni.A01("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                        try {
                            BeS.A00((C2715Bil) this.A01).stopRepeating();
                        } catch (CameraAccessException e) {
                            AbstractC2875Bni.A02("CaptureSession", BV5.A0n("Unable to access camera: ", e));
                            Thread.dumpStack();
                        }
                    } else {
                        try {
                            AbstractC2875Bni.A01("CaptureSession", "Issuing request for session.");
                            CaptureRequest captureRequestA00 = AbstractC2648Bgf.A00(C2715Bil.A00(this.A01).getDevice(), this.A0C, c2646Bgd, this.A0G, true);
                            if (captureRequestA00 == null) {
                                AbstractC2875Bni.A01("CaptureSession", "Skipping issuing empty request for session.");
                            } else {
                                C2716Bim c2716Bim = this.A0A;
                                List<BeX> list = c2646Bgd.A04;
                                CameraCaptureSession.CaptureCallback[] captureCallbackArr = new CameraCaptureSession.CaptureCallback[0];
                                ArrayList arrayListA0t = C60Q.A0t(list);
                                for (BeX beX : list) {
                                    if (beX == null) {
                                        c2707Bid = null;
                                    } else {
                                        ArrayList arrayListA0h = C3cG.A0h();
                                        AbstractC2658Bgq.A00(beX, arrayListA0h);
                                        c2707Bid = arrayListA0h.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayListA0h.get(0) : new C2707Bid(arrayListA0h);
                                    }
                                    arrayListA0t.add(c2707Bid);
                                }
                                Collections.addAll(arrayListA0t, captureCallbackArr);
                                CameraCaptureSession.CaptureCallback captureCallbackA00 = c2716Bim.A00(new C2707Bid(arrayListA0t));
                                C2715Bil c2715Bil = (C2715Bil) this.A01;
                                CameraCaptureSession.CaptureCallback captureCallbackA002 = c2715Bil.A0F.A00(captureCallbackA00);
                                BeS.A03(c2715Bil.A01, "Need to call openCaptureSession before using this API.");
                                ((Bl1) c2715Bil.A01.A00).A00.setSingleRepeatingRequest(captureRequestA00, c2715Bil.A0J, captureCallbackA002);
                            }
                        } catch (CameraAccessException e2) {
                            AbstractC2875Bni.A02("CaptureSession", BV5.A0n("Unable to access camera: ", e2));
                            Thread.dumpStack();
                        }
                    }
                }
                AbstractC2875Bni.A01("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    @Override // X.InterfaceC2732BjW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AOV() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0E
            monitor-enter(r3)
            java.lang.Integer r2 = r4.A05     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r0 = X.C79.A0P     // Catch: java.lang.Throwable -> L11
            if (r2 == r0) goto Le
            java.lang.Integer r1 = X.C79.A0K     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r2 != r1) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2714Bik.AOV():boolean");
    }

    @Override // X.InterfaceC2732BjW
    public final void API(List<C2646Bgd> list) {
        synchronized (this.A0E) {
            Integer num = this.A05;
            switch (num.intValue()) {
                case 0:
                    throw BV5.A0U("issueCaptureRequests() should not be possible in state: ", AbstractC2818Blv.A00(num));
                case 1:
                case 2:
                case 3:
                    this.A0F.addAll(list);
                    break;
                case 4:
                    this.A0F.addAll(list);
                    ExecutorC2446BbZ.A03(this.A0A.A01(), new RunnableC2713Bij(this));
                    break;
                default:
                    throw C3cG.A0Q("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Bga;Landroid/hardware/camera2/CameraDevice;LX/BlQ;)Lcom/google/common/util/concurrent/ListenableFuture<Ljava/lang/Void;>; */
    @Override // X.InterfaceC2732BjW
    public final ListenableFuture AXV(final CameraDevice cameraDevice, BlQ blQ, final C2643Bga c2643Bga) {
        ListenableFuture listenableFutureA01;
        ListenableFuture listenableFutureA012;
        synchronized (this.A0E) {
            Integer num = this.A05;
            if (num.intValue() != 1) {
                AbstractC2875Bni.A02("CaptureSession", FGI.A0M("Open not allowed in state: ", AbstractC2818Blv.A00(num)));
                listenableFutureA012 = new C2938BpP(BV5.A0U("open() should not allow the state: ", AbstractC2818Blv.A00(this.A05)));
            } else {
                this.A05 = C79.A0C;
                ArrayList arrayListA0t = BV4.A0t(c2643Bga.A01());
                this.A06 = arrayListA0t;
                this.A00 = blQ;
                C2715Bil c2715Bil = (C2715Bil) blQ;
                synchronized (c2715Bil.A0I) {
                    c2715Bil.A06 = arrayListA0t;
                    synchronized (c2715Bil.A0H) {
                        if (c2715Bil.A09) {
                            listenableFutureA01 = new C2938BpP(new CancellationException("Opener is disabled"));
                        } else {
                            Executor executor = c2715Bil.A0J;
                            ScheduledExecutorService scheduledExecutorService = c2715Bil.A0K;
                            ArrayList arrayListA0h = C3cG.A0h();
                            Iterator it = arrayListA0t.iterator();
                            while (it.hasNext()) {
                                arrayListA0h.add(AbstractC2942BpW.A01(((BjC) it.next()).A01()));
                            }
                            Bpe bpeA01 = Bpe.A01(new F4N(2, c2715Bil, arrayListA0t), C2945Bpd.A00(AbstractC2947Bpi.A03(executor, AbstractC2947Bpi.A00(new EE2(new Bpa(BV4.A0t(arrayListA0h), ExecutorC2446BbZ.A00(), false), scheduledExecutorService, 0, 5000L)), arrayListA0t, 0)), executor);
                            c2715Bil.A05 = bpeA01;
                            listenableFutureA01 = AbstractC2942BpW.A01(bpeA01);
                        }
                    }
                }
                Bpe bpeA012 = Bpe.A01(new InterfaceC2939BpT() { // from class: X.Bk4
                    @Override // X.InterfaceC2939BpT
                    public final ListenableFuture A4O(Object obj) {
                        return this.A01(cameraDevice, c2643Bga, (List) obj);
                    }
                }, C2945Bpd.A00(listenableFutureA01), ((C2715Bil) this.A00).A0J);
                AbstractC2942BpW.A03(new F56(this, 0), bpeA012, ((C2715Bil) this.A00).A0J);
                listenableFutureA012 = AbstractC2942BpW.A01(bpeA012);
            }
        }
        return listenableFutureA012;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:5:0x000d, B:6:0x0010, B:8:0x0012, B:9:0x0015, B:10:0x001a, B:13:0x0020, B:16:0x0032, B:15:0x002b, B:17:0x0037, B:19:0x0057, B:22:0x005e, B:23:0x0066, B:24:0x0067, B:26:0x006b, B:27:0x0073), top: B:32:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:4:0x0007, B:5:0x000d, B:6:0x0010, B:8:0x0012, B:9:0x0015, B:10:0x001a, B:13:0x0020, B:16:0x0032, B:15:0x002b, B:17:0x0037, B:19:0x0057, B:22:0x005e, B:23:0x0066, B:24:0x0067, B:26:0x006b, B:27:0x0073), top: B:32:0x0007, inners: #1 }] */
    @Override // X.InterfaceC2732BjW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> Aa7(boolean r6) {
        /*
            r5 = this;
            java.lang.String r4 = "The Opener shouldn't null in state:"
            java.lang.String r3 = "release() should not be possible in state: "
            java.lang.Object r2 = r5.A0E
            monitor-enter(r2)
            java.lang.Integer r1 = r5.A05     // Catch: java.lang.Throwable -> L75
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L75
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto L37;
                case 4: goto L1a;
                case 5: goto L1a;
                case 6: goto L67;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L75
        L10:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            goto L5b
        L12:
            A00(r5, r1)     // Catch: java.lang.Throwable -> L75
        L15:
            java.lang.Integer r0 = X.C79.A0Y     // Catch: java.lang.Throwable -> L75
            r5.A05 = r0     // Catch: java.lang.Throwable -> L75
            goto L10
        L1a:
            X.BlJ r0 = r5.A01     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L37
            if (r6 == 0) goto L32
            X.Bil r0 = (X.C2715Bil) r0     // Catch: android.hardware.camera2.CameraAccessException -> L2a java.lang.Throwable -> L75
            android.hardware.camera2.CameraCaptureSession r0 = X.BeS.A00(r0)     // Catch: android.hardware.camera2.CameraAccessException -> L2a java.lang.Throwable -> L75
            r0.abortCaptures()     // Catch: android.hardware.camera2.CameraAccessException -> L2a java.lang.Throwable -> L75
            goto L32
        L2a:
            r3 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r0 = "Unable to abort captures."
            X.AbstractC2875Bni.A05(r1, r0, r3)     // Catch: java.lang.Throwable -> L75
        L32:
            X.BlJ r0 = r5.A01     // Catch: java.lang.Throwable -> L75
            r0.close()     // Catch: java.lang.Throwable -> L75
        L37:
            java.lang.Integer r0 = X.C79.A0W     // Catch: java.lang.Throwable -> L75
            r5.A05 = r0     // Catch: java.lang.Throwable -> L75
            X.Bim r0 = r5.A0A     // Catch: java.lang.Throwable -> L75
            r0.A02()     // Catch: java.lang.Throwable -> L75
            X.BlQ r1 = r5.A00     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r0 = r5.A05     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = X.AbstractC2818Blv.A00(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = X.FGI.A0M(r4, r0)     // Catch: java.lang.Throwable -> L75
            X.BeS.A03(r1, r0)     // Catch: java.lang.Throwable -> L75
            X.BlQ r0 = r5.A00     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.AgR()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L67
            r5.A02()     // Catch: java.lang.Throwable -> L75
            goto L10
        L5b:
            X.BpO<java.lang.Object> r0 = X.BpQ.A01
            return r0
        L5e:
            java.lang.String r0 = X.AbstractC2818Blv.A00(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.IllegalStateException r0 = X.BV5.A0U(r3, r0)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L67:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r5.A04     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L73
            r0 = 9
            X.Brr r0 = X.AbstractC2947Bpi.A01(r5, r0)     // Catch: java.lang.Throwable -> L75
            r5.A04 = r0     // Catch: java.lang.Throwable -> L75
        L73:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            return r0
        L75:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2714Bik.Aa7(boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // X.InterfaceC2732BjW
    public final void close() {
        synchronized (this.A0E) {
            Integer num = this.A05;
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                throw BV5.A0U("close() should not be possible in state: ", AbstractC2818Blv.A00(num));
            }
            if (iIntValue == 1) {
                this.A05 = C79.A0Y;
            } else if (iIntValue == 2) {
                A00(this, num);
                this.A05 = C79.A0Y;
            } else if (iIntValue == 3 || iIntValue == 4) {
                A00(this, num);
                this.A05 = C79.A0T;
                this.A0A.A02();
                this.A02 = null;
            }
        }
    }

    public C2714Bik(C2503BcZ c2503BcZ, C2511Bch c2511Bch) {
        this.A05 = C79.A00;
        this.A05 = C79.A01;
        this.A09 = c2503BcZ;
        this.A0A = new C2716Bim(c2511Bch.A03(CaptureNoResponseQuirk.class));
        this.A0C = new C2404BaI(c2511Bch);
    }

    @Override // X.InterfaceC2732BjW
    public final void Aed(C2643Bga c2643Bga) {
        synchronized (this.A0E) {
            Integer num = this.A05;
            switch (num.intValue()) {
                case 0:
                    throw BV5.A0U("setSessionConfig() should not be possible in state: ", AbstractC2818Blv.A00(num));
                case 1:
                case 2:
                case 3:
                    this.A02 = c2643Bga;
                    break;
                case 4:
                    this.A02 = c2643Bga;
                    if (c2643Bga != null) {
                        if (!this.A0G.keySet().containsAll(c2643Bga.A01())) {
                            AbstractC2875Bni.A02("CaptureSession", "Does not have the proper configured lists");
                            break;
                        } else {
                            AbstractC2875Bni.A01("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            A03(this.A02);
                            break;
                        }
                    }
                    break;
                default:
                    throw C3cG.A0Q("Session configuration cannot be set on a closed/released session.");
            }
        }
    }
}
