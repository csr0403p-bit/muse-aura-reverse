package X;

import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Deprecated(message = "Replaced by the new RippleNode implementation")
/* loaded from: classes4.dex */
public final class AvT extends AbstractC1975Avg implements InterfaceC1559AlZ, AzW {
    public int A00;
    public long A01;
    public AvV A02;
    public final ViewGroup A03;
    public final MutableState A04;
    public final MutableState A05;
    public final C1BO<B6A> A06;
    public final C1BO<C1YV> A07;
    public final Function0<Unit> A08;
    public final boolean A09;
    public final float A0A;

    @Override // X.AzW
    public final void AVU() {
        this.A05.Af8(null);
    }

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        AvV avV = this.A02;
        if (avV != null) {
            avV.A01(this);
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        AvV avV = this.A02;
        if (avV != null) {
            avV.A01(this);
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
    }

    /* JADX WARN: Incorrect types in method signature: (ZFLX/1BO<LX/B6A;>;LX/1BO<LX/1YV;>;Landroid/view/ViewGroup;)V */
    public AvT(ViewGroup viewGroup, C1BO c1bo, C1BO c1bo2, float f, boolean z) {
        super(z, c1bo2);
        this.A09 = z;
        this.A0A = f;
        this.A06 = c1bo;
        this.A07 = c1bo2;
        this.A03 = viewGroup;
        AGE age = AGE.A00;
        this.A05 = C3cG.A08(age, null);
        this.A04 = C3cG.A08(age, AnonymousClass001.A0i());
        this.A01 = 0L;
        this.A00 = -1;
        this.A08 = C2293BSt.A00(this, 19);
    }

    @Override // X.InterfaceC05111Yt
    public final void A9V(C16Z c16z) {
        long jAKb = c16z.AKb();
        this.A01 = jAKb;
        float f = this.A0A;
        boolean zIsNaN = Float.isNaN(f);
        this.A00 = zIsNaN ? Ab3.A01(AbstractC05171y7.A00(c16z, jAKb, this.A09)) : c16z.Abr(f);
        long j = this.A06.getValue().A00;
        float f2 = this.A07.getValue().A03;
        c16z.A9O();
        super.A00.A00(c16z, zIsNaN ? AbstractC05171y7.A00(c16z, c16z.AKb(), super.A01) : c16z.Ah4(f), j);
        InterfaceC1327AhE interfaceC1327AhEA01 = AW9.A01(c16z);
        this.A04.getValue();
        B1Q b1q = (B1Q) this.A05.getValue();
        if (b1q != null) {
            b1q.A02(f2, this.A00, c16z.AKb(), j);
            b1q.draw(AbstractC1290Aga.A00(interfaceC1327AhEA01));
        }
    }
}
