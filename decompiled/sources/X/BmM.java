package X;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class BmM {
    public static final Range<Integer> A0F = AbstractC2481Bc8.A00;
    public BhO A00;
    public BgP A01;
    public Executor A02;
    public final Range<Integer> A03;
    public final Size A04;
    public final C2507Bcd A05;
    public final InterfaceC2610Bfb A06;
    public final BjC A07;
    public final C3010Brs<Void> A08;
    public final C3010Brs<Void> A09;
    public final ListenableFuture<Surface> A0A;
    public final Object A0B = C3cG.A0T();
    public final boolean A0C = true;
    public final C3010Brs<Surface> A0D;
    public final ListenableFuture<Void> A0E;

    public BmM(Range range, Size size, C2507Bcd c2507Bcd, InterfaceC2610Bfb interfaceC2610Bfb, Runnable runnable) {
        this.A04 = size;
        this.A06 = interfaceC2610Bfb;
        this.A05 = c2507Bcd;
        this.A03 = range;
        StringBuilder sbA0f = C3cG.A0f(size, "SurfaceRequest[size: ");
        sbA0f.append(", id: ");
        sbA0f.append(hashCode());
        String strA0v = AnonymousClass001.A0v("]", sbA0f);
        AtomicReference atomicReferenceA16 = BV4.A16(null);
        C3009Brr c3009BrrA00 = AbstractC2947Bpi.A00(new C7264Ejo(strA0v, atomicReferenceA16, 0));
        Object obj = atomicReferenceA16.get();
        obj.getClass();
        C3010Brs<Void> c3010Brs = (C3010Brs) obj;
        this.A08 = c3010Brs;
        AtomicReference atomicReferenceA162 = BV4.A16(null);
        C3009Brr c3009BrrA002 = AbstractC2947Bpi.A00(new C7264Ejo(strA0v, atomicReferenceA162, 1));
        this.A0E = c3009BrrA002;
        AbstractC2942BpW.A03(new F59(c3009BrrA00, c3010Brs, this, 1), c3009BrrA002, ExecutorC2446BbZ.A00());
        Object obj2 = atomicReferenceA162.get();
        obj2.getClass();
        AtomicReference atomicReferenceA163 = BV4.A16(null);
        C3009Brr c3009BrrA003 = AbstractC2947Bpi.A00(new C7264Ejo(strA0v, atomicReferenceA163, 2));
        this.A0A = c3009BrrA003;
        Object obj3 = atomicReferenceA163.get();
        obj3.getClass();
        this.A0D = (C3010Brs) obj3;
        BmL bmL = new BmL(size, this);
        this.A07 = bmL;
        ListenableFuture listenableFutureA01 = AbstractC2942BpW.A01(bmL.A08);
        AbstractC2942BpW.A03(new BmN(this, (C3010Brs) obj2, listenableFutureA01, strA0v), c3009BrrA003, ExecutorC2446BbZ.A00());
        ExecutorC2446BbZ.A03(listenableFutureA01, new Runnable() { // from class: X.BmX
            public static final String __redex_internal_original_name = "SurfaceRequest$$ExternalSyntheticLambda8";

            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0A.cancel(true);
            }
        });
        ExecutorC2446BbZ executorC2446BbZA00 = ExecutorC2446BbZ.A00();
        AtomicReference atomicReferenceA164 = BV4.A16(null);
        AbstractC2942BpW.A03(new F58(4, runnable, this), AbstractC2947Bpi.A02(atomicReferenceA164, this, 5), executorC2446BbZA00);
        Object obj4 = atomicReferenceA164.get();
        obj4.getClass();
        this.A09 = (C3010Brs) obj4;
    }

    public final void A00() {
        this.A0D.A04(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/view/Surface;Ljava/util/concurrent/Executor;LX/BeM<LX/Bn0;>;)V */
    public final void A01(final Surface surface, final BeM beM, Executor executor) throws ExecutionException, InterruptedException {
        if (!this.A0D.A03(surface)) {
            ListenableFuture<Surface> listenableFuture = this.A0A;
            if (!listenableFuture.isCancelled()) {
                BeS.A07(listenableFuture.isDone(), null);
                try {
                    listenableFuture.get();
                    executor.execute(new Runnable() { // from class: X.BmQ
                        public static final String __redex_internal_original_name = "SurfaceRequest$$ExternalSyntheticLambda2";

                        @Override // java.lang.Runnable
                        public final void run() {
                            BeM beM2 = beM;
                            Surface surface2 = surface;
                            Range<Integer> range = BmM.A0F;
                            beM2.accept(new BmJ(3, surface2));
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: X.BmR
                        public static final String __redex_internal_original_name = "SurfaceRequest$$ExternalSyntheticLambda3";

                        @Override // java.lang.Runnable
                        public final void run() {
                            BeM beM2 = beM;
                            Surface surface2 = surface;
                            Range<Integer> range = BmM.A0F;
                            beM2.accept(new BmJ(4, surface2));
                        }
                    });
                    return;
                }
            }
        }
        AbstractC2942BpW.A03(new F59(surface, beM, this, 2), this.A0E, executor);
    }

    public final void A02(final BgP bgP, Executor executor) {
        final BhO bhO;
        synchronized (this.A0B) {
            this.A01 = bgP;
            this.A02 = executor;
            bhO = this.A00;
        }
        if (bhO != null) {
            executor.execute(new Runnable() { // from class: X.BgQ
                public static final String __redex_internal_original_name = "SurfaceRequest$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    BgP bgP2 = bgP;
                    BhO bhO2 = bhO;
                    Range<Integer> range = BmM.A0F;
                    bgP2.AWn(bhO2);
                }
            });
        }
    }
}
