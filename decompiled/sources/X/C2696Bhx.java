package X;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Bhx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2696Bhx extends BjC {
    public BjC A00;
    public BiU A01;
    public C3010Brs<Surface> A02;
    public final ListenableFuture<Surface> A03;

    public C2696Bhx(Size size, int i) {
        super(size, i);
        this.A03 = AbstractC2947Bpi.A01(this, 23);
    }

    @Override // X.BjC
    public final void A02() {
        super.A02();
        BoT.A01(new Runnable() { // from class: X.Bhy
            public static final String __redex_internal_original_name = "SurfaceEdge$SettableSurface$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C2696Bhx c2696Bhx = this.A00;
                BiU biU = c2696Bhx.A01;
                if (biU != null) {
                    biU.A00();
                }
                if (c2696Bhx.A00 == null) {
                    c2696Bhx.A02.A02();
                }
            }
        });
    }

    public final boolean A05(final BjC bjC, Runnable runnable) {
        boolean z;
        BoT.A00();
        bjC.getClass();
        BjC bjC2 = this.A00;
        if (bjC2 == bjC) {
            return false;
        }
        BeS.A07(AnonymousClass002.A1Y(bjC2), "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
        Size size = this.A06;
        Size size2 = bjC.A06;
        BeS.A06(size.equals(size2), String.format("The provider's size(%s) must match the parent(%s)", size, size2));
        int i = this.A05;
        int i2 = bjC.A05;
        BeS.A06(AnonymousClass002.A1Q(i, i2), String.format("The provider's format(%s) must match the parent(%s)", BV5.A1Z(i, i2)));
        synchronized (this.A09) {
            z = this.A04;
        }
        BeS.A07(!z, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
        this.A00 = bjC;
        AbstractC2942BpW.A04(this.A02, bjC.A01());
        bjC.A04();
        ExecutorC2446BbZ.A03(AbstractC2942BpW.A01(this.A08), new Runnable() { // from class: X.Bhz
            public static final String __redex_internal_original_name = "SurfaceEdge$SettableSurface$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                bjC.A03();
            }
        });
        AbstractC2942BpW.A01(bjC.A07).addListener(runnable, BoS.A00());
        return true;
    }
}
