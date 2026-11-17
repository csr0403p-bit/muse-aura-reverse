package X;

import android.media.MediaCodec;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class F58 implements BpZ {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F58(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.BpZ
    public final void onFailure(Throwable th) {
        Object obj;
        Bm5 bm5;
        switch (this.$t) {
            case 1:
                if (th instanceof DeferrableSurface$SurfaceClosedException) {
                    Bj4 bj4 = (Bj4) this.A00;
                    BjC bjC = ((DeferrableSurface$SurfaceClosedException) th).mDeferrableSurface;
                    for (final C2643Bga c2643Bga : bj4.A0M.A01()) {
                        if (c2643Bga.A01().contains(bjC)) {
                            ScheduledExecutorService scheduledExecutorServiceA00 = BoS.A00();
                            final InterfaceC2641BgM interfaceC2641BgM = c2643Bga.A03;
                            if (interfaceC2641BgM != null) {
                                Bj4.A09(bj4, "Posting surface closed", new Throwable());
                                scheduledExecutorServiceA00.execute(new Runnable() { // from class: X.Bgm
                                    public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda11";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        interfaceC2641BgM.AT5(c2643Bga, C79.A00);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                boolean z = th instanceof CancellationException;
                Bj4 bj42 = (Bj4) this.A00;
                if (z) {
                    Bj4.A09(bj42, "Unable to configure camera cancelled", null);
                    return;
                }
                Integer num = bj42.A0a;
                Integer num2 = C79.A0Z;
                if (num == num2) {
                    bj42.A0G(new C2579BeD(4, th), num2);
                }
                AbstractC2875Bni.A05("Camera2CameraImpl", AnonymousClass007.A0a("Unable to configure camera ", bj42), th);
                if (bj42.A03 == this.A01) {
                    bj42.A0E();
                    return;
                }
                return;
            case 2:
                ((InterfaceC2873Bng) this.A01).close();
                return;
            case 3:
                ((AbstractC2867Bna) this.A01).close();
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
                BoT.A00();
                Object obj2 = this.A01;
                Bi6 bi6 = (Bi6) this.A00;
                Bi7 bi7 = bi6.A04;
                if (obj2 == bi7) {
                    AbstractC2875Bni.A03("CaptureNode", FGI.A0H("request aborted, id=", bi7.A02));
                    C2862BnM c2862BnM = bi6.A02;
                    if (c2862BnM != null) {
                        c2862BnM.A00 = null;
                    }
                    bi6.A04 = null;
                    return;
                }
                return;
            case 6:
                BiP biP = (BiP) this.A01;
                if (((Bi2) biP.A00).A03) {
                    return;
                }
                Object obj3 = ((C2646Bgd) C8j4.A0p(biP.A01)).A03.A00.get("CAPTURE_CONFIG_ID_KEY");
                int iA0F = obj3 == null ? -1 : AnonymousClass001.A0F(obj3);
                boolean z2 = th instanceof ImageCaptureException;
                Bi1 bi1 = (Bi1) this.A00;
                Bi5 bi5 = bi1.A00;
                Bi9 bi9 = new Bi9(z2 ? (ImageCaptureException) th : new ImageCaptureException(2, "Failed to submit capture request", th), iA0F);
                BoT.A00();
                ((Bi4) bi5.A00).A04.accept(bi9);
                bi1.A03.Ahf();
                return;
            case 7:
                obj = this.A00;
                break;
            case 8:
                int i = ((BfK) this.A01).A07;
                if (i == 2 && (th instanceof CancellationException)) {
                    AbstractC2875Bni.A01("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                ArrayList arrayListA0h = C3cG.A0h();
                if ((i & 4) != 0) {
                    arrayListA0h.add("IMAGE_CAPTURE");
                }
                if ((i & 1) != 0) {
                    arrayListA0h.add("PREVIEW");
                }
                if ((i & 2) != 0) {
                    arrayListA0h.add("VIDEO_CAPTURE");
                }
                StringBuilder sbA0w = C60O.A0w();
                Iterator it = arrayListA0h.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sbA0w.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sbA0w.append((CharSequence) "|");
                        }
                    }
                }
                AbstractC2875Bni.A06("SurfaceProcessorNode", FGI.A0M("Downstream node failed to provide Surface. Target: ", sbA0w.toString()), th);
                return;
            case 10:
                C7384Etj.A0Y(th, 0);
                obj = this.A01;
                break;
            case 11:
                AbstractC2875Bni.A01("Recorder", AnonymousClass007.A0a("Error in ReadyToReleaseFuture: ", th));
                return;
            case 12:
                AbstractC2875Bni.A06("Recorder", AnonymousClass007.A0a("VideoEncoder Setup error: ", th), th);
                BmH bmH = (BmH) this.A00;
                int i2 = bmH.A00;
                if (i2 < bmH.A03) {
                    bmH.A00 = i2 + 1;
                    bmH.A01 = BoS.A00().schedule(new RunnableC2833Bmc(bmH.A06.A0j, new Runnable() { // from class: X.BmD
                        public static final String __redex_internal_original_name = "Recorder$SetupVideoTask$1$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            BmH bmH2 = (BmH) this.A00.A00;
                            if (bmH2.A02) {
                                return;
                            }
                            AbstractC2875Bni.A01("Recorder", FGI.A0H("Retry setupVideo #", bmH2.A00));
                            BmM bmM = bmH2.A04;
                            BWz bWz = bmH2.A05;
                            C2823Bm4 c2823Bm4 = bmH2.A06;
                            C2823Bm4.A02(c2823Bm4).addListener(new Bm6(bmM, bWz, bmH2), c2823Bm4.A0j);
                        }
                    }), 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
                C2823Bm4 c2823Bm4 = bmH.A06;
                synchronized (c2823Bm4.A0g) {
                    BmF bmF = c2823Bm4.A0M;
                    bm5 = null;
                    switch (bmF) {
                        case CONFIGURING:
                            C2823Bm4.A0F(c2823Bm4, -1);
                            C2823Bm4.A0D(BmF.ERROR, c2823Bm4);
                            break;
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            Bm5 bm52 = c2823Bm4.A0K;
                            c2823Bm4.A0K = null;
                            bm5 = bm52;
                            C2823Bm4.A0F(c2823Bm4, -1);
                            C2823Bm4.A0D(BmF.ERROR, c2823Bm4);
                            break;
                        case IDLING:
                        case RECORDING:
                        case PAUSED:
                        case STOPPING:
                        case RESETTING:
                            throw BV4.A0N(AnonymousClass006.A0y(th, ": ", C3cG.A0f(bmF, "Encountered encoder setup error while in unexpected state ")));
                    }
                }
                if (bm5 != null) {
                    C2823Bm4.A0B(bm5, th, 7);
                    return;
                }
                return;
            case 13:
                Bo1 bo1 = ((C2892Bo4) this.A00).A0A;
                bo1.A0P.remove(this.A01);
                if (th instanceof MediaCodec.CodecException) {
                    bo1.A06((MediaCodec.CodecException) th);
                    return;
                } else {
                    bo1.A05(0, th.getMessage(), th);
                    return;
                }
            case 14:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
        ((C3010Brs) obj).A04(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131 A[Catch: all -> 0x01dd, TryCatch #1 {, blocks: (B:50:0x00f3, B:51:0x00fa, B:71:0x0141, B:53:0x00fe, B:59:0x011e, B:54:0x0107, B:55:0x010e, B:56:0x0114, B:58:0x0118, B:62:0x0122, B:68:0x0131, B:70:0x0137, B:73:0x0143, B:65:0x0128), top: B:108:0x00f3 }] */
    @Override // X.BpZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(I r8) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F58.onSuccess(java.lang.Object):void");
    }
}
