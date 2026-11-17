package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.aura.R;
import kotlin.Unit;

/* renamed from: X.Ap4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1719Ap4 implements BMy, Dg3 {
    public F2N A00;
    public G0V<? super BFM, ? super Integer, Unit> A01 = C8kC.A00;
    public boolean A02;
    public final BMy A03;
    public final AndroidComposeView A04;

    @Override // X.BMy
    public final void Ad8(G0V<? super BFM, ? super Integer, Unit> g0v) {
        this.A04.setOnReadyForComposition(new C2334BUi(19, g0v, this));
    }

    @Override // X.BMy
    public final void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.setTag(R.id.wrapped_composition_tag, null);
            F2N f2n = this.A00;
            if (f2n != null) {
                f2n.A05(this);
            }
            this.A00 = null;
        }
        this.A03.dispose();
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
            dispose();
        } else {
            if (enumC3085Bxl != EnumC3085Bxl.ON_CREATE || this.A02) {
                return;
            }
            Ad8(this.A01);
        }
    }

    public C1719Ap4(BMy bMy, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = bMy;
    }
}
