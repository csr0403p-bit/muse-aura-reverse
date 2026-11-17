package X;

import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes6.dex */
public final class FI0 implements FJD {
    public static final FI0 A00 = new FI0();

    @Override // X.FJD
    public final C7881FIw APX(FJH fjh, long j) {
        FI8<ProgressBar> fi8 = FJ6.A00;
        View view = (View) fi8.A00.A4G(fjh.A00.A03);
        view.measure(AbstractC7826FGh.A01(j), AbstractC7826FGh.A00(j));
        return new C7881FIw(null, FEP.A00(Math.max(AbstractC7829FGk.A01(BV6.A03(j)).A05(j), view.getMeasuredWidth()), Math.max(AbstractC7829FGk.A01((int) j).A04(j), view.getMeasuredHeight())));
    }

    @Override // X.FJD
    public final /* bridge */ boolean AOM(FJD fjd) {
        return AbstractC7609F5w.A1W(fjd, this);
    }

    @Override // X.InterfaceC10547Hrt
    public final /* bridge */ /* synthetic */ boolean AON(FJD fjd) {
        return AbstractC7609F5w.A1W(fjd, this);
    }
}
