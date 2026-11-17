package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Evc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7424Evc implements InterfaceC2940BpU {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C7424Evc(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC2940BpU
    public final Object A4r(final C3010Brs<V> c3010Brs) {
        switch (this.$t) {
            case 0:
                final ListenableFuture listenableFuture = (ListenableFuture) this.A00;
                Executor executor = (Executor) this.A01;
                Object obj = this.A02;
                C3010Brs.A00(c3010Brs, new Runnable() { // from class: X.Bkx
                    public static final String __redex_internal_original_name = "DeferrableSurfaces$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        listenableFuture.cancel(true);
                    }
                }, executor);
                AbstractC2942BpW.A03(new F56(c3010Brs, 2), listenableFuture, executor);
                return BV8.A0u(obj, C60O.A0x("surfaceList["));
            case 1:
                C3010Brs.A00(c3010Brs, new Bph(this), ExecutorC2446BbZ.A00());
                ((RunnableScheduledFutureC2946Bpg) this.A00).A00.set(c3010Brs);
                return BV4.A0k("HandlerScheduledFuture-", this.A02);
            case 2:
                final C3018BsD c3018BsD = (C3018BsD) this.A00;
                final C2507Bcd c2507Bcd = (C2507Bcd) this.A01;
                final Map map = (Map) this.A02;
                C3018BsD.A01(c3018BsD, new Runnable() { // from class: X.BsW
                    public static final String __redex_internal_original_name = "DefaultSurfaceProcessor$$ExternalSyntheticLambda6";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3018BsD c3018BsD2 = c3018BsD;
                        C2507Bcd c2507Bcd2 = c2507Bcd;
                        Map<EnumC2460Bbn, InterfaceC3048Bss> map2 = map;
                        C3010Brs c3010Brs2 = c3010Brs;
                        try {
                            c3018BsD2.A04.A03(c2507Bcd2, map2);
                            c3010Brs2.A03(null);
                        } catch (RuntimeException e) {
                            c3010Brs2.A04(e);
                        }
                    }
                }, new RunnableC3046Bsp());
                return "Init GlRenderer";
            case 3:
                final C3019BsE c3019BsE = (C3019BsE) this.A00;
                final C2507Bcd c2507Bcd2 = (C2507Bcd) this.A01;
                final Map map2 = (Map) this.A02;
                C3019BsE.A01(c3019BsE, new Runnable() { // from class: X.BsV
                    public static final String __redex_internal_original_name = "DualSurfaceProcessor$$ExternalSyntheticLambda3";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3019BsE c3019BsE2 = c3019BsE;
                        C2507Bcd c2507Bcd3 = c2507Bcd2;
                        Map<EnumC2460Bbn, InterfaceC3048Bss> map3 = map2;
                        C3010Brs c3010Brs2 = c3010Brs;
                        try {
                            c3019BsE2.A05.A03(c2507Bcd3, map3);
                            c3010Brs2.A03(null);
                        } catch (RuntimeException e) {
                            c3010Brs2.A04(e);
                        }
                    }
                }, new RunnableC3047Bsq());
                return "Init GlRenderer";
            case 4:
                C2820Blx c2820Blx = (C2820Blx) this.A00;
                InterfaceC2546BdX interfaceC2546BdX = (InterfaceC2546BdX) this.A01;
                List list = (List) this.A02;
                C2822Blz c2822Blz = new C2822Blz(interfaceC2546BdX, c2820Blx, c3010Brs);
                list.add(c2822Blz);
                ((InterfaceC2544BdV) interfaceC2546BdX).A3w(c2822Blz, ExecutorC2446BbZ.A00());
                return "waitForCaptureResult";
            default:
                C78T c78t = (C78T) this.A00;
                Integer num = (Integer) this.A01;
                G0V g0v = (G0V) this.A02;
                C7384Etj.A0Y(c3010Brs, 3);
                final HoC hoC = (HoC) c78t.get(HoC.A00);
                C3010Brs.A00(c3010Brs, new Runnable() { // from class: X.CRW
                    public static final String __redex_internal_original_name = "ListenableFutureKt$$ExternalSyntheticLambda4";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass002.A1K(hoC);
                    }
                }, EnumC7478ExU.A02);
                HzC hzCA02 = Hxb.A02(c78t);
                return GAo.A02(num, C6ys.A00, new EZB(c3010Brs, null, g0v), hzCA02);
        }
    }
}
