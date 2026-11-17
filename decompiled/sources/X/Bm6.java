package X;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes5.dex */
public final /* synthetic */ class Bm6 implements Runnable {
    public static final String __redex_internal_original_name = "Recorder$SetupVideoTask$$ExternalSyntheticLambda0";
    public final /* synthetic */ BmM A00;
    public final /* synthetic */ BWz A01;
    public final /* synthetic */ BmH A02;

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        ListenableFuture listenableFutureA01;
        BmH bmH = this.A02;
        final BmM bmM = this.A00;
        final BWz bWz = this.A01;
        ListenableFuture<Surface> listenableFuture = bmM.A0A;
        if (!listenableFuture.isDone()) {
            C2823Bm4 c2823Bm4 = bmH.A06;
            Bm7 bm7 = c2823Bm4.A0N;
            int iIntValue = bm7.A08.intValue();
            if (iIntValue == 0 || ((iIntValue != 1 && (iIntValue == 2 || iIntValue != 3)) || bm7.A01 != bmM)) {
                InterfaceC2695Bhv interfaceC2695Bhv = c2823Bm4.A0f;
                Executor executor = c2823Bm4.A0j;
                final Bm7 bm72 = new Bm7(interfaceC2695Bhv, executor, c2823Bm4.A0i);
                try {
                    final BdC bdC = c2823Bm4.A0d.ABL().get();
                    final AbstractC2527Bcy abstractC2527Bcy = c2823Bm4.A0P;
                    Integer num = bm72.A08;
                    if (num.intValue() != 0) {
                        listenableFutureA01 = new C2938BpP(BV5.A0U("configure() shouldn't be called in ", AbstractC2829BmW.A00(num)));
                    } else {
                        bm72.A08 = C79.A01;
                        bm72.A01 = bmM;
                        AbstractC2875Bni.A01("VideoEncoderSession", AnonymousClass007.A0a("Create VideoEncoderSession: ", bm72));
                        bm72.A07 = AbstractC2947Bpi.A01(bm72, 25);
                        bm72.A06 = AbstractC2947Bpi.A01(bm72, 26);
                        C3009Brr c3009BrrA00 = AbstractC2947Bpi.A00(new InterfaceC2940BpU() { // from class: X.Bm9
                            @Override // X.InterfaceC2940BpU
                            public final Object A4r(final C3010Brs c3010Brs) {
                                Surface surface;
                                final Bm7 bm73 = bm72;
                                final BmM bmM2 = bmM;
                                BWz bWz2 = bWz;
                                AbstractC2527Bcy abstractC2527Bcy2 = abstractC2527Bcy;
                                BdC bdC2 = bdC;
                                C2507Bcd c2507Bcd = bmM2.A05;
                                Bd5 bd5A01 = Bd2.A01(c2507Bcd, bdC2, abstractC2527Bcy2);
                                AbstractC2440BbT abstractC2440BbT = ((C2558Bdm) bdC2).A02;
                                Size size = bmM2.A04;
                                Range<Integer> range = bmM2.A03;
                                AbstractC2509Bcf abstractC2509Bcf = bd5A01.A01;
                                try {
                                    Bo1 bo1 = new Bo1((BdF) (abstractC2509Bcf != null ? new Bd3(range, size, c2507Bcd, abstractC2509Bcf, bWz2, abstractC2440BbT, bd5A01.A02) : new Bd4(range, size, c2507Bcd, bWz2, abstractC2440BbT, bd5A01.A02)).get(), bm73.A0A);
                                    bm73.A03 = bo1;
                                    Bn3 bn3 = bo1.A0G;
                                    if (bn3 instanceof InterfaceC2854Bmz) {
                                        Executor executor2 = bm73.A0B;
                                        InterfaceC2846Bmp interfaceC2846Bmp = new InterfaceC2846Bmp() { // from class: X.BmA
                                            @Override // X.InterfaceC2846Bmp
                                            public final void AWW(final Surface surface2) throws ExecutionException, InterruptedException {
                                                Executor executor3;
                                                final Bm7 bm74 = bm73;
                                                C3010Brs c3010Brs2 = c3010Brs;
                                                BmM bmM3 = bmM2;
                                                Integer num2 = bm74.A08;
                                                int iIntValue2 = num2.intValue();
                                                InterfaceC2849Bms interfaceC2849Bms = null;
                                                if (iIntValue2 == 0) {
                                                    AbstractC2875Bni.A04("Not provide surface in ", AbstractC2829BmW.A00(num2), "VideoEncoderSession");
                                                } else if (iIntValue2 != 1) {
                                                    if (iIntValue2 != 2 && iIntValue2 == 3) {
                                                        if (bm74.A02 != null && (executor3 = bm74.A09) != null) {
                                                            executor3.execute(new Runnable() { // from class: X.Bma
                                                                public static final String __redex_internal_original_name = "VideoEncoderSession$$ExternalSyntheticLambda7";

                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    Bm7 bm75 = bm74;
                                                                    bm75.A02.AWW(surface2);
                                                                }
                                                            });
                                                        }
                                                        AbstractC2875Bni.A03("VideoEncoderSession", AnonymousClass007.A0a("Surface is updated in READY state: ", surface2));
                                                        return;
                                                    }
                                                    AbstractC2875Bni.A04("Not provide surface in ", AbstractC2829BmW.A00(num2), "VideoEncoderSession");
                                                } else if (bmM3.A0A.isDone()) {
                                                    AbstractC2875Bni.A01("VideoEncoderSession", FGI.A0U("Not provide surface, ", bmM3.toString(), " is already serviced."));
                                                    c3010Brs2.A03(null);
                                                    Bm7.A00(bm74);
                                                    return;
                                                } else {
                                                    bm74.A00 = surface2;
                                                    AbstractC2875Bni.A00(surface2, "provide surface: ", "VideoEncoderSession");
                                                    bmM3.A01(surface2, new C7576F4p(bm74, 6), bm74.A0B);
                                                    bm74.A08 = C79.A0K;
                                                    interfaceC2849Bms = bm74.A03;
                                                }
                                                c3010Brs2.A03(interfaceC2849Bms);
                                            }
                                        };
                                        C2848Bmr c2848Bmr = (C2848Bmr) ((InterfaceC2854Bmz) bn3);
                                        synchronized (c2848Bmr.A03) {
                                            c2848Bmr.A01 = interfaceC2846Bmp;
                                            c2848Bmr.A02 = executor2;
                                            surface = c2848Bmr.A00;
                                        }
                                        if (surface != null) {
                                            try {
                                                executor2.execute(new RunnableC2847Bmq(surface, interfaceC2846Bmp));
                                            } catch (RejectedExecutionException e) {
                                                AbstractC2875Bni.A05(c2848Bmr.A05.A0L, "Unable to post to the supplied executor.", e);
                                            }
                                        }
                                    } else {
                                        c3010Brs.A04(BV4.A0N("The EncoderInput of video isn't a SurfaceInput."));
                                    }
                                } catch (InvalidConfigException e2) {
                                    AbstractC2875Bni.A05("VideoEncoderSession", "Unable to initialize video encoder.", e2);
                                    c3010Brs.A04(e2);
                                }
                                return AnonymousClass007.A0a("ConfigureVideoEncoderFuture ", bm73);
                            }
                        });
                        AbstractC2942BpW.A03(new F56(bm72, 4), c3009BrrA00, bm72.A0B);
                        listenableFutureA01 = AbstractC2942BpW.A01(c3009BrrA00);
                    }
                    c2823Bm4.A0N = bm72;
                    AbstractC2942BpW.A03(new F58(12, bm72, bmH), listenableFutureA01, executor);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
        StringBuilder sbA0f = C3cG.A0f(bmM, "Ignore the SurfaceRequest ");
        sbA0f.append(" isServiced: ");
        sbA0f.append(listenableFuture.isDone());
        sbA0f.append(" VideoEncoderSession: ");
        sbA0f.append(bmH.A06.A0N);
        AbstractC2875Bni.A03("Recorder", AnonymousClass001.A0v(" has been configured with a persistent in-progress recording.", sbA0f));
    }

    public /* synthetic */ Bm6(BmM bmM, BWz bWz, BmH bmH) {
        this.A02 = bmH;
        this.A00 = bmM;
        this.A01 = bWz;
    }
}
