package androidx.compose.ui.platform;

import X.AbstractC1718Ap2;
import X.AbstractC1798ArH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.C2330BUe;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposeView extends AbstractC1718Ap2 {
    public boolean A00;
    public final MutableState<G0V<BFM, Integer, Unit>> A01;

    public final void setContent(G0V<? super BFM, ? super Integer, Unit> g0v) {
        this.A00 = true;
        this.A01.Af8(g0v);
        if (isAttachedToWindow() || super.A00 != null) {
            A0B();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // X.AbstractC1718Ap2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    public ComposeView(Context context) {
        super(context);
        this.A01 = AbstractC1798ArH.A03();
    }

    @Override // X.AbstractC1718Ap2
    public final void A0E(BFM bfm, int i) {
        bfm.AgG(420213850);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, this) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            G0V<BFM, Integer, Unit> value = this.A01.getValue();
            if (value == null) {
                bfm.AgE(-1238823553);
            } else {
                bfm.AgE(98585282);
                AnonymousClass001.A1H(bfm, value, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2330BUe(this, i, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }
}
