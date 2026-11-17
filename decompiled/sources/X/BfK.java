package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BfK {
    public int A00;
    public int A01;
    public C2696Bhx A02;
    public BmM A05;
    public final int A06;
    public final int A07;
    public final Matrix A08;
    public final Rect A09;
    public final AbstractC2481Bc8 A0A;
    public final boolean A0D;
    public final boolean A0E;
    public boolean A03 = false;
    public final Set<Runnable> A0C = C60O.A13();
    public boolean A04 = false;
    public final List<BeM<BhO>> A0B = C3cG.A0h();

    public static void A00(BfK bfK) {
        BeS.A07(!bfK.A04, "Edge is already closed.");
    }

    public BfK(Matrix matrix, Rect rect, AbstractC2481Bc8 abstractC2481Bc8, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A07 = i;
        this.A06 = i2;
        this.A0A = abstractC2481Bc8;
        this.A08 = matrix;
        this.A0D = z;
        this.A09 = rect;
        this.A00 = i3;
        this.A01 = i4;
        this.A0E = z2;
        this.A02 = new C2696Bhx(((C2492BcJ) abstractC2481Bc8).A01, i2);
    }

    public static void A01(BfK bfK) {
        final BgP bgP;
        Executor executor;
        BoT.A00();
        final BfX bfX = new BfX(bfK.A08, bfK.A09, bfK.A00, bfK.A01, bfK.A0D, bfK.A0E);
        BmM bmM = bfK.A05;
        if (bmM != null) {
            synchronized (bmM.A0B) {
                bmM.A00 = bfX;
                bgP = bmM.A01;
                executor = bmM.A02;
            }
            if (bgP != null && executor != null) {
                executor.execute(new Runnable() { // from class: X.Bg0
                    public static final String __redex_internal_original_name = "SurfaceRequest$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        BgP bgP2 = bgP;
                        BhO bhO = bfX;
                        Range<Integer> range = BmM.A0F;
                        bgP2.AWn(bhO);
                    }
                });
            }
        }
        Iterator<BeM<BhO>> it = bfK.A0B.iterator();
        while (it.hasNext()) {
            it.next().accept(bfX);
        }
    }

    public final BmM A02(InterfaceC2610Bfb interfaceC2610Bfb) {
        BoT.A00();
        A00(this);
        Range<Integer> range = BmM.A0F;
        C2492BcJ c2492BcJ = (C2492BcJ) this.A0A;
        BmM bmM = new BmM(c2492BcJ.A00, c2492BcJ.A01, c2492BcJ.A02, interfaceC2610Bfb, new Runnable() { // from class: X.Bfp
            public static final String __redex_internal_original_name = "SurfaceEdge$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                final BfK bfK = this.A00;
                BoS.A00().execute(new Runnable() { // from class: X.Bg4
                    public static final String __redex_internal_original_name = "SurfaceEdge$$ExternalSyntheticLambda6";

                    @Override // java.lang.Runnable
                    public final void run() {
                        BfK bfK2 = bfK;
                        if (bfK2.A04) {
                            return;
                        }
                        bfK2.A04();
                    }
                });
            }
        });
        try {
            final BjC bjC = bmM.A07;
            C2696Bhx c2696Bhx = this.A02;
            if (c2696Bhx.A05(bjC, new RunnableC2634Bg1(c2696Bhx))) {
                ListenableFuture listenableFutureA01 = AbstractC2942BpW.A01(c2696Bhx.A08);
                bjC.getClass();
                ExecutorC2446BbZ.A03(listenableFutureA01, new Runnable() { // from class: X.BgB
                    public static final String __redex_internal_original_name = "SurfaceEdge$$ExternalSyntheticLambda3";

                    @Override // java.lang.Runnable
                    public final void run() {
                        bjC.A02();
                    }
                });
            }
            this.A05 = bmM;
            A01(this);
            return bmM;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw Bb9.A00("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            bmM.A00();
            throw e2;
        }
    }

    public final void A03() {
        BoT.A00();
        this.A02.A02();
        this.A04 = true;
    }

    public final void A04() {
        boolean z;
        BoT.A00();
        A00(this);
        C2696Bhx c2696Bhx = this.A02;
        BoT.A00();
        if (c2696Bhx.A00 == null) {
            synchronized (c2696Bhx.A09) {
                z = c2696Bhx.A04;
            }
            if (!z) {
                return;
            }
        }
        this.A03 = false;
        this.A02.A02();
        this.A02 = new C2696Bhx(((C2492BcJ) this.A0A).A01, this.A06);
        Iterator<Runnable> it = this.A0C.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }
}
