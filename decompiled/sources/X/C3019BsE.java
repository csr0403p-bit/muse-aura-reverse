package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BsE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3019BsE implements InterfaceC2626Bft, SurfaceTexture.OnFrameAvailableListener {
    public int A00;
    public SurfaceTexture A01;
    public boolean A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final C3020BsF A05;
    public final Map<InterfaceC2969BqO, Surface> A06;
    public final Executor A07;
    public final AtomicBoolean A08;

    public C3019BsE(C2507Bcd c2507Bcd, C2693Bht c2693Bht, C2693Bht c2693Bht2) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        this.A00 = 0;
        this.A02 = false;
        this.A08 = BV4.A12(false);
        this.A06 = C3cG.A0j();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.A04 = handlerThread;
        Handler handlerA0B = BV5.A0B(handlerThread);
        this.A03 = handlerA0B;
        this.A07 = new ScheduledExecutorServiceC2936BpL(handlerA0B);
        this.A05 = new C3020BsF(c2693Bht, c2693Bht2);
        try {
            try {
                AbstractC2947Bpi.A03(c2507Bcd, this, map, 3).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw e;
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public static void A00(C3019BsE c3019BsE) {
        if (c3019BsE.A02 && c3019BsE.A00 == 0) {
            Map<InterfaceC2969BqO, Surface> map = c3019BsE.A06;
            Iterator itA11 = BV5.A11(map);
            while (itA11.hasNext()) {
                ((InterfaceC2969BqO) itA11.next()).close();
            }
            map.clear();
            c3019BsE.A05.A04();
            c3019BsE.A04.quit();
        }
    }

    public static void A01(final C3019BsE c3019BsE, final Runnable runnable, final Runnable runnable2) {
        try {
            c3019BsE.A07.execute(new Runnable() { // from class: X.Bsh
                public static final String __redex_internal_original_name = "DualSurfaceProcessor$$ExternalSyntheticLambda6";

                @Override // java.lang.Runnable
                public final void run() {
                    C3019BsE c3019BsE2 = this.A00;
                    Runnable runnable3 = runnable2;
                    Runnable runnable4 = runnable;
                    if (c3019BsE2.A02) {
                        runnable3.run();
                    } else {
                        runnable4.run();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            AbstractC2875Bni.A06("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // X.BgA
    public final void ATf(final BmM bmM) {
        if (this.A08.get()) {
            bmM.A00();
        } else {
            A01(this, new Runnable() { // from class: X.BsI
                public static final String __redex_internal_original_name = "DualSurfaceProcessor$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() throws ExecutionException, InterruptedException {
                    final C3019BsE c3019BsE = this;
                    BmM bmM2 = bmM;
                    c3019BsE.A00++;
                    C3020BsF c3020BsF = c3019BsE.A05;
                    C3021BsG.A02(c3020BsF);
                    final SurfaceTexture surfaceTexture = new SurfaceTexture(c3020BsF.A00);
                    Size size = bmM2.A04;
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    final Surface surface = new Surface(surfaceTexture);
                    bmM2.A01(surface, new BeM() { // from class: X.BsY
                        @Override // X.BeM
                        public final void accept(Object obj) {
                            C3019BsE c3019BsE2 = c3019BsE;
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            Surface surface2 = surface;
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            surfaceTexture2.release();
                            surface2.release();
                            c3019BsE2.A00--;
                            C3019BsE.A00(c3019BsE2);
                        }
                    }, c3019BsE.A07);
                    c3019BsE.A01 = surfaceTexture;
                }
            }, new RunnableC3043Bsi(bmM));
        }
    }

    @Override // X.BgA
    public final void AUS(final InterfaceC2969BqO interfaceC2969BqO) {
        if (this.A08.get()) {
            interfaceC2969BqO.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.BsT
            public static final String __redex_internal_original_name = "DualSurfaceProcessor$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                C3019BsE c3019BsE = this;
                InterfaceC2969BqO interfaceC2969BqO2 = interfaceC2969BqO;
                Executor executor = c3019BsE.A07;
                C7578F4r c7578F4r = new C7578F4r(2, interfaceC2969BqO2, c3019BsE);
                BiU biU = (BiU) interfaceC2969BqO2;
                synchronized (biU.A0A) {
                    biU.A02 = executor;
                    biU.A01 = c7578F4r;
                    z = biU.A03;
                }
                if (z) {
                    biU.A00();
                }
                Surface surface = biU.A08;
                C3020BsF c3020BsF = c3019BsE.A05;
                C3021BsG.A02(c3020BsF);
                Map<Surface, AbstractC3050Bsv> map = c3020BsF.A0B;
                if (!map.containsKey(surface)) {
                    map.put(surface, AbstractC3025BsK.A03);
                }
                c3019BsE.A06.put(interfaceC2969BqO2, surface);
            }
        };
        interfaceC2969BqO.getClass();
        A01(this, runnable, new RunnableC3044Bsj(interfaceC2969BqO));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A08.get();
    }

    @Override // X.InterfaceC2626Bft
    public final void release() {
        if (this.A08.getAndSet(true)) {
            return;
        }
        A01(this, new Runnable() { // from class: X.Bsg
            public static final String __redex_internal_original_name = "DualSurfaceProcessor$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C3019BsE c3019BsE = this.A00;
                c3019BsE.A02 = true;
                C3019BsE.A00(c3019BsE);
            }
        }, new RunnableC3047Bsq());
    }

    @Override // X.InterfaceC2626Bft
    public final /* synthetic */ ListenableFuture Afr(int i, int i2) {
        return BpQ.A01;
    }
}
