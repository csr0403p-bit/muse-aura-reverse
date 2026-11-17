package X;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class BfJ {
    public BgH A00;
    public BhT A01;
    public final InterfaceC2610Bfb A02;
    public final InterfaceC2626Bft A03;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.BgH A01(X.BhT r25) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BfJ.A01(X.BhT):X.BgH");
    }

    public BfJ(InterfaceC2610Bfb interfaceC2610Bfb, InterfaceC2626Bft interfaceC2626Bft) {
        this.A02 = interfaceC2610Bfb;
        this.A03 = interfaceC2626Bft;
    }

    public static void A00(BfK bfK, BfJ bfJ, Map.Entry entry) {
        final BfK bfK2 = (BfK) entry.getValue();
        final BiT biT = new BiT(((BfT) ((BhW) entry.getKey())).A03, ((C2492BcJ) bfK.A0A).A01, bfK.A0D ? bfJ.A02 : null, ((BfT) ((BhW) entry.getKey())).A01, ((BfT) ((BhW) entry.getKey())).A06);
        final int i = ((BfT) ((BhW) entry.getKey())).A00;
        BoT.A00();
        BfK.A00(bfK2);
        BeS.A07(!bfK2.A03, "Consumer can only be linked once.");
        bfK2.A03 = true;
        final C2696Bhx c2696Bhx = bfK2.A02;
        ListenableFuture<Surface> listenableFutureA01 = c2696Bhx.A01();
        InterfaceC2939BpT interfaceC2939BpT = new InterfaceC2939BpT() { // from class: X.Bfe
            @Override // X.InterfaceC2939BpT
            public final ListenableFuture A4O(Object obj) {
                BfK bfK3 = bfK2;
                final C2696Bhx c2696Bhx2 = c2696Bhx;
                int i2 = i;
                BhN bhN = biT;
                Surface surface = (Surface) obj;
                surface.getClass();
                try {
                    c2696Bhx2.A04();
                    BiU biU = new BiU(bfK3.A08, ((C2492BcJ) bfK3.A0A).A01, surface, bhN, i2);
                    ExecutorC2446BbZ.A03(biU.A09, new Runnable() { // from class: X.BgC
                        public static final String __redex_internal_original_name = "SurfaceEdge$$ExternalSyntheticLambda5";

                        @Override // java.lang.Runnable
                        public final void run() {
                            c2696Bhx2.A03();
                        }
                    });
                    BeS.A07(AnonymousClass002.A1Y(c2696Bhx2.A01), "Consumer can only be linked once.");
                    c2696Bhx2.A01 = biU;
                    return new BpQ(biU);
                } catch (DeferrableSurface$SurfaceClosedException e) {
                    return new C2938BpP(e);
                }
            }
        };
        ScheduledExecutorService scheduledExecutorServiceA00 = BoS.A00();
        Bpe bpe = new Bpe(interfaceC2939BpT, listenableFutureA01);
        listenableFutureA01.addListener(bpe, scheduledExecutorServiceA00);
        AbstractC2942BpW.A03(new F58(8, bfK2, bfJ), bpe, BoS.A00());
    }
}
